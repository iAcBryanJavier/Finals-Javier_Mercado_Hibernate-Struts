<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="/struts-tags" prefix="s"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Plate Number Coding</title>
</head>
<body>
	<h2>Finals using hibernate</h2>
	<s:form action= "compute.action" method="post">
		<s:textfield label="Enter Bus Name:" key="busName" size="15"/>
		<s:textfield label="Enter Plate Number" key="plateNumber" size="35"/>
		<s:textfield label="Enter Driver Assigned" key="driverAssigned"/>
		<s:reset/>
		<s:submit value='Determine Plate Number Coding'/>
		
	</s:form>
</body>
</html>