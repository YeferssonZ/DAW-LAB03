/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.miempresa.webapp03tarea;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

@WebServlet(name="LoginServlet", urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {

   /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String xusu = request.getParameter("xusu");
            String xpas = request.getParameter("xpas");
            String usuario = "yzuniga";
            String clave = "12345678";
            String errorMsg = "";
            if (xusu == null || xusu.trim().isEmpty() || xpas == null || xpas.trim().isEmpty()) {
                errorMsg = "Debe ingresar usuario y contraseña.";
            } else if (!xusu.equals(usuario)) {
                errorMsg = "Usuario incorrecto.";
            } else if (!xpas.equals(clave)) {
                errorMsg = "Contraseña incorrecta.";
            }
            if (errorMsg.isEmpty()) {
                response.sendRedirect("/WebApp03Tarea/servlets.html");
            } else {
                response.sendRedirect("/WebApp03Tarea/error_login.jsp?errorMsg=" + URLEncoder.encode(errorMsg, "UTF-8"));
            }
        } finally { 
            out.close();
        }  
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}


