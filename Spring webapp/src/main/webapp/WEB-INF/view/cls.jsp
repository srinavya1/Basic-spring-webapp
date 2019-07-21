<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="st" action="processfrm">
	fname:<form:input path="fname"/>
	lname:<form:input path="lname"/>
	<form:select path="country">
	<form:options items="${st.countryList}"></form:options>
	</form:select>
	english <form:radiobutton value="english"  path="language"/>
	malayalam <form:radiobutton value="malayalam"  path="language"/>
	
	<form:radiobuttons path="state" items="${st.stateList}"/>
	<input type="submit"/>
	</form:form>
</body>
</html>