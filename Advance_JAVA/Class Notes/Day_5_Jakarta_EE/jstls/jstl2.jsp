<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
Vector v=new Vector();
v.addElement("first");
v.addElement(new Integer(420));
v.addElement(new Boolean(true));
request.setAttribute("myvect",v);
%>
<c:forEach var="xy" items="${myvect}">
	${xy}
</c:forEach>