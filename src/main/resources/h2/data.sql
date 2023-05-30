INSERT INTO tb_member (
    pk_member
    ,fd_member_mobile
    ,fd_member_nick
    ,fd_member_birth_year
    ,fd_member_gender
    ,fd_member_push_yn
    ,fd_member_join_date
    ,fd_member_login_date
    ,fd_member_status
    ,fd_member_update_date
    ,fd_member_active_date
    ) 
values (
    1
    ,'012-3456-7890'
    ,'smartX'
    ,'2023-01-01'
    ,'male'
    ,'yes'
    ,'2023-05-28'
    ,'2023-05-28'
    ,'IDLE'
    ,'2023-05-28'
    ,'2023-05-28'
    );


INSERT INTO tb_device (
    pk_device
    ,fd_device_type
    ,fd_device_status
    ,fd_device_soc
    ,fd_device_serial
    ) 
values (
    1
    ,'KICKBOARD'
    ,'IDLE'
    ,'0'
    ,'cf16c374-c549-4f05-9397-1c337398ed29'
    );

INSERT INTO tb_using (
    pk_using
    ) 
values (
    1    
    );

INSERT INTO tb_payment (
    pk_payment
    ) 
values (
    1    
    );

INSERT INTO tb_basic_price (
    pk_basic_price
    ) 
values (
    1    
    );

INSERT INTO tb_coopon (
    pk_coopon
    ) 
values (
    1    
    );

INSERT INTO tb_coopon_member (
    pk_coopon_member
    ) 
values (
    1    
    );

INSERT INTO tb_sample_table (
    pk_sample_table,
    fd_sample
    ) 
values (
    1,
    'hello'
    );
