<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.*"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
This is login.jsp啊1231
<%
    Date d = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String now = df.format(d);
%>

当前时间：<%=now %>

</body>
</html>