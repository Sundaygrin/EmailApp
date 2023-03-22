package controller;

import dtos.register.MailRequest;
import service.MailService;
import service.MailServicelmpl;

public class MailController {
    private MailService mailService = new MailServicelmpl();

    public Object composeMail(MailRequest request){
        try{
            return mailService.createMail(request);
        }catch (IllegalArgumentException e){
            return e.getMessage();
        }
    }
    public Object viewAllInbox(){
        try{
            return mailService.viewInbox();
        }catch(IllegalArgumentException e){
            return  e.getMessage();
        }
    }

    public Object searchMail(String title){
        try{
            return mailService.searchMail(title);
        }catch(IllegalArgumentException e){
            return  e.getMessage();
        }
    }

    public void deleteAllMail(){
        try{
            mailService.deleteAllMail();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

