/** This is going to be auto-implemented by Spring. */

package io.aiven.spring.postgresql.demo;

import org.springframework.data.repository.CrudRepository;

import io.aiven.spring.postgresql.demo.User;

// Spring Boot’s CrudRepository is a part of the Spring Data JPA framework, which provides convenient methods for
// performing CRUD (Create, Read, Update, Delete) operations on entities in a relational database. CrudRepository is an
// interface that extends the basic Repository interface and adds generic CRUD methods to it.
// Here:
// T: Domain type that repository manages (Generally the Entity/Model class name)
// ID: Type of the id of the entity that repository manages (Generally the wrapper class of your @Id that is created
// inside the Entity/Model class)
public interface UserRepository extends CrudRepository<User, Integer> {
}
