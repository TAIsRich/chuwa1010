## REST API (Postman)

### 5 GET APIs with different response type
-GET https://ghibliapi.herokuapp.com/locations **200 ok**
-GET https://ghibliapi.herokuapp.com/locations/sb **404 Not Found**

###5 Post API with json request body, please also paste the response here
- https://reqres.in/api/users **201 created**
```{
  "name": "Richardddddd"
  }
```

Response:

{
"name": "Richardddddd",
"id": "409",
"createdAt": "2022-10-27T21:30:59.651Z"
}

- https://reqres.in/api/register **404 Bad Request**
  {
  "email": "rich.peng@reqres.in",
  "password": "password"
  }

Response:
{
"error": "Note: Only defined users succeed registration"
}

- https://reqres.in/api/register **200 OK**

{
"email": "eve.holt@reqres.in",
"password": "pistol"
}

Response:
{
"id": 4,
"token": "QpwL5tke4Pnpja7X4"
}

- https://reqres.in/api/login 
  {
  "email": "peter@klaven"
  }

Response: 400
{
"error": "Missing password"
}


### 3 PUT API with json request body, please also paste the response here
- PUT https://reqres.in/api/users/2  **200 OK**

  request body:

     ```
     {
         "name": "kyrie",
         "job": "teacher"
     }
     ```

  response:

     ```json
    {
    "name": "kyrie",
    "job": "teacher",
    "updatedAt": "2022-10-27T21:43:40.798Z"
}
     ```

- `PUT https://reqres.in/api/users` - 404 Not Found

### 2 DELETE API

- DELETE https://ghibliapi.herokuapp.com/people  404 Not Found

- DELETE https://ghibliapi.herokuapp.com/people/fe93adf2-2f3a-4ec4-9f68-5422f1b87c01 200 OK

## API Design

### Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
Twitter APIs, in Postman

(https://www.postman.com/twitter/workspace/twitter-s-public-workspace/collection/9956214-784efcda-ed4c-4491-a4c0-a26470a67400?action=share&creator=21288325)

### Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE

- Register a new user POST {{base_url}}/api/v1/users/register
- login POST {{base_url}}/api/v1/users/login
- logout POST {{base_url}}/api/v1/users/logout
- update user profile PUT {{base_url}}/api/v1/users/info
- Get one User's Post: GET {{base_url}}/api/v1/users/{user_id}/posts
- Get one Post's Details: GET {{base_url}}/api/v1/users/{user_id}/posts/{post_id}
- Create a new Post: POST {{base_url}}/api/v1/users/{user_id}/posts + request body
- Update a Post: PUT {{base_url}}/users/api/v1/{user_id}/posts/{post_id}  + request body
- Delete a Post: DELETE {{base_url}}/api/v1/users/{user_id}/posts/{post_id} + Params
- Delete a User account DELETE {{base_url}}/api/v1/users/{user_id} + Params

### Design APIs for the following features (思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)
1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
GET  {{base_url}}/customers/{customer_id}/payments

2. Find the customer's history orders from 10/10/2022 to 10/24/2022
GET   {{base_url}}/customers/{customer_id}/orders?startDate = "10-10-2022"&endDate ="10-24-2022"

3. find the customer's delievery addresses
GET   {{base_url}}/customers/{customer_id}/addresses

4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)
   should be?
GET {{base_url}}/customers/{customer_id}/payments/default

GET {{base_url}}/customers/{customer_id}/addresses/default

Data looks like
```
{ 
  "customers": {
      "id": 123,
      "name": "ssss",
      "orders": [
          {
              "id": "00001",
              "items": [{"name","price","qty"},{""}],
              "date": 2022-10-11
          }, {
              "id": "00002",
              "items": [{"name","price","qty"},{""}],
              "date": 2022-10-13
          }
      ],
      "addresses": [
          {
              "default": "yes",
              "Country": "",
              "City": "",
              "Street": "",
              "HouseNumber": ""
          }, {
              "default": "no",
              "Country": "",
              "City": "",
              "Street": "",
              "HouseNumber": ""
          }
      ],
      "payments": [
          {
              "default": "yes",
              "Method": "credit card",
              "CardNumber": 123456
          }, {
              "default": "no",
              "Method": "credit card",
              "CardNumber": 456789
          }
      ]
  }
}
```

## DataBase

### Create oms_company_address table
create database oms;
use oms;
create table oms_company_address
(id bigint primary key,
address_name varchar(200),
send_status int(1),
receive_status int(1),
name varchar(64),
phone varchar(64),
province varchar(64),
city varchar(64),
region varchar(64),
detail_address varchar(200));

###Insert some random data to oms_company_address table
insert into oms_company_address values
(100, "foshan", 1, 1, "abc", "1", "A", "a", "1 ", "100"),
(10002, "guangzhou", 1, 0, "bbc", "2", "B", "b", "2 ", "200"),
(100003, "shenzhen", 0, 0, "cbc", "3", "C", "c", "3", "300"),
(100000004, "xianggang", 1, 0, "dbc", "4", "D", "d", "4", "400"),
(1000000005, "aomen", 1, 1, "ebc", "5", "E", "e", "5", "500");

###Write a SQL query to fetch all data from oms_company_address `table
select * from oms_company_address;

###Write a SQL query to fetch top 3 records from oms_company_address table
select * from oms_company_address limit 3;

###Update oms_company_address table to set all phone to 666-6666-8888
update oms_company_address
set phone = "666-6666-8888"
where id != 0;

###  Delete one entry from oms_company_address table
delete from oms.oms_company_address 
where id = 100;

### Create test DB
use test
### Create oms_company_address collection (method: createCollection() )
db.createCollection("oms_company_address")
### some CRUD
1. Insert few random entries to oms_company_address collection (method: insert() )
2. Read one entry from oms_company_address collection (method: find() )
3. Read all entries from oms_company_address collection (method: find() )
4. Update one entry from oms_company_address collection (method: update() or save() )
5. Remove one entry from oms_company_address collection (method: remove() )

- db.oms_company_address.insert({.....})
- db.oms_company_address.find({_id: 100})
- db.oms_company_address.find()
- db.oms_company_address.findOneAndUpdate({_id: 100},{$set:{phone: Long("888")}})
- db.oms_company_address.remove({_id: 100})
