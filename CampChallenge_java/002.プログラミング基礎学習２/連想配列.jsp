<%-- 
    Document   : rensou
    Created on : 2017/05/22, 15:10:56
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<%
 
HashMap<String,String> prof = new HashMap<String,String>();

prof.put("1","AAA");
prof.put("hello","world");
prof.put("soeda","33");
prof.put("20","22");


//確認の為記載

out.print(prof.size());
out.print(prof.get("1")); 
out.print(prof.get("hello"));
out.print(prof.get("soeda"));
out.print(prof.get("20"));


%>
        