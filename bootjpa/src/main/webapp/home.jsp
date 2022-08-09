<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addAlien">
  <label for="fname">Alien id:</label><br>
  <input type="text" id="fname" name="aid" value="John"><br>
  <label for="lname">Alien Name:</label><br>
  <input type="text" id="lname" name="aname" value="Doe"><br><br>
    <label for="lname"> Tech:</label><br>
  <input type="text" id="lname" name="tech" value="JAVA"><br><br>
  <input type="submit" value="Submit">
</form> 

<form action="getAlien">
  <label for="fname">Alien id:</label><br>
  <input type="text" id="aid" name="aid" value="John"><br>
  <input type="submit" value="Submit">
</form> 


</body>
</html>