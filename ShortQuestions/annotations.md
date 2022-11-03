# Annotations
## Entity
- `@Entity` defines a POJO model class as database mapping
- `@Table` defines SQL table design parameters
- `@UniqueConstrant` adds `UNIQUE` constraint to a column
- `@Id` defines `PRIMARY KEY` constaint to a column
- `@GenerateValue` defines incrementing rule for a primary key
- `@Column` defines a column's parameter
- `@CreateTimestamp` injects a current time to the field when created
- `@UpdateTimestamp` injects a current time to the field when updated
- `@ManyToOne`
- `@OneToMany`
- `@ManyToMany`
- `@JoinColumn` maps a POJO entity with a related database entity by specifying a foreign key name and nullable

## Controller
- `@RestController` defines a contoller class as the REST API contoller layer to handle requests
- `@RequestMapping` defines the starting path variable
- `@Autowired` injects a service layer implementation
- `@PostMapping` defines a POST method
- `@GetMapping` defines a GET method with path variable
- `@PutMapping` defines a PUT method with path variable
- `@DeleteMapping` defines a DELETE method with path variable
- `@PathVariable` maps field names in path variable with a Java field
- `@RequestBody` defines a request body source from DTO
- `@JsonProperty` maps Json field names with a Java field
- `@JsonPropertyOrder`

## DAO
- `@Repository` defines an interface as the DAO type

## Service
- `@Service` defines a class as the service layer implementation

## Other
- `@ResponseStatus` defines a class with a returned http response status
