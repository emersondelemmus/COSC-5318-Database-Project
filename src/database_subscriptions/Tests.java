/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author brendanmcantosh
 */
public class Tests {
    
    public static void main(String []args ) throws SQLException
    {
            DBcommands cmd = new DBcommands();
            String Table = "MAGAZINE";
            String Attributes = "Name, Mfrequency";
            String Values = "'Times', '235 weeks'";
            String Where = "Name = 'Times'";
            cmd.insert(Table, Attributes, Values);
            cmd.delete(Table, Where);
           
             
    }
    
}
