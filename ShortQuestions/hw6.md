# Homework 6

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
### 1.