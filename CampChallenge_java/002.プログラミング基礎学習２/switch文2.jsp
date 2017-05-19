<%-- 
    Document   : switch文2
    Created on : 2017/05/19, 14:59:23
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  
    char type;
         type = 'A';

    switch ('A'){
        case 'A':
            out.print("英語");
            break;
        case 'あ':
            out.print("日本語");
            break;
            }
%>