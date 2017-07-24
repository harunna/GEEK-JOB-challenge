/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guest1Day
 */
public class Session2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            request.setCharacterEncoding("UTF-8");

            
           
            //session2.jspから受け取る( name、sex、hobby)
            String name = request.getParameter("name");
            String sex = request.getParameter("sex");
            String hobby = request.getParameter("hobby");

            //Http型でsession2のセッションを取得
            HttpSession hs = request.getSession();

//            out.print("前回の登録したデータ"+"<br>");

            

            // 何も入ってないor前回のデータをセッションから呼び出す
//            out.println("前回の登録データ<br>");
//
//            out.println("<font size=\"+1\">名前："+hs.getAttribute("name")+"</font><br>");    
//            out.println("<font size=\"+1\">性別："+hs.getAttribute("sex")+"</font><br>");
//            out.println("<font size=\"+1\">趣味："+hs.getAttribute("hobby")+"</font><br>"); 
//            out.println("<br><br>");//前回と今回のデータを分けるため改行
           


            //今回のデータ
            // HttpSession型変数.setAttributeでセッションへ登録
            // String型データを登録
            hs.setAttribute("name",name);
            hs.setAttribute("sex", sex);
            hs.setAttribute("hobby", hobby);
            
            
            
            //今回のセッションを表示
            out.println("今回の登録データ<br>");
            out.println(""+name+"</font><br>");
            out.println(""+sex+"</font><br>");
            out.println(""+hobby+"</<br>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
   
     
}
