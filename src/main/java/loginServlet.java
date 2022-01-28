import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.sql.*;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet  implements Runnable
{

public void run() {
      System.out.println("Running login Servlet");
   }
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {

res.setContentType("text/html");
PrintWriter out=res.getWriter();
String name=req.getParameter("username");
String pwd=req.getParameter("password");
Connection ct=null;ResultSet rs=null;
try
{
    String dri="org.sqlite.JDBC";
    String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
    Class.forName(dri);
    ct=DriverManager.getConnection(dripath);
try {
    PreparedStatement ps=ct.prepareStatement("select * from employees where username=? and password=?");
ps.setString(1,name);
ps.setString(2,pwd);
rs=ps.executeQuery();
if(rs.next())
{
    if(rs.getString(12).equals("Employee"))
{
RequestDispatcher rd=req.getRequestDispatcher("empdashboard.jsp");        
rd.forward(req,res);
}
    else if(rs.getString(12).equals("Admin"))
{
RequestDispatcher rd=req.getRequestDispatcher("admindashboard.jsp");        
rd.forward(req,res);
}
}
else
{
out.println("<h1>Incorrect login details</h1></div>");
RequestDispatcher rd=req.getRequestDispatcher("login.jsp");  
rd.include(req, res);
}
ct.close();
}
catch(Exception ex) {System.out.println(ex); }
}
catch(Exception ex) {System.out.println(ex); }
}
public void destroy() {

}

}

