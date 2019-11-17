<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/10/24
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车页面</title>
</head>
<body>

<h2>您的购物车商品如下:</h2>
<%
    Map<String, Integer> map = (Map<String, Integer>) session.getAttribute("car");

    if (map != null) {
        for (String name : map.keySet()) {
            Integer count = map.get(name);
%>
<h3>名称:<%=name %>,数量:<%=count%></h3>
<%

        }
    }
%>

<a href="cc"> <h4>清空购物车~!</h4></a>

</body>
</html>
