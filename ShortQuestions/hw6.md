## Mysql
### 1
create table oms_company_address(
id bigint unsigned auto_increment,
address_name varchar(200),
send_status int(1),
receive_status int(1),
name varchar(64),
phone varchar(64),
province varchar(64),
city varchar(64),
region varchar(64),
detail_address varchar(200),
primary key(id));
### 2
insert into oms_company_address
values(1,"address_name1",0,0,"Anna","1234567890","Los Angeles","CA","Los Angeles","detail1");
insert into oms_company_address
values(2,"address_name2",1,1,"Bob","2234567890","Seattle","WA","Seattle","detail2");
insert into oms_company_address
values(3,"address_name3",1,1,"Tom","3234567890","New York","NY","New York","detail3");
insert into oms_company_address
values(4,"address_name4",1,1,"Bob","4234567890","Boston","MA","Boston","detail4");
### 3
select * from oms_company_address;
### 4
select * from oms_company_address limit 3;
### 5
update oms_company_address set phone="666-6666-8888";
### 6
delete from oms_company_address where id=1;


## MongoDB
### 1 
use test
### 2
db.createCollection("oms_company_address", {capped:true, size:100000})
### 3
db.oms_company_address.insertOne({
id:1,
address_name:"address_name1",
send_status:0,
receive_status:0,
name:"Anna",
phone:"1234567890",
city:"Los Angeles",
province:"CA",
region:"Los Angeles",
detail_address:"detail1"
})
db.oms_company_address.insertOne({
id:2,
address_name:"address_name2",
send_status:0,
receive_status:0,
name:"Anna2",
phone:"2234567890",
city:"Los Angeles",
province:"CA",
region:"Los Angeles",
detail_address:"detail2"
})
db.oms_company_address.insertOne({
id:3,
address_name:"address_name3",
send_status:0,
receive_status:0,
name:"Anna3",
phone:"3234567890",
city:"Los Angeles",
province:"CA",
region:"Los Angeles",
detail_address:"detail3"
})
### 4
db.oms_company_address.find().limit(1)
### 5
db.oms_company_address.find()
### 6
db.oms_company_address.updateOne({id:3},{$set:{id:2}})
### 7
db.oms_company_address.remove({id:2})

## Rest API
### 1
```angular2html
Twitter api collection
https://developer.twitter.com/en/docs/api-reference-index
```
```angular2html
Paypal api collection
https://developer.paypal.com/api/rest/authentication/
```
```angular2html
Youtube api collecion
https://developers.google.com/youtube/v3/docs
```
### 2
```angular2html
post blog
POST {{website-url}}/v1/blog

delete blog
DELETE {{website-url}}/v1/blog/:blog_id

search blog
GET {{website-url}}/v1/blog/search/:keyword

edit blog(update)
PUT {{website-url}}/v1/blog/:blog_id
```

### 1
{{website-url}}/:usr_id/payments
### 2
{{website-url}}/:usr_id/orders?start=2022-10-10&end=2022-10-24
### 3
{{website-url}}/:usr_id/delievery_addresses
### 4
{{website-url}}/:usr_id/delievery_addresst&default=true

{{website-url}}/:usr_id/payment&default=true
