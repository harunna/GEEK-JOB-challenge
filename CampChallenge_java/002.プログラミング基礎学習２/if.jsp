<%-- 
    Document   : if
    Created on : 2017/05/18, 17:37:36
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int num;
num = 0;
      
if (num == 1){
    out.print("1です");
}else if (num == 2){
    out.print("プログラミングキャンプです");
} else{
    out.print("その他です");
}
%>