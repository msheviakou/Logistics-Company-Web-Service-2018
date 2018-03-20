package edu.bsuir.controller.security;

import edu.bsuir.model.Users;
import edu.bsuir.service.implementation.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateREST {

    @Autowired
    private UsersServiceImpl usersService;

    @RequestMapping(value = "/authenticate",
                    method = RequestMethod.POST,
                    produces = { MediaType.APPLICATION_JSON_VALUE,
                                 MediaType.APPLICATION_XML_VALUE })
    public Users authenticate(@RequestBody Users user) { return usersService.getUserByLoginAndPassword(user.getLogin(), user.getPassword()); }
}
