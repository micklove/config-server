package mlo55.rest;

import java.util.ArrayList;
import java.util.List;

import mlo55.service.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/echo")
public class EchoController {

    @Autowired
    private Environment env;

    @Autowired
    private UserRepo userRepo;

    /**
     * e.g. http://localhost:10071/echo/mick
     */
    @RequestMapping(method = GET, value="/{name}")
    public ResponseEntity<List<String>> getProducerByIdAndDate(@PathVariable final String name) {
        final String msg = String.format("Hello %s, brand = [%s]", name, env.getProperty("brand.name"));
        List<String> response = new ArrayList<>();
        response.add(msg);
        return ResponseEntity.ok(response);
    }

    /**
     * e.g. http://localhost:10071/all
     */
    @RequestMapping(method = GET, value="/all")
    public ResponseEntity<List<UserResource>>  getAllUsers() {
        UserResourceAssemblerSupport resource = new UserResourceAssemblerSupport(this.getClass(), UserResource.class);
        return ResponseEntity.ok(resource.toResources(userRepo.findAll()));
    }


}
