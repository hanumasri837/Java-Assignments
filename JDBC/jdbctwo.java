//Write program to upload a file(to DB) and download file(from DB) using JDBC.
import java.util.*;
import java.sql.*;

Class jdbctwo{
  
    public static void main (String a[]) throws SQLException, ClassNotFoundException{
  try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager("jdbc:mysql://localhost:1234/jdbc","user","password");
    //uploading file
    PreparedStatement p= con.prepareStatement("update employee set resume= ?"+"where name='john'");
    File file= new File("C:\Users\hanumasri\OneDrive\Documents\file.txt");
    FileInputStream newfile= new FileInputStream(file);
    p.setBinaryStream(4,newfile);
    p.executeUpdate();
    // reading file
        String str="select resume from employee where name='john'";
    Statement s=con.createStatement();    
    result= s.executeQuery(str);
        File outputfile= new File("outputfile.txt");
        FileOutputStream outfile= new FileOutputStream(outputfile);
        if(result.next()){
          input= result.getBinaryStream("resume");
          byte[] buffer=new byte[1024];
          while(input.read(buffer)>0)
          {
            outfile.write(buffer);
          }
        }
    
  }
    catch Exception e{
      e.printStackTrace();
    }
    finally{
      
        outfile.close();
        input.close();
      st.close();
      con.close();
      cst.close();
    }
  
 
  }
}
