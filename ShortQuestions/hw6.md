### HW 6

#### Database

##### SQL Exercise - MySQL

```sql
CREATE DATABASE oms_database;
USE oms_database;
CREATE TABLE oms_company_address (
id BIGINT,
address_name VARCHAR(200),
send_status INT(1),
receive_status INT(1),
name VARCHAR(64),
phone VARCHAR(64),
province VARCHAR(64),
city VARCHAR(64),
region VARCHAR(64),
detail_address VARCHAR(200)
);
ALTER TABLE oms_company_address
ADD PRIMARY KEY (id);
ALTER TABLE oms_company_address
RENAME COLUMN recieve_status TO receive_status;

INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (01, 'home', 0, 1, 'George', '6691234567', 'CA', 'Santa Clara', 'San Jose', '87 N San Pedro St');

USE oms_database;
SELECT * FROM oms_company_address;

INSERT INTO oms_company_address
VALUES 
		(02, 'SoCal', 1, 1, 'Alex', '6691467238', 'CA', 'Los Angeles', 'Pasedena', '186 First St'),
		(03, 'Bay Area', 0, 0, 'Nate', '5782179327', 'CA', 'San Mateo', 'Foster City', '1070 City Blvd'),
		(04, 'Seattle Area', 1, 1, 'Mason', '9781235890', 'WA', 'Seattle', 'Seattle', '5500 Phinney Ave'),
		(05, 'San Francisco', 0, 1, 'Kate', '345789260', 'CA', 'San Francisco', 'South San Francisco', '3489 16th St'),
		(06, 'Bay Area', 1, 0, 'Mark', '456239870', 'CA', 'Oakland', 'Oakland', '650 bellevue Ave');
        
        
SELECT * FROM oms_company_address; 

SELECT * From oms_company_address
ORDER BY id ASC
LIMIT 3;

UPDATE oms_company_address
SET phone = '666-666-8888'
WHERE id BETWEEN 1 AND 6;

DELETE FROM oms_company_address WHERE id=1;
```

Table view

![table_view](/Users/zhy/Desktop/table_view.png)

Top three records

![top_three](/Users/zhy/Desktop/top_three.png)

Update phone number

![update_phone](/Users/zhy/Desktop/update_phone.png)

Delete on entry 

![after_deleting](/Users/zhy/Desktop/after_deleting.png)

##### NoSQL Exercise - MongoDB

1. Create ``test`` DB

   ```javascript
   // run mongodb shell
   mongosh
   
   use test
   ```

   

2. Create ``oms-company_address`` collection (method: createCollection())

   ```javascript
   db.createCollection('oms_campany_address')
   ```

   

3. Insert few random entries to ``oms_company_address`` collection (method: insert())

   ```javascript
   db.oms_company_address.insertOne(
     {
     id: 1,
     address_name: 'home', 
     send_status: 0, 
     receive_status: 1, 
     name: 'George', 
     phone: '6691234567', 
     province: 'CA', 
     city: 'Santa Clara', 
     region: 'San Jose', 
     detail_address: '87 N San Pedro St'
     }
   )
   
   db.oms_company_address.insertMany([
     {
       id: 02,
       address_name: 'SoCal',
       send_status: 1,
       receive_status: 1,
       name: 'Alex',
       phone: '6691467238',
       province: 'CA',
       city: 'Los Angeles',
       region: 'Pasadena',
       detail_address: '186 First St'
     },
     {
       id: 03,
       address_name: 'Bay Area',
       send_status: 0,
       receive_status: 0,
       name: 'Nate',
       phone: '5782179327',
       province: 'CA',
       city: 'San Mateo',
       region: 'Foster City',
       detail_address: '1070 City Blvd'
     },
     {
       id: 04,
       address_name: 'Seattle Area',
       send_status: 1,
       receive_status: 1,
       name: 'Mason',
       phone: '9781235890',
       province: 'WA',
       city: 'Seattle',
       region: 'Seattle',
       detail_address: '5500 Phinney Ave'
     },
     {
       id: 05,
       address_name: 'San Francisco',
       send_status: 0,
       receive_status: 1,
       name: 'kate',
       phone: '345789260',
       province: 'CA',
       city: 'San Francisco',
       region: 'South San Francisco',
       detail_address: '3489 16th St'
     },
     {
       id: 06,
       address_name: 'Bay Area',
       send_status: 1,
       receive_status: 0,
       name: 'Mark',
       phone: '456239870',
       province: 'CA',
       city: 'Oakland',
       region: 'Oakland',
       detail_address: '650 bellevue Ave'
     }
     ])
   ```

   

