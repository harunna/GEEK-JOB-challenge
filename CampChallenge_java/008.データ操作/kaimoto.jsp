<%-- 
    Document   : kaimoto
    Created on : 2017/07/06, 17:07:49
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  
<body> 
 <%
     request.setCharacterEncoding("UTF-8");
     int t = Integer.parseInt((String)request.getParameter("total"));
     int c = Integer.parseInt((String)request.getParameter("count"));
     int ty = Integer.parseInt((String)request.getParameter("kind"));
 
     out.print("総額" + t + "円<br>");
     if(ty ==1){
     out.print("購入する商品：雑貨<br>");
    }
    else if(ty ==2){
     out.print("購入する商品：生鮮食品<br>");
     }
     else if(ty ==3){
     out.print("購入する商品：その他<br>");
     }
     out.print("個数" + c + "個(１個あたり" + t / c + "円）<br><br>");
    if (t > 4999) {
         double p = t * 0.05;
         out.print("5000円以上購入されたため、5％のポイント(" + ((int) p) + ")が付きました。");
    } else if (t > 2999) {
         double p = t * 0.04;
        out.print("3000円以上購入されたため、4％のポイント(" + ((int) p) + ")が付きました。");
     }
 %>
 <body>

</html>

 

