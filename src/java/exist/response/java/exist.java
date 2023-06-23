
package exist.response.java;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/log")
public class exist extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String email = request.getParameter("str1");
       String pwd = request.getParameter("str2");
       HttpSession session = request.getSession();
       PrintWriter out = response.getWriter();
       RequestDispatcher dispatcher = null;
           
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
           PreparedStatement pst = con.prepareStatement("select * from user where email = ? and pwd = ?");
           pst.setString(1, email);
           pst.setString(2, pwd);
           
           ResultSet rs = pst.executeQuery();
           if(rs.next()) {
               session.setAttribute("str1", rs.getString("email"));
               dispatcher = request.getRequestDispatcher("success.jsp");
           } else {
               request.setAttribute("status1", "failed");
               dispatcher = request.getRequestDispatcher("login.jsp");
           }
           dispatcher.forward(request, response);
       } catch (ServletException | IOException | ClassNotFoundException | SQLException e) {
       }
     }
}
