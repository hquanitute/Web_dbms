<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sửa khách hàng</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>

<body>
	<div class="row my-auto mx-auto ">
		<div class="col-8">
			<form class="needs-validation" action="editCustomer" method="post">
				<input type="text" class="form-control" name="e_makh"
					value="${param.makh }">
				<div class="row">
					<div class="col-md-12 mb-3">
						<label for="fullName">Họ tên</label> <input type="text"
							class="form-control" name="e_fullName" value="${param.tenkh }"
							required>
						<div class="invalid-feedback">Vui lòng nhập họ tên</div>
					</div>
				</div>

				<div class="mb-3">
					<label for="username">Tên đăng nhập</label>
					<div class="input-group">
						<div class="input-group-prepend">
							<span class="input-group-text">@</span>
						</div>
						<input type="text" class="form-control" name="e_username" value=""
							required>
						<div class="invalid-feedback" style="width: 100%;">Vui lòng
							nhập tên đăng nhập</div>
					</div>
				</div>

				<div class="mb-3">
					<label for="inputPassword" class=" col-form-label">Mật khẩu</label>
					<div class="">
						<input type="password" class="form-control" name="e_inputPassword"
							value="" placeholder="Mật khẩu">
					</div>
				</div>

				<div class="mb-3">
					<label for="email">Email <span class="text-muted"></span></label> <input
						type="email" class="form-control" name="e_email"
						value="${param.email }" placeholder="you@example.com" required>
					<div class="invalid-feedback">Vui lòng nhập đúng email</div>
				</div>

				<div class="mb-3">
					<label for="address">Địa chỉ</label> <input type="text"
						class="form-control" name="e_address" value="${param.diachi }"
						placeholder="123 Võ văn Ngân" required>
					<div class="invalid-feedback">Vui lòng nhập địa chỉ</div>
				</div>
				<div class="mb-3">
					<label for="sdt">SĐT</label> <input type="text"
						class="form-control" name="e_phonenumber" value="${param.sdt}"
						placeholder="012345678" required>
					<div class="invalid-feedback">Vui lòng nhập SĐT</div>
				</div>
				<button class="btn btn-primary btn-lg btn-block mx-auto col-md-4"
					type="submit">Sửa</button>
				<a href="redirectKhachHang"
					class="btn btn-primary btn-lg btn-block mx-auto col-md-4"
					type="submit">Xóa</a>
			</form>
		</div>

	</div>
</body>

</html>