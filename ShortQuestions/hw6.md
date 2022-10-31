## MySQL Exercise

1. Create oms_company_address table

2. Insert some random data to oms_company_address table

3. Write a SQL query to fetch all data from oms_company_address `table

4. Write a SQL query to fetch top 3 records from oms_company_address table 5. Update oms_company_address table to set all phone to 666-6666-8888

6. Delete one entry from oms_company_address table

7. (Optional)Youcanalsotrytocreateothertablesthatlistedabove

```mysql
show databases;
use ycc;
#1
DROP TABLE IF EXISTS ycc.oms_company_address;
CREATE TABLE ycc.oms_company_address (
	id                   bigint,
	address_name         varchar(200) comment '地址名称',
	send_status          int(1) comment '默认发货地址：0->否；1->是',
	receive_status       int(1) comment '是否默认收货地址：0->否；1->是',
	name                 varchar(64) comment '收发货人姓名',
	phone                varchar(64) comment '收货人电话',
	province             varchar(64) comment '省/直辖市',
	city                 varchar(64) comment '市',
	region               varchar(64) comment '区',
	detail_address       varchar(200) comment '详细地址',
	primary key (id)
);
#2
INSERT INTO oms_company_address VALUES ('1', 'NChicago', '1', '1', 'Corn', '18000000000', 'IL', 'Chicago', 'asda', 'posdiojd');
INSERT INTO oms_company_address VALUES ('2', 'NSan Jose', '0', '0', 'Apple', '18000000000', 'CA', 'San Jose', 'gfdg', 'hfvxcvxcvxcv');
INSERT INTO oms_company_address VALUES ('3', 'NNew York', '0', '0', 'Tree', '18000000000', 'NY', 'New York', 'grgtgt', 'jmujujuj');
INSERT INTO oms_company_address VALUES ('4', 'NMiami', '0', '0', 'Banana', '18000000000', 'FL', 'Miami', 'odjn', 'yugrkjhsefioh');
INSERT INTO oms_company_address VALUES ('5', 'NLos Angles', '0', '0', 'Tree', '18000000000', 'CA', 'Los Angles', 'tndf', 'ervdfggr');
#3
select * from oms_company_address;
#4
select * from oms_company_address limit 3;
#5
update oms_company_address set phone = '666-6666-8888';
#6
delete from oms_company_address where id = 5;
rollback;
#7

```

## **MongoDB Exercise**

1. Create test DB
2. Create oms_company_address collection (method: createCollection() )
3. Insert few random entries to oms_company_address collection (method: insert() )

4. Read one entry from oms_company_address collection (method: find() )

5. Read all entries from oms_company_address collection (method: find() )

6. Update one entry from oms_company_address collection (method:update()orsave()) 

7. Remove one entry from oms_company_address collection (method:remove())

8. (Optional)You can also try to create other tables that listed above

```shell
test> use test
already on db test
test> db.createCollection("oms_company_address")
{ ok: 1 }
test> db.oms_company_address.insert({"cid":"1","address_name":"100 S Ijahs St","send_status":"1","receive_status":"0","name":"Wang Ming"})
DeprecationWarning: Collection.insert() is deprecated. Use insertOne, insertMany, or bulkWrite.
{
  acknowledged: true,
  insertedIds: { '0': ObjectId("6358d3fa24631b303f715acc") }
}
test> 

