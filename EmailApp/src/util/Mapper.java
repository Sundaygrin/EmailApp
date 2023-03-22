package util;

import data.model.Mail;
import data.model.User;
import dtos.register.MailRequest;
import dtos.register.RegisterRequest;
import dtos.register.SignUpRequest;

import java.time.format.DateTimeFormatter;

public class Mapper {
    public static User map(RegisterRequest registerRequest){
        User user = new User();
        user.setFirstName(registerRequest.getFirstName());
        user.setLastName(registerRequest.getLastName());
        user.setDateOfBirth(registerRequest.getDateOfBirth());
        user.setPassword(registerRequest.getPassword());
        user.setEmailAddress(registerRequest.getEmailAddress());
        return  user;
    }

    public static void map(User foundUser, SignUpRequest signUpRequest){
        signUpRequest.setFullName(foundUser.getEmailAddress() + " " + foundUser.getLastName());
        signUpRequest.setEmail(foundUser.getEmailAddress());
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm a");


    }

    public static Mail map(MailRequest mailRequest){
        Mail mail = new Mail();
        mail.setSenderMail(mailRequest.getSenderEmailAddress());
        mail.setReceiverMail(mailRequest.getReceiverEmailAddress());
        mail.setTitle(mailRequest.getTitle());
        mail.setBody(mailRequest.getBody());
        return mail;
    }
}
