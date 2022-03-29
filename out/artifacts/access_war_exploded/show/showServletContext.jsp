<%@ page import="jakarta.servlet.ServletContext" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: youwu
  Date: 2021/12/10
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px">
    <tr>
        <td>属性名</td>
        <td>属性值</td>
    </tr>
    <%
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=utf-8");
        ServletContext context = config.getServletContext();
        Enumeration<String> names = context.getAttributeNames();
        String name;
        while (names.hasMoreElements()) {
            name = names.nextElement();
    %>
    <tr>
        <td><%=name%></td>
        <td><%=context.getAttribute(name)%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
