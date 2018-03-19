<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>scriptlet2</title>
</head>
<body>
	<H2>JSP Scriptlet2</H2>

	<%
	int count = 0;
	for(int i = 0; i < 10; i++){
		count += i;
		}
	out.println("count=" + count);
	%>
</body>
</html>