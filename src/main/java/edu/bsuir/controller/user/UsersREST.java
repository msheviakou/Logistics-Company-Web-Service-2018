package edu.bsuir.controller.user;

import edu.bsuir.model.Users;
import edu.bsuir.service.implementation.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersREST {

    @Autowired
    private UsersServiceImpl usersService;

    @RequestMapping(value = "/user",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public Users addUser(@RequestBody Users user) { return usersService.addUser(user); }

    @RequestMapping(value = "/users",
                    method = RequestMethod.GET,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public List<Users> getAllUsers() {
        return usersService.getAll();
    }

    @RequestMapping(value = "/users/forwarders",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public List<Users> getAllUsersForwarders() {
        return usersService.getAllForwarders();
    }

    @RequestMapping(value = "/user/{userId}",
                    method = RequestMethod.GET,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public Users getUser(@PathVariable("userId") String userId) { return usersService.getUser(Integer.parseInt(userId)); }

    @RequestMapping(value = "/user/{userId}",
                    method = RequestMethod.DELETE,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public void deleteUser(@PathVariable("userId") String userId) { usersService.deleteUser(Integer.parseInt(userId)); }

    @RequestMapping(value = "/user/login/{login}",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public Users getUserByLogin(@PathVariable("login") String login) {
        return usersService.getUserByLogin(login);
    }
}
