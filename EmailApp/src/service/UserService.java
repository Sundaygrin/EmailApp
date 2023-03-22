package service;

import data.model.User;
import dtos.register.RegisterRequest;
import dtos.register.SignUpRequest;

public interface UserService {
    String login(SignUpRequest response);
    User signUp(RegisterRequest request);
    void delete();

    void deleteAll();
}
