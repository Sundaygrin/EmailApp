package service;

import data.model.Mail;
import data.repository.MailRepository;
import data.repository.MailRepositorylmpl;
import dtos.register.MailRequest;
import dtos.response.FindInboxResponse;
import util.Mapper;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MailServicelmpl implements MailService{
    ArrayList<FindInboxResponse> inboxes = new ArrayList<>();

    MailRepository mailRepository = new MailRepositorylmpl();
    Mail mail = new Mail();

    int count;

    @Override
    public Mail createMail(MailRequest mailRequest) {
        return mailRepository.save(Mapper.map(mailRequest));
    }

    @Override
    public Mail searchMail(String title) {
        try {
            for (FindInboxResponse email: inboxes);
            if (mail.getTitle().equals(title))
                return mailRepository.findByTitle(title);
        }
        catch (NoSuchElementException e){e.getMessage();}
        throw new NoSuchElementException("No mail Found....");
    }

    @Override
    public String viewInbox() {
        return mailRepository.findAll().toString();
    }

    @Override
    public void deleteMail() {
        mailRepository.deleteAll();
        count = 0;
    }

    @Override
    public void deleteAllMail() {
        mailRepository.deleteAll();
        count = 0;
    }
}
