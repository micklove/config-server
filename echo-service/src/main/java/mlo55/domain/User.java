package mlo55.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
    private String password;

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
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
}
