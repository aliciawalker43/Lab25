<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Welcome TO Weather</title>
</head>
<body>



<h1> Here is the Weather Update</h1>


          <div>
			
           <c:forEach var="data" items="${data.text}">
            <td><c:out value= "${data }"/></td> 		   </c:forEach>
 			
				
				
			</div>
  

</body>
</html>