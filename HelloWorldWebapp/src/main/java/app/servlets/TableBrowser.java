package app.servlets;

import app.database.PostgreSQL;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableBrowser extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PostgreSQL pgDatabase = new PostgreSQL();

        Statement statement = null;
        ResultSet resultSet = null;
        Connection connection = pgDatabase.getConnection();
        pgDatabase.getDriver();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query = "SELECT * FROM users";


        try {
            assert statement != null;
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("resultSet", resultSet);
        request.getRequestDispatcher("browse-users").forward(request, response);
    }
}
