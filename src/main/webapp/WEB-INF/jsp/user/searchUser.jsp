<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#search").click(function(){
	var userInputData = $("#userInputData").val();
	alert(userInputData);
	$.ajax({type:"GET",url:"searchResults.htm",
		accepts:"text/json",
			data:{"searchString":userInputData},
success:function(result){
$("#responseData").html(result);
}
	});
	}
	);
});
</script>
</head>
<body>
<input type="text" name="userInputData" id="userInputData" /><input type="button" value="search" id="search">
<div id="responseData"></div>
</body>
</html>