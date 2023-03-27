# H2

jdbc:h2:mem:53cb8242-b8c7-4f13-be48-2bcc41305ba0
by default
to see the consol add config:
```
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:testdb

```
Long -> bigint

insert into course(id,name,author)
values(1, 'Learn AWS','tachla');

select * from course;

delete from course where id=1

# JDBC
lot of sql 
lot of java code

# spring JDBC
lot of SQL queries
lesser Java Code
```
@Autowired
private JdbcTemplate jdbcTemplate;
```

# JPA
not worry about queries
just map entities to tables

```
@Entity
@Id
@Column
 
   @PersistenceContext
   private EntityManager entityManager;

```

# Spring Data JPA
let's make JPA somple
no need to entity manager

you have to just to create an interface extends JpaRepository
```
private interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> 
```
# Hibernate vs JPA

-JPA define the specification. ir is an API
-- how do you define entities
-- how do you map attributes
-- who manages th entities

-hibernate is one of the popular implementations of JPA
- Using hibernate directly would result in a lock in to hibernate
- other implementations like Toplink