# Homework 6 (HW5)

## SQL
### 1. Create `oms_company_address` table
```MySQL
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

### 2. Insert some random data to `oms_company_address` table
```MySQL
INSERT INTO oms_company_address VALUES(
    1,
    "ABC Co Ltd",
    0,
    0,
    "Mike Wang",
    "13012345789",
    "Beijing",
    "Beijing",
    "Chaoyang",
    "30 East 3rd Ring Road"
)
INSERT INTO oms_company_address VALUES(
    2,
    "CBA Corp",
    1,
    0,
    "Michelle Li",
    "13087543215",
    "Shanghai",
    "Shanghai",
    "Pudong",
    "1233 Lujiazui Ring Road"
)
INSERT INTO oms_company_address VALUES(
    3,
    "XYZ LLC",
    1,
    1,
    "James Park",
    "2121231234",
    "New York",
    "New York",
    "Greenwich Villege",
    "20 W 10 ST"
)
```

### 3. Write a SQL query to fetch all data from `oms_company_address` table
`SELECT * FROM oms_company_address;`

### 4. Write a SQL query to fetch top 3 records from oms_company_address table
`SELECT * FROM oms_company_address LIMIT 3;`

### 5. Update oms_company_address table to set all phone to 666-6666-8888
`UPDATE oms_company_address SET phone = '666-6666-8888';`

### 6. Delete one entry from oms_company_address table
`DELETE FROM oms_company_address WHERE id = 1;`

### 7. (Optional) You can also try to create other tables that listed above
```MySQL
CREATE TABLE oms_order_return_reason (
    id BIGINT PRIMARY KEY,
    name VARCHAR(100),
    sort INT,
    status INT(1),
    create_time DATETIME
);
```

## MongoDB
### 1. Create test DB
`use test`
### 2. Create oms_company_address collection (method: createCollection() )
`db.createCollection('oms_company_address')`
### 3. Insert few random entries to oms_company_address collection (method: insert() )
```MongoDB
db.oms_company_address.insert(
    [
        {id: 1, address_name: 'ABC Co Ltd', send_status: 0, receive_status: 0, name: 'Mike Wang', phone: '13012345789', province: 'Beijing', city: 'Beijing', region: 'Chaoyang', detail_address: '30 East 3rd Ring Road'},

        {id: 2, address_name: 'CBA Corp', send_status: 1, receive_status: 0, name: 'Michelle Li', phone: '13087543215', province: 'Shanghai', city: 'Shanghai', region: 'Pudong', detail_address: '1233 Lujiazui Ring Road'},

        {id: 3, address_name: 'XYZ LLC', send_status: 1, receive_status: 1, name: 'James Park', phone: '2121231234', province: 'New York', city: 'New York', region: 'Greenwich Villege', detail_address: '20 W 10 ST'}
    ]
)
```
### 4. Read one entry from oms_company_address collection (method: find() )
`db.oms_company_address.find({id:1})`
### 5. Read all entries from oms_company_address collection (method: find() )
`db.oms_company_address.find()`
### 6. Update one entry from oms_company_address collection (method: update() or save())
```MongoDB
db.oms_company_address.update(
    {id:1},
    {$set: {
        phone: '666-6666-8888'
    }}
)
```
### 7. Remove one entry from oms_company_address collection (method: remove() )
`db.oms_company_address.remove({id:1})`

### 8. (Optional) You can also try to create other tables that listed above
```MongoDB
db.createCollection('oms_order_return_reason')
db.oms_order_return_reason.insert(
    [
        {id: 1, name: 'defective', sort: '1', status: '1', create_time: 2022-10-25T10:15:23Z'}
    ]
)
```

##REST API

### Postman

- 5 GET APIs with different response type
1. GET https://ghibliapi.herokuapp.com/vehicles
   Response status: 200 OK
```
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
2. GET https://ghibliapi.herokuapp.com/vehicles?id=d8f893b5-1dd9-41a1-9918-0099c1aa2de8
   Response status: 200 OK
```
[
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
  }
]
```
3. GET https://ghibliapi.herokuapp.com/vehicles/id=d8f893b5-1dd9-41a1-9918-0099c1aa2de8
   Response status: 404 Not Found
```{}```
4. GET https://ghibliapi.herokuapp.com/vehicles?name=Air Destroyer Goliath
   Response status: 200 OK
```
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
    }
]
```
5. GET https://ghibliapi.herokuapp.com/vehicles?name=Airplane
   Response status: 200 OK
```[]```

- 5 Post API with json request body, please also paste the response here
1. POST https://ghibliapi.herokuapp.com/vehicles
Request Body:
```
{
    "name": "Air Destroyer Goliath ver 1"
}
```
Response Status: 201 Created
Response:
```
{
    "name": "Air Destroyer Goliath ver 1",
    "id": "36e4fee3-c0c0-4da5-871d-ede777ca3e46"
}
```
2. POST https://ghibliapi.herokuapp.com/vehicles
Request Body:
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfa",
    "name": "Fake Air Destroyer Goliath",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
        "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfa"
}
```
Response Status: 201 Created
Response:
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfa",
    "name": "Fake Air Destroyer Goliath",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
        "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfa"
}
```
3. Post https://ghibliapi.herokuapp.com/vehicles
Request Body:
```
{
    "id": "001a",
    "name": "Air Destroyer Goliath",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship"
}
```
Response Status: 201 Created
Response:
```
{
    "id": "001a",
    "name": "Air Destroyer Goliath",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship"
}
```
4. Post https://ghibliapi.herokuapp.com/vehicles
Request Body:
```
{
    "id": "001aaaaaaa",
    "name": "Air Destroyer Goliath",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship",
    "test type": "test"
}
```
Response Status: 201 Created
Response:
```
{
    "id": "001aaaaaaa",
    "name": "Air Destroyer Goliath",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship",
    "test type": "test"
}
```
5. Post https://ghibliapi.herokuapp.com/vehicles/id=001a
Request Body:
```
{
    "id": "001aaaaaaa",
    "name": "Air Destroyer Goliath",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship",
    "test type": "test"
}
```
Response Status: 404 Not Found
Response:
`{}`

