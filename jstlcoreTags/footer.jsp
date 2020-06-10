<%@page pageEncoding="UTF-8" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body style="overflow-x: hidden;">
	<%=session.getAttribute("name")%>
	<footer>
		<div style="border: 2px dashed darkorange; width: 100%;">
			<p align="center">&copy; All right reserved 2020 </p>
		</div>
	</footer>
	<c:remove var="name" scope="session"></c:remove>
</body>
</html>