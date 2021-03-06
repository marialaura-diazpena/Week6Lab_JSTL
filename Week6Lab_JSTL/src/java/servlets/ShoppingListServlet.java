package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

    ArrayList<String> items = new ArrayList<>();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        
        String username = (String) session.getAttribute("username");
     
        if (username == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                    .forward(request, response);
            return;
        } else {
            String action = request.getParameter("action");
            if (action.equals("logout")){
                session.invalidate();
                session = request.getSession(); 
                getServletContext().getRequestDispatcher("/WEB-INF/register.jsp")
                    .forward(request, response);
           
        }
            
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp")
                    .forward(request, response);
           
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        
        String action = request.getParameter("action");
        if (action.equals("register")) {
           String username = request.getParameter("username"); 
           session.setAttribute("username", username);
           request.setAttribute("username", username); 
           
        } else if (action.equals("add")){
            String item = request.getParameter("newItem");
            items.add(item);
            request.setAttribute("items", items);
            session.setAttribute("items", items);
            
        } else if (action.equals("delete")){
            String itemSelect = request.getParameter("item");
            items.remove(itemSelect);
            request.setAttribute("items", items);
            session.setAttribute("items", items);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

    }
}