import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.sql.*;

@WebServlet("/leaveServlet")
class leaveServlet extends HttpServlet implements Runnable{
public void run() {
System.out.println("Running leave servlet");
}
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
try{    
String dri="org.sqlite.JDBC";
    String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
    Class.forName(dri);
    Connection ct=DriverManager.getConnection(dripath);
        PreparedStatement ps=ct.prepareStatement("select fname,lname from employees where username=?");
        String uname=(String)req.getSession().getAttribute("username");
        System.out.println(uname);
        ps.setString(1,uname);
        ResultSet rs=ps.executeQuery();
int status=0;
while(rs.next())
{
    String fname=rs.getString(1),lname=rs.getString(2);
    int daynum=Integer.parseInt(req.getParameter("daynum"));
    String startdate=req.getParameter("startdate");
    String reason=req.getParameter("reason");
   System.out.println(daynum+" "+startdate+" "+reason);
    PreparedStatement ps1=ct.prepareStatement("insert into leave (fname,lname,username,no_of_days,start_date,leave_reason,approved) values (?,?,?,?,?,?,?)");
    ps1.setString(1,fname);
    ps1.setString(2,lname);
    ps1.setString(3,uname);
    ps1.setInt(4,daynum);
    ps1.setString(5,startdate);
    ps1.setString(6,reason);
ps1.setString(7,"N");
    status=ps1.executeUpdate();
System.out.println(status);
}
if(status>0)
res.sendRedirect("profile.jsp");
ct.close();
}
catch(Exception e) {
System.out.println(e);
}

}

public void destroy() {
}
}
