<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统首页</title>
</head>
<body>
<table>
	<s:iterator value="carTypeList" status="s">
	<tr>
     <td><s:property value="id"/></td>
     <td><s:property value="typeName"/></td>
     <td><s:property value="typeMemo"/></td>
    </tr>
   </s:iterator> 
</table>
</body>
</html>