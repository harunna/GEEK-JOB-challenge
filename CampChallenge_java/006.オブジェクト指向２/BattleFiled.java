/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class BattleFiled extends HttpServlet {

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

            //dealerインスタンスを生成
            Dealer dealer = new Dealer();
            //userインスタンスを生成
            User user = new User();

            out.print(dealer.cards);
            out.print("<br>");

            dealer.setCard(dealer.deal());
            out.print("ディーラーの手札は" + dealer.myCards + "だった");
            out.print("<br>");

            user.setCard(dealer.deal());

            out.print("ユーザーの手札は" + user.myCards + "だった");
            out.print("<br>");

            if (user.checksum()) {
                user.setCard(dealer.hit());
                out.print("ユーザーはカードを引いた" + "<br>" + user.myCards + "になった");
                out.print("<br>");
            } else {
                out.print("ユーザーはhitしませんでした。");
                out.print("<br>");
            }

            if (dealer.checksum()) {
                dealer.setCard(dealer.hit());
                out.print("ディーラーはカードを引いた" + "<br>" + dealer.myCards + "になった");
                out.print("<br>");
            } else {
                out.print("ディーラーはhitしませんでした。");
                out.print("<br>");
            }
            out.print("ユーザーの合計は" + user.open());
            out.print("<br>");
            out.print("ディーラーの合計は" + dealer.open());
            out.print("<br>");

            //カードを見比べて勝敗を決める
            //dealer又はuserが21だった時
            if (dealer.open() > 21 || user.open() > 21) {
                if (dealer.open() > 21 && user.open() > 21) {
                    out.print("どちらもバーストで引き分けです");
                } else if (user.open() > 21) {
                    out.print("ディーラーの勝ちです");
                } else {
                    out.print("ユーザーの勝ちです");
                }

                //dealer又はuserが21だった時
            } else if (dealer.open() == 21 || user.open() == 21) {
                if (dealer.open() == 21 && user.open() == 21) {
                    out.print("引き分けです");
                } else if (user.open() == 21) {
                    out.print("ユーザーの勝ちです");
                } else {
                    out.print("ディーラーの勝ちです");
                }

                //userがdealerよりも持ち札が大きかった時        
            } else if (dealer.open() < user.open()) {
                out.print("ユーザーの勝ちです");
            } else if (dealer.open() > user.open()) {
                out.print("ディーラーの勝ちです");
            } else {
                out.print("引き分けです");
            }

           
 /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BattleFiled</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("</body>");
            out.println("</html>");
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
