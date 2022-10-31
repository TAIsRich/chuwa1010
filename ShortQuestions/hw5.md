## SQL Exercise
### 1. `Create` *oms_company_address* table
```MySQL
CREATE TABLE IF NOT EXISTS oms_company_address (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    address_name VARCHAR(20),
    send_status INT(1),
    receive_status INT(1),
    name VARCHAR(64),
    phone VARCHAR(64),
    province VARCHAR(64),
    city VARCHAR(64),
    region VARCHAR(64),
    detail_address VARCHAR(200)
)AUTO_INCREMENT = 1;
```
### 2. `Insert` some random data to *oms_company_address* table
```MySQL
INSERT INTO oms_company_address VALUES(
    1,
    "29th st",
    1,
    1,
    "Amy A",
    "4152897354",
    "California",
    "San Jose",
    "Santa Clara",
    "888 29th st"
);
INSERT INTO oms_company_address VALUES(
    2,
    "banana",
    1,
    0,
    "Bob B",
    "4159735100",
    "California",
    "San Jose",
    "Fremont",
    "321 banana st"
);
INSERT INTO oms_company_address VALUES(
    3,
    "Capitol",
    1,
    1,
    "Lily M",
    "5102834001",
    "California",
    "San Jose",
    "Fremont",
    "3300 Capitol Aue."
);
```
### 3. Write a SQL query to `fetch all data` from *oms_company_address* table
```Mysql
SELECT * FROM oms_company_address;
```

### 4. Write a SQL query to `fetch top 3 records` from *oms_company_address* table
```Mysql
SELECT * FROM oms_company_address LIMIT 3;
```

### 5. Update *oms_company_address* table to `set all` phone to 666-6666-8888

```Mysql
UPDATE oms_company_address SET phone = '666-6666-8888';
```

### 6. `Delete one entry` from *oms_company_address* table
```Mysql
DELETE FROM oms_company_address WHERE id = 3;
```

### 7. (Optional) You can also try to create other tables that listed above
```MySQL
CREATE TABLE oms_order_return_reason (
    id bigint PRIMARY KEY AUTO_INCREMENT,
    name varchar(100),
    sort INT,
    status INT(1),
    create_time DATETIME
)AUTO_INCREMENT = 1;
```
## MongoDB Exercise
### 1. `Create` test DB
```
use test
```

### 2. `Create` oms_company_address collection (method: createCollection() )
```
db.createCollection('oms_company_address')
```

### 3. Insert few random entries to oms_company_address collection (method: insert() )
```
db.oms_company_address.insertOne( {id: 1, address_name: '29th st', send_status: 1, receive_status: 1, name: 'Amy A', phone: '4152897354', province: 'California', city: 'San Jose', region: 'Santa Clara', detail_address: '888 29th st'} )


db.oms_company_address.insertMany(
    [
        {id: 2, address_name: 'banana', send_status: 1, receive_status: 0, name: 'Bob B', phone: '4159735100', province: 'California', city: 'San Jose', region: 'Fremont', detail_address: '321 banana st'},

        {id: 3, address_name: 'Capitol', send_status: 1, receive_status: 1, name: 'Lily M', phone: '5102834001', province: 'California', city: 'San Jose', region: 'Fremont', detail_address: '3300 Capitol Aue'}
    ]
)
```

