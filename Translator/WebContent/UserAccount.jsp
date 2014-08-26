<%@ page language="java" contentType="text/html" %>
<!Doctype html>
<html>
<% if (request.isUserInRole("translator")==false ){%>
<script>alert('User are not log in');</script>
<h1>
	<%
	out.println("request.isUserInRole('translator')="+request.isUserInRole("translator")+'\n'); 
	out.println("Your IP address is " + request.getRemoteAddr());
	%>
</h1>
<% }else{ %>
<h1>This is user account page</h1>
<%}%>
</html>