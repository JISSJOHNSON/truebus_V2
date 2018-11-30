package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    String mysqlUname = "root";
    String mysqlPswd = "root"; //For MySQL SERVER
//    String mysqlPswd = ""; //For WAMP
    String mysqlURL = "jdbc:mysql://localhost:3306/truebus";
    String driverPath = "com.mysql.jdbc.Driver";
    
    Connection con;
    
    public Connect(){
        this.makeConnection();
    }
    
    public Connection makeConnection(){
        try {
            Class.forName(driverPath);
            con = DriverManager.getConnection(mysqlURL, mysqlUname, mysqlPswd);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }
}