### 4. `Read one entry` from *oms_company_address* collection (method: find() )
```
db.oms_company_address.findOne()
````

### 5. `Read all entries` from *oms_company_address* collection (method: find() )
```
db.oms_company_address.find()
```

### 6. `Update one entry` from *oms_company_address* collection (method: update() or save())
```
db.oms_company_address.update(
    {id:1},
    { $set: {phone: '666-6666-8888'} }
)
```
### 7. `Remove one entry` from *oms_company_address* collection (method: remove() )
```
db.oms_company_address.deleteOne({id:3})
```

### 8. (Optional) You can also try to create other tables that listed above
```
var date = new Date(2022, 01, 01, 14, 12);
db.oms_order_return_reason.insertOne({id: 1, name: 'AAA', sort: '1', status: '1', create_time: date })
```

## REST API
### Postman

### - 5 GET APIs with different response type
API-GET-1
API: GET https://v2.jokeapi.dev/joke/Programming
Response status: 200 OK 
Response:
```
{
    "error": false,
    "category": "Programming",
    "type": "single",
    "joke": "Two C strings walk into a bar.\nThe bartender asks \"What can I get ya?\"\nThe first string says \"I'll have a gin and tonic.\"\nThe second string thinks for a minute, then says \"I'll take a tequila sunriseJF()#$JF(#)$(@J#()$@#())!*FNIN!OBN134ufh1ui34hf9813f8h8384h981h3984h5F!##@\"\nThe first string apologizes, \"You'll have to excuse my friend, he's not null-terminated.\"",
    "flags": {
        "nsfw": false,
        "religious": false,
        "political": false,
        "racist": false,
        "sexist": false,
        "explicit": false
    },
    "id": 28,
    "safe": true,
    "lang": "en"
}
```
API-GET-2
API: GET https://v2.jokeapi.dev/joke343
Response status: 404Not Found

API-GET-3
API: GET https://v2.jokeapi.dev/joke/Miscellaneous,Dark
Response status: 200 OK 

API-GET-4
API: GET https://v2.jokeapi.dev/joke/Miscellaneous?blacklistFlags=nsfw
Response status: 200 OK 

API-GET-5
API: GET https://v2.jokeapi.dev/joke/Miscellaneous?blacklistFlags=nsfw&contains=dog
Response status: 200 OK 

### 5 Post API with json request body, please also paste the response here
API POST: https://v2.jokeapi.dev/submit
RequestBody:
```
{
    "formatVersion": 3,
    "category": "Misc",
    "type": "single",
    "joke": "A horse walks into a bar. “Hey,” says the barman. “Yes please,” says the horse.",
    "flags": {
        "nsfw": true,
        "religious": false,
        "political": true,
        "racist": false,
        "sexist": false,
        "explicit": false
    },
    "lang": "en"
}
```
Response status: 00Internal Server Error

### 3 Put API with json request body, please also paste the response here
API POST: https://v2.jokeapi.dev/submit
RequestBody:
```
{
    "formatVersion": 3,
    "category": "Misc",
    "type": "single",
    "joke": "A horse walks into a bar. “Hey,” says the barman. “Yes please,” says the horse.",
    "flags": {
        "nsfw": true,
        "religious": false,
        "political": true,
        "racist": false,
        "sexist": false,
        "explicit": false
    },
    "lang": "en"
}
```
Response status: 00Internal Server Error

### Each example with 404, 401,500 and any http status codes you know
- 404 Not Found
- 401 Unauthorised
- 500 Internal Server Error

## API Design
### 1, Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.
[Twitter API](https://developer.twitter.com/en/docs/api-reference-index)
[Youtube API](https://developers.google.com/youtube/v3/docs)

### 2, Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE Design
- Endpoint: https://www.mybblog.com/
- GET: https://www.mybblog.com/{blogger_id}/blogs/{post_id}
- POST: https://www.mybblog.com/{blogger_id}/post
- PUT: https://www.mybblog.com/{blogger_id}/post
- DELETE: https://www.mybblog.com/{blogger_id}/{post_id}


####  APIs for the following features (思考:path variable 怎么用?有sub resources, 哪些地方该用复数)

### 1.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
    GET https://www.someapi.dev/payments?method=paypal
    GET https://www.someapi.dev/payments?method=credit_card_1
### 2.  Find the customer's history orders from 10/10/2022 to 10/24/2022
    GET https://www.someapi.dev/orders?from=2022-10-10&to=2022-10-24
### 3.  find the customer's delievery  addresses
    GET https://www.someapi.dev/profile/{customer_id}/address
### 4.  If I also want to get customer's default payment and default delievery address, what kind of the API (URL) 
should be?
    GET https://www.someapi.dev/profile/{customer_id}/address&default=true























