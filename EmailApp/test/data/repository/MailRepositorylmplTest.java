package data.repository;

import data.model.Mail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailRepositorylmplTest {

    MailRepository mailRepository;
    Mail mails;

    @BeforeEach
    void setup(){
        mails = new Mail();
        mailRepository = new MailRepositorylmpl();
    }

    @Test
    void saveOneMail_CountIsOne(){
        mailRepository.save(mails);
        mailRepository.count();
        assertEquals(1,mailRepository.count());
    }
    @Test
    public void deleteMailTest(){
        mailRepository.delete(mails);
    }

}