package controller;

import dtos.register.RegisterRequest;
import dtos.register.SignUpRequest;
import service.UserService;
import service.UserlServicelmpl;

public class UserController {
    private static UserService userService = new UserlServicelmpl() ;

    public static Object register(RegisterRequest request){

        try{
            return userService.signUp(request);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }
    public Object login(SignUpRequest request){
        try{
            return userService.login(request);
        }catch (IllegalArgumentException ex){
            throw new IllegalArgumentException(ex.getMessage());
        }
    }
}

