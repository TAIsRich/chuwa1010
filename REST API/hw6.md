#### Postman
###### 1. Postman - 5 GET APIs with different response type
- Get https://reqres.in/api/users?page=2
Response status:200 OK
Response type: JSON
```
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
```
- Get https://reqres.in/api/users?page=23
Response status:404 Not Found
Response type: JSON
```
{}
```
- Get https:https://reqres.in/api/unknown
Response status:200 OK
Response type: JSON
```
{
    "page": 1,
    "per_page": 6,
    "total": 12,
    "total_pages": 2,
    "data": [
        {
            "id": 1,
            "name": "cerulean",
            "year": 2000,
            "color": "#98B2D1",
            "pantone_value": "15-4020"
        },
        {
            "id": 2,
            "name": "fuchsia rose",
            "year": 2001,
            "color": "#C74375",
            "pantone_value": "17-2031"
        },
        {
            "id": 3,
            "name": "true red",
            "year": 2002,
            "color": "#BF1932",
            "pantone_value": "19-1664"
        },
        {
            "id": 4,
            "name": "aqua sky",
            "year": 2003,
            "color": "#7BC4C4",
            "pantone_value": "14-4811"
        },
        {
            "id": 5,
            "name": "tigerlily",
            "year": 2004,
            "color": "#E2583E",
            "pantone_value": "17-1456"
        },
        {
            "id": 6,
            "name": "blue turquoise",
            "year": 2005,
            "color": "#53B0AE",
            "pantone_value": "15-5217"
        }
    ],
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}
```
- Get https:reqres.in/api/users/2
Response status:200 OK
Response type: JSON
```
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
```
- Get https:reqres.in/api/unknown/2
Response status:200 OK
Response type: JSON
```
{
    "data": {
        "id": 2,
        "name": "fuchsia rose",
        "year": 2001,
        "color": "#C74375",
        "pantone_value": "17-2031"
    },
    "support": {
        "url": "https://reqres.in/#support-heading",
        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
    }
}
```

###### 2. 5 Post API with json request body, please also paste the response here
- Post https://reqres.in/api/users 
status:201 Created 
Request Body
```
{
    "name": "morpheus",
    "job": "leader"
}
```
Response
```
{
    "name": "morpheus",
    "job": "leader",
    "id": "953",
    "createdAt": "2022-10-26T00:17:22.438Z"
}
```

