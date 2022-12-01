
### @Table
declare table
### @Entity
declare class as entity class
### @Id
declare primary key
### @UniqueConstraint
set unique attribute
### @GeneratedValue
strategy for primary key generating
### @Column
declare attribute
### @UpdateTimestamp
set this property as update timestamp of containing entity
### @CreationTimestamp

set property as the creation timestamp of the containing entity
@Entity - it is a enity, will be used to map with database
@Table - will be used to locate the database table name
@Id - this column is a primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) - 主键⾃增的策略
@Column(name = "description", nullable = false) - specify the
informaiton for this column, like name in database, can be null or not in
database

### @Repository
declare dao

### @RestController
declare restful controller
### @RequestMapping
set request url
### @Autowired
inject collaborating beans to this class
### @PostMapping
declare receiving post request
### @GetMapping
declare receiving get request
### @Service
declare this is a service layer.