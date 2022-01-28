import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;
import java.sql.*;
import java.lang.*;

@WebServlet("/emp_update")
class emp_update extends HttpServlet {
public void init() {
}
public void doPost(HttpServletRequest req,HttpServletResponse res)
{
try{  
        String dri="org.sqlite.JDBC";
        String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
        String field1=req.getParameter("field1");
        int field2=Integer.parseInt(req.getParameter("field2"));
        Class.forName(dri);
        Connection ct=DriverManager.getConnection(dripath);
        PreparedStatement ps=ct.prepareStatement("update employees set salary=? where username=?");
        ps.setInt(1,field2);
        ps.setString(2,field1);
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