4. Read one entry from ``oms_company_address`` collection (method: find())

   ```javascript
   db.oms_company_address.find({'id': 1})
   ```

   

5. Read all entries from ``oms_company_address`` collection (method: find())

   ```javascript
   db.oms_company_address.find({})
   ```

   

6. Update one entry from ``oms_company_address`` collection (method: update() or save())

   ```javascript
   db.oms_company_address.updateOne(
     {id: 1},
     {$set: {address_name: 'Bay Area'}}
     )
   
   db.oms_company_address.updateMany(
     {id: {$lt: 3}},
     {$set: {phone: '666-666-8888'}}
     )
   ```

   

7. Remove one entry form ``oms_company_address`` collection (method: remove())

   ```javascript
   db.oms_company_address.deleteOne({name: 'George'})
   
   db.oms_company_address.deleteMany({phone: '666-666-8888'})
   ```

   ![mongodb](/Users/zhy/Desktop/mongodb.png)

#### REST API

##### Postman

1. 5 GET APIs with different response type

   - GET https://ghibliapi.herokuapp.com/films/12cfb892-aac0-4c5b-94af-521852e46d6a

     Response:

     200 ok

     ```json
     {
         "id": "12cfb892-aac0-4c5b-94af-521852e46d6a",
         "title": "Grave of the Fireflies",
         "original_title": "火垂るの墓",
         "original_title_romanised": "Hotaru no haka",
         "image": "https://image.tmdb.org/t/p/w600_and_h900_bestv2/qG3RYlIVpTYclR9TYIsy8p7m7AT.jpg",
         "movie_banner": "https://image.tmdb.org/t/p/original/vkZSd0Lp8iCVBGpFH9L7LzLusjS.jpg",
         "description": "In the latter part of World War II, a boy and his sister, orphaned when their mother is killed in the firebombing of Tokyo, are left to survive on their own in what remains of civilian life in Japan. The plot follows this boy and his sister as they do their best to survive in the Japanese countryside, battling hunger, prejudice, and pride in their own quiet, personal battle.",
         "director": "Isao Takahata",
         "producer": "Toru Hara",
         "release_date": "1988",
         "running_time": "89",
         "rt_score": "97",
         "people": [
             "https://ghibliapi.herokuapp.com/people/"
         ],
         "species": [
             "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2"
         ],
         "locations": [
             "https://ghibliapi.herokuapp.com/locations/"
         ],
         "vehicles": [
             "https://ghibliapi.herokuapp.com/vehicles/"
         ],
         "url": "https://ghibliapi.herokuapp.com/films/12cfb892-aac0-4c5b-94af-521852e46d6a"
     }
     ```

   - GET https://ghibliapi.herokuapp.com/people?limit=10

     Response:

     200 ok

     ```json
     [
         {
             "id": "267649ac-fb1b-11eb-9a03-0242ac130003",
             "name": "Haku",
             "gender": "Male",
             "age": "12",
             "eye_color": "Green",
             "hair_color": "Green",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/dc2e6bd1-8156-4886-adff-b39e6043af0c"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/e2cfaa78-fb19-11eb-9a03-0242ac130003",
             "url": "https://ghibliapi.herokuapp.com/people/267649ac-fb1b-11eb-9a03-0242ac130003"
         },
         {
             "id": "fe93adf2-2f3a-4ec4-9f68-5422f1b87c01",
             "name": "Pazu",
             "gender": "Male",
             "age": "13",
             "eye_color": "Black",
             "hair_color": "Brown",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/fe93adf2-2f3a-4ec4-9f68-5422f1b87c01"
         },
         {
             "id": "598f7048-74ff-41e0-92ef-87dc1ad980a9",
             "name": "Lusheeta Toel Ul Laputa",
             "gender": "Female",
             "age": "13",
             "eye_color": "Black",
             "hair_color": "Black",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/598f7048-74ff-41e0-92ef-87dc1ad980a9"
         },
         {
             "id": "3bc0b41e-3569-4d20-ae73-2da329bf0786",
             "name": "Captain Dola",
             "gender": "Female",
             "age": "60",
             "eye_color": "Black",
             "hair_color": "Peach",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/3bc0b41e-3569-4d20-ae73-2da329bf0786"
         },
         {
             "id": "abe886e7-30c8-4c19-aaa5-d666e60d14de",
             "name": "Romska Palo Ul Laputa",
             "gender": "Male",
             "age": "33",
             "eye_color": "Black",
             "hair_color": "Brown",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/abe886e7-30c8-4c19-aaa5-d666e60d14de"
         },
         {
             "id": "e08880d0-6938-44f3-b179-81947e7873fc",
             "name": "Uncle Pom",
             "gender": "Male",
             "age": "Unspecified/Elderly",
             "eye_color": "Black",
             "hair_color": "White",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/e08880d0-6938-44f3-b179-81947e7873fc"
         },
         {
             "id": "5c83c12a-62d5-4e92-8672-33ac76ae1fa0",
             "name": "General Mouro",
             "gender": "Male",
             "age": "Unspecified/Adult",
             "eye_color": "Black",
             "hair_color": "None",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/5c83c12a-62d5-4e92-8672-33ac76ae1fa0"
         },
         {
             "id": "3f4c408b-0bcc-45a0-bc8b-20ffc67a2ede",
             "name": "Duffi",
             "gender": "Male",
             "age": "Unspecified/Adult",
             "eye_color": "Dark brown",
             "hair_color": "Dark brown",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/3f4c408b-0bcc-45a0-bc8b-20ffc67a2ede"
         },
         {
             "id": "fcb4a2ac-5e41-4d54-9bba-33068db083ca",
             "name": "Louis",
             "gender": "Male",
             "age": "30",
             "eye_color": "Dark brown",
             "hair_color": "Dark brown",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/fcb4a2ac-5e41-4d54-9bba-33068db083ca"
         },
         {
             "id": "2cb76c15-772a-4cb3-9919-3652f56611d0",
             "name": "Charles",
             "gender": "Male",
             "age": "Unspecified/Adult",
             "eye_color": "Dark brown",
             "hair_color": "Light brown",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
             "url": "https://ghibliapi.herokuapp.com/people/2cb76c15-772a-4cb3-9919-3652f56611d0"
         }
     ]
     ```

   - GET https://reqres.in/api/users/1

     response:

     200 ok

     ```json
     {
         "data": {
             "id": 1,
             "email": "george.bluth@reqres.in",
             "first_name": "George",
             "last_name": "Bluth",
             "avatar": "https://reqres.in/img/faces/1-image.jpg"
         },
         "support": {
             "url": "https://reqres.in/#support-heading",
             "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
         }
     }
     ```

   - GET https://ghibliapi.herokuapp.com/species?name=Spirit

     Response:

     200 ok

     ```json
     [
         {
             "id": "b5a92d0e-5fb4-43d4-ba60-c012135958e4",
             "name": "Spirit",
             "classification": "Spirit",
             "eye_colors": "Red",
             "hair_colors": "Light Orange",
             "url": "htps://ghibliapi.herokuapp.com/species/b5a92d0e-5fb4-43d4-ba60-c012135958e4",
             "people": [
                 "https://ghibliapi.herokuapp.com/people/ca568e87-4ce2-4afa-a6c5-51f4ae80a60b"
             ],
             "films": [
                 "https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
             ]
         }
     ]
     ```

   - GET https://ghibliapi.herokuapp.com/vehicles

     Response:

     200 ok

     ```json
     [
         {
             "id": "4e09b023-f650-4747-9ab9-eacf14540cfb",
             "name": "Air Destroyer Goliath",
             "description": "A military airship utilized by the government to access Laputa",
             "vehicle_class": "Airship",
             "length": "1,000",
             "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
             ],
             "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
         },
         {
             "id": "d8f893b5-1dd9-41a1-9918-0099c1aa2de8",
             "name": "Red Wing",
             "description": "An experimental aircraft captured by Porco. Named Savoia S.21",
             "vehicle_class": "Airplane",
             "length": "20",
             "pilot": "https://ghibliapi.herokuapp.com/people/6523068d-f5a9-4150-bf5b-76abe6fb42c3",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/ebbb6b7c-945c-41ee-a792-de0e43191bd8"
             ],
             "url": "https://ghibliapi.herokuapp.com/vehicles/d8f893b5-1dd9-41a1-9918-0099c1aa2de8"
         },
         {
             "id": "923d70c9-8f15-4972-ad53-0128b261d628",
             "name": "Sosuke's Boat",
             "description": "A toy boat where Sosuke plays",
             "vehicle_class": "Boat",
             "length": "10",
             "pilot": "https://ghibliapi.herokuapp.com/people/a10f64f3-e0b6-4a94-bf30-87ad8bc51607",
             "films": [
                 "https://ghibliapi.herokuapp.com/films/758bf02e-3122-46e0-884e-67cf83df1786"
             ],
             "url": "https://ghibliapi.herokuapp.com/vehicles/923d70c9-8f15-4972-ad53-0128b261d628"
         }
     ]
     ```

     

