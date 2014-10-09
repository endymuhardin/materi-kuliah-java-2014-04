<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halo JSP</title>
    </head>
    <body>
        <h1>Hello ${nama}!</h1>
        
        <h2>Waktu saat ini : <fmt:formatDate pattern="HH:mm:ss"  value="${waktu}"></fmt:formatDate></h2>
    </body>
</html>
