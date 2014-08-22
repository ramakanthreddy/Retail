<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#search").click(function(){
		var seachUser = $("#searchUser").val();
		$.ajax({type:"GET",url:"searchUserResult.htm",
			accepts:"text/json",
				data:{"searchUser":searchUser},
success:function(result){
	$("#responceData").html(result);
}				
			});
	});
});	






</script>
</head>
<body>
<div style="background: green;width:1000px;length:1000px">
<form:form action="searchUserResult.htm" commandName="searchUser">
<h3>Enter User:</h3><form:input path="screenName" id="searchUser"/>
<input type="submit" value="search user" id="search"/>
</form:form>
</div>
<div id="responseData">
</div>
</body>
</html>