2. 5 POST APIs with JSON request body, please also paste the response here

   1. POST https://ghibliapi.herokuapp.com/people

      request body:

      ```json
      {
          "id": '123',
          "name": 'people1',
          "gender": 'Female',
          "age": '23'
      }
      ```

      Response:

      201 created

      ```json
      {
          "id": "c47d02f6-c078-4592-8e48-5ac5708f0125"
      }
      ```

      

   2. POST https://reqres.in/api/register

      request body:

      ```json
      {
          "email": "eve.holt@reqres.in",
          "password": "cityslicka"
      }
      ```

      Response:

      200 ok

      ```json
      {
        "id": 4,
        "token": "QpwL5tke4Pnpja7X4"
      }
      ```

      

   3. POST https://reqres.in/api/users

      request body:

      ```json
      {
          "name": "morpheus",
          "job": "leader"
      }
      ```

      Response:

      201 created

      ```json
      {
          "id": "608",
          "createdAt": "2022-10-30T20:32:16.432Z"
      }
      ```

      

   4. POST https://reqres.in/api/logout

      Request body: N/A

      Response:

      200 ok

      ```json
      {}
      ```

      

   5. POST https://reqres.in/api/login

      Request body:

      ```json
      {
          "email": "eve.holt@reqres.in",
          "password": "cityslicka"
      }
      ```

      Response:

      20 ok

      ```json
      {
        "token": "QpwL5tke4Pnpja7X4"
      }
      ```

      

