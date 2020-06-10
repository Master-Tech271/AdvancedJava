<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>

<% 
	String str = (String) session.getAttribute("even");
%>
<h1><%="This is Even Page <br><h3 align='center'>"+str+"</h3>"%></h1>
</body>

</html>