# MySQL - Relational Database
### Exercise
**1. Create `oms_company_address` table**
   ```
   CREATE DATABASE oms;
   
   USE oms;
   
   CREATE TABLE oms_company_address (
    id BIGINT PRIMARY KEY,
    address_name VARCHAR(20),
    send_status INT(1),
    receive_status INT(1),
    name VARCHAR(64),
    phone VARCHAR(64),
    province VARCHAR(64),
    city VARCHAR(64),
    region VARCHAR(64),
    detail_address VARCHAR(200)
   );
   ```

**2. Insert some random data to `oms_company_address` table**
   ```
   insert into oms_company_address values (1, "address001", 1, 1, "firstname01 lastname01", "(619) 456-2747", "California", "Lakeside", "San Diego County", "12085 Gay Rio Dr");
   insert into oms_company_address values (2, "address002", 1, 1, "firstname02 lastname02", "(217) 586-2906", "Illinois", "Mahomet", "Champaign County", "108 W State St");
   insert into oms_company_address values (3, "address003", 1, 1, "firstname03 lastname03", "(812) 665-2468", "Indiana", "Jasonville", "Greene County", "4172 W County 1350 Rd S");
   insert into oms_company_address values (4, "address004", 1, 1, "firstname04 lastname04", "(903) 427-1178", "Texas", "Clarksville", "Red River County", "520 W 7th St");
   ```

**3. Write a SQL query to fetch all data from `oms_company_address` table**
   ```
   SELECT * FROM oms_company_address;
   ```

**4. Write a SQL query to fetch top 3 records from `oms_company_address` table**
   ```
   SELECT * FROM oms_company_address LIMIT 3;
   ```

**5. Update `oms_company_address` table to set all phone to 666-6666-8888**
   ```
   SET SQL_SAFE_UPDATES = 0;
   UPDATE oms_company_address SET phone = "666-6666-8888";
   SET SQL_SAFE_UPDATES = 1;
   ```

**6. Delete one entry from `oms_company_address` table**
   ```
   DELETE FROM oms_company_address WHERE id = 1;
   ```


# MongoDB - Non-SQL Database
### Exercise
**1. Create `test` DB**
   ```
   use test
   ```

**2. Create `oms_company_address` collection (method: createCollection() )**
   ```
   db.createCollection("oms_company_address")
   ```

**3. Insert few random entries to `oms_company_address` collection (method: insert() )**
   ```
   db.oms_company_address.insert({id: 1, address_name: "address001", send_status: 1, receive_status: 1, name: "firstname01 lastname01", phone: "(619) 456-2747", province: "California", city: "Lakeside", region: "San Diego County", detail_address:"12085 Gay Rio Dr"})
   db.oms_company_address.insert({id: 2, address_name: "address002", send_status: 1, receive_status: 1, name: "firstname02 lastname02", phone: "(217) 586-2906", province: "Illinois", city: "Mahomet", region: "Champaign County", detail_address: "108 W State St"})
   db.oms_company_address.insert({id: 3, address_name: "address003", send_status: 1, receive_status: 1, name: "firstname03 lastname03", phone: "(812) 665-2468", province: "Indiana", city: "Jasonville", region: "Greene County", detail_address: "4172 W County 1350 Rd S"})
   db.oms_company_address.insert({id: 4, address_name: "address004", send_status: 1, receive_status: 1, name: "firstname04 lastname04", phone: "(903) 427-1178", province: "Texas", city: "Clarksville", region: "Red River County", detail_address: "520 W 7th St"})
   ```

**4. Read one entry from oms_company_address collection (method: find() )**
   ```
   db.oms_company_address.find({id: 1})
   ```

**5. Read all entries from oms_company_address collection (method: find() )**
   ```
   db.oms_company_address.find()
   ```

**6. Update one entry from oms_company_address collection (method:update() or save() )**
   ```
   db.oms_company_address.findOneAndUpdate({id: 1}, {$set: {phone: "666-6666-8888"}})
   db.oms_company_address.findOne({id: 1})
   ```

**7. Remove one entry from oms_company_address collection (method:remove() )**
   ```
   db.oms_company_address.remove({id: 1})
   ```


# REST API
**1. 5 GET APIs with different response type**  
Response status: 220 OK           https://ghibliapi.herokuapp.com/films  
Response status: 220 OK           https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe  
Response status: 404 Not Found    https://ghibliapi.herokuapp.com/films/id=2baf70d1-42bb-4437-b551-e5fed5a87abe  
Response status: 220 OK           https://ghibliapi.herokuapp.com/films?id=2baf70d1-42bb-4437-b551-e5fed5a87abe  
Response status: 220 OK           https://ghibliapi.herokuapp.com/films?id=2baf70d1-42bb-4437-b551-e5fed5a87abe&id=ea660b10-85c4-4ae3-8a5f-41cea3648e3e  
Response status: 220 OK           https://ghibliapi.herokuapp.com/films?original_title=天空の城ラピュタ  
Response status: 220 OK           https://ghibliapi.herokuapp.com/films?title=Castle in the Sky  

