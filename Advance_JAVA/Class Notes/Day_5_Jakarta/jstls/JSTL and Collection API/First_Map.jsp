<%@ page isELIgnored="false" import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Map<Integer,String>mymap=new HashMap<Integer,String>();
mymap.put(1,"abc");
mymap.put(2,"xyz");
mymap.put(3,"pqr");
pageContext.setAttribute("list",mymap);
%>
<table border="2">
<c:forEach var="myvar" items="${list}">
<tr>
<td>
${myvar.key}
</td>
<td>
${myvar.value}
</td>
</tr></c:forEach></table>
</body>
</html>