3. 3 PUT APIs with JSON request body, please also paste the response here

   - PUT https://reqres.in/api/users/2

     Request body:

     ```json
     {
         "name": "morpheus",
         "job": "zion resident"
     }
     ```

     Response:

     200 ok

     ```json
     {
         "updatedAt": "2022-10-30T21:14:28.037Z"
     }
     ```

   - PUT https://reqres.in/api/1/1

     request body:

     ```json
     {
         "id": 2,
         "name": "fuchsia rose",
         "year": 2001,
         "color": "#C74375",
         "pantone_value": "17-2031"
     }
     ```

     Response:

     200 ok

     ```json
     {
         "updatedAt": "2022-10-30T22:03:23.950Z"
     }
     ```

   - PUT https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe

     request body:

     ```json
     {
         "title": "test"
     }
     ```

     Response:

     200 ok

     ```json
     {
         "id": "2baf70d1-42bb-4437-b551-e5fed5a87abe"
     }
     ```

     

4. 2 DELETE APIs

   - DELETE https://reqres.in/api/users/2

     Response:

     204 no content

     

   - DELETE https://reqres.in/api/1/1

     Response:

     204 no content

     

5. Each example with 404, 401, 500 and any HTTP status code you know.

   - 200 OK
   - 201 Created
   - 202 Accepted
   - 204 No Content

   - 400 Bad Request

   - 401 Unauthorized

   - 404 Not Found

   - 500 Internet Server Error

   - 502 Bad Gateway

     

