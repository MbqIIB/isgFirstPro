<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome!!! Spring Security</h1>
<br>
<p>${welcomeMessage}</p>

<ul>
<%-- <c:url value="/j_spring_security_logout" var="logoutUrl"/>  --%>
<c:url value="/home" var="homeURL"/>
<c:url value="/saveElement" var="saveElementURL"/>
<c:url value="/insertElement" var="insertElementURL"/>
<li><a href="${homeURL}">Home</a></li>
<li><a href="${saveElementURL}">save 1 Element</a></li>
<li><a href="${insertElementURL}">insert Element</a></li>
</ul>

</body>
</html>