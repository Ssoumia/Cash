<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="margin-left: 50px; background-image: linear-gradient(to left,silver, white  ); font-family: Times New Roman">
<form method=post>
<table align="center">
<caption style="color: grey; font-size: 60px;"> Menu : </caption>
<tr> <td colspan=2> <br/></td> </tr>
<tr>  <td> <input type="submit" value="Information Utilisateur" name="user" style="background-image: linear-gradient(to top, silver, white  ); width:500px; height:80px; border-style: outset; font-size: 25px; text-align: center "/></td> </tr>
<tr> <td colspan=2> <br/></td> </tr>
<tr>  <td> <input type="submit" value="Information Compte" name="compte" style="background-image: linear-gradient(to top, silver, white  ); width:500px; height:80px; border-style: outset; font-size: 25px; text-align: center "/></td> </tr>
<tr> <td colspan=2> <br/></td> </tr>

 </table>
</form>
<%
 if(request.getParameter("user")!=null)
{  response.sendRedirect("saisiUser");
}
%>
<%
 if(request.getParameter("compte")!=null)
{  response.sendRedirect("getCptbyuser");
}
%>
</body>
</html>