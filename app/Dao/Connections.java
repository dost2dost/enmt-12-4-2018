package Dao;

import java.sql.*;
import java.util.Properties;

/**
 * Created by Dost Muhammad on 3/21/2018.
 */
public class Connections {

    public static Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5432/conurets_automation";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","password,123");
        props.setProperty("ssl","false");
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(url,props);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
