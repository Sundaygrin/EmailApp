package data.model;

public class Mail {
    private int mailId;
    private String title;
    private String body;
    private String senderMail;
    private String receiverMail;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public String getReceiverMail() {
        return receiverMail;
    }

    public void setReceiverMail(String receiverMail) {
        this.receiverMail = receiverMail;
    }

    public int getMailId() {
        return mailId;
    }

    public void setMailId(int mailId) {
        this.mailId = mailId;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mailId=" + mailId +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", senderMail='" + senderMail + '\'' +
                ", receiverMail='" + receiverMail + '\'' +
                '}';
    }
}

