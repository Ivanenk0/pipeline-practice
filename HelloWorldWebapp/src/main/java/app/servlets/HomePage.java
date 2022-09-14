package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class HomePage extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dbInteraction = request.getParameter("submit");
        switch (dbInteraction) {
            case "Browse users" :
                request.getRequestDispatcher("/src/main/webapp/browse-users.jsp").forward(request,response);
                break;
            case "Add new user" :
                request.getRequestDispatcher("/src/main/webapp/add-new-user.jsp").forward(request,response);
                break;
            case "Remove user" :
                request.getRequestDispatcher("/src/main/webapp/remove-user.jsp").forward(request,response);
                break;
            case "Modify user" :
                request.getRequestDispatcher("/src/main/webapp/modify-user.jsp").forward(request,response);
                break;
            default:
                request.getRequestDispatcher("/src/main/webapp/index.jsp").forward(request,response);
        }
    }
}
