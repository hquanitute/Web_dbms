<%@page import="java.net.InetAddress"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Object.dsIP"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="vi">

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="" content="">
<meta name="" content="">

<title>Đăng nhập</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/source/cpanelSource/bootstrap/dist/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/source/cpanelSource/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/source/signin.css"
	rel="stylesheet">

</head>

<body class="text-center">
	<div class="row">
		<form class="form-signin" action="login" method="POST">
			<img src="image/logo.jpg">
			<h1 class="h3 mb-3 font-weight-normal">Đăng nhập</h1>
			<label for="inputEmail" class="sr-only">Username</label> <input
				type="text" name="inputUserName" class="form-control"
				placeholder="Tên đăng nhập" required autofocus> <br> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" name="inputPassword" class="form-control"
				placeholder="Mật khẩu" required>

			<div class="row text-left">
				<%
					dsIP obj = (dsIP) request.getAttribute("ip");
					if(obj!=null){
						ArrayList<String> ds = obj.getDs();
						for (int i = 0; i < ds.size(); i++) {
							%>
							<label class="radio-inline"> <input type="radio" name="ipChecked"
								value="<%=ds.get(i) %>"><%=ds.get(i) %><br> </label>
							<%
							}
					}
				%>
			</div>


			<div class="checkbox mb-3">
				<label> <input type="checkbox" value="remember-me">
					Nhớ mật khẩu
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit" name="action" value="dangnhap">Đăng
				nhập</button>
			<button type="submit" name="action" value="dangky" class="mt-5 mb-3">Đăng
				ký tài khoản khách hàng mới</button>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
		</form>
	</div>
</body>

</html>