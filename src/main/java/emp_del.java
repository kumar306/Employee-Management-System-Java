import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.sql.*;

@WebServlet("/emp_del")
class emp_del extends HttpServlet {
public void init() {
}
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
try{  
String dri="org.sqlite.JDBC";
String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
String user=req.getParameter("id");
Class.forName(dri);
Connection ct=DriverManager.getConnection(dripath);
        PreparedStatement ps=ct.prepareStatement("delete from employees where username=?");
        int status=0;
        ps.setString(1,user);
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