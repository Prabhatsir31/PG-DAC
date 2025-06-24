<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="status" scope="request" value="brilliant"/>
	${status}

<c:remove var="status" scope="request"/>

	<br>
	${status}