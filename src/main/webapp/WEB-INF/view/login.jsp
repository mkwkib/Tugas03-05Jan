<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: btpnsshifted
  Date: 12/18/2019
  Time: 3:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="utf-8">
    <meta name="keywords" content="Queer Signup form a Flat Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
    <link href="/static/css/style.css" rel='stylesheet' type='text/css' />
    <!--webfonts-->
    <link href="//fonts.googleapis.com/css?family=Montserrat:400,500,600,700,800,900" rel="stylesheet">
    <!--//webfonts-->

</head>
<body>

<h1>ARIF</h1>

<div class="w3_frm">
    <!---728x90--->
    <form action="/login" method="post">
        <h3>Login Form</h3>
        <div class="field-w3-agile-grid leftf">
            <input id="username" type="text" name="username" placeholder="User Name" required="" />
        </div>
        <!---728x90--->
        <div class="field-w3-agile-grid leftf">
            <input id="password" type="text" name="password" placeholder="password" required="" />
        </div>
        <input type="submit" value="LOGIN">
        <div class="field-w3-agile-grid leftf">
            <span><c:out value="${error}"/></span>
            <span><c:out value="${message}"/></span>
        </div>
    </form>


</div>
<!--copyright-->

<!--//copyright-->


</body>
</html>