##### Design API

1. Find 2 collections of API examples, i.e. Twitter, Paypal, Youtube, etc. 

   1. [Twitter API v2](https://www.postman.com/twitter/workspace/twitter-s-public-workspace/collection/9956214-784efcda-ed4c-4491-a4c0-a26470a67400?ctx=documentation)

      Get single tweet: GET https://api.twitter.com/2/tweets/:id

      get multiple tweets: GET  https://api.twitter.com/2/tweets?ids=

      ge user by ID: GET  https://api.twitter.com/2/users/:id

      get users by ID: GET  https://api.twitter.com/2/users?ids=

      get user by username: GET  https://api.twitter.com/2/users/by/username/:username

      get users by username: GET  https://api.twitter.com/2/users/by?usernames=

      get followers of user ID: GET  https://api.twitter.com/2/users/:id/followers

      get users a user ID is following: GET  https://api.twitter.com/2/users/:id/following

      follow a user ID: POST https://api.twitter.com/2/users/:id/following

      unfollow a user ID: DEL https://api.twitter.com/2/users/:source_user_id/following/:target_user_id

      create a tweet: POST https://api.twitter.com/2/tweets

      delete a tweet: DEL https://api.twitter.com/2/tweets/:id

      like a tweet: POST https://api.twitter.com/2/users/:id/likes

      get liked tweets: GET https://api.twitter.com/2/users/:id/liked_tweets

      unlike a tweet: DEL https://api.twitter.com/2/users/:id/likes/:tweet_id

      

   2. [Paypal APIs](https://developer.paypal.com/api/rest/)

      create orders: POST {{base_url}}/v2/checkout/orders

      show order details: GET {{base_url}}/v2/checkout/orders/:order_id

      show details for authorized payments GET {{base_url}}/v2/payments/authorizations/:authorization_id

      refund captured payment: POST {{base_url}}/v2/payments/captures/:capture_id/refund

      show refund details: GET {{base_url}}/v2/payments/refunds/:refund_id

      generate invoice number: POST {{base_url}}/v2/invoicing/generate-next-invoice-number

      generate QR code: POST {{base_url}}/v2/invoicing/invoices/:invoice_id/generate-qr-code

      

2. Design a collection of APIs for a **blog website**, please specify GET, POST, PUT, DELETE

   get user by ID: GET https://api.blog.com/v1/users/:id

   get a post by ID: GET https://api.blog.com/v1/posts/:id

   get followers of user ID: GET https://api.blog.com/v1/users/:id/followers

   get users a user ID is following: GET https://api.blog.com/v1/users/:id/following

   create a post: POST https://api.blog.com/v1/posts

   delete a post: DEL https://api.blog.com/v1/posts/:id

   update a post: PUT https://api.blog.com/v1/posts/:id

   like a post: POST https://api.blog.com/v1/users/:id/likes

   get liked posts: GET https://api.blog.com/v1/users/:id/liked-posts

   unlike a post: DEL https://api.blog.com/v1/users?:id/likes/:post-id

   

3. Design a collection of APIs for the following features, think about how to use **path variables**, **sub resources**, where to use **plurals**.
   1. find the customer's payments, like credit card 1, credit card 2, Paypal, ApplePay
   
      GET /api/v1/customers/:id/payments
   
   2. find the customer's history orders from 10/10/2022 to 10/24/2022
   
      GET /api/v1/customers/:id/orders?startDate='10/10/2022'&endDate='10/24/2022'
   
   3. find the customer's delivery addresses
   
      GET /api/v1/customers/:id/delivery-addresses
   
   4. if I also want to get customer's default payment and default delivery addresses, what kind of API(URL) should it be?
   
      GET /api/v1/customers/:id/payments/default
   
      GET /api/v1/customers/:id/delivery-addresses/default





