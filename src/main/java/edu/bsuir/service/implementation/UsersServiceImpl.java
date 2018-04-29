package edu.bsuir.service.implementation;

import edu.bsuir.model.Users;
import edu.bsuir.repository.UsersRepository;
import edu.bsuir.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users addUser(Users user) { return usersRepository.saveAndFlush(user); }

    @Override
    public void deleteUser(int id) {
        usersRepository.deleteById(id);
    }

    @Override
    public Users getUser(int id) {
        return usersRepository.getOne(id);
    }

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @Override
    public List<Users> getAllForwarders() {
        return usersRepository.getAllByPost("Экспедитор");
    }

    @Override
    public Users getUserByLoginAndPassword(String login, String password) { return usersRepository.getUserByLoginAndPassword(login, password); }

    @Override
    public Users getUserByLogin(String login) {
        Optional<Users> isUser = usersRepository.getUserByLogin(login);
        if (isUser.isPresent())
            return isUser.get();
        return new Users();
    }

    @Override
    public Users getUserByName(String name) {
        return usersRepository.getUserByName(name);
    }
}
