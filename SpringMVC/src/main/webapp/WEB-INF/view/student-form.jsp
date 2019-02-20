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
        <form:option value="Belgium" label="Belgium"></form:option>
        <form:option value="France" label="France"></form:option>
        <form:option value="Germany" label="Germany"></form:option>
        <form:option value="Spain" label="Spain"></form:option>
    </form:select>
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
