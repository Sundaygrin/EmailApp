package service;

import data.model.Mail;
import dtos.register.MailRequest;

public interface MailService {
    Mail createMail(MailRequest mailRequest);
    Mail searchMail(String titlt);
    String viewInbox();
    void deleteMail();
    void deleteAllMail();
}
