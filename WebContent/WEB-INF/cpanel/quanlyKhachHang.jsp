<%@page import="java.net.URLEncoder"%>
<%@page import="Object.dsKhachHang"%>
<%@ page isELIgnored="false"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Object.KhachHang"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <c:if test="${sessionScope.username}==null">
	out.print("Please login first");  
    request.getRequestDispatcher("login.html").include(request, response);  
</c:if> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/source/cpanelSource/bootstrap/dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/source/cpanelSource/font-awesome/css/font-awesome.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/source/cpanelSource/dist/css/AdminLTE.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/source/cpanelSource/dist/css/skins/skin-purple.min.css">


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

<!-- Google Font -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">

</head>

<body class="hold-transition skin-purple sidebar-mini">
	<div class="wrapper">
		<!-- Main Header -->
		<header class="main-header">
			<!-- Logo -->
			<a href="WEB-INF/cpanel/quaanly.jsp" class="logo"> <span
				class="logo-mini">SPA</span> <span class="logo-lg"><b>SPA</b>
					HOÀNG GIA</span>
			</a>
			<!-- Header Navbar -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="push-menu"
					role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- Notifications Menu -->
						<li class="dropdown notifications-menu">
							<!-- Menu toggle button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <i class="fa fa-bell-o"></i> <span
								class="label label-warning">10</span>
						</a>
							<ul class="dropdown-menu">
								<li class="header">You have 10 notifications</li>
								<li>
									<!-- Inner Menu: contains the notifications -->
									<ul class="menu">
										<li>
											<!-- start notification --> <a href="#"> <i
												class="fa fa-users text-aqua"></i>inform here
										</a>
										</li>
										<!-- end notification -->
									</ul>
								</li>
								<li class="footer"><a href="#">View all</a></li>
							</ul>
						</li>

						<!-- User Account Menu -->
						<li class="dropdown user user-menu">
							<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
							data-toggle="dropdown"> <!-- The user image in the navbar-->
								<img src="" class="user-image" alt="User Image"> <!-- hidden-xs hides the username on small devices so only the image appears. -->
								<span class="hidden-xs"></span>
						</a>
							<ul class="dropdown-menu">
								<!-- The user image in the menu -->
								<li class="user-header"><img src="" class="img-circle"
									alt="User Image">
									<p>inform admin</p></li>
								<!-- Menu Body -->
								<li class="user-body">
									<p>inform admin</p> <!-- /.row -->
								</li>
								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="pull-left">
										<a href="#" class="btn btn-default btn-flat">Profile</a>
									</div>
									<div class="pull-right">
										<a href="logout" class="btn btn-default btn-flat">Sign out</a>
									</div>
								</li>
							</ul>
						</li>
						<!-- Manage Admin Account-->
					</ul>
				</div>
			</nav>
		</header>
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">

			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">

				<!-- Sidebar user panel (optional) -->
				<div class="user-panel">
					<div class="pull-left image">
						<img src="" class="img-circle" alt="User Image">
					</div>
					<div class="pull-left info">
						<p><%=session.getAttribute("username")%></p>
						<!-- Status -->
						<a href="#"><i class="fa fa-circle text-success"></i> Online</a>
					</div>
				</div>

				<!-- search form (Optional) -->
				<form action="#" method="get" class="sidebar-form">
					<div class="input-group">
						<input type="text" name="q" class="form-control"
							placeholder="Search..."> <span class="input-group-btn">
							<button type="submit" name="search" id="search-btn"
								class="btn btn-flat">
								<i class="fa fa-search"></i>
							</button>
						</span>
					</div>
				</form>
				<!-- /.search form -->

				<!-- Sidebar Menu -->
				<ul class="sidebar-menu" data-widget="tree">
					<!-- Optionally, you can add icons to the links -->
					<li class="active"><a href="redirectCpanel"><i class="fa fa-home"></i> <span>Trang chủ</span></a></li>
        <li class="active"><a href="redirectKhachHang"><i class="fa fa-users"></i> <span>Khách hàng</span></a></li>
        <li><a href="redirectNhanVien"><i class="fa fa-user-circle"></i> <span>Nhân viên</span></a></li>
        <li><a href="redirectBaoCao"><i class="fa fa-line-chart"></i> <span>Báo cáo</span></a></li>
        <li><a href="redirectDichVu"><i class="fa fa-asterisk"></i> <span>Dịch vụ</span></a></li>
        <li><a href="redirectHoaDon"><i class="fa fa-id-card"></i> <span>Hóa đơn</span></a></li>
        <li><a href="redirectKhuyenMai"><i class="fa fa-dollar"></i> <span>Khuyến mãi</span></a></li>
        <li><a href="redirectTaiKhoan"><i class="fa fa-user-o"></i> <span>Tài khoản</span></a></li>
        <li><a href="redirectThongtin"><i class="fa fa-info"></i> <span>Thông tin</span></a></li>
				</ul>
				<!-- /.sidebar-menu -->
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper" style="min-height: 623px;">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Page Header <small>Optional description</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
					<li class="active">Here</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content container-fluid">

				<!--------------------------
        | Your Page Content Here |
        -------------------------->
				<div class="row">
					<div class="card ">
						<div class="card-header card-header-primary">
							<div class="row">
								<h4 class="card-title col-xs-4 my-auto ml-sm-5">Danh sách
									khách hàng</h4>
								
							</div>
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-striped">
									<thead>
										<tr>
											<th scope="col">Mã KH</th>
											<th scope="col">Tên KH</th>
											<th scope="col">Địa chỉ</th>
											<th scope="col">SDT</th>
											<th scope="col">Email</th>
										</tr>
									</thead>
									<tbody>
										<%
											dsKhachHang obj = (dsKhachHang) request.getAttribute("dsKH");
											List<KhachHang> ds = (List<KhachHang>) obj.getDs();
										%>

										<%
											for (int i = 0; i < ds.size(); i++) {
										%>
										<tr>
											<td><%=i+1%></td>
											<td><%=ds.get(i).getTenKH()%></td>
											<td><%=ds.get(i).getDiaChi()%></td>
											<td><%=ds.get(i).getSDT()%></td>
											<td><%=ds.get(i).getEmail()%></td>
											<td><a href="redirectEditCustomer?makh=<%=ds.get(i).getMaKH()%>&
											tenkh=<%=URLEncoder.encode(ds.get(i).getTenKH(), "UTF-8")%>&
											diachi=<%=URLEncoder.encode(ds.get(i).getDiaChi(), "UTF-8")%>&
											sdt=<%=ds.get(i).getSDT()%>&
											email=<%=URLEncoder.encode(ds.get(i).getEmail(), "UTF-8")%>
											">Sửa</a></td>
											<td><a href="redirectDeleteCustomer?makh=<%=ds.get(i).getMaKH()%>">Xóa</a></td>
										</tr>
										<%
											}
										%>
									</tbody>
								</table>
								<!-- <nav aria-label="Page navigation example">
									<ul class="pagination justify-content-center">
										<li class="page-item disabled"><a class="page-link"
											href="#" tabindex="-1">Previous</a></li>
										<li class="page-item"><a class="page-link" href="#">1</a></li>
										<li class="page-item"><a class="page-link" href="#">2</a></li>
										<li class="page-item"><a class="page-link" href="#">3</a></li>
										<li class="page-item"><a class="page-link" href="#">Next</a>
										</li>
									</ul>
								</nav> -->
							</div>
						</div>
					</div>
				</div>

			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Main Footer -->
		<footer class="main-footer">
			<!-- To the right -->
			<div class="pull-right hidden-xs">DBMS</div>
			<!-- Default to the left -->
			<strong>Copyright &copy; 2018 <a href="#">UTE</a>.
			</strong> All rights reserved.
		</footer>
	</div>

	<!-- jQuery 3 -->
	<script
		src="${pageContext.request.contextPath}/source/cpanelSource/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap 3.3.7 -->
	<script
		src="${pageContext.request.contextPath}/source/cpanelSource/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- AdminLTE App -->
	<script
		src="${pageContext.request.contextPath}/source/cpanelSource/dist/js/adminlte.min.js"></script>

</body>
</html>