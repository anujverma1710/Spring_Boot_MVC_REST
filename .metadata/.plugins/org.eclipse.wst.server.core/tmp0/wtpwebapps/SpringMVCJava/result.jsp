<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page import="com.telusko.web.UserSessionListener" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Result is : ${result}

No. of visits : ${counter}

<% 
UserSessionListener counter = (UserSessionListener) session.getAttribute(UserSessionListener.COUNTER); 
%>

Number of online user(s): <%= counter.getActiveSessionNumber() %>


</body>
</html>