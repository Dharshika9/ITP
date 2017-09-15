/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Yasitha Milan
 */
public class Func {
    public Func(){
        
    }
    public static int getNextNum(String col, String table, Connection con)
    {
        int id = 1;
        String query = "select max (" + col + ") as nextid from " + table;
		PreparedStatement pst = null;
		ResultSet rs = null;
	
        try
        {
            pst = con.prepareStatement(query);
            rs = pst.executeQuery(query);
            while (rs.next())
            {

                if (rs.getString("nextid") == "")
                    id = 0;
                else
                    id = Integer.parseInt(rs.getString("nextid"));
            }
			
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
        return id + 1;
    }
    public static String getNextID(String col, String table, String prefix, Connection con)
    {
        int id = 0;
        int length = prefix.length() + 1;
        String query = "select max(substring( " + col + ","+length +",length(" + col + "))) as nextid from " + table;

		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try
        	{
            		pst = con.prepareStatement(query);
            		rs = pst.executeQuery(query);
            		while (rs.next())
            		{

                		if (rs.getString("nextid") == "")
                    			id = 1001;
                		else
                    			id = Integer.parseInt(rs.getString("nextid")) + 1;
            		}
        	}
        	catch (Exception ex)
        	{
           		 System.out.println(ex);
        	}
        return prefix + id;
    }
}
