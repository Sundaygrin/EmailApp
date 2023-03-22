import controller.MailController;
import controller.UserController;
import data.model.Mail;
import data.model.User;
import dtos.register.MailRequest;
import dtos.register.RegisterRequest;
import dtos.register.SignUpRequest;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static User user;

    static UserController userController = new UserController();
    static MailController mailController = new MailController();
    private static java.lang.Object Object;
    private static java.lang.Object Objects;
    private static Mail output;
    private static Mail result;


    public static void main(String[] args) {
        try{
            EmailApplication();
        }catch (StringIndexOutOfBoundsException er){
            display("Invalid input, please try again...");
        }

    }

    private static void EmailApplication(){
        String message = input( """
                ================================================
                Welcome to your Email
                ================================================
                1: Register
                2: Login
                3: Exist
                ================================================
                """);
        switch (message.charAt(0)){
            case '1' -> Register();
            case '2' -> Login();
            case '3' -> Exist();
            default -> EmailApplication();
        }
    }

    private static void exitMailApplication(){
        display("Thanks for your Time");
        System.exit(1);
    }


    private static void Register() {
        try{
            RegisterRequest request = new RegisterRequest();
            request.setFirstName(input("Enter FirstName: "));
            request.setLastName(input("Enter LastName: "));
            request.setPhoneNumber(input("Enter phone Number"));
            request.setDateOfBirth(input("Enter Date Of Birth: " ));
            request.setEmailAddress(input("Enter Email Address: "));
            request.setPassword(input("Enter Password: "));
            var result = UserController.register(request);
            display(result.toString());
            display("Registration successfull, you can now Login into your account..");
            EmailApplication();
        }
        catch(IllegalArgumentException | NullPointerException | InputMismatchException e ){
            display(e.getMessage());
            EmailApplication();
        }
    }

    private static void Login() {
        SignUpRequest request = new SignUpRequest();
        request.setEmail(input("Enter your Email Address"));
        request.setPassword(input("Enter your password"));
        var result  = userController.login(request);
        display(result.toString());
        displayAfterUserLogin();
        EmailApplication();

    }

    private static void displayAfterUserLogin() {
        String display = input("""
                ================================
                1 -> Compose Mail
                2 -> Inbox
                3 -> Search Mail
                4 -> Delete Mail
                5 -> Home Page
                6 -> Exit
                """);
        switch (display.charAt(0)) {
            case '1' -> composeMail();
            case '2' -> inbox();
            case '3' -> searchMail();
            case '4' -> deleteMail();
            case '5' -> homePage();
            case '6' -> exit();
        }
    }

    private static void composeMail() {
        MailRequest request = new MailRequest();
        request.setReceiverEmailAddress(input("Receiver Email Address "));
        request.setSenderEmailAddress(input("Sender Email Address"));
        request.setTitle(input("Enter Mail Subject"));
        request.setBody(input("Enter Mail Body"));
        var output = mailController.composeMail(request);
        display(output.toString());
    }

    private static void inbox() {
        display(String.valueOf(mailController.viewAllInbox()));
        displayAfterUserLogin();

    }

    private static void searchMail() {
        try {
            String title = input("Enter title of your Mail");
            display(String.valueOf(mailController.searchMail(title)));
            displayAfterUserLogin();
        }catch (NoSuchElementException e) {
            display(e.getMessage());
        }
        displayAfterUserLogin();
    }

    private static void deleteMail() {
        mailController.deleteAllMail();
        displayAfterUserLogin();
    }

    private static void homePage() {
        EmailApplication();
    }


    private static void exit() {
        display("Thank You for your Time .....");
    }
    private static void display(String Prompt) {
        JOptionPane.showMessageDialog(null, Prompt);
    }

    private static String input(String Prompt) {
        return JOptionPane.showInputDialog(Prompt);
    }

    private static void Exist() {
        display("Thank You for your Time .....");
    }
    }
