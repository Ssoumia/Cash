<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div>
   <f:form modelAttribute="banqueForm" method="post"  action="iformationCpt">
      <table>
          <tr>
            <td>Nom de L'utilisateur </td>
            <td><f:input path="nom"/></td>
            <td><f:errors path="nom"></f:errors></td>
          </tr>
          <tr>
            <td><input type="submit" value="OK"></td>
          </tr>
      </table>
   </f:form>
   
   </div>
   
   <div>
     <table>
        <tr>
          <td>Solde: </td>
          <td>${banqueForm.compte.solde}</td>
        </tr>
        <tr><td></td></tr>
        <tr>
        <td><p>Transaction éffectué sur le compte </p></td>
        </tr>
         <tr>
          <td>Date : </td>
          <td>${banqueForm.transaction.dateTransaction}</td>
        </tr>
        <tr>
          <td>Montant retiré : </td>
          <td>${banqueForm.transaction.montant}</td>
        </tr>
        
     </table>
   </div>
   <a href="menu">retour</a>
   <a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>
</body>
</html>