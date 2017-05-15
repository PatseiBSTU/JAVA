<%--
  Created by IntelliJ IDEA.
  User: npats
  Date: 14.05.2017
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="bstu.Message"%>
<html>
<head>
  <title>Title</title>

</head>
<body>
<c:out value="JSTL подключена"/>
<jsp:useBean id="ob"  class="bstu.Message" scope="request"/>
<jsp:setProperty name="ob" property="id" value="12"/>
</body>
</html>

