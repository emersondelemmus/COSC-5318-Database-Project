/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;
import java.sql.*;

/**
 *
 * @author brendanmcantosh
 */
public class DBcommands {
    
    /* getConn will be called whenever a statement is used */
    public Connection getConn()
    {
             Connection conn;    
             String url = "jdbc:mysql://localhost:3306/Subscriptions";
             String user = "Admin";
             String password = "1234";
         try
         {
            conn = DriverManager.getConnection(url,user,password);
            
            return conn;
         }
         catch(SQLException e)
                    {
                        System.out.println("Connection Unsucessful");
                    }
         return null;
    }
    
    /*Inserts into table */
    public void insert(String Table, String Attributes, String Values) throws SQLException
    {
        try (Connection conn = getConn()) {
            Statement myStmt = conn.createStatement();
            /* Get the arguments from the user with the application */
            String Sql = "Insert into " + Table + " (" + Attributes
                      + ") values (" + Values + ")";
            myStmt.executeUpdate(Sql);
            System.out.println("Insert Complete");
            
            conn.close();
        }
    }
    /* Deletes from table */
    public void delete(String Table, String Where) throws SQLException
    {
        try (Connection conn = getConn())
        {
            Statement myStmt = conn.createStatement();
            String Sql = "DELETE FROM "  + Table
                    + " WHERE (" + Where + ");";
            int rowsAffected = myStmt.executeUpdate(Sql);
            
            System.out.println("Rows affected: " + rowsAffected);
            System.out.println("Deletion Complete");
            
            conn.close();
        }
    }
    /* Updates a table */
    public void update(String Table, String Set, String Where) throws SQLException
    {
        try (Connection conn = getConn())
        {
            Statement myStmt = conn.createStatement();
            String Sql = "update " + Table 
                    + " set " + Set 
                    + " where " + Where;
            
            myStmt.executeUpdate(Sql);
            System.out.println("Update Complete");
            
            conn.close();
        }
        
    }
    
}
