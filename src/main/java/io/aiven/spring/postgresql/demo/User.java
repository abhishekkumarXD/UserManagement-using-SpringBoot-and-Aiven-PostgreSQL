/** When we are using hibernate, it is going to translate this into Postgres database. */

package io.aiven.spring.postgresql.demo;

import jakarta.persistence.*;

@Entity // specifies that the class is an entity and is mapped to a database table
@Table(name = "users")
public class User {

    // The @GeneratedValue annotation provides us with different strategies for the generation of primary keys.
    // GenerationType.IDENTITY : This strategy will help us to generate the primary key value by the database itself
    // using the auto-increment column option.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
