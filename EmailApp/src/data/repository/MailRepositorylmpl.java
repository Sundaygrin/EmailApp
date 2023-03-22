package data.repository;

import data.model.Mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MailRepositorylmpl implements MailRepository{
    int count;

    private List<Mail> mails = new ArrayList<>();

    @Override
    public Mail save(Mail mail) {
        boolean mailhasNotBeenSaved =mail.getMailId() == 0;
        if (mailhasNotBeenSaved){
            mail.setMailId(generateMailId());
            mails.add(mail);
            count++;
        }
        return mail;
    }

    private int generateMailId() {
        return count+1;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Mail> findAll() {
        return mails;
    }

    @Override
    public void delete(Mail mail) {
        for (Mail mail1 : mails ){
            if(mail1 == mail){mails.remove(mail);
                count --;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (Mail mail: mails){
            if(mail.getMailId() == id){
                mails.remove(mail);
                count --;
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        mails.remove(mails);
        count --;
    }

    @Override
    public Mail findByTitle(String title) {
        for (Mail mail : mails) {
            if (Objects.equals(mail.getTitle(), title)){
                return  mail;
            }
        }
        return null;
    }
}
