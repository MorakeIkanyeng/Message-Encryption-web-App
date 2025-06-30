/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.Date;
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
public class SaveMessageServlet extends HttpServlet {

    @EJB MiniProjectFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String msg = (String)session.getAttribute("encrypt");
        Long id = (Long)session.getAttribute("id");
        MiniProject proj = createProject(session,msg,id);
        sfl.create(proj);
        
        RequestDispatcher disp = request.getRequestDispatcher("saveMessageOutcome.jsp");
        disp.forward( request, response);
    }

    private MiniProject createProject(HttpSession session, String msg, Long id) {
        MiniProject proj = new MiniProject();
        proj.setId(id);
        proj.setMessage(msg);
        proj.setLength(msg.length());
        proj.setTimestamp(new Date());
        return proj;
    }
    
}
