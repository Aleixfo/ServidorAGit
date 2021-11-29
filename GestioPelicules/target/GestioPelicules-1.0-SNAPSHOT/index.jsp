<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Login</title>
</head>
<body>

<!--
 Amb les seguents marques s'indica quina part del codi conte instruccions
 que s'han de substituir pel seu resultat.
 <½ ... ½>
 <½= [EXPRESIO] %>
-->

<%/*@ include file="header.jsp"*/%>

<h1>Login</h1>

<form name="loginForm" method="get" action="ServletLogin">

    User: <label><br>
    <input type="text" name="usuario"/>
</label><br>
    Password: <label><br>
    <input type="password" name="password"/>
</label><br><br>
    <input type="submit" value="LogIn">

</form>

<%/*@ include file="footer.jsp"*/%>

</body>
</html>




