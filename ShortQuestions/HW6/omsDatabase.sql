create database oms;
use oms;

create table if not exists oms_order (
	id bigint primary key,
    member_id bigint,
    order_sn varchar(64),
    create_time DATETIME,
    member_username varchar(64),
    total_amount decimal(10,2),
    pay_amount decimal(10,2),
    freight_amount decimal(10,2),
    pay_type int(1),
    source_type int(1),
    status int(1),
    order_type int(1),
    delivery_company varchar(64),
    delivery_sn varchar(64),
    auto_confirm_day int,
    bill_type int(1),
    receiver_name varchar(100),
    receiver_phone varchar(32),
    receiver_post_code varchar(32),
    receiver_province varchar(32),
    receiver_city varchar(32),
    receiver_region varchar(32),
    receiver_detail_address varchar(200),
    note varchar(500),
    confirm_status int(1),
    delete_status int(1),
    payment_time DATETIME,
    delivery_time DATETIME,
    receive_time DATETIME,
    comment_time DATETIME,
    modify_time DATETIME
);

create table if not exists oms_order_item (
	id bigint primary key,
    order_id bigint,
    order_sn varchar(64),
    product_id bigint,
    product_pic varchar(500),
    product_name varchar(200),
    product_brand varchar(200),
    product_sn varchar(64),
    product_price decimal(10,2),
    product_quantity int,
    product_sku_id bigint,
    product_sku_code varchar(50),
    product_category_id bigint,
    sp1 varchar(100),
    sp2 varchar(100),
    sp3 varchar(100),
    product_attr varchar(500)
);

create table if not exists oms_company_address(
	id bigint primary key,
    address_name varchar(200),
    send_status int(1),
    receive_status int(1),
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detial_address varchar(200)
);

insert into oms_company_address values(
	1, 'Boston', 0, 0, 'amy', '1234567890', 'Hubei', 'wuhan', 'wuchang', '222 hid Drive, Boston'
);

insert into oms_company_address 
values
(0, 'Boston', 0, 0, 'john', '1234567890', 'Hubei', 'wuhan', 'wuchang', '24 hid Drive, Boston'),
(2, 'newyork', 1, 0, 'David', '1234567890', 'Hubei', 'wuhan', 'wuchang', '26 hid Drive, newyork'),
(3, 'Washington', 1, 0, 'Chris', '1234567890', 'Hubei', 'wuhan', 'wuchang', '227 hid Drive, Washington'),
(4, 'Boston', 1, 1, 'Kate', '1234567890', 'Hubei', 'wuhan', 'wuchang', '32 hid Drive, Boston'),
(5, 'Boston', 0, 0, 'Jake', '1234567890', 'Hubei', 'wuhan', 'wuchang', '262 hid Drive, Boston'),
(6, 'Boston', 1, 0, 'Kathy', '1234567890', 'Hubei', 'wuhan', 'wuchang', '722 hid Drive, Boston'),
(7, 'Boston', 1, 1, 'Cora', '1234567890', 'Hubei', 'wuhan', 'wuchang', '292 hid Drive, Boston'),
(8, 'Boston', 0, 0, 'amy', '1234567890', 'Hubei', 'wuhan', 'wuchang', '92 hid Drive, Boston');

select * from oms_company_address;

select * from oms_company_address limit 3;

update oms_company_address set phone='666-6666-8888';

delete from oms_company_address where id=0;