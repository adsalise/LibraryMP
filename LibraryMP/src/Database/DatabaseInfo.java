package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jncor
 */
public class DatabaseInfo
{
    private static final String connectionString = "jdbc:mysql://DESKTOP-B322RD1:3306/test?useSSL=false";
    private static final String username = "noel";
    private static final String password = "Wve0Gb49tHt89QHB";
    
    public static String GetConnectionString()
    {
        return connectionString;
    }
    
    public static Connection DBConnection() throws SQLException
    {
        return DriverManager.getConnection(connectionString, username, password);
    }
}
