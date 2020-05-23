import java.sql.*;
import java.util.*;

class jdbcone{
  public static void main (String a[]) throws SQLException, ClassNotFoundException{
  try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager("jdbc:mysql://localhost:1234/jdbc","user","password");
    PreparedStatement pst=con.prepareStatement("Insert into employee values(?,?,?)");
    if(pst!=null)
    {
      pst.setInt(1,3);
      pst.setString(2,"Amy W");
      pst.setString(3,"department of science");
      pst.executeUpdate();
      System.out.println("table updated");
    }
    else{
            System.out.println("pst is not created");
    }
    
    
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
    /* stored Procedure
    Create procedure empinfo(
    empname out employee.ename%type,
    empdeptno out employee.deptno%type,
    empdeptname out employee.deptname%type
    )
    IS
    BEGIN 
    Select ename,deptno,deptname into empname,empdeptno,empdeptname from employee;
    END;
    
    */
    CallableStatement cst = con.preparecall("{Call empinfo(?,?,?)}");
      
      cst.registerOutParameter(1,Types.Varchar);
      cst.registerOutParameter(2,Types.NUMERIC);
      cst.registerOutParameter(3,Types.Varchar);
      cst.execute();
    int deptnumber= cst.getInt(2);
    String name= cst.getString(1);
    String departname=cst.getString(3);
    System.out.println("deptnumber"+deptnumber+"name="+name+"departname="+departname);   
    
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
