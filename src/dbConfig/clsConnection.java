package dbConfig;

import java.sql.*;

public class clsConnection {

    String DBDriver = "com.mysql.jdbc.Driver";

    public Connection setConnection(Connection conn, String DBUserName, String DBPassword) {

        try {

            Class.forName(DBDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/traceability_system", "root", "");

        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load database driver. Pls try again");
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Unable to connect database. Database Location: ");
            System.exit(0);
        }

        return conn;

    }

}
