<!DOCTYPE html>
<html>
<head>
	<title>index</title>
</head>
<body>

	<!-- pagecontext  object -: it is a reference of all the jsp implicit objects. -->
	<%
		application.setAttribute("hello", "bye");
		pageContext.setAttribute("name", "Mohd Umar", pageContext.SESSION_SCOPE);
		pageContext.setAttribute("name2", "Umar"); //BY DEFAULT PAGESCOPE
	%>
	<%= "Name = " + pageContext.getAttribute("name", pageContext.SESSION_SCOPE) %>
	<%= "<br> Hello : "+application.getAttribute("hello")%>
	<%= "<br> Hello : "+pageContext.getAttribute("hello", pageContext.APPLICATION_SCOPE)%>
	<%= "<br>Last Name = " + pageContext.getAttribute("name2", pageContext.PAGE_SCOPE) %>
</body>
</html>