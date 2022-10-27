### MySQL - Exercise
1.  Create oms_company_address table

```
Create DATABASE mysqlExercise CHARACTER SET utf8;
Create TABLE oms_company_address (
    address_name varchar(200),
    send_status int,
    receive_status int, 
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64)
    detail_address varchar(200)
);

```

2.  Insert some random data to  oms_company_address  table
```
INSERT INTO oms_company_address (
    address_name varchar(200),
    send_status int,
    receive_status int, 
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64)
    detail_address varchar(200)
)VALUES (
    alice LLC,
    1,
    1,
    Alice, 
    123456789,
    WA, 
    Seattle, 
    King,
    117th
);
```
3.  Write a SQL query to fetch all data from  oms_company_address  `table

`SELECT * FROM oms_company_address; `
4.  Write a SQL query to fetch top 3 records from  oms_company_address  table

`SELECT * FROM oms_company_address LIMIT 3; `

5.  Update  oms_company_address  table to set all  phone to 666-6666-8888

`UPDATE oms_company_address SET phone = '666-6666-8888' WHERE id > 0;`
6.  Delete one entry from  oms_company_address  table

`DELETE * FROM oms_company_address;`
7.  (Optional) You can also try to create other tables that listed above



### MongoDB Exercise
1.  Create  test DB

`use test`
2.  Create  oms_company_address  collection  (method: createCollection() )

`db.createCollection(oms_company_address)`
3.  Insert few random entries to  oms_company_address  collection (method: insert() )
```
db.oms_company_address.insert([{
    id = "1",
    address_name: "123",
    send_status: 1,
    receive_status: 1,
    name: "Alice",
    phone: "123456789",
    province: "WA", 
    city: "Seattle", 
    region: "king", 
    detail_address: "test"
}])
```
4.  Read one entry from  oms_company_address  collection (method: find() )

`db.oms_company_address.find(city: "seattle")`
5.  Read all entries from  oms_company_address  collection (method: find() )

`db.oms_company_address.find()`
6.  Update one entry from  oms_company_address collection (method: update() or save() )

`db.oms_company_address.update({"phone": "123456789"}, {set: "666-6666-8888"})`
7.  Remove one entry from  oms_company_address collection (method: remove() )

`db.oms_company_address.remove()'
8.  (Optional) You can also try to create other tables that listed above



API Design
1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范
Twitter:


2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
```
Blog Website:
GET 
https://www.blog.com/person/id
POST
https://www.blog.com/person/id/posts/post_id
PUT
https://www.blog.com/person/id/posts/post_id
DELETE
https://www.blog.com/person/id/posts/post_id
```


Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
1.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.

`GET /api/v1/customers/{customer_id}/payments`
2.  Find the customer's history orders from 10/10/2022 to 10/24/2022

`GET /api/v1/customers/{customer_id}/order/orderdates?startDate="10/10/2022"&endDates="10/24/2022"`
3.  find the customer's delievery  addresses

`GET /api/v1/customers/{customer_id}/addresses`
4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?

`GET /api/v1/customers/{customer_Id}/payments/default`
`GET /api/v1/customers/{customer_Id}/addresses/default`