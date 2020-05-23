import java.sql.*;
import java.util.*;

class jdbcone{
  public static void main (String a[]) throws SQLException{
  try{
    Driver d= new JdbcOdbcDriver(); //drivers are loaded
    DriverManager.registerDriver(d); //drivers registered
    Connection con=getConnection("jdbc:odbc:jdbcdsn","user","password");
    Statement st=con.createStatement(); //statement object is created
    Resultset rs= st.executeQuery("Select deptno from employee"); //retrieving all deptartment numbers from employee table
    if(rs!=null)
    {
      int dno =rs.getInt(1);
      System.out.println(dno);
    }
    else{
      System.out.println("Records not found");
    }
    
  }
    catch Exception e{
      e.printStackTrace();
    }
    finally{
      st.close();
      con.close();
    }
  
  }
}
