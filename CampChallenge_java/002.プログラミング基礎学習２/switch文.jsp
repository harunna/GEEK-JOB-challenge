<%-- 
    Document   : switch文
    Created on : 2017/05/19, 13:12:25
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    int type;
    type = 2;
    
        switch(type){
        case 1:
            out.print("one");
            break;
        case 2:
            out.print("two");
            break;
        default:
            out.print("想定外です");
        }
%>
