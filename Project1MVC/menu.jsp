<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Project-1 MVC</title>
</head>
<body>
	
	<div style="width: 300px; overflow-x: hidden; margin: 0 auto; margin-top: 20px;">
		<table  style="padding: 20px;  border: 2px solid orange;">
			<tr  style="color: red;">
				<th style="padding: 15px;">Id</th>
				<th style="padding: 15px;">Item Name</th>
				<th style="padding: 15px;">Price</th>
			</tr>

	<c:forEach var="item" items="${foodItems}">
		<tr style="padding: 5px; color: blue; ">
			<td style="padding: 15px;">${item.id}</td>
			<td style="padding: 15px;">${item.item}</td>
			<td style="padding: 15px;">${item.price}</td>
		</tr>
		
	</c:forEach>
	</table>
	</div>
</body>
</html>