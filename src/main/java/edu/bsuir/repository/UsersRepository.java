package edu.bsuir.repository;

import edu.bsuir.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users getUserByLoginAndPassword(String login, String password);
    Users getUserByName(String name);
    List<Users> getAllByPost(String post);
}
