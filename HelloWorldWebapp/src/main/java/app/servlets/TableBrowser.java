package app.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TableBrowser extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        final String postgresDriver = "org.postgresql.Driver";
    }
}
