<%-- 
    Document   : for文3
    Created on : 2017/05/22, 18:09:31
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    int count = 1;
    int num = 0;
    
for (int i = 1; i <= 100; i++){
    //計算
    num = num + i;
    //表示
    
    out.print(i+"回目:");
    out.print( num + "<br>");
   
            
}
%>
