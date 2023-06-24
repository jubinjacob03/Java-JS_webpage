# Java-JS_webpage

A streaming webpage developed on Apache NetBeans IDE 15, using Java &amp; JavaScript with login page connected to MySQL backend.  

# Requirements

- Apache NetBeans IDE 15
- Windows 7 or above
- Apache Tomcat
- Java SDK
- MySQL 
<br>  
:wrench: My specifications :
<br><br>




	Product Version: Apache NetBeans IDE 15  
    Java: 18.0.2.1; Java HotSpot(TM) 64-Bit Server VM 18.0.2.1+1-1  
    Runtime: Java(TM) SE Runtime Environment 18.0.2.1+1-1  
    System: Windows 11 version 10.0 running on amd64; UTF-8; en_IN (nb)  
    MySQL Workbench: version 8.0.31

# Setup

- Install Apache NetBeans IDE 15 and configure Tomcat server with it.
- Open MySQL Workbench and create a Localhost Adminstrator Account.
- Clone this repo using git to any folder.
- Open <em><strong>'MySQL_ReadMe.txt'</strong></em> from repo files and copy paste each line into <em><strong>MySQL Database</strong></em> and execute them.
- Open Apache NetBeans and navigate to Menu Tab > File > Open Project
- Locate the cloned folder and click 'Open Project'.
- All project files and resources will be now properly loaded to NetBeans.
- Navigate to <i><strong>\build\src\java\exist\response\java</strong></i> and open <em><strong>'exist.java'</strong></em> in working pane.
- Find the line <code>con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");</code>
- Change the values of <i><strong>"root,"root"</strong></i> to your MySQL Workbench Localhost Adminstrator <em><strong>Username</strong></em> and <em><strong>Password</strong></em> respectively.
- Similarly open and change MySQL credential values in <em><strong>'login.java'</strong></em>.
- Save the changes ( <em><strong>Ctrl + S</strong></em> )

# Running the Project

- Click on Menu Tab > Run > Clean and Build Project
- Again click Menu Tab > Run > Run Project
- Enter Apache Tomcat server user and password.
- Default browser will open Localhost port automatically, if not opened; Open any browser and go to <code>http://localhost:8080/</code>
- The website will be now <em><strong>live</em></strong>.
- To close the live server, navigate to the server pane under working pane and click the stop button or directly close the browser.

# Help

:link: Major components in DIR :
<br>



	
	index.html : Main page/ Home page.  
    login2.jsp : Handle Front-End + JS for Sign-in section.  
    exist.java : Handle Back-end + JDBC for Sign-in section.  
    login.jsp : Handle Front-End + JS for Sign-up section.  
    login.java : Handle Back-end + JDBC for Sign-iup section.  
    success.jsp : Act as ToNext page after successful authentication with Database.
    MySQL_ReadMe.txt : Contains all the Back-end configuration codes for creating Database.

