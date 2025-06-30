/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.MiniProjectFacadeLocal;

/**
 *
 * @author morak
 */
public class EnterMassageServlet extends HttpServlet {
    
    @EJB MiniProjectFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String message = request.getParameter("message");
        
        updateSession(session, message);
         
        RequestDispatcher disp = request.getRequestDispatcher("enterMessageOutcome.jsp");
        disp.forward( request, response);
    }

    private void updateSession(HttpSession session, String msg) {
        
        String message = (String) session.getAttribute("message");
        message = msg;
        session.setAttribute("message", message);
    }

    
}
