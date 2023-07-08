/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author acer
 */
import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon()
    {
        //Connection con=null;
        //PreparedStatement pst=null;
        //ResultSet rs=null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://@localhost:3306/project","root","Darkarrow@1");
            //if(con!=null)
            //System.out.println("Successfully connected");
            return con;
        }
        catch(Exception e)
        {   System.out.println(e);
            System.out.println("not connected");
            return null;
        
    }    
}
}
