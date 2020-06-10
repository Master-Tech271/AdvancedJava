<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<title> </title>
</head>
<body>

	<h1 align="center"> <%="divide by zero is invalid" %>  </h1> <br/><br/>
	<h3><% out.println(exception); %></h3>


</body>
</html>