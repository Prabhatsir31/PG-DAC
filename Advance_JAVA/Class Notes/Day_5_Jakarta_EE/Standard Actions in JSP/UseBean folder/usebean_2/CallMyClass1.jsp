<jsp:useBean id="ob1" class="beanpack.MyClass1"/>


<jsp:setProperty name="ob1" property="num" value="200"/>

The number is <br>

<jsp:getProperty name="ob1" property="num"/>