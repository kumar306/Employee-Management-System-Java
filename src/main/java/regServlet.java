import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;  
import java.sql.*; 
import java.lang.*;

@WebServlet("/regServlet")
class regServlet extends HttpServlet implements Runnable {

public void run() {
System.out.println("Running Register servlet");
}

protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
String fname=req.getParameter("fname");
String lname=req.getParameter("lname");
String email=req.getParameter("email");
String joindate=req.getParameter("joindate");
String username=req.getParameter("username");
String dept=req.getParameter("dept");
String designation=req.getParameter("desig");
String phone=req.getParameter("phone");
int salary=Integer.parseInt(req.getParameter("salary"));
String blood=req.getParameter("blood");
String password=req.getParameter("password");
System.out.println(fname+" "+lname+" "+email+" "+joindate+" "+username+" "+dept+" "+designation+" "+phone+" "+salary+" "+blood+" "+password);
try
{
    String dri="org.sqlite.JDBC";
    String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
    Class.forName(dri);
    Connection ct=DriverManager.getConnection(dripath);
    int status=0;  
        try{  
            PreparedStatement ps=ct.prepareStatement(  
  "insert into employees(fname,lname,email,phone,bld_grp,joindate,dept,designation,salary,username,password,role) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1,fname);  
            ps.setString(2,lname);  
            ps.setString(3,email);  
            ps.setString(4,phone);  
            ps.setString(5,blood);  
            ps.setString(6,joindate);  
            ps.setString(7,dept);  
            ps.setString(8,designation);  
            ps.setInt(9,salary);  
            ps.setString(10,username);  
            ps.setString(11,password);  
            ps.setString(12,"Employee");
            status=ps.executeUpdate();    
if(status>0)
res.sendRedirect("home.html");
else
{
res.sendRedirect("home.html");
}
out.close();
            ct.close();  
        }catch(Exception ex){ex.printStackTrace();}  
           
}
catch(Exception e) {System.out.println(e); }
}
public void destroy()
{
}

}
