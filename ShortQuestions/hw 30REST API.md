# hw 30REST

```

2. Design a collection of APIs for a Blog Website, please specify GET POST PUT DELETE
- create a new blogger account 
	POST https://www.blog.com/bloggers
	
- direct to home page of a blogger 
	GET https://www.blog.com/bloggers/blogger_id
	
- retrieve blog history of a blogger 
	GET https://www.blog.com/bloggers/blogger_id/posts
	
- open a specific blog of a blogger 
	GET https://www.blog.com/bloggers/blogger_id/posts/post_id
	
- publish a new blog 
	POST https://www.blog.com/bloggers/blogger_id/posts
	
- update a blog 
	PATCH https://www.blog.com/blogger/blogger_id/posts/post_id
	
- delete a blog 
	DELETE https://www.blog.com/blogger/blogger_id/posts/post_id

1. find the customer's payments, like credit card 1, credit card 2, paypal, Apple Pay.
	GET https://www.something.com/customer_id/payments

 2. Find the customer's history orders from 10/10/2022 to 10/24/2022

	GET https://www.something.com/customer_id/orders?startdate=...&enddate=...

3. find the customer's delievery addresses
	GET https://www.something.com/customer_id/addresses

4. If I also want to get customer's default payment and default delievery address, what kind of the API (URL)should be?
	GET https://www.something.com/customer_id/payments?default=true
	GET https://www.something.com/customer_id/addresses?default=true
```