<%-- 
    Document   : for文2
    Created on : 2017/05/22, 18:09:08
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

int i ;
String moji = "";

    out.print("start<br>");

for (i = 1; i <= 30; i++){
    //文字連結
   moji = moji + "A";
    
}

    //表示
    out.print(moji + "<br>");
    out.print("end");


%>