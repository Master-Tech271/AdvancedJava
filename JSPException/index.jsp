<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>JSP Exception</title>
</head>
<body>


<form action="index.jsp">
	<input type="text" name="num1" required><br><br><br>
	<input type="text" name="num2" required><br><br><br>
	<input type="submit" value="submit" name="sub"><br>
</form>

<!-- try catch exception in jsp  -->
<%
	if(request.getParameter("sub")!=null) {
	try{
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));

	try {
	%>
	<%="Answer is = "+ (num1/num2) %>
	<%

} catch(ArithmeticException ae) {
	out.println("Divide by zero is invalid!.. "+ae);
}
} catch(Exception je) {
	out.println("Enter only Integers value");
}
}
%>

</body>
</html>