/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackege.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
/**
 *
 * @author guest1Day
 */
public class hikimodo2 extends HttpServlet {

    String[][] prf(int x,int y){
        String[][]taji;
        
        if(x<3){
            x=3;
        }
        if(y<4){
            y=4;
        }
        
        taji = new String [x][y];
        
        
        taji[0][0] = "1";
        taji[0][1] = "Aさん";
        taji[0][2] = "埼玉県";
        taji[0][3] = "12月1日";
        taji[1][0] = "2";
        taji[1][1] = "Bさん";
        taji[1][2] = null;
        taji[1][3] = "1月1日";
        taji[2][0] = "3";
        taji[2][1] = "Cさん";
        taji[2][2] = "神奈川";
        taji[2][3] = "2月1日";
      
        //for (int i=0;i<taji.length; i++){
        //return taji[i];
        
    //}
        
            return taji;
         
            
           
    }
    
    
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
            
       
            
            //戻り値に使う配列
            String[][] output;
          
            output = prf(3,4);
            

            
            //outputに入ったものを1つずつ展開
            for (int j =0;j<3;j++){
                for(int i =1;i<4;i++){
                    if(output[j][i]==null){
                      continue;
                    }                        
               out.print(output[j][i]+"<br>");
                }
                
            
               
            
            //拡張for文で要素を一つずつ表示
            //for (int i=0;i<prf2.; i++){
                //out.print(prf2[i]);
            //}
          
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikimodo2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        }
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