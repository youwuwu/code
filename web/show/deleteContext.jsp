<%@ page import="jakarta.servlet.ServletContext" %>
<%@ page import="java.util.Enumeration" %>
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
            context.removeAttribute(name);
        }
        context.setAttribute("liker", "揭小冰");
        context.setAttribute("lover", "黄穗");
        Enumeration<String> realnames = context.getAttributeNames();
        String realname;
        while (realnames.hasMoreElements()) {
            realname = realnames.nextElement();
    %>
    <tr>
        <td><%=realname%>
        </td>
        <td><%=context.getAttribute(realname)%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
