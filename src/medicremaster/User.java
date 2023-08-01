package medicremaster;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ranjeet
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Arrays;
public class User {
    String username;
    char []password;
    LoginFail fail=new LoginFail();
    MainMenu pass=new MainMenu();
    DbConnection dbc=new DbConnection();
    Connection conn=dbc.connect();
    public void login(String usr,char [] psw)throws SQLException
    {
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from login where username='"+usr+"'");
        if(rs.next())
        {
            username=rs.getString(1);
            password=rs.getString(2).toCharArray();
        }
        if(usr.equals(username) && Arrays.equals(psw,password))
            pass.setVisible(true);
        else
            fail.setVisible(true);
                    rs.close();
                    stmt.close();
                    conn.close();
    } 
}
