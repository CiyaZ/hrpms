$(function ()
{
	$('#menu-tree').tree({
		onClick: function (node)
		{
			switch (node.text)
			{
				case '储蓄账户类型管理':
					newTabTo('储蓄账户类型管理', 'accountTypeManage');
					break;
			}
		}
	});
});

/**
 * 整个页面刷新至链接
 * @param link 链接字符串
 */
function navigateTo(link)
{
	location.href = link;
}

/**
 * 新建标签页刷新至链接
 */
function newTabTo(title, link)
{
	var iframe = '<iframe src=' + link + ' scrolling="auto" style="width: 100%; height: 100%"></iframe>';
	$('#tt').tabs('add', {
		title: title,
		content: iframe,
		closable: true
	});
}