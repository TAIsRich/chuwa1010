## Hw6 Database

### MySql

#### 1. Create oms_company_address table
```sql
create table hw6.oms_company_address (
	id bigint,
    address_name varchar(200),
    send_status int(1),
    receive_status int(1),
    name varchar(64),
    phone varchar(64),
    province varchar(64),
    city varchar(64),
    region varchar(64),
    detail_address varchar(200),
    primary key(id)
);
```

#### 2. Insert some random data to oms_company_address table
```sql
Insert into hw6.oms_company_address 
value(1, '124 st', 1, 1, 'zxc', '1234567890', 'east lansing', 'MI', 'US', 'sdkdchjkhd');
Insert into hw6.oms_company_address 
value(2, '401 blvd', 0,1,'asd', '0987654321', 'jersey', 'NY','US', 'sdcndjkd');
Insert into hw6.oms_company_address 
value(3, '525 st', 1,0,'qwe','0873366382', 'manhatten', 'NY', 'US', 'sakdhiuhuo');
Insert into hw6.oms_company_address 
value(4, '96 Rd', 0,0,'lkj','836382', 'Edison', 'NJ', 'US', 'kdhfusuo')
```
#### 3. Write a SQL query to fetch all data from oms_company_address `table
```sql
select * from oms_company_address
```
#### 4. Write a SQL query to fetch top 3 records from oms_company_address table
```sql
select * from oms_company_address limit 3
```
#### 5. Update oms_company_address table to set all phone to 666-6666-8888
```sql
update oms_company_address set phone = '666-6666-8888';
```
#### 6.Delete one entry from oms_company_address table
```sql
delete from oms_company_address where id = 4;
```

### MongoDB
#### 1. Create test DB

#### 2. Create oms_company_address collection (method: createCollection() )
```mongodb-json-query
db.createCollection("oms_company_address")
```
#### 3. Insert few random entries to oms_company_address collection (method: insert() )
```mongodb-json-query
db.oms_company_address.insert({id: "1", address_name :"morgan st", send_status: "1", receive_status: "0", name: "ser"})
db.oms_company_address.insert({id: "2", address_name :"384 st", send_status: "0", receive_status: "0", name: "djf"})
```
#### 4. Read one entry from oms_company_address collection (method: find() )
```mongodb-json-query
db.oms_company_address.find({id:"1"})
```
#### 5. Read all entries from oms_company_address collection (method: find() )
```mongodb-json-query
db.oms_company_address.find()
```
#### 6. Update one entry from oms_company_address collection (method:update()orsave()) 
```mongodb-json-query
db.oms_company_address.update({address_name: "morgan st"} {$set:{address_name:"none"}})
```
#### 7. Remove one entry from oms_company_address collection (method:remove())
```mongodb-json-query
db.oms_company_address.remove({id : "1"})
```

### REST API

#### 5 GET APIs with different response type
1. GET: https://ghibliapi.herokuapp.com/films  
   Response status: 200 OK
2. GET: https://ghibliapi.herokuapp.com/films?title=Castle in the Sky
   Response status: 200 OK
3. https://ghibliapi.herokuapp.com/people
   Response status: 200 OK
4. https://ghibliapi.herokuapp.com/people/age
   Response status: 404 Not Found
5. https://ghibliapi.herokuapp.com/people?id=267649ac-fb1b-11eb-9a03-0242ac130003
   Response status: 200 OK

#### 5 Post API with json request body, please also paste the response here 
1. POST: https://ghibliapi.herokuapp.com/people

   request body：
   ```json
   {
      "id": "1"
   }
   ```
   response: 201 Created
   ```json
   {
   "id": "72de086b-9ff8-41ad-bd20-50f72c0e1467"
   }
   ```

2. POST: https://reqres.in/api/users

   request body:
   ```json
   {
    "name": "morpheus",
    "job": "leader"
   }
   ```
   response: 201 Created
   ```json
   {
    "name": "morpheus",
    "job": "leader",
    "id": "375",
    "createdAt": "2022-10-28T16:43:29.917Z"
   }
   ```
   
3. POST: https://reqres.in/api/register

   request body:
   ```json
   {
      "email": "eve.holt@reqres.in",
      "password": "pistol"
   }
   ```
   response: 200 OK
   ```json
   {
       "id": 4,
       "token": "QpwL5tke4Pnpja7X4"
   }
   ```

