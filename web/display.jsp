<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Plate Number Coding</title>
</head>
<body>

	<p> The <b><s:property value="busName"/></b> with plate number <b><s:property value="plateNumber"/></b>
		belongs to <b><s:property value="codingDay"/></b> coding. Assigned driver is <b><s:property value="driverAssigned"/>.</b>
	</p>
	
	<form action="index.jsp">
		<input type="submit" value="<<GO BACK>>">
	</form>

</body>
</html>