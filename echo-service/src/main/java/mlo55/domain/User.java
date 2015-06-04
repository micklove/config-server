package mlo55.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by IntelliJ IDEA.
 * User: micklove
 * Date: 4/06/2015
 * Time: 10:21 PM
 */
@Entity
public class User {

    @GeneratedValue
    @Id
    private Long id;

    private String user;

    private String email;

    @JsonIgnore
    private String password;

    public User() {
    }

    public User(final String user, final String password, final String email) {
        this.user = user;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return this.id;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
