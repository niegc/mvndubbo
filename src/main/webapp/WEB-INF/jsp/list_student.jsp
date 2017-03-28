<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<c:forEach var="student"   items="${stu}" >

 name:${student.id} <br>

</c:forEach>




<form action="list_onestudent">
	<input name="myid" type="text" />
	<input type="submit"  value="submit"/>
</form>


<br>

This is student:${student.userId}

 
</body>
</html>