
import java.util.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet 
{
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
	PrintWriter out= res.getWriter();
	out.print("Welcome to servlet");
	}
}
