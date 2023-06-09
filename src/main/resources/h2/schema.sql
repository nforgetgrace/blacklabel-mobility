DROP TABLE IF EXISTS tb_member;
CREATE TABLE tb_member ( 
	pk_member bigint auto_increment, 
	fd_member_mobile varchar(30),
	fd_member_nick varchar(100),
	fd_member_birth_year varchar(10),
	fd_member_gender varchar(10),
	fd_member_push_yn varchar(10),
	fd_member_join_date varchar(10),
	fd_member_login_date varchar(10),
	fd_member_status varchar(10),
	fd_member_update_date varchar(10),
	fd_member_active_date varchar(100),
	primary key (pk_member) 
);


DROP TABLE IF EXISTS tb_device;
CREATE TABLE tb_device ( 
	pk_device bigint auto_increment, 
	fd_device_type varchar(50),
	fd_device_status varchar(50),
	fd_device_soc varchar(50),
	fd_device_serial varchar(100),
	primary key (pk_device) 
);


DROP TABLE IF EXISTS tb_using;
CREATE TABLE tb_using ( 
	pk_using bigint auto_increment, 
	fk_member varchar(50),
	fk_device varchar(50),
	fd_using_date_start varchar(50),
	fd_using_date_end datetime,
	fd_using_total_min varchar(50),
	fd_using_total_price varchar(100),
	primary key (pk_using) 
);


DROP TABLE IF EXISTS tb_payment;
CREATE TABLE tb_payment ( 
	pk_payment bigint auto_increment, 
	fk_using varchar(50),
	fk_member varchar(50),
	fk_device varchar(50),
	fd_payment_yn varchar(100),
	fd_payment_date varchar(100),
	fd_payment_price varchar(100),
	fd_payment_cancel_yn varchar(10),
	primary key (pk_payment) 
);


DROP TABLE IF EXISTS tb_basic_price;
CREATE TABLE tb_basic_price ( 
	pk_basic_price bigint auto_increment, 
	fd_price varchar(10),
	fd_per_basic_time varchar(10),
	primary key (pk_basic_price) 
);


DROP TABLE IF EXISTS tb_coopon;
CREATE TABLE tb_coopon ( 
	pk_coopon bigint auto_increment, 
	fd_coopon_name varchar(255),
	fd_coopon_discount_price varchar(100),
	fd_use_yn varchar(10),
	primary key (pk_coopon) 
);


DROP TABLE IF EXISTS tb_coopon_member;
CREATE TABLE tb_coopon_member ( 
	pk_coopon_member bigint auto_increment, 
	fk_coopon varchar(100),
	fk_member varchar(100),
	fd_coopon_member_regist_date varchar(100),
	fd_coopon_member_start_date varchar(100),
	fd_coopon_member_end_date varchar(100),
	fd_coopon_member_use_yn varchar(10),
	primary key (pk_coopon_member) 
);


DROP TABLE IF EXISTS tb_sample_table;
CREATE TABLE tb_sample_table ( 
	pk_sample_table bigint auto_increment, 
	fd_sample varchar(100),
	primary key (pk_sample_table) 
);

