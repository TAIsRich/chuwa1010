### HW 5

##### SQL Exercise - MySQL

```sql
CREATE DATABASE oms_database;
USE oms_database;
CREATE TABLE oms_company_address (
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
RENAME COLUMN recieve_status TO receive_status;

INSERT INTO oms_company_address (id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES (01, 'home', 0, 1, 'George', '6691234567', 'CA', 'Santa Clara', 'San Jose', '87 N San Pedro St');

USE oms_database;
SELECT * FROM oms_company_address;

INSERT INTO oms_company_address
VALUES 
		(02, 'SoCal', 1, 1, 'Alex', '6691467238', 'CA', 'Los Angeles', 'Pasedena', '186 First St'),
		(03, 'Bay Area', 0, 0, 'Nate', '5782179327', 'CA', 'San Mateo', 'Foster City', '1070 City Blvd'),
		(04, 'Seattle Area', 1, 1, 'Mason', '9781235890', 'WA', 'Seattle', 'Seattle', '5500 Phinney Ave'),
		(05, 'San Francisco', 0, 1, 'Kate', '345789260', 'CA', 'San Francisco', 'South San Francisco', '3489 16th St'),
		(06, 'Bay Area', 1, 0, 'Mark', '456239870', 'CA', 'Oakland', 'Oakland', '650 bellevue Ave');
        
        
SELECT * FROM oms_company_address; 

SELECT * From oms_company_address
ORDER BY id ASC
LIMIT 3;

UPDATE oms_company_address
SET phone = '666-666-8888'
WHERE id BETWEEN 1 AND 6;

DELETE FROM oms_company_address WHERE id=1;
```

Table view

![table_view](/Users/zhy/Desktop/table_view.png)

Top three records

![top_three](/Users/zhy/Desktop/top_three.png)

Update phone number

![update_phone](/Users/zhy/Desktop/update_phone.png)

Delete on entry 

![after_deleting](/Users/zhy/Desktop/after_deleting.png)

##### NoSQL Exercise - MongoDB

1. Create ``test`` DB

   ```
   // run mongodb shell
   mongosh
   
   use test
   ```

   

2. Create ``oms-company_address`` collection (method: createCollection())

   ```
   db.createCollection('oms_campany_address')
   ```

   

3. Insert few random entries to ``oms_company_address`` collection (method: insert())

   ```
   ```

   

4. Read one entry from ``oms_company_address`` collection (method: find())

5. Read all entries from ``oms_company_address`` collection (method: find())

6. Update one entry from ``oms_company_address`` collection (method: update() or save())

7. Remove one entry form ``oms_company_address`` collection (method: remove())

   





