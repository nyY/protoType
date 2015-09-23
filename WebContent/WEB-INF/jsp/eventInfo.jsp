<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>  
<%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
  <head>  
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>  
      Event
    </title>  
  </head>  
  <body>  
  <s:if test="hasActionMessages()">
	<s:actionmessage/>
  </s:if>
  
  <a href="Event">top</a><br/>
  <a href="Create">create</a><br/>
  <a href="Edit">edit</a><br/>
  <a href="Select">select</a><br/>
  </body>  
</html>  