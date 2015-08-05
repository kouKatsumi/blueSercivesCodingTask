<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Document details</title>
</head>
<body>
	<p>
		Document name: ${documentDetails.getName()}
	</p>
	<p>
		Document content: ${documentDetails.getContent()}
	</p>
	<p>
		Document state: ${documentDetails.getState().toString()}
	</p>
	<c:if test="${not empty documentDetails.getReason()}">
		<p>
			Rejected reason: ${documentDetails.getReason()}
		</p>
	</c:if>
	<p>
		<c:if test="${not empty actions.getAccept()}">
    		<a href="<c:url value="/document/${documentDetails.getId()}/accept" />">${actions.getAccept()}</a>
		</c:if>
		
		<c:if test="${not empty actions.getReject()}">
    		<a href="<c:url value="/document/${documentDetails.getId()}/reject" />">${actions.getReject()}</a>
		</c:if>
		
		<c:if test="${not empty actions.getEdit()}">
    		<a href="<c:url value="/document/${documentDetails.getId()}/edit" />">${actions.getEdit()}</a>
		</c:if>
		
   		<a href="<c:url value="/history/${documentDetails.getId()}" />">history</a>
	</p>
</body>
</html>