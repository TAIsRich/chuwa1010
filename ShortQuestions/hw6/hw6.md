# Database

### MySQL
_1. Create_ _oms_company_address_ _table_
`-   CREATE TABLE oms_company_address(id bigint primary key,address_name varchar(200),name varchar(64),phone varchar(64));`
_2. Insert some random data to_ _oms_company_address_ _table_
```
insert into oms_company_address values (001, '33st', 'John', '123456789');
insert into oms_company_address values (002, '122st', 'Matt', '123123123');
insert into oms_company_address values (003, '42', 'Leon', '456456456');
```
_3. Write a SQL query to fetch all data from_ _oms_company_address_ _`table_

`select * from oms_company_address;`

_4. Write a SQL query to fetch top 3 records from_ _oms_company_address_ _table_
`select * from oms_company_address limit 3;`
_5. Update_ _oms_company_address_ _table to set all_ _phone_ _to 666-6666-8888_
```
SET SQL_SAFE_UPDATES = 0;
UPDATE oms_company_address SET phone = "666-6666-8888";
SET SQL_SAFE_UPDATES = 1;
```
_6. Delete one entry from_ _oms_company_address_ _table_
`delete from oms_company_address where id = 001;`

### mongoDB
_1. Create_ _test_ _DB_
`use test`
_2. Create_ _oms_company_address_ _collection (method: createCollection() )_
`db.createCollection("oms_company_address")`
_3. Insert few random entries to_ _oms_company_address_ _collection (method: insert() )_
```
db.oms_company_address.insert({address:"33th st", name: 'Tony', phone:"111-111-1111" });
db.oms_company_address.insert({address:"102th st", name: 'Sam', phone:"222-222-2222" });
db.oms_company_address.insert({address:"48th st", name: 'Jack', phone:"333-333-3333" })
```
_4. Read one entry from_ _oms_company_address_ _collection (method: find() )_
`db.oms_company_address.findOne({"name":"Sam"});`
```
{
"_id" : ObjectId("635cdef13811560b0f85a271"),
"address" : "102th st",
"name" : "Sam",
"phone" : "222-222-2222"
}
```
_5. Read all entries from_ _oms_company_address_ _collection (method: find() )_
`db.oms_company_address.find();`
```
\{ "_id" : ObjectId("635cdec73811560b0f85a270"), "address" : "33th st", "name" : "Tony", "phone" : "111-111-1111" }

{ "_id" : ObjectId("635cdef13811560b0f85a271"), "address" : "102th st", "name" : "Sam", "phone" : "222-222-2222" }

{ "_id" : ObjectId("635cdf033811560b0f85a272"), "address" : "48th st", "name" : "Jack", "phone" : "333-333-3333" }
```
_6. Update one entry from_ _oms_company_address_ _collection (method: update() or save() )_
`db.oms_company_address.update({"name":"Sam"},{$set:{phone:"123-456-7890"}});`

_7. Remove one entry from_ _oms_company_address_ _collection (method: remove() )_
`db.oms_company_address.remove({"name":"Jack"})`

current collection:
```
{ "_id" : ObjectId("635cdec73811560b0f85a270"), "address" : "33th st", "name" : "Tony", "phone" : "111-111-1111" }

{ "_id" : ObjectId("635cdef13811560b0f85a271"), "address" : "102th st", "name" : "Sam", "phone" : "123-456-7890" }
```

# REST API Postman

### _5 GET APIs with different response type_
- `200 OK` : `GET https://reqres.in/api/users/3`
- `200 OK` : `GET https://reqres.in/api/unknown`
- `200 OK` : `GET https://reqres.in/api/users?page=2`
- `404 Not Found` : `GET https://reqres.in/api/users/23`
- `204 No Content`

### _5 Post API with json request body, please also paste the response here_
- `201 Created` : `POST https://reqres.in/api/users`
```
// request body
{
    "name": "morpheus",
    "job": "leader"
}

// response
{
    "name": "morpheus",
    "job": "leader",
    "id": "366",
    "createdAt": "2022-10-31T23:25:08.829Z"
}
```

