$(function ()
{
	$('#account-type-table').datagrid({
		url: '/accountTypeList',
		method: 'GET',
		columns: [[
			{field: 'accountTypeId', title: '储蓄账户类型ID'},
			{field: 'accountTypeName', title: '储蓄账户类型名称'},
			{field: 'op', title: '操作', formatter: function (value, row, rowIndex)
				{
					if(row.accountTypeId === 1)
					{
						return '';
					}
					else
					{
						return '<a onclick="deleteConfirm(' + row.accountTypeId + ')" class="easyui-linkbutton" data-options="iconCls:\'icon-delete\'" style="color: blue; text-decoration: underline;cursor: pointer">删除</a>';
					}
				}}
		]]
	});
});

function showAddAccountTypeButton()
{
	$('#add-account-type-win').window('open');
}

function submitForm()
{
	var accountType = $('#account-type').val();
	$.ajax({
		type: "POST",
		async: true,
		url: '/addAccountType',
		data: {accountType: accountType},
		dataType: "json",
		success: function (msg)
		{
			if(msg.msg === 'success')
			{
				$('#add-account-type-win').window('close');
				reloadDataGrid();
			}
			else
			{
				$('#add-err-msg').text('输入不符合要求，呼入必须小于20个字');
			}
		},
		error: function (err)
		{
			$('#add-err-msg').text('网络错误：删除过程中出错，请稍后重试！');
		}
	});
}

function reloadDataGrid()
{
	$('#account-type-table').datagrid('reload');
}

function deleteConfirm(accountTypeId)
{
	$.messager.confirm(
		'警告',
		'你确定要删除该分类吗？注意，该操作不会导致该分类下的所有储蓄账户丢失。',
		function (result)
		{
			if(result)
			{
				$.ajax({
					type: "GET",
					async: true,
					url: '/deleteAccountType?accountTypeId=' + accountTypeId,
					dataType: "json",
					contentType: "application/json; charset=utf-8",
					success: function (msg)
					{
						reloadDataGrid();
					},
					error: function (err)
					{
						$.messager.alert('网络错误', '删除过程中出错，请稍后重试！');
					}
				});
			}
		});
}