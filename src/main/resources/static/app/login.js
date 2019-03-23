$(function ()
{
	// 窗口定制
	$('#login-window').window({
		collapsible: false,
		minimizable: false,
		maximizable: false,
		closable: false
	});
});

/**
 * 重置表单
 */
function resetForm()
{
	$('#username').val('');
	$('#password').val('');
}

/**
 * 提交表单
 */
function submitForm()
{
	var result = checkForm();
	if(result)
	{
		$('#login-form').submit();
	}
}

/**
 * 表单校验提交
 */
function checkForm()
{
	var username = $('#username').val();
	var password = $('#password').val();

	if (username === '' || password === '')
	{
		alert('用户名或密码不能为空');
		return false;
	}
	if (username.length > 255 || password.length > 255)
	{
		alert('用户名或密码不能超过255个字符');
		return false;
	}

	return true;
}