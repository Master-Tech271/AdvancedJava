<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page errorPage="PageExceptionHandler.jsp" %>
<!DOCTYPE html>
<html>
<head>
	<title> PageException </title>
</head>
<body>
<form action="pageException.jsp">
	<input type="text" name="num1" required><br><br><br>
	<input type="text" name="num2" required><br><br><br>
	<input type="submit" value="submit" name="sub"><br>
</form>

<!-- page exception in jsp  -->
<%
	if(request.getParameter("sub")!=null) {
	
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));

	%>
	<%="Answer is = "+ (num1/num2) %>
	<%

}
%>
</body>
</html>