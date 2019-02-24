<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>

    </title>
</head>

<body>
<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"></form:input>
    <br><br>
    Last name: <form:input path="lastName"></form:input>
    <br><br>
    <form:select path="country">
        <form:options items="${student.countryOptions}"></form:options>
    </form:select>
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
