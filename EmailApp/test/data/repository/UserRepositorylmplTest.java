package data.repository;

import data.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static service.UserlServicelmpl.userRepository;

class UserRepositorylmplTest {

    @BeforeEach
    void setup(){
        userRepository = new UserRepositorylmpl();
        User user = new User();
        user.setFirstName("Sunday");
        user.setLastName("Charles");
        user.setPassword("Sunday");
        user.setEmailAddress("Sunday@gmail.com");

    }

    @Test
    void saveTest() {
        User users = new User();
        userRepository.save(users);
        assertEquals(1,userRepository.count());
    }


    @Test
    void findByUserNameTest() {
        User user = new User();
        user.setFirstName("Sunday");
        userRepository.save(user);
        assertEquals(1,userRepository.count());
    }

    @Test
    void deleteTest() {
        User users = new User();
        userRepository.save(users);
        userRepository.remove(users);
        assertEquals(1,userRepository.count());
        assertEquals(1,userRepository.size());
    }

    @Test
    void deleteAll() {
    }


}