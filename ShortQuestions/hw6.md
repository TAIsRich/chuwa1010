# HW6 - Database, REST API

## MySQL Exercise

1. **Create `oms_company_address` table**

   ```sql
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
   ```

2. **Insert some random data to `oms_company_address` table**

   ```sql
   insert into oms_company_address values
   (100001, "Celtics", 1, 1, "Jason Tatum", "8601239876", "MA", "Boston", "Suffolk County", "100 Legends Way"),
   (100002, "Bulls", 1, 0, "Coby White", "2304568216", "IL", "Chicago", "Cook County", "1901 W Madison St"),
   (100003, "Knicks", 0, 0, "RJ Barrett", "2035891234", "NY", "New York", "New York County", "4 Pennsylvania Plaza"),
   (100004, "Nets", 1, 0, "Kevin Durant", "4031110000", "NY", "Brooklyn", "Kings County", "620 Atlantic Ave");
   ```

3. **Write a SQL query to fetch all data from `oms_company_address `table**

   ```sql
   select * from oms_company_address;
   ```

4. **Write a SQL query to fetch top 3 records from `oms_company_address` table**

   ```sql
   select * from oms_company_address limit 3;
   ```

5. **Update `oms_company_address` table to set all `phone` to 666-6666-8888**

   ```sql
   update oms_company_address
   set phone = "666-6666-8888";
   ```

6. **Delete one entry from `oms_company_address` table**

   ```sql
   delete from oms.oms_company_address where id = 100001;
   ```

   

## MongoDB - Non-SQL Exercise

1. **Create `test` DB** 

   `use test`

2. **Create `oms_company_address` collection**

   `db.createCollection("oms_company_address")`

3. **Insert few random entries to `oms_company_address` collection**

   `db.oms_company_address.insert({.....})`

