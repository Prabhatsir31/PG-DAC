<%@taglib uri="http://java.sun.com/jstl/core" prefix="d" %>
<html>
  <head>
    <title>Count to 10 Example (using JSTL) using d</title>
  </head>

  <body>
    <d:forEach var="i" begin="1" end="15" step="1">
	 ${i}

      <br/>
    </d:forEach>
  </body>
</html>



