<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<!--
 Amb les seguents marques s'indica quina part del codi conte instruccions
 que s'han de substituir pel seu resultat.
 <½ ... ½>
 <½= [EXPRESIO] %>
-->

<h1>Login</h1>

<form name="loginForm" method="post" action="ServletLogin">

    User: <label><br>
    <input type="text" name="usuario"/>
</label><br>
    Password: <label><br>
    <input type="password" name="password"/>
</label><br><br>
    <input type="submit" value="LogIn">

</form>

<a href="ServletLogin">Productes</a>

</body>
</html>




