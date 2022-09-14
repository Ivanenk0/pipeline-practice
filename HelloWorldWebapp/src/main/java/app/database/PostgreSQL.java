package app.database;

import java.sql.*;

public class PostgreSQL implements DatabaseConnection{
    /**
     * database url
     */
    private static final String databaseURL = "jdbc:postgresql://localhost:5432/MelonFirm";
    private static final String postgresDriver = "org.postgresql.Driver";
    /**
     * User and Password
     */
    private static final String databaseUser = "postgres";
    private static final String databasePassword = "postgres";

    public Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(databaseURL, databaseUser, databasePassword);
            System.out.println(PostgreSQL.this + "\t| Creating PostgreSQL connection");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public void getDriver() {
        try {
            Class.forName(postgresDriver);
            System.out.println(PostgreSQL.this + "\t| Creating PostgreSQL Driver Class instance");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
