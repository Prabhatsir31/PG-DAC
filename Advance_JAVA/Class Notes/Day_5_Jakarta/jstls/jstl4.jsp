<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="level" scope="request" value="first class"/>
the value for level is
${requestScope.level}