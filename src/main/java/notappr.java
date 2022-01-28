import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.sql.*;

@WebServlet("/notappr")
class notappr extends HttpServlet implements Runnable{
public void run() {
System.out.println("Not approved the leave request");
}
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
try{  
        String dri="org.sqlite.JDBC";
        String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
        String field1=req.getParameter("user");
        String field2=req.getParameter("startdate");
        Class.forName(dri);
        Connection ct=DriverManager.getConnection(dripath);
        PreparedStatement ps=ct.prepareStatement("delete from leave where username=? and start_date=?");
    
        ps.setString(1,field1);
        ps.setString(2,field2);
        int status=0;
        status=ps.executeUpdate();

        ct.close();
      }
        catch(Exception ex) {
        System.out.println(ex);
        }
}

public void destroy() {
}
}