# hw30 DB

MySQL Exercise

```sql
CREATE DATABASE myCorp CHARACTER SET utf8mb4;
USE myCorp;

-- 2. create 'oms_company_address' table
CREATE TABLE IF NOT EXISTS `oms_company_address` (
`id` BIGINT(20) AUTO_INCREMENT comment 'id',
`address_name` VARCHAR(200) comment '地址名称',
`send_status` INT(1) comment '默认发货地址：0->否；1->是',
`receive_status` INT(1) comment '是否默认收货地址：0->否；1->是',
`name` VARCHAR(64) comment '收发货人姓名',
`phone` VARCHAR(64) comment '收货人电话',
`province` VARCHAR(64) comment '省/直辖市',
`city` VARCHAR(64) comment '市',
`region` VARCHAR(64) comment '区',
`detail_address` VARCHAR(200) comment '详细地址',
PRIMARY KEY(`id`) USING BTREE
) ENGINE = InnoDB 
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4
  ROW_FORMAT = DYNAMIC;
 
SHOW COLUMNS FROM myCorp;

-- 3. insert some random data to 'oms_company_address' table
INSERT INTO oms_company_address
VALUES (null, '123 Fake street, Santa Clara, CA 95004', 0, 0, 'Charles', '+75(0)0190092215',
        'California', 'Santa Clara', NULL, NULL);
INSERT INTO oms_company_address
VALUES (null, '28195 Becker River\nEast Keiratown, AL 78374', 0, 1, 'Mireille', '(807)054-0180x5068', 'Kansas',
        'Schmittchester', NULL, NULL);
INSERT INTO oms_company_address
VALUES (null, '92127 Arlie Square Suite 639\nPort Stephan, SD 28855-0544', 1, 1, 'Kattie', '+56(8)3627152212',
        'NewMexico', 'Hudsonville', NULL, NULL);

INSERT INTO oms_company_address 
(id, address_name, send_status, receive_status, name, phone, province, city, region, detail_address)
VALUES 
(null, '77964 Aufderhar Grove Apt. 208\nPowlowskihaven, CO 91725', 1, 0, 'Kelsie', '1-937-328-0265x0387',
        'Colorado', 'Donnellyberg', NULL, NULL),
(null, '695 Alexandra Parks Suite 056\nErnserview, VT 20935', 0, 0, 'Allie', '1-069-482-3378x9318', 'Nevada',
        'Hudsonburgh', NULL, NULL),
(null, '019 Steuber Place\nPort Matilde, MN 37054-6646', 1, 1, 'Kennedy', '654-780-6240', 'Pennsylvania',
        'Alyssonshire', NULL, NULL),
(null, '921 Destany Spur\nJacobiton, ID 01212-4106', 1, 0, 'Sandra', '1-289-075-8308x263', 'Louisiana',
        'Ondrickaborough', NULL, NULL),
(null, '497 Boyer Cliff\nWest Luciousberg, MA 72817-0474', 1, 0, 'Darron', '972.755.2705', 'Colorado',
        'Anabelchester', NULL, NULL),
(null, '08928 Kulas Station\nWest Rhianna, KY 39016-1617', 0, 1, 'Oran', '606.556.4348x59603', 'California',
        'Mercedesbury', NULL, NULL),
(null, '2285 Isabel Trail Suite 342\nEast Donald, VA 58943', 0, 1, 'Jackson', '1-539-519-7702x377',
        'Tennessee', 'North Katheryn', NULL, NULL);

 -- 4. write a SQL query to fetch all data from 'oms_company_address' table
 SELECT * 
 FROM oms_company_address;
 
 
 -- 5. write a SQL query to fetch top 3 records from 'oms_company_address' table
 SELECT * 
 FROM oms_company_address 
 LIMIT 3;
 
 
 -- 6. update 'oms_company_address' table to set all phone numbers to 666-6666-8888
 UPDATE oms_company_address
 SET phone = '666-6666-8888'
 WHERE id > 0;
 
 
 -- 7. delete one entry from 'oms_company_address' table
 DELETE 
 FROM oms_company_address
 WHERE id = 3;
```

NoSQL Exercise

1. Create test database:

```sql
use test
```

1. *Create oms_company_address collection (method: createCollection() )*

 

```sql
db.createCollection("oms_company_address")
```

1. *Insert few random entries to oms_company_address collection (method: insert()*

```sql
db.oms_company_address.insertOne({
    id: "1",
    address_name: "62117 Berge Stravenue Apt. 275\\nLydamouth, MA 32445-1216",
    send_status: 0,
    receive_status: 0,
    name: "Summer",
    phone: "111-111-1111",
    province: "Pennsylvania",
    city: "Lake Daren",
    region: "test",
    detail_address: "test"
})

db.oms_company_address.insertMany([{
    id: "2",
    address_name: "123 Fake street, Santa Clara, CA 95004",
    send_status: 1,
    receive_status: 1,
    name: "Chuwa",
    phone: "111-111-1111",
    province: "California",
    city: "Santa Clara",
    region: "test",
    detail_address: "test"
    },
    {
    id: "3",
    address_name: "28195 Becker River\\nEast Keiratown, AL 78374",
    send_status: 0,
    eceive_status: 1,
    name: "Mireille",
    phone: "111-111-1111",
    province: "Kansas",
    city: "Schmittchester",
    region: "test",
    detail_address: "test"
}])
```

1. Read one entry from oms_company_address collection (method: find()):

```sql
db.oms_company_address.findOne({id: "1"})
db.oms_company_address.findOne({"id": "1"})
```

1. *Read all entries from oms_company_address collection (method: find() )*

```sql
db.oms_company_address.find()
```

6. Update one entry from oms_company_address collection (method: update() or save()):

```sql
db.oms_company_address.updateOne({"phone": "111-111-111"}, {$set: {"phone": "666-666-888"}})
```

7.*Remove one entry from oms_company_address collection (method: remove() )*

```sql
db.oms_company_address.deleteOne({"id" : "1"})
db.oms_company_address.deleteOne({name : "Summer"})
db.oms_company_address.deleteOne({"name" : "Summer"})
```