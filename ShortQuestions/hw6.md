**DB PRACTICE**

1.

```SQL
CREATE TABLE `oms_company_address`.`oms_company_address` (
  `id` BIGINT NULL,
  `address_name` VARCHAR(200) NULL,
  `send_status` INT(1) NULL,
  `receive_status` INT(1) NULL,
  `name` VARCHAR(64) NULL,
  `phone` VARCHAR(64) NULL,
  `province` VARCHAR(64) NULL,
  `city` VARCHAR(64) NULL,
  `region` VARCHAR(64) NULL,
  `detail_address` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'hw7';
```

2.

```SQL
INSERT INTO `oms_company_address`.`oms_company_address` (`id`, `address_name`, `send_status`, `receive_status`, `name`, `phone`, `province`, `city`, `region`, `detail_address`) VALUES ('1', '56 B street', '1', '1', 'Seungcheol Choi', '1223456', 'Zhejiang', 'Hangzhou', 'C', '56 B street, Apt 7890');
INSERT INTO `oms_company_address`.`oms_company_address` (`id`, `address_name`, `send_status`, `receive_status`, `name`, `phone`, `province`, `city`, `region`, `detail_address`) VALUES ('2', '7 C street', '1', '0', 'J Lin', '4566', 'Zhejiang', 'Wenzhou', 'C', '7 C street, Apt 589');
INSERT INTO `oms_company_address`.`oms_company_address` (`id`, `address_name`, `send_status`, `receive_status`, `name`, `phone`, `province`, `city`, `region`, `detail_address`) VALUES ('3', '98 N street', '0', '0', 'J Hong', '5699', 'Shanghai', 'Shanghai', 'R', '98 N street, Building 8, Apt 899');

```

3.

```SQL
SELECT * FROM oms_company_address.oms_company_address;
```

4.

```SQL
SELECT * FROM oms_company_address.oms_company_address LIMIT 3;

```

5.

```SQL
UPDATE oms_company_address.oms_company_address 
SET phone = '666-6666-8888' 
WHERE id IS NOT NULL;
```

6.

```SQL
DELETE FROM oms_company_address.oms_company_address 
where id = 1;
```

**MongoDB**
1.

```
use test

```

2.

```
db.createCollection('oms_company_address')
```

3.

```
db.oms_company_address.insertMany([
	{id: 1, address_name: 'A street', send_status: 1, receive_status: 1, name: 'S Choi', phone : '12456789', province : 'Zhejiang', city : 'Hangzhou', region : 'C', detail_address: 'Apt 668'},
	{id: 2, address_name: 'B street', send_status: 0, receive_status: 0, name: 'J Yoon', phone : '1678099', province : 'Zhejiang', city : 'Wenzhou', region : 'C', detail_address: 'Apt 677'},
	{id: 3, address_name: 'C street', send_status: 1, receive_status: 0, name: 'J Hong', phone : '77789', province : 'Xinjiang', city : 'A', region : 'P', detail_address: 'Apt 17'}])

```

4.

```
db.oms_company_address.find({id : 2})
```

5.

```
db.oms_company_address.find()
```

6.

```
db.oms_company_address.updateOne({ id : 1},{$set: {address_name : 'ABC Street'}})
```

7.

```
db.oms_company_address.remove({ id : 2})
```

**Postman**

1.

GET https://ghibliapi.herokuapp.com/locations Status: 200 OK

GET https://ghibliapi.herokuapp.com/people/ba924631-068e-4436-b6de-f3283fa848f0eer Status: 404 NOT FOUND

