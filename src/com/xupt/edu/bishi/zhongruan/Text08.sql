create table employee(
	emp_no int primary key auto_increment,
	emp_name varchar(50) not null,
	emp_sex varchar(2) check(emp_sex='男'or'女'),
	emp_id varchar(18) not null,
	play_no int,
	add_no int
);
create table play(
	play_no int primary key auto_increment,
	play_department varchar(50) not null,
	play_position varchar(50) not null,
	foreign key(play_no) references employee(emp_no),
);
create table address(
	add_no int primary key auto_increment,
	add_province varchar(30) not null,
	add_city varchar(30) not null,
	foreign key(add_no) references employee(emp_no),
);
