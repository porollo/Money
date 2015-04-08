<%@ taglib prefix="h" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Spider
  Date: 31.03.2015
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
  <script>




  </script>
</head>

<body>

Hello, <b>${pageContext.request.userPrincipal.name}</b>, Date and time: <%= new java.util.Date() %>

<br/>
//Make validation both client and server
<form>
  <h1>Electricity</h1>
  Date: <br/><input type="text" name="date" class="input_el_date"/>
  <br/>
  Count: <br/><input type="text" name="count" class="input_el_ count"/>
  <br/>
  <input type="submit" value="Add Electricity" />
</form>
<br/>
<br/>
<form>
  <h1>Water</h1>
  Date: <br/><input type="text" name="date" class="input_wt_date"/>
  <br/>
  Count: <br/><input type="text" name="count" class="input_wt_ count"/>
  <br/>
  <input type="submit" value="Add Water" />
</form>
<br/>
<br/>

${pageContext.request.contextPath}


</body>
</html>
