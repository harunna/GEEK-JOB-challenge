<%-- 
    Document   : for文1
    Created on : 2017/05/22, 16:30:33
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
   
long a = 8;

for (int i = 1; i < 21; i++) {
    a *= 8;
    
    
    out.print(i + "回目；"); 
    out.print(a + "です<br>"); 
    
}

%>