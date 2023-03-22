package dtos.register;

import java.time.LocalDateTime;

public class MailRequest {
    private String title;
    private String body;
    private String senderEmailAddress;
    private String receiverEmailAddress;
    private LocalDateTime dateTime = LocalDateTime.now();

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

    public String getSenderEmailAddress() {
        return senderEmailAddress;
    }

    public void setSenderEmailAddress(String senderEmailAddress) {
        this.senderEmailAddress = senderEmailAddress;
    }

    public String getReceiverEmailAddress() {
        return receiverEmailAddress;
    }

    public void setReceiverEmailAddress(String receiverEmailAddress) {
        this.receiverEmailAddress = receiverEmailAddress;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "MailRequest{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", senderEmailAddress='" + senderEmailAddress + '\'' +
                ", receiverEmailAddress='" + receiverEmailAddress + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
