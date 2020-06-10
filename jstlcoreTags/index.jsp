<%@page pageEncoding="UTF-8" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>JSTL Core Tags</title>
</head>
<body>
	<c:set var="name" value="Mohd Umar" scope="request"></c:set>
	<c:set var="name" value="Mohd Umar1" scope="session"></c:set>
	${requestScope.name}
	<br>
	<c:set var="str" value="${'M'},${'O'}" scope="request"></c:set>
	<c:forEach var="sa" items="${str}" varStatus="soa">
		${sa}&nbsp;
	</c:forEach>
	<c:if test="${name.equals('Mohd Umar')}" var="ifs">
		<br>${"Hello"}
	</c:if>
	<c:choose>
		<c:when	test="${name.equalsIgnoreCase('mohd umar')}"> ${'Welcome'} </c:when>
		<c:otherwise>${'Invalid'}</c:otherwise>
	</c:choose>
	<br>
	<c:url var="footer_url" scope="request" value="footer.jsp">
		<c:param name="name" value="Mohd Umar"> </c:param>
		<c:param name="age" value="19"> </c:param>
		<c:param name="id" value="456"> </c:param>
	</c:url>
	<a href="${footer_url}">Footer</a>
	<br>
	<c:forTokens var="tk" items="My Name is Mohd Umar" delims=" ">
		${tk} <br>
	</c:forTokens> 		
	<%-- <c:redirect url="${footer_url}"> </c:redirect> --%>
	<c:out value="${name}"> </c:out>
</body>
</html>