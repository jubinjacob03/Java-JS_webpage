/* Using MySQL Workbench 8.0.31
   Create a local host administrator account
   *By default the build file has localhost username and password both as "root", Change in build code if using 
    different credentials
   After creating localhost ; follow steps below to add database */


// Create a database with any name.

create database login;

// switch the working Directory and create a table to hold email and pswd value.

use login;
create table user(email varchar(50), pwd varchar(50));

// Insert some dummy values or custom values of your wish.

insert into user values('1prabhanshu@gmail.com','123456');
insert into user values('abhinani24@gmail.com','password');
insert into user values('abhishekti478@gmail.com','iloveyou');
insert into user values('aditya.ranjan09@gmail.com','princess');
insert into user values('akhileshbhambhani@gmail.com','123456789');
insert into user values('akrajawat20@gmail.com','rockyou');
insert into user values('aksandhu90@gmail.com','12345678');
insert into user values('akshayshahu000@gmail.com','abc123');
insert into user values('aloky836@gmail.com','1234567');
insert into user values('am27491@gmail.com','nicole');
insert into user values('amarjun7@gmail.com','daniel');
insert into user values('bishnuroy72@gmail.com','babygirl');
insert into user values('bpnkesharwani@gmail.com','monkey');
insert into user values('chimanchandra23@gmail.com','lovely');
insert into user values('daljeet.kalsi1989@gmail.com','jessica');
insert into user values('dameet6@gmail.com','654321');
insert into user values('deepakjh69@gmail.com','michael');
insert into user values('deepakvarma891@gmail.com','ashley');
insert into user values('deeptendra12@gmail.com','12345');
insert into user values('deshbandhusaini51@gmail.com','iloveu');

// Use select* to display all the data in Table format.

select * from user;


