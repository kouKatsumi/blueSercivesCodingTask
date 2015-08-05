<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Edit document</title>
</head>
<body>
<form:form method="POST" action="/BlueMediaAssignment/document/edited">
	<form:hidden path="id"/>
	<table>
	    <tr>
	        <td colspan="2"><form:label path="name">Name: ${command.getName()}</form:label></td>
	    </tr>
	    <tr>
	        <td><form:label path="content">Content</form:label></td>
	        <td><form:input path="content"></form:input></td>
	    </tr>
	    <tr>
	        <td colspan="2">
	            <input type="submit" value="Submit"/>
	        </td>
	    </tr>
	</table>  
</form:form>
</body>
</html>