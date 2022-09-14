package app.database;

import java.sql.Connection;
import java.sql.Driver;

public interface DatabaseConnection {
    Connection getConnection();
    Class getDriver();

}
