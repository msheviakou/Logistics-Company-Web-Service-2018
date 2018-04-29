package edu.bsuir.service;

import edu.bsuir.model.Users;

import java.util.List;

public interface UsersService {
    Users addUser(Users user);
    void deleteUser(int id);
    Users getUser(int id);
    List<Users> getAll();
    List<Users> getAllForwarders();
    Users getUserByLoginAndPassword(String login, String password);
    Users getUserByLogin(String login);
    Users getUserByName(String name);
}
