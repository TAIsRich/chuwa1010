# Homework 6 
## sql practice
1. Create oms_company_address table
2. Insert some random data to oms_company_address table
3. Write a SQL query to fetch all data from oms_company_address `table
4. Write a SQL query to fetch top 3 records from oms_company_address table 
5. Update oms_company_address table to set all phone to 666-6666-8888
6. Delete one entry from oms_company_address table
7. (Optional)You can also try to create other tables that listed above
   SQL in: omsDatabase.sql in folder "HW6"

## non-sql practice in MongoDB
1. Create test DB
   start mongo shell: mongosh
   show databases: show dbs
   create test db: use test
2. Create oms_company_address collection (method: createCollection() )
   db.createCollection("oms_company_address")
3. Insert few random entries to oms_company_address collection (method: insert() )
insert one: 
    db.oms_company_address.insertOne({
   id: "1",
   address_name: "62117 Berge Stravenue Apt. 275\\nLydamouth, MA 32445-1216",
   send_status: 0,
   receive_status: 0,
   name: "Summer",
   phone: "111-111-1111",
   province: "Pennsylvania",
   city: "Lake Daren",
   region: "test",
   detail_address: "test"
   })
insert many:
   db.oms_company_address.insertMany([{
   id: "2",
   address_name: "92127 Arlie Square Suite 639\\nPort Stephan, SD 28855-0544",
   send_status: 1,
   receive_status: 1,
   name: "Kattie",
   phone: "111-111-1111",
   province: "NewMexico",
   city: "Hudsonville",
   region: "test",
   detail_address: "test"
   },
   {
   id: "3",
   address_name: "28195 Becker River\\nEast Keiratown, AL 78374",
   send_status: 0,
   eceive_status: 1,
   name: "Mireille",
   phone: "111-111-1111",
   province: "Kansas",
   city: "Schmittchester",
   region: "test",
   detail_address: "test"
   }])
4. Read one entry from oms_company_address collection (method: find() )
   db.oms_company_address.findOne({id:"1"})
5. Read all entries from oms_company_address collection (method: find() )
   db.oms_company_address.find()
6. Update one entry from oms_company_address collection(method:update()or save())
   db.oms_company_address.updateOne({"phone": "111-111-1111"},{$set: {"phone":"666-777-9999"}})
7. Remove one entry from oms_company_address collection(method:remove())
   db.oms_company_address.deleteOne({"id":"1"})

## Postman
API 练习网站: https://reqres.in/
### 5 GET APIs with different response type
#### API: https://reqres.in/api/users/2
Response status: 200 OK
Response:
   {
      "data": {
      "id": 2,
      "email": "janet.weaver@reqres.in",
      "first_name": "Janet",
      "last_name": "Weaver",
      "avatar": "https://reqres.in/img/faces/2-image.jpg"
      },
      "support": {
      "url": "https://reqres.in/#support-heading",
      "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
      }
   }

#### API: https://reqres.in/api/users/23
Response status: 404Not Found
{}

#### API： https://reqres.in/api/users?page=2
Response status: 200 OK
Response:
{
   "page": 2,
   "per_page": 6,
   "total": 12,
   "total_pages": 2,
   "data": [
   {
   "id": 7,
   "email": "michael.lawson@reqres.in",
   "first_name": "Michael",
   "last_name": "Lawson",
   "avatar": "https://reqres.in/img/faces/7-image.jpg"
   },
   {
   "id": 8,
   "email": "lindsay.ferguson@reqres.in",
   "first_name": "Lindsay",
   "last_name": "Ferguson",
   "avatar": "https://reqres.in/img/faces/8-image.jpg"
   },
   {
   "id": 9,
   "email": "tobias.funke@reqres.in",
   "first_name": "Tobias",
   "last_name": "Funke",
   "avatar": "https://reqres.in/img/faces/9-image.jpg"
   },
   {
   "id": 10,
   "email": "byron.fields@reqres.in",
   "first_name": "Byron",
   "last_name": "Fields",
   "avatar": "https://reqres.in/img/faces/10-image.jpg"
   },
   {
   "id": 11,
   "email": "george.edwards@reqres.in",
   "first_name": "George",
   "last_name": "Edwards",
   "avatar": "https://reqres.in/img/faces/11-image.jpg"
   },
   {
   "id": 12,
   "email": "rachel.howell@reqres.in",
   "first_name": "Rachel",
   "last_name": "Howell",
   "avatar": "https://reqres.in/img/faces/12-image.jpg"
   }
   ],
   "support": {
   "url": "https://reqres.in/#support-heading",
   "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
   }
}

#### API: https://ghibliapi.herokuapp.com/locations/?id=11014596-71b0-4b3e-b8c0-1c4b15f28b9a
Status: 200 OK
Response:
[
   {
   "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
   "name": "Irontown",
   "climate": "Continental",
   "terrain": "Mountain",
   "surface_water": "40",
   "residents": [
   "https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0",
   "https://ghibliapi.herokuapp.com/people/030555b3-4c92-4fce-93fb-e70c3ae3df8b"
   ],
   "films": [
   "https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
   ],
   "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
   }
]

#### API:https://ghibliapi.herokuapp.com/locations/?name=Irontown
Status: OK
Response:
[
   {
   "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
   "name": "Irontown",
   "climate": "Continental",
   "terrain": "Mountain",
   "surface_water": "40",
   "residents": [
   "https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0",
   "https://ghibliapi.herokuapp.com/people/030555b3-4c92-4fce-93fb-e70c3ae3df8b"
   ],
   "films": [
   "https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
   ],
   "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
   }
]

### 5 Post API with json request body, please also paste the response here 
#### Post API: https://reqres.in/api/users
Request body:
{
"name": "morpheus",
"job": "leader"
}
Status: 201 Created
Response:
{
"id": "518",
"createdAt": "2022-10-28T00:46:16.192Z"
}

#### Post API: https://reqres.in/api/register
Request body:
{
"email": "eve.holt@reqres.in",
"password": "pistol"
}
Status: 200 OK
Response:
{
"id": 4,
"token": "QpwL5tke4Pnpja7X4"
}
#### post API: https://reqres.in/api/login
Request body:
{
"email": "eve.holt@reqres.in",
"password": "cityslicka"
}
Status: 200 OK
Response:
{
"token": "QpwL5tke4Pnpja7X4"
}

#### Post API: https://reqres.in/api/login
Status: 400 Bad Request
Request body:
{
"email": "peter@klaven"
}
Response:
{
"error": "Missing password"
}
#### Post API: https://reqres.in/api/register
Status: 400 Bad Request
Request body:
{
"email": "eve.holt@reqres.in"
}
Response:
{
"error": "Missing password"
}

### 3 PUT API with json request body, please also paste the response here 
#### PUT API: https://reqres.in/api/users/2
status: 200 OK
Request body:
{
"name": "morpheus",
"job": "zion resident"
}
Response:
{
"name": "morpheus",
"job": "zion resident",
"updatedAt": "2022-10-28T01:20:37.393Z"
}

#### put API: https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a
Status: 200 OK
Request body:
{
"name": "Iron",
"climate": "Continental",
"terrain": "Mountain",
"surface_water": "400",
"films": [
"https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
],
"url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
}
Response:
{
"name": "Iron",
"climate": "Continental",
"terrain": "Mountain",
"surface_water": "400",
"films": [
"https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
],
"url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
}
#### put API: https://ghibliapi.herokuapp.com/locations/Irontown
Status: 404 Not Found
Request body:
{
"name": "Iron",
"climate": "Continental",
"films": [
"https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
],
"url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
}
Response:
{}

### 2 DELETE API
#### Delete API: https://reqres.in/api/users/1
Status: 204 No Content

#### Delete API: https://ghibliapi.herokuapp.com/locations/name="Iron"
Status: 404 not found
Request body:
{
"name": "Iron",
"climate": "Continental",
"films": [
"https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
],
"url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
}
Response:
{}

### Each example with 404, 401,500 and any http status codes you know
- 100 Continue
- 101 Switching Protocols
- 102 Processing

- 200 OK
- 201 Created
- 202 Accepted
- 203 Non-Authoritative Information
- 204 No Content
- 205 Reset Content
- 206 Partial Content
- 207 Multi-Status
- 208 Already Reported
- 226 IM Used

- 300 Multiple Choices
- 301 Moved Permanently
- 302 Found
- 303 Check Other
- 304 Not Modified
- 305 Use Proxy
- 306 Switch Proxy
- 307 Temporary Redirect
- 308 Permanent Redirect

- 400 Bad Request
- 401 Unauthorised
- 402 Payment Required
- 403 Forbidden
- 404 Not Found
- 405 Method Not Allowed
- 406 Not Acceptable
- 407 Proxy Authentication Required
- 408 Request Timeout
- 409 Conflict

- 500 Internal Server Error
- 501 Not Implemented
- 502 Bad Gateway
- 503 Service Unavailable
- 504 Gateway Timeout

## API design
### Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc. -- 命名规范
Twitter
User by ID: GET https://api.twitter.com/2/users/:id
Users by ID: GET https://api.twitter.com/2/users?ids=12,2244994945,2244994946
Users by Name: GET https://api.twitter.com/2/users/by/username/:username
Followers of user ID: GET https://api.twitter.com/2/users/:id/followers
Users  a user ID is following: GET https://api.twitter.com/2/users/:id/following
Follow a user ID: POST https://api.twitter.com/2/users/:id/following
Unfollow a user ID: DELETE https://api.twitter.com/2/users/:source_user_id/following/:target_user_id

Pokemon
Pokemon Search: GET https://pokeapi.co/api/v2/pokemon/ditto/


### Design a collection of APIs for a Blog Website,please specify GET POST PUT DELETE
Get user list: GET https://www.blog.com/v1/users/
Get post list: GET https://www.blog.com/v1/posts/
Add user by id: POST https://www.blog.com/v1/users/{id}
Add posts by id: POST https://www.blog.com/v1/posts/{id}
Update user information by id: PUT https://www.blog.com/v1/users/{id}
Update post information by id: PUT https://www.blog.com/v1/posts/{id}
Delete user by id: DELETE https://www.blog.com/v1/users/{id}
Delete post by id: DELETE https://www.blog.com/v1/posts/{id}

### Design APIs for the following features (思考:path variable 怎么用?有sub resources, 哪些地方该用复数)
#### find the customer's payments,like credit card1,credit card2,paypal,ApplePay.
GET /api/v1/customers/{customer_id}/payments

#### Find the customer's history orders from 10/10/2022 to 10/24/2022
GET /api/v1/customers/{customer_id}/orders?startDate="10/10/2022"&endDate="10/24/2022"

#### find the customer's delivery addresses
GET /api/v1/customers/{customer_id}/addresses

#### If I also want to get customer's default payment and default delivery address,what kind of the API(URL) should be?
GET /api/v1/customers/{customer_id}/addresses/default
GET /api/v1/customers/{customer_id}/payments/default