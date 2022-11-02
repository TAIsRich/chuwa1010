## HW6

Database

SQL Exercise - MySQL

```sql
CREATE DATABASE oms_database;
USE oms_company_address (
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
RENAME COLUMN receive_status TO receive_status;

INSERT INTO oms_company_address (id ,address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUE (01, 'home', 0, 1, 'George', '9874444333', 'TX', 'Dallas', 'Dallas', '123 West Main St' );

USE oms_database;
SELECT * FROM oms_company_address;

INSERT INTO oms_company_address
VALUE
        (02, 'SoCal', 1, 1, 'Alex', '6691467238', 'CA', 'Los Angeles', 'Pasedena', '186 First St'),
        (03, 'Bay Area', 0, 0, 'Nate', '5782179327', 'CA', 'San Mateo', 'Foster City', '1070 City Blvd'),
        (04, 'Seattle Area', 1, 1, 'Mason', '9781235890', 'WA', 'Seattle', 'Seattle', '5500 Phinney Ave'),
        (05, 'San Francisco', 0, 1, 'Kate', '345789260', 'CA', 'San Francisco', 'South San Francisco', '3489 16th St'),
        (06, 'Bay Area', 1, 0, 'Mark', '456239870', 'CA', 'Oakland', 'Oakland', '650 bellevue Ave');
SELECT * FROM oms_company_address;

SELECT * FROM oms_company_address;
ORDER BY id ASC
LIMIT 3;

UPDATE oms_company_address;
SET phone = '666-666-8888'
WHERE id BETWEEN 1 AND 6;

DELETE FROM oms_company_address WHERE id = 1;
```

NoSQL Exercise - MongoDB

1. Create `test` DB

   ```sql
   mongosh
   use test
   ```

2. Create `oms_company_address` collection

   ```sql
   db.createCollection('oms_company_address')
   ```

3. Insert random enrtries to `oms_company_address` collection

   ```sql
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

4. Read one entry from `oms_company_address` collection

   ```sql
   db.oms_company_address.find({'id': 1})
   ```

5. Read all entries from `oms_company_address` collection

   ```sql
   db.oms_company_address.find({})
   ```

6. Update one entry from `oms_company_address` collection

   ```sql
   db.oms_company_address.updateOne(
   {id: 1},
   {$set: {address_name: 'Bay Area'}}
   )
   db.oms_company_address.updateMany(
   {id: {$lt: 3}},
   {$set: {phone: '333-333-4444'}}
   )
   ```

7. Remove one entry from `oms_company_address` collection

   ```sql
   db.oms_company_address.deleteOne({name: 'George'})
   db.oms_company_address.deleteMany({phone: '333-333-4444'})
   ```

   

### REST API

##### Postman

1. GET APIs with different response type

   GET https://ghibliapi.herokuapp.com/locations/

   ```json
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
       },
       {
           "id": "64a996aa-481e-4627-9624-ab23f59a05a9",
           "name": "Gutiokipanja",
           "climate": "Continental",
           "terrain": "Hill",
           "surface_water": "50",
           "residents": [
               "https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0",
               "https://ghibliapi.herokuapp.com/people/030555b3-4c92-4fce-93fb-e70c3ae3df8b"
           ],
           "films": [
               "https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
           ],
           "url": "https://ghibliapi.herokuapp.com/locations/64a996aa-481e-4627-9624-ab23f59a05a9"
       },...
       {
           "id": "398e3e1e-9912-4eb6-91fe-a9f8b932b67d",
           "name": "St. Morwald's Home for Children",
           "climate": "Mild",
           "terrain": "City",
           "surface_water": "",
           "residents": [
               "https://ghibliapi.herokuapp.com/people/2d66e2eb-5a74-4721-a5b3-c556497bdb66",
               "https://ghibliapi.herokuapp.com/people/835f8c7c-2fc6-4f54-b545-c02ab066cd69"
           ],
           "films": [
               "https://ghibliapi.herokuapp.com/films/790e0028-a31c-4626-a694-86b7a8cada40"
           ],
           "url": "https://ghibliapi.herokuapp.com/locations/398e3e1e-9912-4eb6-91fe-a9f8b932b67d"
       }
   ]
   ```

2. GET https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a Response status: 200 OK

   ```json
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
   ```

3. GET https://ghibliapi.herokuapp.com/locations?name=Irontown Response status: 200 OK

   ```json
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
   ```

4. GET https://ghibliapi.herokuapp.com/locations/id=11014596-71b0-4b3e-b8c0-1c4b15f28b9a Response status: 404 Not Found []

1. POST https://ghibliapi.herokuapp.com/locations Request Body:

   ```json
   {
       "name": "Irontown"
   }
   ```

​	Response Status: 201 Created Response:

```json
{
    "id": "f918f745-79ce-4a29-9a2e-f6a1a831faf7"
}
```

2. POST https://ghibliapi.herokuapp.com/locations Request Body:

   ```json	
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
   ```

   Response Status: 201 Created Response:

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain",
       "surface_water": 40,
       "residents": [
           "https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0",
           "https://ghibliapi.herokuapp.com/people/030555b3-4c92-4fce-93fb-e70c3ae3df8b"
       ],
       "films": [
           "https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
       ],
       "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
   }
   ```

