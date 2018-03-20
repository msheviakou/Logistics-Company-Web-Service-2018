package edu.bsuir.controller;

import edu.bsuir.model.Users;
import edu.bsuir.service.implementation.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersRESTController {

    @Autowired
    private UsersServiceImpl usersService;

    @RequestMapping(value = "/users",
                    method = RequestMethod.GET,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public List<Users> getAllUsers() {
        return usersService.getAll();
    }


    @RequestMapping(value = "/user/{userId}",
                    method = RequestMethod.GET,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public Users getUsers(@PathVariable("userId") String userId) { return usersService.getUser(Integer.parseInt(userId)); }

    @RequestMapping(value = "/user/{userId}",
            method = RequestMethod.DELETE,
            produces = { MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE })
    public void deleteUser(@PathVariable("userId") String userId) { usersService.delete(Integer.parseInt(userId)); }


    @RequestMapping(value = "/user",
                    method = RequestMethod.POST,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public Users addUser(@RequestBody Users user) { return usersService.addUser(user); }

    @RequestMapping(value = "/user",
                    method = RequestMethod.PUT,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public Users editUser(@RequestBody Users user) { return usersService.editUser(user); }
}
