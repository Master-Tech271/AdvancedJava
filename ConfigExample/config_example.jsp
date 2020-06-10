<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Example</title>
</head>
<body>
	<h1>Name : <%=config.getInitParameter("Name")%></h1> <br>
	<h1>Name : <%=pageContext.getServletConfig().getInitParameter("Name")%></h1>
</body>
</html>