
package login.response.java;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import  java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/register")
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("str3");
        String pwd = request.getParameter("str4");
        String pwd2 = request.getParameter("str5");
        RequestDispatcher dispatcher = null;
        PrintWriter out = response.getWriter();
        Boolean temp = pwd.equals(pwd2);
        
        if(temp.equals(true)){

        Connection con = null;   
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
            PreparedStatement pst = con.prepareStatement("insert into user(email,pwd) values(?,?)");
            pst.setString(1, email);
            pst.setString(2, pwd);
            
            int rowCount = pst.executeUpdate();
            dispatcher = request.getRequestDispatcher("login.jsp");
            if(rowCount > 0){
                request.setAttribute("status", "success");   
            }
            else{
                request.setAttribute("status", "failed");
            }
            dispatcher.forward(request, response);
        } catch (ServletException | IOException | ClassNotFoundException | SQLException e) {
         }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        else{ 
             response.setContentType("text/html");  
             out.println("<script type=\"text/javascript\">");  
             out.println("alert('Password do not match');");  
             out.println("</script>");
        }   
     }     
    } 


