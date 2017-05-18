<%-- 
    Document   : sisokuenzan
    Created on : 2017/05/18, 14:19:32
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
final int BASE = 100;
int num = 5;

//足し算
int tasu  = BASE + num;
 
out.println(BASE + "+" +  num + "=" + tasu);

//引き算
int hiku  = BASE - num;
 
out.println(BASE + "-" +  num + "=" + hiku);


//掛け算
int kake  = BASE * num;
 
out.println(BASE + "*" +  num + "=" + kake);


//割り算
int wari  = BASE / num;
 
out.println(BASE + "/" +  num + "=" + wari);

%>