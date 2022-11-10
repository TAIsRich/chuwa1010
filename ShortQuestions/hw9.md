### 4
`JPA` Java persistence api, can map javabean and its variable members to a database table's columns,
JPA also support database operation, basing on jpa we can call functions to operate database instead of writing sql statement.

`Hibernate` a framework implements the jpa, since jpa is a specification, the hibernate is a orm framework that based on jpa
### 5
`Hiraki` is a connection pool. Connection pool can cache the connections to avoid disconnect TCP, speed up the response time
### 6
all of them are used to define the mapping relationship between table and its foreign key table

@OneToMany
a mapping relationship that one row data in a table can be related with many items from another table

@ManyToOne
a mapping relationship that one row data in a table can only be related with an item from another table,
but this item can be related with many rows in this table

@ManyToMany
a mapping relationship that one row data in a table can be related with many items from another table
and this item can also be related with many rows in this table
### 7
cascade = CascadeType.ALL defined that a row of data would do cascadeType.
orphanRemoval = true means when a row of data is removed, all data from other table related with this data would be removed.
cascade = CascadeType.ALL would do cascade persist, remove, pefresh, merge, but orphanRemoval only do the remove.
When we do not consider other cascade options, use orphanRemoval = true is ok.
### 8
fetch is used to define loading way,
fetch = FetchType.LAZY, which would use select, it would not be loaded before we call it.
fetch = FetchType.EAGER, which would use join, it would load immediately
If we want to loading the foreign key's table immediately, use FetchType.EAGER.
### 9
JPA named functions by column name. 
we do not have to name them by ourselves. 
For example, if we want to search people who's last name is "White", we can search it as
findByLastname("White")
