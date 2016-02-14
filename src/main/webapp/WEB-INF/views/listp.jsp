<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>liste des personne</title>
</head>
<body>

<ul>
<c:forEach items="${lp}" var="p">
    <li> ${p.prenom} ${p.nom}
    </li>
</c:forEach>
</ul>

<a href="list">retour</a>
<a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>
</body>
</html>