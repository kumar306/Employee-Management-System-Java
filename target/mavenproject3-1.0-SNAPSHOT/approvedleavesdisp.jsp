<%-- 
    Document   : approvedleavesdisp
    Created on : 27-Jan-2022, 11:44:02 am
    Author     : adiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@page import="java.util.*" %>
        <%@page import="java.sql.*" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Details</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <table class="table table-hover">
            <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Username</th>
                <th>Number of days</th>
                <th>Start Date</th>
                <th>Leave Reason</th>
            </tr>
            </thead>
            <tbody>
            <% String dri="org.sqlite.JDBC";
    String dripath="jdbc:sqlite:C:\\Users\\adiku\\emp_management.db";
    Class.forName(dri);
    Connection ct=DriverManager.getConnection(dripath);
    try{  
String uname=(String)session.getAttribute("username");
        PreparedStatement ps=ct.prepareStatement("select fname,lname,username,no_of_days,start_date,leave_reason from leave where approved='Y' and username=?");
        ps.setString(1,uname);        
        ResultSet rs=ps.executeQuery();

    while(rs.next())
    {
    String fname=rs.getString(1),lname=rs.getString(2),username=rs.getString(3);
int no_of_days=rs.getInt(4);
String startdate=rs.getString(5),reason=rs.getString(6);
   %>
    <tr>
    <td><%= fname %></td>
    <td><%= lname %></td>
    <td><%= username %></td>
    <td><%= no_of_days %></td>
    <td><%= startdate %></td>
    <td><%= reason %></td>
    </tr>
 <% }
ct.close();
}
catch(Exception ex) {System.out.println(ex); }
 %> 
            </tbody>
        </table>
    </body>
</html>
