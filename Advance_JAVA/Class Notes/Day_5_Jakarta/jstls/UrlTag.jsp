<%--  <c:url >   adds the jsessionid to the end of the "value" relative URL ( if cookies are disabled)
it is same like "response.encodeURL("/somepage"); " of servlet
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<% session.setAttribute("role","admin"); %>

this is a hyperlink with URL rewriting enabled
<br></br>


<a href="<c:url value='/SomeOther.jsp'/>"> <i>Go To SomeOther page</i></a>




