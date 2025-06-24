<%@taglib prefix="abc" uri="/WEB-INF/hello.tld"%>
Before tag starts
<br><b>
<abc:second code="p1" desc="Soap" price="50"/>
</b><br>
After tag
<br>
<br>
Before tag starts
<br><b>
<abc:second code='<%="p2"%>' desc="Perfume" price="150"/>
</b><br>
After tag
<br>





