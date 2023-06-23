<% 
   if(session.getAttribute("str1")==null){
     response.sendRedirect("login.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Watch Anime</title>
    </head>
    <body>
    <container-fluid>
        <div class="container-fluid">
            <center>
            <h1>Web Page Blocked</h1>
            <br>
            <br>
            <h2>The page you have requested has been blocked,</h2>
            <h2>because the URL is banned as per the Government Rules...</h2>
            </center>
        </div>
    </container-fluid>
        
    </body>
</html>
