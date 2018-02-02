<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>
<%
	String path2 = request.getContextPath();
	String basePath2 = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path2 + "/";
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="applicable-device" content="pc,mobile">
<meta name="MobileOptimized" content="width" />
<meta name="HandheldFriendly" content="true" />
<link rel="shortcut icon" href="resource/img/logo.png" type="image/x-icon">
<rapid:block name="description">
	<meta name="description" content="${options.optionMetaDescrption}" />
</rapid:block>
<rapid:block name="keywords">
	<meta name="keywords" content="${options.optionMetaKeyword}" />
</rapid:block>
<rapid:block name="title">
	<title>${options.optionSiteTitle}-${options.optionSiteDescrption}</title>
</rapid:block>
<link rel="stylesheet" href="<%=basePath2%>resource/css/style.css">
<link rel="stylesheet" href="<%=basePath2%>resource/plugin/font-awesome/css/font-awesome.min.css">

<rapid:block name="header-style">

</rapid:block>
</head>
<body>
	<div id="page" class="site" style="transform: none;">

		<%@ include file="part/header.jsp"%>
		<div id="content" class="site-content" style="transform: none;">
			<rapid:block name="left"></rapid:block>
			<rapid:block name="right">
				<%@ include file="part/sidebar-1.jsp"%>
			</rapid:block>
		</div>
		<div class="clear"></div>
		<rapid:block name="link"></rapid:block>
		<%@ include file="part/footer.jsp"%>

	</div>

	<script src="<%=basePath2%>resource/js/jquery.min.js"></script>
	<script src="<%=basePath2%>resource/js/superfish.js"></script>
	<script src="<%=basePath2%>resource/js/script.js"></script>
	<script src="<%=basePath2%>resource/plugin/layui/layui.all.js"></script>
	<script src="<%=basePath2%>resource/js/canvas_line.js"></script>
	<script src="<%=basePath2%>resource/plugin/bootstrap-3.3.7/js/bootstrap.min.js"></script>

	<rapid:block name="footer-script"></rapid:block>

</body>
</html>