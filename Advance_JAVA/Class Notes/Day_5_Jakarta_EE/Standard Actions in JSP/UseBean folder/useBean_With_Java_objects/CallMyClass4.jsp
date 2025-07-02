<%@page import="java.util.*"%>

<jsp:useBean id="ob1" class="beanpack.MyClass4"/>

<% List a=new ArrayList(); 
   a.add(100);
   a.add("hello");
%>


<jsp:setProperty name="ob1" property="list" value="<%=a%>"/>

<jsp:getProperty name="ob1" property="list"/>




with different syntax

<br><br>
<jsp:setProperty name="ob1" property="list" value="<%=new ArrayList()%>"/>

the value is <br>

<jsp:getProperty name="ob1" property="list"/>





