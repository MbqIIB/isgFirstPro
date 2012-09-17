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
Insert Element
</p>

 <%System.out.println(" SPRING_SECURITY_LAST_EXCEPTION --->: " + session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION")); %>
 
 
	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused : ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>

<form action="" method="POST">
<table align="center">
  
  
    
	<tbody>
	  <tr>
	    <td><label for="element_id">Element ID:</label></td>	    	    
	  </tr>
	  <tr>	   
	    <td><input id="element_id" name="element_id" size="20" maxlength="50" type="text"/>	</td>	    
	  </tr>
	  <tr>
	    <td><label for="function_id">Function ID: </label></td>	    	    
	  </tr>
	  <tr>	    
	    <td><input id="function_id" name="function_id" size="20" maxlength="50" type="text"/>	</td>	    
	  </tr>
	  <tr>
	    <td><label for="format">Format: </label></td>	    	    
	  </tr>
	  <tr>	    
	    <td><input id="format" name="format" size="20" maxlength="50" type="text"/>	</td>	    
	  </tr>
	  <tr>
	    <td><label for="length">Length: </label></td>	    	    
	  </tr>
	  <tr>	    
	    <td><input id="length" name="length" size="20" maxlength="50" type="text"/>	</td>	    
	  </tr>
	  <tr>
	    <td><label for="description">Description: </label></td>	    	    
	  </tr>
	  <tr>	    
	    <td><input id="description" name="description" size="20" maxlength="50" type="text"/>	</td>	    
	  </tr>
	  <tr>
	    <td><label for="allowed_operators">Allowed Operators: </label></td>	    	    
	  </tr>
	  <tr>	    
	    <td><input id="allowed_operators" name="allowed_operators" size="20" maxlength="50" type="text"/>	</td>	    
	  </tr>
	  <tr>
		  <td>
		  	<input type="submit" value="Insert"/>
		  </td>
	  </tr>
	  
	</tbody>

</table>






</form>



</body>
</html>