<%@ page  contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<html>
<head>

<title>Login</title>
</head>
<body>
<h1>page d'authentification</h1>
<c:if test="${not empty msg_erreur }">
${msg_erreur}
</c:if>

<c:if test="${not empty msg_logout }">
${msg_logout}
</c:if>

<form action="j_spring_security_check" method="post">
 <table>
 <tr>
 <td>Username</td> <td><input type="text" name="username"/></td>
 </tr>
 <tr>
 <td>Password</td> <td><input type="password" name="password"/></td>
 </tr>
 <tr>
 <td colspan="2" align="center"><input type="submit"value="Valider"/></td>
 </tr>
 </table>

</form>


</body>
</html>