GET https://ghibliapi.herokuapp.com/people?gender=Male&eye_color=Blue Status: 200 OK
```Json
[
    {
        "id": "466bc926-2024-4653-ac63-fe52f2dc8c7b",
        "name": "Natori",
        "gender": "Male",
        "age": "NA",
        "eye_color": "Blue",
        "hair_color": "Grey",
        "films": [
            "https://ghibliapi.herokuapp.com/films/90b72513-afd4-4570-84de-a56c312fdf81"
        ],
        "species": "https://ghibliapi.herokuapp.com/species/603428ba-8a86-4b0b-a9f1-65df6abef3d3",
        "url": "https://ghibliapi.herokuapp.com/people/466bc926-2024-4653-ac63-fe52f2dc8c7b"
    },
    {
        "id": "835f8c7c-2fc6-4f54-b545-c02ab066cd69",
        "name": "Custard",
        "gender": "Male",
        "age": "NA",
        "eye_color": "Blue",
        "hair_color": "Blonde",
        "films": [
            "https://ghibliapi.herokuapp.com/films/790e0028-a31c-4626-a694-86b7a8cada40"
        ],
        "species": "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2",
        "url": "https://ghibliapi.herokuapp.com/people/835f8c7c-2fc6-4f54-b545-c02ab066cd69"
    }
]

```

GET https://ghibliapi.herokuapp.com/films?id=1b67aa9a-2e4a-45af-ac98-64d6ad15b16c Status: 200 OK

```JSON
[
    {
        "id": "1b67aa9a-2e4a-45af-ac98-64d6ad15b16c",
        "title": "Pom Poko",
        "original_title": "平成狸合戦ぽんぽこ",
        "original_title_romanised": "Heisei tanuki gassen Ponpoko",
        "image": "https://image.tmdb.org/t/p/w600_and_h900_bestv2/kowo9E1e1JcWLXj9cCvAOFZcy5n.jpg",
        "movie_banner": "https://image.tmdb.org/t/p/original/jScPd0u0jeo66l8gwDl7W9hDUnM.jpg",
        "description": "As the human city development encroaches on the raccoon population's forest and meadow habitat, the raccoons find themselves faced with the very real possibility of extinction. In response, the raccoons engage in a desperate struggle to stop the construction and preserve their home.",
        "director": "Isao Takahata",
        "producer": "Toshio Suzuki",
        "release_date": "1994",
        "running_time": "119",
        "rt_score": "78",
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
        "url": "https://ghibliapi.herokuapp.com/films/1b67aa9a-2e4a-45af-ac98-64d6ad15b16c"
    }
]
```

GET https://ghibliapi.herokuapp.com/vehicles/?vehicle_class=Boat Status: 200 OK

