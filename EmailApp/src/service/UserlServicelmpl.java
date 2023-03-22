package service;

import data.model.Mail;
import data.model.User;
import data.repository.UserRepository;
import data.repository.UserRepositorylmpl;
import dtos.register.RegisterRequest;
import dtos.register.SignUpRequest;
import util.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

public class UserlServicelmpl implements UserService{
    public static UserRepository userRepository = new UserRepositorylmpl();
    User user = new User();
    int count;
    List<Mail> mail = new ArrayList<>();

    @Override
    public String login(SignUpRequest request) {

        User user = userRepository.findByUsername(request.getUsername());
        if (user == null) throw new NullPointerException("No user found");
        if(user.getPassword() == request.getPassword()){
//
            return "Login Successful";
        }
        return  "Login Successful";
    }

    @Override
    public User signUp(RegisterRequest request) {
        emailExist(request.getEmailAddress());
        dateOfBirthExist(request.getDateOfBirth());
        phoneNumberExist(request.getPhoneNumber());
        return userRepository.save(Mapper.map(request));
    }

    @Override
    public void delete() {

    }


    private  void phoneNumberExist(String phoneNumber){
        if (phoneNumber == null) throw new NullPointerException("Phone Number field cant be empty");
        if (phoneNumber.length() != 11) throw  new NumberFormatException("Length 11 required for phoneNumber. ");
        if (Objects.equals(phoneNumber,user.getPhoneNumber()))  throw  new IllegalArgumentException(phoneNumber + "already exists");
    }
    private void dateOfBirthExist(String date) {
        if(date == null) throw new NoSuchElementException("Date of Birth field cant be empty.");
    }

    private void emailExist(String email) {
        if (email == null) throw new IllegalArgumentException("Email cant be empty");
        if (Objects.equals(email, user.getEmailAddress())) throw new IllegalArgumentException("Email already exist");
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }
}
