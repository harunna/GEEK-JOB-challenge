<%-- 
    Document   : ring
    Created on : 2017/07/06, 18:04:47
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品入力PAGE</title>
    </head>
    <body>
        必要な情報を入力してください
        <form action="./kaimoto.jsp" method="get">
          
            総額:<input type = "text" name="total"><br>
            個数:<input type = "text" name="count"><br>
            商品の種類:
            雑貨:<input type = "radio" name="kind" value="1"><br>
            生鮮食品:<input type="radio" name="kind" value="2"><br>
            その他:<input type="radio" name="kind" value="3"><br>
            送信:<input type="submit" value="送信する"><br>

        </form>
    </body>
</html>
