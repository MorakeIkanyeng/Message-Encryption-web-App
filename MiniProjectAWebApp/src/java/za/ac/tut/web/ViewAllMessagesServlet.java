/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.MiniProjectFacadeLocal;
import za.ac.tut.entity.MiniProject;

/**
 *
 * @author morak
 */
public class ViewAllMessagesServlet extends HttpServlet {

    @EJB MiniProjectFacadeLocal sfl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        List<MiniProject> proj = sfl.findAll();
        request.setAttribute("proj", proj);
        
        RequestDispatcher disp = request.getRequestDispatcher("ViewAllMessageOutcome.jsp");
        disp.forward( request, response);
    }

}
