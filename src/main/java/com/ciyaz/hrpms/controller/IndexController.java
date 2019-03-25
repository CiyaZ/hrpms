package com.ciyaz.hrpms.controller;

import com.ciyaz.hrpms.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author CiyaZ
 */
@Controller
public class IndexController
{
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndexPage(Model model, HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		model.addAttribute("user", user);
		return "index";
	}
}
