package com.ciyaz.hrpms.controller;

import com.ciyaz.hrpms.domain.Role;
import com.ciyaz.hrpms.domain.User;
import com.ciyaz.hrpms.service.RoleService;
import com.ciyaz.hrpms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author CiyaZ
 */
@Controller
public class LoginController
{
	private final UserService userService;
	private final RoleService roleService;

	@Autowired
	public LoginController(UserService userService, RoleService roleService)
	{
		this.userService = userService;
		this.roleService = roleService;
	}

	/**
	 * 获取登录页
	 *
	 * @return 登录页
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage()
	{
		return "login";
	}

	/**
	 * 登录
	 *
	 * @param username 用户名
	 * @param password 密码
	 * @param request  请求对象
	 * @return 登陆成功跳转控制面板，失败返回登录页
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String username,
	                    @RequestParam String password,
	                    Model model,
	                    HttpServletRequest request,
	                    HttpServletResponse response)
	{
		if (username == null
				|| password == null
				|| "".equals(username)
				|| "".equals(password)
				|| username.length() > 255
				|| password.length() > 255)
		{
			// 非正常手段跳过了前台验证，且表单校验不通过的情况
			response.setStatus(400);
			return null;
		}

		User user = userService.login(username, password);
		if (user == null)
		{
			// 登录失败
			model.addAttribute("err_msg", "用户名或密码错误");
			model.addAttribute("username", username);
			return "login";
		}
		else
		{
			// 登录成功

			List<Role> roleList = roleService.getRoleListByUserId(user.getUserId());

			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			session.setAttribute("roleList", roleList);

			return "redirect:/dashboard";
		}
	}

	/**
	 * 登出
	 *
	 * @param request 请求对象
	 * @return 返回登录页
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request)
	{
		request.getSession().setAttribute("user", null);
		request.getSession().setAttribute("roleList", null);

		return "redirect:/login";
	}
}
