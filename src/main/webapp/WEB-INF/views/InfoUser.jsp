<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style> 
   FIELDSET { 
      border-STYLE: solid; 
      border-WIDTH: 1px; 
      border-color: #000000; 
 } 
</style> 
<div>
   <f:form modelAttribute="banqueForm" method="post"  action="iformationUser">
      <table>
          <tr>
            <td>Saisissez L'identifiant de l'utilisateur </td>
            <td><f:input path="idutilisateur"/></td>
            <td><f:errors path="idutilisateur"></f:errors></td>
          </tr>
          <tr>
            <td><input align="right" type="submit" value="OK"></td>
          </tr>
      </table>
   </f:form>
   
   
       
  

<fieldset width="250px">
<table align='left'>
<legend><tr> <td colspan=4 style="font-size: 20px; " ><strong>Informations du client </strong></td>  </tr></legend>
<!-- <tr> <td colspan=4><br/> </td>  </tr> -->
<tr> <td align='right'>Nom : </td>   <td>${banqueForm.utilisateur.nom}</td>  <tr>  <td align='right'>Prénom :</td>  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<td>${banqueForm.utilisateur.prenom}</td> </tr>
<tr> <td align='right'>CIN :</td>     <td>${banqueForm.utilisateur.cin}</td> <tr>    <td align='right'>Addresse :</td> <td>${banqueForm.utilisateur.adresse}</td> </tr>
<tr> <td align='right'>Telephone :</td><td>${banqueForm.utilisateur.tel}</td>  </tr>       <td align='right'>Role : </td> <td>${banqueForm.utilisateur.role}</td>  </tr> 

</table>
</fieldset>
<a href="menu">retour</a>
<a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>
    
<table border=1px>
<style>
table { 
color: #333;
font-family: Helvetica, Arial, sans-serif;
width: 800px; 
border-collapse: 
collapse; border-spacing: 0; 
}

td, th { 
border: 1px solid transparent; 
height: 30px; 
transition: all 0.3s;  
}

th {
background: #DFDFDF;  
font-weight: bold;
}

td {
background: #FAFAFA;
text-align: center;
}

tr:nth-child(even) td { background: #F1F1F1; }   

tr:nth-child(odd) td { background: #FEFEFE; }  

tr td:hover { background: #666; color: #FFF; } 
</style>
	
<!--    <div> -->
<%--    <f:form modelAttribute="banqueForm" method="post"  action="iformationUser"> --%>
<!--       <table> -->
<!--           <tr> -->
<!--             <td>Saisissez L'identifiant de l'utilisateur </td> -->
<%--             <td><f:input path="idutilisateur"/></td> --%>
<%--             <td><f:errors path="idutilisateur"></f:errors></td> --%>
<!--           </tr> -->
<!--           <tr> -->
<!--             <td><input type="submit" value="OK"></td> -->
<!--           </tr> -->
<!--       </table> -->
<%--    </f:form> --%>
   
<!--    </div> -->
   
<!--    <div> -->
<!--      <table> -->
<!--         <tr> -->
<!--           <td>Nom: </td> -->
<%--           <td>${banqueForm.utilisateur.nom}</td> --%>
<!--         </tr> -->
<!--         <tr> -->
<!--           <td>Prenom: </td> -->
<%--           <td>${banqueForm.utilisateur.prenom}</td> --%>
<!--         </tr> -->
<!--         <tr> -->
<!--           <td>CIN: </td> -->
<%--           <td>${banqueForm.utilisateur.cin}</td> --%>
<!--         </tr> -->
<!--         <tr> -->
<!--           <td>Adresse: </td> -->
<%--           <td>${banqueForm.utilisateur.adresse}</td> --%>
<!--         </tr> -->
<!--         <tr> -->
<!--           <td>Tél: </td> -->
<%--           <td>${banqueForm.utilisateur.tel}</td> --%>
<!--         </tr> -->
<!--         <tr> -->
<!--           <td>Role: </td> -->
<%--           <td>${banqueForm.utilisateur.role}</td> --%>
<!--         </tr> -->
<!--      </table> -->
<!--    </div> -->
</body>
</html>