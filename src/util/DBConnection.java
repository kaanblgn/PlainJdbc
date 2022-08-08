package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection connect() {

        // create connection object
        Connection connection = null;
        try {
            // load class
            Class.forName("org.postgresql.Driver");
            // connection
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "TesstPsqlPass123");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
