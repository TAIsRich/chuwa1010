### hw6
{ "id":1, "address_name":A2, "Sen_status": 1, "receive_status":1, "name":Jake, "phone":12343423, "province":Shangxi, "city":fsdf, "region" :sdfsdf, "detail_address":A3, }

test.oms_company_address.insertOne({ "id":1, "address_name":A2, "Sen_status": 1, "receive_status":1, "name":Jake, "phone":12343423, "province":Shangxi, "city":fsdf, "region" :sdfsdf, "detail_address":A3 })

test.oms_company_address.insertOne({ 
  id:1, 
address_name:"A2",
Sen_status: "1", 
receive_status:"0", 
name:"Jake",
phone: "12343423", 
province:"Shangxi", 
city:"fsdf", 
region:"sdfsdf",
detail_address:"A3"

})
MongoDB
test.oms_company_address.find({"name":"Jake"});
test.oms_company_address.find();
test.oms_company_address.find({"name":"Jake"});
test.oms_company_address.remove({"name":"Jake"})
test.oms_company_address.update({"name":"Jake"},{$set:{"name":"Kyle"}})
test.oms_company_address.remove({"name":"Jake"})
![Mongo](https://user-images.githubusercontent.com/70904267/198152002-95ef3a85-6eb2-4b5d-a64b-f977aef1949d.PNG)

![mysql](https://user-images.githubusercontent.com/70904267/198152015-e675b7b5-2e20-40d7-86ae-35685884bf71.PNG)

1.  Find 2 collection of APIs example. ie. Twitter, Paypal, Youtube etc.  -- 命名规范
2.  Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
Design APIs for the following features (思考：path variable 怎么用？有sub resources, 哪些地方该用复数)
return resources, create,update,delete resources
1.  find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
2.  Find the customer's history orders from 10/10/2022 to 10/24/2022
3.  find the customer's delievery  addresses
4.  If I also want to get customer's default payment and default delievery address, what kind of the API (URL) 
should be?
![API](https://user-images.githubusercontent.com/70904267/198151978-742a7a07-5c9b-4eef-8b0d-2404643799dd.PNG)
![GetApi1](https://user-images.githubusercontent.com/70904267/198151997-55b007c7-2a4a-4462-8b80-91e7dacf90bc.PNG)

![GetApi](https://user-images.githubusercontent.com/70904267/198151991-601f73c3-0cfb-46cc-958a-c6f12b543905.PNG)

