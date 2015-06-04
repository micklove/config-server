package mlo55.rest;

import mlo55.domain.User;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

/**
 * Created by IntelliJ IDEA.
 * User: micklove
 * Date: 5/06/2015
 * Time: 2:06 AM
 */
public class UserResourceAssemblerSupport extends ResourceAssemblerSupport<User, UserResource> {

    public UserResourceAssemblerSupport(Class<?> controllerClass, Class<UserResource> resourceType) {
        super(controllerClass, resourceType);
    }

    @Override
    public UserResource toResource(User user) {
        return createResourceWithId(user.getId(), user);
    }

    @Override
    protected UserResource instantiateResource(User user) {
        return new UserResource(user);
    }
}