**2. 5 Post API with json request body, please also paste the response here**
- Response status: 201 Created https://ghibliapi.herokuapp.com/films
    - Request body:
      ```
      {"title": "Dragon Ball"}
      ```
    - Response:
      ```
      {"title": "Dragon Ball", "id": "6cd0db8f-3881-49b7-aa52-699689b24091"}
      ```
- Response status: 201 Created https://ghibliapi.herokuapp.com/films
    - Request body:
      ```
      {"title": "Dragon Ball", "original_title": "ドラゴンボール"}
      ```
    - Response:
      ```
      {"title": "Dragon Ball", "original_title": "ドラゴンボール", "id": "f10bb2cf-e9b3-46dc-bdde-c1b49e1e3595"}
      ```
- Response status: 201 Created https://ghibliapi.herokuapp.com/people
    - Request body:
      ```
      {"name": "Jay"}
      ```
    - Response:
      ```
      {"name": "Jay", "id": "1089ec24-0053-4f3d-af27-01416aa035a3"}
      ```
- Response status: 201 Created https://ghibliapi.herokuapp.com/people
    - Request body:
      ```
      {"name": "Juno", "gender": "male"}
      ```
    - Response:
      ```
      {"name": "Juno", "gender": "male", "id": "ae76e2bd-49db-4d31-8fa7-d5621fea929b"}
      ```
- Response status: 400 Bad Request https://ghibliapi.herokuapp.com/people 
    - Request body:
      ```
      {"name": "Juno", "gender": "male", "url": "https://ghibliapi.herokuapp.com/people/ae76e2bd-49db-4d31-8fa7-d5621fea929b"}
      ```
    - Response:
      ```
      <!DOCTYPE html>
      <html lang="en">
      <head>
      <meta charset="utf-8">
      <title>Error</title>
      </head>
      <body>
      <pre>Bad Request</pre>
      </body>
      </html>
      ```

**3. 3 PUT API with json request body, please also paste the response here**
- Response status: 404 Not Found https://ghibliapi.herokuapp.com/locations
    - Request body:
      ```
      {"id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain",
       "surface_water": "41",
       "residents": [],
       "films": [],
       "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
      }
      ```
    - Response:
      ```
      {}
      ```
- Response status: 200 OK https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a
    - Request body:
      ```
      {"id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain",
       "surface_water": "41",
       "residents": [],
       "films": [],
       "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
      }
      ```
    - Response:
      ```
      {"id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain",
       "surface_water": "41",
       "residents": [],
       "films": [],
       "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
      }
      ```
- Response status: 404 Not Found https://ghibliapi.herokuapp.com/locations?name=Irontown
    - Request body:
      ```
      {"id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain",
       "surface_water": "42",
       "residents": [],
       "films": [],
       "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
      }
      ```
    - Response:
      ```
      {}
      ```

**4. 2 DELETE API**  
Response status: 200 OK         https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe  
Response status: 404 Not Found  https://ghibliapi.herokuapp.com/films?id=2baf70d1-42bb-4437-b551-e5fed5a87abe


# API Design
**1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.**
- [Gmail](https://developers.google.com/gmail/api/reference/rest):
  - GET (Method: users.getProfile) https://gmail.googleapis.com/gmail/v1/users/{userId}/profile
  - POST (Method: users.stop) https://gmail.googleapis.com/gmail/v1/users/{userId}/stop
  - PoST (Method: users.drafts.create) https://gmail.googleapis.com/upload/gmail/v1/users/{userId}/drafts
  - DELETE (Method: users.drafts.delete) https://gmail.googleapis.com/gmail/v1/users/{userId}/drafts/{id}
- [Youtube](https://developers.google.com/youtube/v3/docs):
  - GET https://www.googleapis.com/youtube/v3/channels
  - PUT https://www.googleapis.com/youtube/v3/channels
  - GET https://www.googleapis.com/youtube/v3/comments
  - POST https://www.googleapis.com/youtube/v3/comments
  - PUT https://www.googleapis.com/youtube/v3/comments

**2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE**  

**www.ablogwebbsite.com**

- GET
  - get user posts: https://www.ablogwebbsite.com/users/{user_id}/posts
  - get user profile: https://www.ablogwebbsite.com/users/{user_id}/profile
- POST
  - create a blog: https://www.ablogwebbsite.com/users/{user_id}/posts
- PUT
  - update user profile: https://www.ablogwebbsite.com/users/{user_id}/profile
- DELETE
  - delete a post: https://www.ablogwebbsite.com/users/{user_id}/posts/{post_id}

**3. Design APIs for the following features**
- **1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.**  
        `https://www.companyname.com/customer/{customer_id}/payments`
- **2. Find the customer's history orders from 10/10/2022 to 10/24/2022**  
        `https://www.companyname.com/customer/{customer_id}/orders/date?start=10-10-2022&end=10-24-2022`
- **3. find the customer's delivery addresses**  
        `https://www.companyname.com/customer/{customer_id}/addresses`
- **4. If I also want to get customer's default payment and default delivery address, what kind of the API (URL) should be?**  
        `https://www.companyname.com/customer/{customer_id}/payments?default=true&addresses?default=true`