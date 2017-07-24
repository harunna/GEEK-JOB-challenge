<%-- 
    Document   : soinsu
    Created on : 2017/07/07, 15:03:10
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        素因数分解します。数値を入力してください。<br>
        入力された数字は1桁の素因数のみで分解されます。<br>
        2桁の素因数は分解されません。<br>
        
        <form action="./soinsu2.jsp" method="get">
            
        数値：<input type = "text" name ="number"><br>
        <input type = "submit" value = "送信"><br>
        
        </form>
        
    </body>
</html>