- 3 PUT API with json request body, please also paste the response here
1. PUT 
Request Body: https://ghibliapi.herokuapp.com/vehicles
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfb",
    "name": "Air Destroyer Goliath changed",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
      "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
}
```
Response Status: 404 Not Found
Response:
`{}`
2. PUT https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb
Request Body:
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfb",
    "name": "Air Destroyer Goliath changed",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship changed",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
      "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
}
```
Response Status: 200 OK
Response:
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfb",
    "name": "Air Destroyer Goliath changed",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship changed",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
        "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
}
```

2. PUT https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb
Request Body:
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfb-changed",
    "name": "Air Destroyer Goliath changed",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship changed",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
      "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
}
```
Response Status: 200 OK
Response:
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfb",
    "name": "Air Destroyer Goliath changed",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship changed",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
        "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
}
```
3. PUT https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb
Request Body:
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfa",
    "name": "Air Destroyer Goliath id changed",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship changed",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
      "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
}
```
Response Status: 200 OK (but did not change id)
```
{
    "id": "4e09b023-f650-4747-9ab9-eacf14540cfb",
    "name": "Air Destroyer Goliath id changed",
    "description": "A military airship utilized by the government to access Laputa",
    "vehicle_class": "Airship changed",
    "length": "1,000",
    "pilot": "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
    "films": [
        "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
    ],
    "url": "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
}
```
- 2 DELETE API
1. DELETE https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb
Response Status: 200 OK
Response:
`{}`
2. DELETE https://ghibliapi.herokuapp.com/vehicles?name=Red Wing
Response Status: 404 Not Found
Reponse:
`{}`
- Each example with 404, 401,500 and any http status codes you know
  - 100 Continue
  - 101 Switching Protocols
  - 102 Processing
  - 103 Early Hints
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
  - 303 See Other
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
  - 410 Gone
  - 411 Length Required
  - 412 Precondition Failed
  - 413 Payload Too Large
  - 414 URI Too Long
  - 415 Unsupported Media Type
  - 416 Range Not Satisfiable
  - 417 Expectation Failed
  - **418 I'm a teapot**
  - 421 Misdirected Request
  - 422 Unprocessable Entity
  - 423 Locked
  - 424 Failed Dependency
  - 425 Too Early
  - 426 Upgrade Required
  - 428 Precondition Required
  - 429 Too Many Requests
  - 431 Request Header Fields Too Large
  - 451 Unavailable For Legal Reasons
  - 500 Internal Server Error
  - 501 Not Implemented
  - 502 Bad Gateway
  - 503 Service Unavailable
  - 504 Gateway Timeout
  - 505 HTTP Version Not Supported
  - 506 Variant Also Negotiates
  - 507 Insufficient Storage
  - 508 Loop Detected
  - 510 Not Extended
  - 511 Network Authentication Required

### API Design
1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.
    1.  Paypal: https://www.postman.com/paypal/workspace/paypal-public-api-workspace/collection/
    2.  Youtube: https://developers.google.com/youtube/v3/docs
2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
    1.  Endpoint: GET https://www.blog.com/blogger/v1
    2.  Read all blogs: GET https://www.blog.com/blogger/v1/blogs
    3.  Read 1 blog's posts: GET https://www.blog.com/blogger/v1/blogs/blog_id/posts
    4.  Read 1 blog's 1 post: GET https://www.blog.com/blogger/v1/blogs/blog_id/posts/post_id
    5.  Post to a blog: POST https://www.blog.com/blogger/v1/blogs/blog_id/posts/post_id
    6.  Update a post: PUT https://www.blog.com/blogger/v1/blogs/blog_id/posts/post_id
    7.  Delete a post: DELETE https://www.blog.com/blogger/v1/blogs/blog_id/posts/post_id

#### Design APIs for the following features
3.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
    GET https://www.store.com/payments/v1/u1/stored?method=paypal
4.  Find the customer's history orders from 10/10/2022 to 10/24/2022
    GET https://www.store.com/orders/v1/u1/past?from=2022-10-10&to=2022-10-24
5.  find the customer's delievery  addresses
    GET https://www.store.com/profile/v1/u1/address
6.  If I also want to get customer's default payment and default delievery address, what kind of the API (URL) 
should be?
    GET https://www.store.com/payments/v1/u1/stored?default=true
    GET https://www.store.com/profile/v1/u1/address?default=true