- Post https://reqres.in/api/register
status:400
Request Body
```
{
    "email": "sydney@fife",
}
```
Response
```
{
    "error": "Missing password"
}
```
- Post https://reqres.in/api/register
status:200 ok
Request Body
```
{
    "email": "eve.holt@reqres.in",
    "password": "pistol"
}
```
Response
```
{
    "id": 4,
    "token": "QpwL5tke4Pnpja7X4"
}
```
- Post https://reqres.in/api/login
status:200 ok
Request Body
```
{
    "email": "eve.holt@reqres.in",
    "password": "cityslicka"
}
```
Response
```
{
    "token": "QpwL5tke4Pnpja7X4"
}
```
- Post https://reqres.in/api/login
status:400
Request Body
```
{
    "email": "peter@klaven"
}
```
Response
```
{
    "error": "Missing password"
}
```
###### 3 PUT API with json request body, please also paste the response here
- Put https://reqres.in/api/users/2
status: 200
Request Body
```
{
    "name": "morpheus",
    "job": "zion resident"
}
```
Response
```
{
    "name": "morpheus",
    "job": "zion resident",
    "updatedAt": "2022-10-26T00:26:08.274Z"
}
```
- Put https://ghibliapi.herokuapp.com/locations/11014596-71b0-4b3e-b8c0-1c4b15f28b9a
status: 200
Request Body
```
{
    "id": "11014596-71b0-4b3e-b8c0-1c4b15f28b9a"
}
```
Response
```
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
- Put https://ghibliapi.herokuapp.com/locations/64a996aa-481e-4627-9624-ab23f59a05a9
status: 200
Request Body
```
{
    "id": "64a996aa-481e-4627-9624-ab23f59a05a9"
}
```
Response
```
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
}
```
###### 4. 2 DELETE API
Delete https://reqres.in/api/users/2
status: 204 No Content

Delete https://ghibliapi.herokuapp.com/locations/64a996aa-481e-4627-9624-ab23f59a05a9
statis: 200
Response
```
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
}
```
###### 5. Each example with 404, 401,500 and any http status codes you know
1XX -> Informational Responses. For example, 102 indicates the resource is being
processed. 
2XX -> success status, e.g. 200/204 etc. (Mostly okay)
3XX -> redirect, e.g. 301 means Moved permanently
4XX -> Client-side errors 400 means bad request and 404 means resource not found (applicaiton error)
5XX -> Server-side errors. For example, 500 means an internal server error (e.g. 503)

#### API Design
###### 1. Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.
Twitter [reference](https://www.postman.com/twitter/workspace/twitter-s-public-workspace/request/9956214-c936778b-e343-4a23-b1b4-433c501cf6eb)
- Lookup single tweet - GET https://api.twitter.com/2/tweets/:id
- User lookup by ID - GET https://api.twitter.com/2/users?ids=
- Followers of User ID - GET https://api.twitter.com/2/users/:id/followers
- Users a user ID is following - GET https://api.twitter.com/2/users/:id/following
- Follow a user ID - POST https://api.twitter.com/2/users/:id/following
- Unfollow a user ID - DELETE https://api.twitter.com/2/users/:source_user_id/following/:target_user_id
- Block a user ID - POST https://api.twitter.com/2/users/:id/blocking
- Blocks lookup - GET https://api.twitter.com/2/users/:id/blocking
- Unblock a user ID - DELETE https://api.twitter.com/2/users/:source_user_id/blocking/:target_user_id

Paypal [reference](https://www.postman.com/paypal/workspace/paypal-public-api-workspace/collection/19024122-92a85d0e-51e7-47da-9f83-c45dcb1cdf24?ctx=documentation)
- Show ordr details - GET {{base_url}}/v2/checkout/orders/:order_id
- Create order - POST {{base_url}}/v2/checkout/orders
- Order update - PATCH {{base_url}}/v2/checkout/orders/:order_id
- Authorize payment for order - POST {{base_url}}/v2/checkout/orders/:order_id/authorize
- Capture payment for ordr - POST {{base_url}}/v2/checkout/orders/:order_id/capture
- Show tracking information - GET {{base_url}}/v1/shipping/trackers/:tracking_id
- Add tracking info for multiple PayPal transactions - POST {{base_url}}/v1/shipping/trackers-batch
- Update or cancel tracking information for PayPal transaction - PUT {{base_url}}/v1/shipping/trackers/:tracking_id

###### 2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
- create a new blogger account - POST https://www.blog.com/blogger
- direct to home page of a blogger GET https://www.blog.com/blogger/blogger_id
- retrieve blog history of a blogger GET https://www.blog.com/blogger/blogger_id/posts
- open a specific blog of a blogger GET https://www.blog.com/blogger/blogger_id/posts/post_id
- publish a new blog - POST https://www.blog.com/blogger/blogger_id/posts
- update a blog - PATCH https://www.blog.com/blogger/blogger_id/posts/post_id
- delete a blog - DELETE https://www.blog.com/blogger/blogger_id/posts/post_id

###### 1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
GET https://www.merchant.com/customer_id/payments
###### 2. Find the customer's history orders from 10/10/2022 to 10/24/2022
GET https://www.merchant.com/customer_id/orders?startdate=...&enddate=...
###### 3. find the customer's delievery addresses
GET https://www.merchant.com/customer_id/addresses
###### 4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)
should be?
- GET https://www.merchant.com/customer_id/payments?default=true
- GET https://www.merchant.com/customer_id/addresses?default=true
