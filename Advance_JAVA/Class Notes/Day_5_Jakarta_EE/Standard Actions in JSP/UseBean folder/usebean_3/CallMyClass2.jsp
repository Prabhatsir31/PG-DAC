<jsp:useBean id="ob1" class="beanpack.MyClass2"/>


<jsp:setProperty name="ob1" property="name" param="nm"/>

<jsp:setProperty name="ob1" property="age" param="ag"/>

The values are <br><br>
<jsp:getProperty name="ob1" property="name"/>

<jsp:getProperty name="ob1" property="age"/>