-  `200` : `POST https://reqres.in/api/register`
```
// request body
{
    "email": "eve.holt@reqres.in",
    "password": "pistol"
}

// response

{
  "id": 4,
  "token": "QpwL5tke4Pnpja7X4"
}
```

- `400` : `POST https://reqres.in/api/register`
```
// request body
{
    "email": "sydney@fife"
}
// response
{
    "error": "Missing password"
}
```

- `200` : `POST https://reqres.in/api/login`
```
// request body
{
    "email": "eve.holt@reqres.in",
    "password": "cityslicka"
}

// response
{
    "token": "QpwL5tke4Pnpja7X4"
}
```

- `400` : `POST https://reqres.in/api/login`
```
// request body
{
    "email": "peter@klaven"
}

// response
{
    "error": "Missing password"
}
```

### __3 PUT API with json request body, please also paste the response here__

- `200` : `PUT https://reqres.in/api/users/2`
```
// request body
{
    "name": "morpheus",
    "job": "zion resident"
}

// response
{
    "name": "morpheus",
    "job": "zion resident",
    "updatedAt": "2022-11-01T00:41:09.073Z"
}
```

- `200` : `PUT https://reqres.in/api/users/{id}`
```
// request body
null

// response
```
{
  "updatedAt": "2022-11-01T00:54:45.540Z"
}

```

- `200` : `PUT https://reqres.in/api/{resource}/{id}`
```
// request body
null

// response
```
{
  "updatedAt": "2022-11-01T00:49:23.634Z"
}
```

### __2 DELETE API__

- `204` : `DELETE https://reqres.in/api/{resource}/{id}`
- `204` : `DELETE https://reqres.in/api/users/{id}`


##  API Design
1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
- Paypal
```
User info - GET  {{base_url}}/v1/identity/oauth2/userinfo?schema=paypalv1.1\
Create order - POST {{base_url}}/v2/checkout/orders
Show order detail - GET {{base_url}}/v2/checkout/orders/:order_id
update order - PATCH {{base_url}}/v2/checkout/orders/:order_id
Authorize payment for order - POST {{base_url}}/v2/checkout/orders/:order_id/authorize
Capture payment for order - POST {{base_url}}/v2/checkout/orders/:order_id/capture
Show refund details - GET {{base_url}}/v2/payments/refunds/:refund_id
Refund captured payment POST {{base_url}}/v2/payments/captures/:capture_id/refund
```
- YouTube
```
Caption list - GET https://www.googleapis.com/youtube/v3/captions
Caption insert - POST https://www.googleapis.com/upload/youtube/v3/captions
Caption update - PUT https://www.googleapis.com/upload/youtube/v3/captions
Caption download - GET https://www.googleapis.com/youtube/v3/captions/id
Caption delete - DELETE https://www.googleapis.com/youtube/v3/captions
Subscription list - GET https://www.googleapis.com/youtube/v3/subscriptions
Subscription insert - POST https://www.googleapis.com/youtube/v3/subscriptions
Subscription delete - DELETE https://www.googleapis.com/youtube/v3/subscriptions
```
2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE

```
read a post - GET http://www.bblloogg.com/user/v2/blogs/blogID/post
create a post - POST http://www.bblloogg.com/user/v2/blogs/blogID/post
update a post - PUT http://www.bblloogg.com/user/v2/blogs/blogID/post
delete a post - DELETE http://www.bblloogg.com/user/v2/blogs/blogID/post
```

###   Design APIs for the following features:
(思考：path variable 怎么⽤？有sub resources, 哪些地⽅该⽤复数)

_1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay._
```
GET /api/v1/customers/{customer_id}/payments
```
_2. Find the customer's history orders from 10/10/2022 to 10/24/2022_
```
GET /api/v1/customers/{customer_id}/orders?startDate="10/10/2022"&endDate="10/24/2022"
```
_3. find the customer's delivery addresses_
```
GET /api/v1/customers/{customer_id}/addresses
```
_4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?_
```
GET /api/v1/customers/{customer_id}/payments/default
GET /api/v1/customers/{customer_id}/addresses/default
```
