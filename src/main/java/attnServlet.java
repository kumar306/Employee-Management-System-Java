import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.sql.*;

@WebServlet("/attnServlet")
class attnServlet extends HttpServlet implements Runnable {
public void run() {
System.out.println("Running Attendance servlet");
}
public void doPost(HttpServletRequest req,HttpServletResponse res) {
String uname=(String)req.getSession().getAttribute("username");
int hr1=Integer.parseInt(req.getParameter("entertime").substring(0,2));
int min1=Integer.parseInt(req.getParameter("entertime").substring(3));
int hr2=Integer.parseInt(req.getParameter("exittime").substring(0,2));
int min2=Integer.parseInt(req.getParameter("exittime").substring(3));
if(min2<min1)
    min2=min2+60;
if(hr2<hr1)
    hr2+=24;
float hrs_worked=((hr2-hr1)*60 + (min2-min1))/(float)60.0;
try{
        String dri="org.sqlite.JDBC";
        String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
        Class.forName(dri);
        Connection ct=DriverManager.getConnection(dripath);
        PreparedStatement ps=ct.prepareStatement("update employees set hours=hours+? where username=?");
        ps.setFloat(1,hrs_worked);
        ps.setString(2,uname);
        int status=0;
        status=ps.executeUpdate();
        ct.close();
        res.sendRedirect("salary.jsp");
      }
        catch(Exception ex) {
        System.out.println(ex);
        }
}
public void destroy() {
}
}


