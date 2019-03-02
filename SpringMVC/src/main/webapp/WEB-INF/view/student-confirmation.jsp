<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation</title>
</head>

<body>
The student name is ${student.firstName} ${student.lastName}
<br><br>
The student is from ${student.country}
<br><br>
The student's favourite language is ${student.favouriteLanguage}
<br><br>
The student's favourite operating system(s) is(are)
<ul>
    <c:forEach var="item" items="${student.operatingSystems}">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>
