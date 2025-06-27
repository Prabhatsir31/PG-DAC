<%pageContext.setAttribute("one","PAGE");%>
<%request.setAttribute("two","REQUEST");%>
<%session.setAttribute("three","SESSION");%>
<%application.setAttribute("four","APPLICATION");%>

<%=pageContext.getAttribute("one")%>
<br>
${pageScope.one}
<br>
${one}
<br>

<%=request.getAttribute("two")%>
<br>
${requestScope.two}
<br>
${two}
<br>

<%=session.getAttribute("three")%>
<br>
${sessionScope.three}
<br>
${three}
<br>

<%=application.getAttribute("four")%>
<br>
${applicationScope.four}
<br>
${four}
<br>