<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>iFrend CRM</title>
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body>
<h1 align="center">CRM</h1>
<p align="center">
Please use the form below to log in to your account.
</p>

 <%System.out.println(" SPRING_SECURITY_LAST_EXCEPTION --->: " + session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION")); %>
 
 
	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>

<form action="j_spring_security_check" method="POST">
<table align="center">
  
  
    
	<tbody>
	  <tr>
	    <td><label for="j_username">User ID:</label></td>	    	    
	  </tr>
	  <tr>	   
	    <td><input id="j_username" name="j_username" size="20" maxlength="50" type="text"/>	</td>	    
	  </tr>
	  <tr>
	    <td><label for="j_password">Password: </label></td>	    	    
	  </tr>
	  <tr>	    
	    <td><input id="j_password" name="j_password" size="20" maxlength="50" type="password"/>	</td>	    
	  </tr>
	  <tr>
	    <td><label for="_spring_security_remember_me">Remember Me?</label> </td>
	    <td><input id="_spring_security_remember_me" name="_spring_security_remember_me" type="checkbox" value="true"/>	</td>	    
	  </tr>
	  <tr>
		  <td>
		  	<input type="submit" value="Login"/>
		  </td>
	  </tr>
	  
	</tbody>

</table>






</form>



</body>
</html>