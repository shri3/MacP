<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>MacProny- Online Shopping Website - ${title}</title>

<script>
window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp" %>

	<!-- Page Content -->
	<!-- home content -->
	<c:if test="${userClickHome ==true}">
	<%@include file="home.jsp" %>
	</c:if>
	
	<!-- about us content -->
	<c:if test="${userClickAbout ==true}">
	<%@include file="about.jsp" %>
	</c:if>
	
	
	<!-- contact content -->
	<c:if test="${userClickContact ==true}">
	<%@include file="contact.jsp" %>
	</c:if>
	
	<!-- product content -->
	<c:if test="${userClickAllProducts ==true or userClickCategoryProducts == true}">
	<%@include file="listProducts.jsp" %>
	</c:if>
	<!-- /.container -->

	<!-- Footer -->
	<!-- footer comes here -->
	<%@include file="./shared/footer.jsp" %>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
	<script src="${js}/myapp.js"></script>

</body>

</html>
