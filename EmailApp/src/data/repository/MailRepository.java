package data.repository;

import data.model.Mail;

import java.util.List;

public interface MailRepository {
    Mail save(Mail mail);
    long count();
    List<Mail> findAll();
    void delete(Mail mail);
    void delete(int id);
    void deleteAll();
    Mail findByTitle(String title);
}
