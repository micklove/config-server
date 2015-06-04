package mlo55.rest;

import mlo55.domain.User;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by IntelliJ IDEA.
 * User: micklove
 * Date: 5/06/2015
 * Time: 1:52 AM
 */
public class UserResource extends ResourceSupport {

    private final User user;

    public UserResource(final User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
