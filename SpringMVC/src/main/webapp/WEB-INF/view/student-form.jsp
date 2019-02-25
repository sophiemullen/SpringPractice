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
        <form:options items="${theCountryOptions}"></form:options>
    </form:select>
    <br><br>
    Favourite Language:
    Java <form:radiobutton path="favouriteLanguage" value="Java"></form:radiobutton>
    Typescript <form:radiobutton path="favouriteLanguage" value="Typescript"></form:radiobutton>
    Python <form:radiobutton path="favouriteLanguage" value="Python"></form:radiobutton>
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
