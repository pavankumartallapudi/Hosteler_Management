<%@page import="java.sql.*" buffer="8kb" language="java" %>
<%@ page import="javax.servlet.*" %>



<%
   String username=request.getParameter("username");
   String password=request.getParameter("pass");
   
   try {
              // Load MySQL JDBC driver
              Class.forName("com.mysql.cj.jdbc.Driver");
              // Establish connection with database
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
              
              // Prepare SQL statement to check credentials
              PreparedStatement ps = con.prepareStatement("select * from owners where username= ? and password= ?");
              ps.setString(1, username);
              ps.setString(2, password);
              ResultSet rs = ps.executeQuery();
              
              // Validate user
              if (rs.next()) {
                  
                  response.sendRedirect("owner_login_SS");
              } else {
                  // Redirect to login page with error message
                  response.sendRedirect("owner_login");
				  
              }
          } catch (Exception e) {
              e.printStackTrace();
          }

%>
