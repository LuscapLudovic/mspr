package dal.jdbc;

import dal.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class JdbcTools {
    private static final String urldb;

    static {

        try {
            Class.forName(Settings.getProperty("driverDB"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        urldb = Settings.getProperty("urldb");
    }



    public static Connection getConnection() throws SQLException{
        //Connection connection = DriverManager.getConnection(urldb);
        Connection connection = DriverManager.getConnection(urldb);

        return connection;
    }
}
