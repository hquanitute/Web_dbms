<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource
		var="db"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/world"
		user="root"
		password="root"
	/>
					<%-- <c:if test="${empty db}">
				    var1 is empty or null.
				</c:if>
				<c:if test="${not empty db}">
				    var1 is NOT empty or null.
				</c:if> --%>
	<sql:query var="rs" dataSource="${db}">select * from city</sql:query>
	<c:out value="${rs. }"></c:out>
	<c:forEach items="${rs.rows}" var="city">
		<c:out value="${city.Name}"></c:out> <br>
	</c:forEach>
 	<c:out value="hello jstl"></c:out>
</body>
</html>