4. **Read one entry from `oms_company_address` collection** 

   `db.oms_company_address.find({_id: 100002})`

   ![oneentry](https://raw.githubusercontent.com/KeMa-444/gitexample/main/screenshots/oneentry.png)

5. **Read all entries from `oms_company_address` collection**

   `db.oms_company_address.find()` 

   ![allentry](https://raw.githubusercontent.com/KeMa-444/gitexample/main/screenshots/allentry.png)

6. **Update one entry from `oms_company_address` collection**

   `db.oms_company_address.findOneAndUpdate({_id: 100002},{$set:{phone: Long("8886668888")}})` 

   `db.oms_company_address.find({_id: 100002})`

   ![updateoneentry](https://raw.githubusercontent.com/KeMa-444/gitexample/main/screenshots/updateoneentry.png)

7. **Remove one entry from `oms_company_address` collection**

   `db.oms_company_address.remove({_id: 100004})`

   `db.oms_company_address.find()`

   ![removeoneentry](https://raw.githubusercontent.com/KeMa-444/gitexample/main/screenshots/removeoneentry.png)



## REST API

1. **5 GET APIs with different response type**

   - `GET https://reqres.in/api/users/2` - 200 OK

   - `GET https://reqres.in/api/users/22` - 404 Not Found

   - `GET https://ghibliapi.herokuapp.com/people` - 200 OK

   - `GET https://ghibliapi.herokuapp.com/people/2` - 404 Not Found

   - `GET https://ghibliapi.herokuapp.com/people?gender=Male` - 200 OK

2. **5 Post API with json request body, please also paste the response here**

   - `POST https://reqres.in/api/users` - 201 Created

     request body:

     ```json
     {
         "name": "kyrie",
         "job": "athlete"
     }
     ```

     response:

     ```json
     {
         "name": "kyrie",
         "job": "athlete",
         "id": "931",
         "createdAt": "2022-10-26T03:41:13.751Z"
     }
     ```

   - `POST https://reqres.in/api/register` - 200 OK

     request body:

     ```json
     {
         "email": "eve.holt@reqres.in",
         "password": "pistol"
     }
     ```

     response:

     ```json
     {
         "id": 4,
         "token": "QpwL5tke4Pnpja7X4"
     }
     ```

   - `POST https://reqres.in/api/register` - 400 Bad Request

     request body:

     ```json
     {
         "email": "AAA@reqres.in",
         "password": "pistol"
     }
     ```

     response:

     ```json
     {
         "error": "Note: Only defined users succeed registration"
     }
     ```

   - `POST https://reqres.in/api/register` - 400 Bad Request

     request body:

     ```json
     {
         "email": "eve.holt@reqres.in"
     }
     ```

     response: 

     ```json
     {
         "error": "Missing password"
     }
     ```

   - `POST https://reqres.in/api/login` - 200 OK

     request body:

     ```json
     {
         "email": "eve.holt@reqres.in",
         "password": "cityslicka"
     }
     ```

     response:

     ```json
     {
         "token": "QpwL5tke4Pnpja7X4"
     }
     ```

3. **3 PUT API with json request body, please also paste the response here**

   - `PUT https://reqres.in/api/users/2` - 200 OK

     request body:

     ```json
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
         "updatedAt": "2022-10-26T04:12:48.126Z"
     }
     ```

   - `PUT https://reqres.in/api/users` - 404 Not Found

     request body:

     ```json
     {
         "name": "morpheus",
         "job": "zion resident"
     }
     ```

     

   - `PUT https://ghibliapi.herokuapp.com/people/05d8d01b-0c2f-450e-9c55-aa0daa34838e` - 200 OK

     request body:

     ```
     {
         "age": "25"
     }
     ```

     response:

     ```json
     {
         "age": 25,
         "id": "05d8d01b-0c2f-450e-9c55-aa0daa34838e"
     }
     ```

4. **2 DELETE API**

   - `DELETE https://ghibliapi.herokuapp.com/people` - 404 Not Found

   - `DELETE https://ghibliapi.herokuapp.com/people/05d8d01b-0c2f-450e-9c55-aa0daa34838e` - 200 OK

     

## API Design

1. **Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.**

   - PayPal APIs:
     - Get User Info: `GET {{base_url}}/v1/identity/oauth2/userinfo?schema=paypalv1.1`
     - Create Order: `POST {{base_url}}/v2/checkout/orders`
     - Show Order Details: `GET {{base_url}}/v2/checkout/orders/:order_id`
     - Update Order: `PATCH {{base_url}}/v2/checkout/orders/:order_id`
     - Authorize Payment for Order: `POST {{base_url}}/v2/checkout/orders/:order_id/authorize`
     - Show Details for Authorized Payment: `GET {{base_url}}/v2/payments/authorizations/:authorization_id`
     - Show Refund Details: `GET {{base_url}}/v2/payments/refunds/:refund_id`
     - Add Tracking Info for Multi Transactions: `POST {{base_url}}/v1/shipping/trackers-batch`
     - Show Tracking Info: `GET {{base_url}}/v1/shipping/trackers/:tracking_id`
     - Update or Cancel Tracking Info: `PUT {{base_url}}/v1/shipping/trackers/:tracking_id`
     - Show Disputes Details: `GET {{base_url}}/v1/customer/disputes/:dispute_id`
     - Partially Update Dispute: `PATCH {{base_url}}/v1/customer/disputes/:dispute_id`
     - Appeal Dispute: `POST {{base_url}}/v1/customer/disputes/:dispute_id/appeal`
     - Accept Claim: `POST {{base_url}}/v1/customer/disputes/:dispute_id/accept-claim`
   - Youtube APIs:
     - Get Channel Info: `GET {base_URL}/channels?part=contentDetails&mine=true`
     - Get User-Created Playlist: `GET {base_URL}/playlists?part=snippet&mine=true`
     - Get Channel Subscribers: `GET {base_URL}/subscriptions?part=snippet&mySubscribers=true`
     - Get User Subscriptions: `GET {base_URL}/subscriptions?part=snippet&mine=true`
     - Get User Activity During a Time Period: `GET {base_URL}/activities?part=snippet,contentDetails&mine=true&publishedAfter=2013-04-01T00%3A00%3A00Z&publishedBefore=2013-05-01T00%3A00%3A00Z`
     - Get User's Most Viewed Videos: `GET {base_URL}/search?part=snippet&forMine=true&order=viewCount&type=video`
     - Create a Subscription: `POST {base_URL}/subscriptions?part=snippet`
     - Create a Playlist: `POST {base_URL}/playlists?part=snippet`
     - Adding a Video to a Playlist: `POST {base_URL}/playlistItems?part=snippet`

2. **Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE**

   - Get a List of Blog Posts of a User: `GET {{base_url}}/users/{user_id}/posts`
   - Get Details of a Blog Post: `GET {{base_url}}/users/{user_id}/posts/{post_id}`
   - Create a Blog Post: `POST {{base_url}}/users/{user_id}/posts`
   - Replace a Blog Post: `PUT {{base_url}}/users/{user_id}/posts/{post_id}`
   - Partially Update a Blog Post: `PATCH {{base_url}}/users/{user_id}/posts/{post_id}`
   - Delete a Blog Post: `DELETE {{base_url}}/users/{user_id}/posts/{post_id}`

   

   **Design APIs for the following features**

   - **find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.**

     `GET {{base_url}}/customers/123/payments`

   - **Find the customer's history orders from 10/10/2022 to 10/24/2022**

     `GET {{base_url}}/customers/123/orders/date?start=10-10-2022&end=10-24-2022`

   - **find the customer's delievery addresses**

     `GET {{base_url}}/customers/123/addresses`

   - **If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?**

     `GET {{base_url}}/customers/123/payments?default=yes`

     `GET {{base_url}}/customers/123/addresses?default=yes`

data looks like:

```json
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

