<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2019/10/19
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>

<h2><a href="login.html">点击进入登录页面</a><br/></h2>


让Tomcat的默认Servlet去提供下载:
<a href="img/mm.jpg">妹子.jpg</a>
<a href="img/hcc.zip">妹子2.zip</a>


手动提供下载:
<a href="dl?filename=mm.jpg">妹子.jpg</a>
<a href="dl?filename=hcc.zip">妹子2.zip</a>

</body>
</html>