4. POST: https://reqres.in/api/register

   request body:
   ```json
   {
       "id": 5
   }
   ```
   response: 400 Bad Request
   ```json
   {
       "error": "Missing email or username"
   }
   ```

5. POST: https://reqres.in/api/login

   request body:
   ```json
   {
       "email": "eve.holt@reqres.in",
       "password": "cityslicka"
   }
   ```
   response: 200 OK
   ```json
   {
       "token": "QpwL5tke4Pnpja7X4"
   }
   ```

#### 3 PUT API with json request body, please also paste the response here 
1. PUT: https://reqres.in/api/users/2

   request body:
   ```json
   {
       "name": "morpheus",
       "job": "zion resident"
   }
   ```
   
   response: 200 OK
   ```json
   {
       "name": "morpheus",
       "job": "zion resident",
       "updatedAt": "2022-10-28T16:58:56.363Z"
   }
   ```

2. PUT: https://reqres.in/api/users/4

   request body:
   ```json
   {
       "name": "xinyu",
       "job": "zion resident"
   }
   ```
   
   response: 200 OK
   ```json
   {
       "name": "xinyu",
       "job": "zion resident",
       "id": "49",
       "createdAt": "2022-10-28T17:06:04.493Z"
   }
   ```

3. PUT: https://reqres.in/api/user/863

   request body:
   ```json
   {
       "email": "none",
       "password": "cityslicka"
   }
   ```
   response:
   ```json
   {
       "email": "none",
       "password": "cityslicka",
       "updatedAt": "2022-10-28T17:09:34.016Z"
   }
   ```

#### 2 DELETE API

1. DELETE: https://reqres.in/api/user/863 
   Response status: 204 No Content
2. DELETE: https://reqres.in/api/user/4
   Response status: 204 No Content

#### Each example with 404, 401,500 and any http status codes you know
404: indicates that the server cannot find the requested resource.
401: indicates that the request has not been applied because it lacks valid authentication credentials for the target resource.
500: indicates that the server encountered something unexpected that prevented it from fulfilling the request.

### API Design

#### 1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
PayPal:
* Identity:
  * Show user profile information: `GET {{base_url}}/v1/identity/oauth2/userinfo`
  * Set account properties: `POST {{base_url}}/v1/identity/account-settings`
  * Disable account properties: `POST {{base_url}}/v1/identity/account-settings/deactivate`
* Orders
  * Create order: `POST {{base_url}}/v2/checkout/orders`
  * Update order: `PATCH {{base_url}}/v2/checkout/orders/{id}`
  * Show order details: `GET {{base_url}}/v2/checkout/orders/{id}`
  * Authorize payment for order: `POST {{base_url}}/v2/checkout/orders/{id}/authorize`
  * Confirm the Order:`POST {{base_url}}/v2/checkout/orders/{id}/confirm-payment-source`

Twitter:
* Tweets likes:
  * DELETE /2/users/:id/likes/:tweet_id
  * GET /2/tweets/:id/liking_users
  * GET /2/users/:id/liked_tweets
  * POST /2/users/:id/likes
* User follows:
  * DELETE /2/users/:source_user_id/following/:target_user_id
  * GET /2/users/:id/followers
  * GET /2/users/:id/following
  * POST /2/users/:id/following
* Users lookup:
  * GET /2/users
  * GET /2/users/:id
  * GET /2/users/by
  * GET /2/users/by/username/:username
  * GET /2/users/me

#### 2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
* get user account information: GET {}/users/account
* 


Design APIs for the following features (思考:path variable 怎么用?有sub resources, 哪些地方该用复数)
#### 1. find the customer's payments, like credit card1, credit card2, paypal,ApplePay.

GET {}/users/{id}/payments

#### 2. Find the customer's history orders from 10/10/2022 to 10/24/2022
GET {}/users/order-history?start=10-1-2022&end=10-24-2022
#### 3. find the customer's delivery addresses
GET {}/users/addresses
#### 4. If I also want to get customer's default payment and default delievery address,what kind of the API(URL) should be?
GET {}/users/payments?default=yes
GET {}/users/addresses?default=yes