3. https://ghibliapi.herokuapp.com/locations Request Body:

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain"
       
     }
   ```

   Response Status: 201 Created ResponseL

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain"
   }
   ```

4. Post https://ghibliapi.herokuapp.com/locations/ Request Body:

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a"    
   }
   ```

   Response Status: 201 Created ResponseL

   ```json
   {
       "id": "40847cfa-e51e-48b0-9e27-4b26d6fb9379"
   }
   ```

5. Post https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a Request Body:

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown",
       "climate": "Continental",
       "terrain": "Mountain"
       
     }
   ```

   Response Status: 404 Not Found Response: `{}`

1. PUT https://ghibliapi.herokuapp.com/locations/ Request Body

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
     }
   ```

   Response Status: 404 Not Found Response: {}

2. PUT https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a Request Body:

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown change",
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
   ```

   Response Status: 200 OK Response:

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown change",
       "climate": "Continental",
       "terrain": "Mountain",
       "surface_water": 40,
       "residents": [
           "https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0",
           "https://ghibliapi.herokuapp.com/people/030555b3-4c92-4fce-93fb-e70c3ae3df8b"
       ],
       "films": [
           "https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
       ],
       "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
   }
   ```

3. PUT https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a Request Body:

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown change",
       "climate": "Continental change",
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
   ```

   Response Status: 200 OK (but did not change id)

   ```json
   {
       "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a",
       "name": "Irontown change",
       "climate": "Continental change",
       "terrain": "Mountain",
       "surface_water": 40,
       "residents": [
           "https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0",
           "https://ghibliapi.herokuapp.com/people/030555b3-4c92-4fce-93fb-e70c3ae3df8b"
       ],
       "films": [
           "https://ghibliapi.herokuapp.com/films/0440483e-ca0e-4120-8c50-4c8cd9b965d6"
       ],
       "url": "https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
   }
   ```

1. DELETE https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a Response Status: 200 OK Response: `{}`
2. DELETE https://ghibliapi.herokuapp.com/locations?id=11014596-71b0-4b3e-b8c0-1c4b15f28b9a Response Status: 404 Not Found Reponse: `{}`

### API Design

1. Find 2 collection of APIs examples. ie. Twitter, PayPal, Youtube etc.
2. Design a collection of APIs for a Blog Website, please sepcify GET POST PUT DELETE

```htm
Blog Website:
GET https://www.blog.com/{id}
POST https://www.blog.com/{id}/info
PUT https://www.blog.com/{id}/info
DELETE https://www.blog.com/{id}/info
```

### Design APIs for the following features

1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.

   `GET /api/v1/customers/{customer_id}/payments`

2. Find the customer's history orders from 10/10/2022 to 10/24/2022

   `GET /api/v1/customers/{customer_id}/order/orderdates?startDate="10/10/2022"&endDates="10/24/2022"`

3. find the customer's delievery addresses

   `GET /api/v1/customers/{customer_id}/addresses`

4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL) should be?

   `GET /api/v1/customers/{customer_Id}/payments/default`

   `GET /api/v1/customers/{customer_Id}/addresses/default`