# HW6 ShortAnswers 

### MySQL

1. Create oms_company_address table
   ```sql
   CREATE TABLE `oms_company_address` (
     `id` bigint NOT NULL,
     `address_name` varchar(200) DEFAULT NULL,
     `send_status` int DEFAULT NULL,
     `receive_status` int DEFAULT NULL,
     `name` varchar(64) DEFAULT NULL,
     `phone` varchar(64) DEFAULT NULL,
     `province` varchar(64) DEFAULT NULL,
     `city` varchar(64) DEFAULT NULL,
     `region` varchar(64) DEFAULT NULL,
     `detail_address` varchar(200) DEFAULT NULL,
     PRIMARY KEY (`id`)
   ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
   ```

2. Insert some random data to oms_company_address table
   ```sql
   use new_schema;
   insert into oms_company_address values(1, 'LA', 1, 1, 'apple', '100-100-1001', 'CA', 'Los Angles', 'apple', 'apple');
   ```

3.  Write a SQL query to fetch all data from oms_company_address `table

   ```sql
   use new_schema;
   select * from oms_company_address;
   ```

   

4. Write a SQL query to fetch top 3 records from oms_company_address table 5. Update oms_company_address table to set all phone to 666-6666-8888

   ```sql
   use new_schema;
   select * from oms_company_address limit 3;
   update oms_company_address set phone = '666-6666-8888';
   ```

   

5. Delete one entry from oms_company_address table
   ```sql
   delete from oms_company_address where id = 5;
   ```

### NOSQL

1. Create testDB

   ```sql
   use testDB
   ```

2. Create oms_company_address collection (method: createCollection() )
   ```sql
   db.createCollection('oms_company_address')
   ```

3. Insert few random entries to oms_company_address collection (method: insert() )
   ```sql
   db.oms_company_address.insert([{
       "id": 1,
       "address_name": "apple park",
       "send_status": 0,
       "receive_status": 0,
       "name": "apple",
       "phone": "100-100-1001",
       "province": "CA",
       "region": "US",
       "detial_address": "apple park"    
   }])
   ```

4. Read one entry from oms_company_address collection (method: find() )
   ```sql
   db.oms_company_address.find({id:1})
   ```

5. Read all entries from oms_company_address collection (method: find())

   ```sql
   db.oms_company_address.find()
   ```

6. Update one entry from oms_company_address collection(method:update()orsave())
   ```sql
   db.oms_company_address.update(
      {id:1},
      {$set: {
      		phone: "666-6666-8888"
      }}
   )
   ```

7. Remove one entry from oms_company_address collection(method:remove())
   ```sql
   db.oms_company_address.remove({id:1})
   ```

   

