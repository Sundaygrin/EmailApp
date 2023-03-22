package data.repository;

import data.model.User;
import dtos.register.SignUpRequest;

import java.util.List;

public interface UserRepository {
    User user = new User();

    static User findAccount(SignUpRequest request) {
        return user;
    }

    User save(User user);
    long count();
    List<User> findAll();
    void delete(User user);
    void delete(int id);
    void deleteAll();
    User findByUsername(String username);
    int size();
    User remove(User users);

}
