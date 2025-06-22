<%--  <c:url >   adds the jsessionid to the end of the "value" relative URL ( if cookies are disabled)
it is same like "response.encodeURL("/somepage"); " of servlet
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
this is a hyperlink with URL rewriting enabled
<a href="<c:url value='/jstlheader.jsp'/>"> <i>Go To jstlheader page</i></a>