```JSON
[
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

2.

    (1) POST https://ghibliapi.herokuapp.com/locations  Status: 201 Created

```JSON
    {
    "id": "11014597-71b0-4b3e-b8c0-1c4b15f28b9a",
    "name": "Newark",
    "climate": "Continental",
    "terrain": "City",
    "surface_water": "30",
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

(2) POST https://ghibliapi.herokuapp.com/people  Status: 201 Created

```JSON
    {
    "id": "17a",
    "name": "Seungcheol Choi",
    "gender": "Male",
    "age": "27",
    "eye_color": "Black",
    "hair_color": "Silver"

  }

```

(3) POST https://ghibliapi.herokuapp.com/people  Status: 400 Bad Request


```JSON
    {
    "id": "17a",
    "name": "Seungcheol Choi",
    "gender": "Male",
    "age": "27",
    "eye_color": "Black",
    "hair_color": "Silver",//caused by the comma

  }
```


(4) POST https://ghibliapi.herokuapp.com/vehicles  Status: 201 Created


```JSON
    {
        "id": "4443",
        "name": "747B",
        "description": "An airplane",
        "vehicle_class": "Airplane",
        "length": "100"
        
    }
```

(5) POST https://ghibliapi.herokuapp.com/films  Status: 201 Created


```JSON
   {
        "id": "5557",
        "title": "Majou",
        "original_title": "Majou",
        "original_title_romanised": "Witch",
        "description": "A witch's story.",
        "director": "Yuka Murakami",
        "producer": "Yuu",
        "release_date": "2009",
        "running_time": "89",
        "rt_score": "87"
        
    }
```

3.

(1) PUT https://ghibliapi.herokuapp.com/films  Status:404 Not Found

```JSON
  {
    "id": "2baf70d1-42bb-4437-b551-e5fed5a87abe",
    "title": "Castle in the Sky",
    "original_title": "天空の城ラピュタ",
    "original_title_romanised": "Tenkū no shiro Rapyuta",
    "image": "https://image.tmdb.org/t/p/w600_and_h900_bestv2/npOnzAbLh6VOIu3naU5QaEcTepo.jpg",
    "movie_banner": "https://image.tmdb.org/t/p/w533_and_h300_bestv2/3cyjYtLWCBE1uvWINHFsFnE8LUK.jpg",
    "description": "The orphan Sheeta inherited a mysterious crystal that links her to the mythical sky-kingdom of Laputa. With the help of resourceful Pazu and a rollicking band of sky pirates, she makes her way to the ruins of the once-great civilization. Sheeta and Pazu must outwit the evil Muska, who plans to use Laputa's science to make himself ruler of the world.",
    "director": "Hayao Miyazaki",
    "producer": "Isao Takahata",
    "release_date": "1986",
    "running_time": "124" 
  }
```

(2) PUT https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe  Status:200 OK //id is not changed in the result

```JSON
 {
    "id": "2890088",
    "title": "Castle in the Sky",
    "original_title": "天空の城ラピュタ",
    "original_title_romanised": "Tenkū no shiro Rapyuta",
    "image": "https://image.tmdb.org/t/p/w600_and_h900_bestv2/npOnzAbLh6VOIu3naU5QaEcTepo.jpg",
    "movie_banner": "https://image.tmdb.org/t/p/w533_and_h300_bestv2/3cyjYtLWCBE1uvWINHFsFnE8LUK.jpg",
    "description": "The orphan Sheeta inherited a mysterious crystal that links her to the mythical sky-kingdom of Laputa. With the help of resourceful Pazu and a rollicking band of sky pirates, she makes her way to the ruins of the once-great civilization. Sheeta and Pazu must outwit the evil Muska, who plans to use Laputa's science to make himself ruler of the world.",
    "director": "Hayao Miyazaki",
    "producer": "Isao Takahata",
    "release_date": "1986",
    "running_time": "124",
    "rt_score": "95",
    "people": [
      "https://ghibliapi.herokuapp.com/people/598f7048-74ff-41e0-92ef-87dc1ad980a9",
      "https://ghibliapi.herokuapp.com/people/fe93adf2-2f3a-4ec4-9f68-5422f1b87c01",
      "https://ghibliapi.herokuapp.com/people/3bc0b41e-3569-4d20-ae73-2da329bf0786",
      "https://ghibliapi.herokuapp.com/people/40c005ce-3725-4f15-8409-3e1b1b14b583",
      "https://ghibliapi.herokuapp.com/people/5c83c12a-62d5-4e92-8672-33ac76ae1fa0",
      "https://ghibliapi.herokuapp.com/people/e08880d0-6938-44f3-b179-81947e7873fc",
      "https://ghibliapi.herokuapp.com/people/2a1dad70-802a-459d-8cc2-4ebd8821248b"
    ],
    "species": [
      "https://ghibliapi.herokuapp.com/species/af3910a6-429f-4c74-9ad5-dfe1c4aa04f2"
    ],
    "locations": [
      "https://ghibliapi.herokuapp.com/locations/"
    ],
    "vehicles": [
      "https://ghibliapi.herokuapp.com/vehicles/4e09b023-f650-4747-9ab9-eacf14540cfb"
    ],
    "url": "https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe"
}
```

(3) PUT https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe  Status:200 OK 

```JSON
 {
    "id": "fb083a4e-77b2-4623-a2e0-6bbca5bfd5b2",
    "name": "Ursula's Log Cabin",
    "climate": "TODO",
    "terrain": "TODO",
    "surface_water": "40",
    "residents": [
      "TODO"
    ],
    "films": [
      "https://ghibliapi.herokuapp.com/films/ea660b10-85c4-4ae3-8a5f-41cea3648e3e"
    ],
    "url": "https://ghibliapi.herokuapp.com/locations/fb083a4e-77b2-4623-a2e0-6bbca5bfd5b2"
  }
```

4.
(1) DELETE https://ghibliapi.herokuapp.com/films/2baf70d1-42bb-4437-b551-e5fed5a87abe  Status:200 OK 

(2) DELETE https://ghibliapi.herokuapp.com/locations/fb083a4e-77b2-4623-a2e0-6bbca5bfd5b2dfe  Status:404 Not Found


5.
1xx Informational

100 Continue

101 Switching Protocols

102 Processing (WebDAV)

2xx Success

 200 OK

 201 Created

 202 Accepted

 203 Non-Authoritative Information

 204 No Content

 205 Reset Content

 206 Partial Content

 207 Multi-Status (WebDAV)

 208 Already Reported (WebDAV)
 
 226 IM Used

3xx Redirection

    300 Multiple Choices

    301 Moved Permanently

    302 Found

    303 See Other

    304 Not Modified

    305 Use Proxy

    306 (Unused)

    307 Temporary Redirect

    308 Permanent Redirect (experimental)

4xx Client Error

     400 Bad Request

     401 Unauthorized

    402 Payment Required

     403 Forbidden

     404 Not Found

    405 Method Not Allowed

    406 Not Acceptable

    407 Proxy Authentication Required

    408 Request Timeout

    409 Conflict

    410 Gone

    411 Length Required

    412 Precondition Failed

    413 Request Entity Too Large

    414 Request-URI Too Long

    415 Unsupported Media Type

    416 Requested Range Not Satisfiable

    417 Expectation Failed

    418 I'm a teapot (RFC 2324)

    420 Enhance Your Calm (Twitter)

    422 Unprocessable Entity (WebDAV)

    423 Locked (WebDAV)

    424 Failed Dependency (WebDAV)

    425 Reserved for WebDAV

    426 Upgrade Required

    428 Precondition Required

    429 Too Many Requests

    431 Request Header Fields Too Large

    444 No Response (Nginx)

    449 Retry With (Microsoft)

    450 Blocked by Windows Parental Controls (Microsoft)

    451 Unavailable For Legal Reasons

    499 Client Closed Request (Nginx)

5xx Server Error

    500 Internal Server Error

    501 Not Implemented

    502 Bad Gateway

    503 Service Unavailable

    504 Gateway Timeout

    505 HTTP Version Not Supported

    506 Variant Also Negotiates (Experimental)

    507 Insufficient Storage (WebDAV)

    508 Loop Detected (WebDAV)

    509 Bandwidth Limit Exceeded (Apache)

    510 Not Extended

    511 Network Authentication Required



**API Design**

2.

base url: http://blog.com

get one user's post according to user's id: GET http://blog.com/api/v1/users/{users_id}/posts

get one user's post according to user's id and post's id: GET http://blog.com/api/v1/users/{users_id}/posts/{posts_id}

a user creates one new post: POST http://blog.com/api/v1/users/{users_id}/posts/{posts_id}

modify one specified post: PUT http://blog.com/api/v1/users/{users_id}/posts/{posts_id}

delete one specified post: DELETE http://blog.com/api/v1/users/{users_id}/posts/{posts_id}

3. Design APIs

1. GET {{baseUrl}}/api/v1/customers/{customer_id}/payments

2. GET {{baseUrl}}/api/v1/customers/{customer_id}/orders?startDate="10/10/2022"&endDate="10/24/2022"

3. GET {{baseUrl}}/api/v1/customers/{customer_id}/addresses

4. GET {{baseUrl}}/api/v1/customers/{customer_id}/payments/default

    GET {{baseUrl}}/api/v1/customers/{customer_id}/addresses/default
