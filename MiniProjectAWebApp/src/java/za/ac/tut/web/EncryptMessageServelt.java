package za.ac.tut.web;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.bl.MassageManager;
import za.ac.tut.bl.MessageInterface;
import za.ac.tut.bl.MiniProjectFacadeLocal;


public class EncryptMessageServelt extends HttpServlet {
    
    @EJB MiniProjectFacadeLocal sfl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String msg = (String)session.getAttribute("message");
        MessageInterface encrypt = new MassageManager();
        String encrypted = encrypt.encrypt(msg);
        updateSession(session, encrypted);
        
        RequestDispatcher disp = request.getRequestDispatcher("encryptMessageOutcome.jsp");
        disp.forward( request, response);
    }

    private void updateSession(HttpSession session, String encrypted) {
        String encrypt;
        
        encrypt = (String)session.getAttribute("encrypt");
        encrypt = encrypted;
        session.setAttribute("encrypt", encrypt);
    }

}
