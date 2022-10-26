## Database

### MySQL

1. ```mysql
   create table oms_company_address(
       id bigint primary key,
       address_name varchar(200),
       send_status int,
       receive_status int,
       name varchar(64),
       phone varchar(64),
       province varchar(64),
       city varchar(64),
       region varchar(64),
       detail_address varchar(200)
   );
   ```

2. ```mysql
   insert into oms_company_address
   values ('1', 'a', '0', '0', 'aa', '1111111111', 'aaa', 'aaaa', 'aaaaa', 'aaaaaa');
   insert into oms_company_address
   values ('2', 'b', '1', '1', 'bb', '2222222222', 'bbb', 'bbbb', 'bbbbb', 'bbbbbb');
   insert into oms_company_address
   values ('3', 'c', '0', '0', 'cc', '3333333333', 'ccc', 'cccc', 'ccccc', 'cccccc');
   insert into oms_company_address
   values ('4', 'd', '1', '1', 'dd', '4444444444', 'ddd', 'dddd', 'ddddd', 'dddddd');
   insert into oms_company_address
   values ('5', 'e', '0', '0', 'ee', '5555555555', 'eee', 'eeee', 'eeeee', 'eeeeee');
   ```

3. ```mysql
   select * from oms_company_address;
   ```

4. ```mysql
   select * from oms_company_address limit 3;
   ```

5. ```mysql
   update oms_company_address set phone = '666-6666-8888';
   ```

6. ```mysql
   delete from oms_company_address where id = '4';
   ```

### MongoDB

1. ```
   use test
   ```

2. ```
   db.createCollection("oms_company_address")
   ```

3. ```
   db.oms_company_address.insert({id: 1, name: "a", phone: "1111111111", detail_address: "aa"})
   db.oms_company_address.insert({id: 2, address_name: "b", send_status: 1, receive_status: 1, name: "bb", phone: "2222222222", province: "bbb", city: "bbbb", region: "bbbbb", detail_address: "bbbbbb"})
   db.oms_company_address.insert({id: 3, address_name: "c", send_status: 0, name: "cc"})
   db.oms_company_address.insert({id: 4, name: "d"})
   db.oms_company_address.insert({id: 5, name: "e"})
   ```

4. ```
   db.oms_company_address.find({id: 3})
   ```

5. ```
   db.oms_company_address.find()
   ```

6. ```
   db.oms_company_address.update({id: 2}, {$set: {send_status: 0}})
   ```

7. ```
   db.oms_company_address.remove({name: "e"})
   ```

## REST API

### Postman

- GET 1: GET https://postman-echo.com/get

- GET 2: GET https://www.boredapi.com/api/activity

- GET 3: GET https://api.zippopotam.us/us/90210

- GET 4: GET https://api.genderize.io/?name=kate

- GET 5: GET https://datausa.io/api/data?drilldowns=Nation&measures=Population

- POST 1: POST https://reqres.in/api/users

  - Request

    ```json
    {
        "name": "aaa",
        "job": "bbb"
    }
    ```

  - Response

    ```json
    {
        "name": "aaa",
        "job": "bbb",
        "id": "29",
        "createdAt": "2022-10-26T20:37:16.787Z"
    }
    ```

- POST 2: POST https://reqres.in/api/register

  - Request

    ```json
    {
        "email": "a@b.c",
        "password": "aaa"
    }
    ```

  - Response

    ```json
    {
        "error": "Note: Only defined users succeed registration"
    }
    ```
  
- POST 3: POST https://reqres.in/api/register

  - Request

    ```json
    {
        "email": "a@b.c"
    }
    ```
    
  - Response
  
    ```json
    {
        "error": "Missing password"
    }
    ```
  
- POST 4: POST https://reqres.in/api/login

  - Request

    ```json
    {
        "email": "eve.holt@reqres.in",
        "password": "cityslicka"
    }
    ```

  - Response

    ```json
    {
        "token": "QpwL5tke4Pnpja7X4"
    }
    ```
  
- POST 5: POST https://reqres.in/api/login

  - Request

    ```json
    {
        "password": "aaa"
    }
    ```
    
  - Response
  
    ```json
    {
        "error": "Missing email or username"
    }
    ```
  
- PUT 1: PUT https://reqres.in/api/users/3

  - Request

    ```json
    {
        "name": "abc"
    }
    ```
    
  - Response

    ```json
    {
        "name": "abc",
        "updatedAt": "2022-10-26T20:41:10.148Z"
    }
    ```

- PUT 2: PUT https://jsonplaceholder.typicode.com/todos/5

  - Request

    ```json
    {
        "title": "aaa",
        "completed": false
    }
    ```
    
  - Response

    ```json
    {
        "title": "aaa",
        "completed": false,
        "id": 5
    }
    ```

- PUT 3: PUT https://jsonplaceholder.typicode.com/users/10

  - Request

    ```json
    {
        "phone": "123-456-7890",
        "website": "a.b"
    }
    ```
    
  - Response

    ```json
    {
        "phone": "123-456-7890",
        "website": "a.b",
        "id": 10
    }
    ```

- DELETE 1: DELETE https://reqres.in/api/users/5

- DELETE 2: DELETE https://jsonplaceholder.typicode.com/posts/2


### API Design

- Blog
  - Get user post: GET https://www.xxx.com/users/:user_id/posts/:post_id
  - Get all posts: GET https://www.xxx.com/users/:user_id/posts
  - Post a new post: POST https://www.xxx.com/users/:user_id/posts/:post_id
  - Update post title: PUT https://www.xxx.com/users/:user_id/posts/:post_id/title
  - Update post body: PUT https://www.xxx.com/users/:user_id/posts/:post_id/body
  - Remove a post: DELETE https://www.xxx.com/users/:user_id/posts/:post_id

1. https://www.xxx.com/users/:user_id/payments

2. https://www.xxx.com/users/:user_id/orders?from=101022&to=102422

3. https://www.xxx.com/users/:user_id/addresses

4. https://www.xxx.com/users/:user_id/payments?default=1

   https://www.xxx.com/users/:user_id/addresses?default=1
