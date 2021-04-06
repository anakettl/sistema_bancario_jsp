package dao;

import java.sql.*;

public class ConnectionFactory {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
           Class.forName("com.mysql.jdbc.Driver");
           String urlBD="jdbc:mysql://localhost:3306/trabalho8";
           return DriverManager.getConnection(urlBD, "root", "");
    }
}

