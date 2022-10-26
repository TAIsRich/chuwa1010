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

### REST API
