<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>

<% 
	int num = Integer.parseInt(request.getParameter("num"));

	if(num%2==0) {
		response.sendRedirect("for_even.jsp");
		session.setAttribute("even", "Your number "+ num +" is Even");
	}
	else{
	%>
	<% out.println("Your Number "+num+ " is Odd"); %>	
	<h1 align="center"><%="Odd" %></h1>
	<%

	}
%>

</body>

</html>