<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${paramValues.animals[0] =='TIGER'}">
		its a tiger
	</c:when>
	<c:when test="${paramValues.animals[0] =='LION'}">
		it is a lion
	</c:when>
	<c:when test="${paramValues.animals[0] eq 'ELEPHANT'}">
		it is Elephant
	</c:when>
	<c:otherwise>
		invalid choice
	</c:otherwise>
</c:choose>
	