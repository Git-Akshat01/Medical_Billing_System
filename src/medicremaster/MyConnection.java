package medicremaster;

import java.sql.*;
import javax.swing.JOptionPane;
public class MyConnection {
    public Connection connectme()
    {
       try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","dsouza","dsouza");
       }
       catch(ClassNotFoundException | SQLException e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
       return null;
    }
}