test> db.oms_company_address.find()
[
  {
    _id: ObjectId("6358d3fa24631b303f715acc"),
    cid: '1',
    address_name: '100 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Wang Ming'
  }
]
test> try{db.oms_company_address.insertMany([{"cid":"2","address_name":"101 S Ijahs St","send_status":"1","receive_status":"0","name":"Wang Ming"}, {"cid":"3","address_name":"102 S Ijahs St","send_status":"1","receive_status":"0","name":"Ma Li"}, {"cid":"4","address_name":"103 S Ijahs St","send_status":"1","receive_status":"1","name":"Wang Xing"}, {"cid":"5","address_name":"104 S Ijahs St","send_status":"0","receive_status":"1","name":"Zhang Hong"}, {"cid":"6","address_name":"105 S Ijahs St","send_status":"0","receive_status":"0","name":"Li Hao"}trycatch (e){print(e)}
{
  acknowledged: true,
  insertedIds: {
    '0': ObjectId("6358d64a24631b303f715acd"),
    '1': ObjectId("6358d64a24631b303f715ace"),
    '2': ObjectId("6358d64a24631b303f715acf"),
    '3': ObjectId("6358d64a24631b303f715ad0"),
    '4': ObjectId("6358d64a24631b303f715ad1")
  }
}
test> db.oms_company_address.find()
[
  {
    _id: ObjectId("6358d3fa24631b303f715acc"),
    cid: '1',
    address_name: '100 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Wang Ming'
  },
  {
    _id: ObjectId("6358d64a24631b303f715acd"),
    cid: '2',
    address_name: '101 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Wang Ming'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ace"),
    cid: '3',
    address_name: '102 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Ma Li'
  },
  {
    _id: ObjectId("6358d64a24631b303f715acf"),
    cid: '4',
    address_name: '103 S Ijahs St',
    send_status: '1',
    receive_status: '1',
    name: 'Wang Xing'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad0"),
    cid: '5',
    address_name: '104 S Ijahs St',
    send_status: '0',
    receive_status: '1',
    name: 'Zhang Hong'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad1"),
    cid: '6',
    address_name: '105 S Ijahs St',
    send_status: '0',
    receive_status: '0',
    name: 'Li Hao'
  }
]
test> db.oms_company_address.find({cid:'3'})
[
  {
    _id: ObjectId("6358d64a24631b303f715ace"),
    cid: '3',
    address_name: '102 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Ma Li'
  }
]
test> db.oms_company_address.find({cid:"3"})
[
  {
    _id: ObjectId("6358d64a24631b303f715ace"),
    cid: '3',
    address_name: '102 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Ma Li'
  }
]
test> db.oms_company_address.find()
[
  {
    _id: ObjectId("6358d3fa24631b303f715acc"),
    cid: '1',
    address_name: '100 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Wang Ming'
  },
  {
    _id: ObjectId("6358d64a24631b303f715acd"),
    cid: '2',
    address_name: '101 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Wang Ming'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ace"),
    cid: '3',
    address_name: '102 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Ma Li'
  },
  {
    _id: ObjectId("6358d64a24631b303f715acf"),
    cid: '4',
    address_name: '103 S Ijahs St',
    send_status: '1',
    receive_status: '1',
    name: 'Wang Xing'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad0"),
    cid: '5',
    address_name: '104 S Ijahs St',
    send_status: '0',
    receive_status: '1',
    name: 'Zhang Hong'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad1"),
    cid: '6',
    address_name: '105 S Ijahs St',
    send_status: '0',
    receive_status: '0',
    name: 'Li Hao'
  }
]
test> db.oms_company_address.updateOne({cid:'1'},{$set:{name:"Wang Mingming"}})
{
  acknowledged: true,
  insertedId: null,
  matchedCount: 1,
  modifiedCount: 1,
  upsertedCount: 0
}
test> db.oms_company_address.find()
[
  {
    _id: ObjectId("6358d3fa24631b303f715acc"),
    cid: '1',
    address_name: '100 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Wang Mingming'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ace"),
    cid: '3',
    address_name: '102 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Ma Li'
  },
  {
    _id: ObjectId("6358d64a24631b303f715acf"),
    cid: '4',
    address_name: '103 S Ijahs St',
    send_status: '1',
    receive_status: '1',
    name: 'Wang Xing'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad0"),
    cid: '5',
    address_name: '104 S Ijahs St',
    send_status: '0',
    receive_status: '1',
    name: 'Zhang Hong'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad1"),
    cid: '6',
    address_name: '105 S Ijahs St',
    send_status: '0',
    receive_status: '0',
    name: 'Li Hao'
  }
]
test> db.oms_company_address.deleteOne({cid:"2"})
{ acknowledged: true, deletedCount: 0 }
test> db.oms_company_address.find()
[
  {
    _id: ObjectId("6358d3fa24631b303f715acc"),
    cid: '1',
    address_name: '100 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Wang Mingming'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ace"),
    cid: '3',
    address_name: '102 S Ijahs St',
    send_status: '1',
    receive_status: '0',
    name: 'Ma Li'
  },
  {
    _id: ObjectId("6358d64a24631b303f715acf"),
    cid: '4',
    address_name: '103 S Ijahs St',
    send_status: '1',
    receive_status: '1',
    name: 'Wang Xing'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad0"),
    cid: '5',
    address_name: '104 S Ijahs St',
    send_status: '0',
    receive_status: '1',
    name: 'Zhang Hong'
  },
  {
    _id: ObjectId("6358d64a24631b303f715ad1"),
    cid: '6',
    address_name: '105 S Ijahs St',
    send_status: '0',
    receive_status: '0',
    name: 'Li Hao'
  }
]
test> 

```

