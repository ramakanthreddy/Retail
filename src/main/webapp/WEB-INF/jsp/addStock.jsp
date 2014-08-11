<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" commandName="addstock" action="addStock.htm">
  Category<form:input path="category"/>
 <br />
  Sub-Category<form:input path="subcategory"/>
  <br/>
  Quantity<form:input path="quantity"/>
  <br/>
  Price per unit<form:input path="price"/>
  <br/>
  <input type="submit" value="addStock" />
</form:form>
</body>
</html>