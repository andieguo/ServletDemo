<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=’1’ cellspacing=’0’ cellpadding=’5’>
		<tr>
			<th>number</th>
			<th>squared</th>
		</tr>
		<%
			for (int i = 0; i < 10; i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=(i * i)%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>