/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database_5318;

/**
 *
 * @author Em-kun
 */
public class Customers_Search {
    
    private int IDnum;
    private String Fname;
    private String Minit;
    private String Lname;
    private String Address;
    
    public Customers_Search (int ID, String Fname, String Minit, String Lname, String Address) {
    
            this.IDnum = ID;
            this.Fname = Fname;
            this.Minit = Minit;
            this.Lname = Lname;
            this.Address = Address; 
    }
    
    public int getID()
    {
        return IDnum;
    }
    
    public String getFname()
    {
        return Fname;
    }
    
    public String getMinit()
    {
        return Minit;
    }
    
    public String getLname()
    {
        return Lname;
    }
    
    public String Address()
    {
        return Address;
    }
}
