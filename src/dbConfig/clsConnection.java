/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConfig;

/**
 *
 * @author Colonnello
 */
import java.io.*;
import java.sql.*;
import javax.swing.*;

public class clsConnection {

   

    String DBDriver = "com.mysql.jdbc.Driver";

    public Connection setConnection(Connection conn, String DBUserName, String DBPassword) {

        try {

            Class.forName(DBDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost/traceability_system", "root", "");

        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load database driver. Pls try again");
            e.printStackTrace();
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Unable to connect database. Database Location: ");
            e.printStackTrace();
            System.exit(0);
        }

        return conn;

    }

}
