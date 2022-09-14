package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomePage extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        switch (request.getParameter("submit")) {
            case "Browse users" :
                request.getRequestDispatcher("/browse-users.jsp").forward(request,response);
                break;
            case "Add new user" :
                request.getRequestDispatcher("/add-new-user.jsp").forward(request,response);
                break;
            case "Remove user" :
                request.getRequestDispatcher("/remove-user.jsp").forward(request,response);
                break;
            case "Modify user" :
                request.getRequestDispatcher("/modify-user.jsp").forward(request,response);
                break;
            default:
                request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
    }
}
