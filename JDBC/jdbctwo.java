//Write program to upload a file(to DB) and download file(from DB) using JDBC.
import java.util.*;
import java.sql.*;

Class jdbctwo{
  
    public static void main (String a[]) throws SQLException, ClassNotFoundException{
  try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager("jdbc:mysql://localhost:1234/jdbc","user","password");
    
    
  }
    catch Exception e{
      e.printStackTrace();
    }
    finally{
      st.close();
      con.close();
      cst.close();
    }
  
 
  }
}
