package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 807930
 */
public class ShoppingListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        if (request.getParameter("logout") != null){
            session.invalidate();
            session = request.getSession();
            request.setAttribute("message", "You have successfully logged out.");
        }
        
        String username = "";
        String sessionUsername = (String) session.getAttribute("username");
        if(sessionUsername == null){
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            
        } else 
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
