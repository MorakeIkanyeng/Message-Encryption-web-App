/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
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
public class StartSessionServlet extends HttpServlet {
    
    @EJB MiniProjectFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        Long id = Long.parseLong(request.getParameter("id"));
        
        initializeSession(session, name , id);
        
        RequestDispatcher disp = request.getRequestDispatcher("menu.jsp");
        disp.forward( request, response);
    }

    private void initializeSession(HttpSession session, String name, Long id) {
        String message="", encrypted = "", decrypted = "";
        int length = 0;
        
        session.setAttribute("name", name);
        session.setAttribute("id", id);
        session.setAttribute("encrypted", encrypted);
        session.setAttribute("decrypted", decrypted);
        session.setAttribute("message", message);
        session.setAttribute("length", length);
    }

}
