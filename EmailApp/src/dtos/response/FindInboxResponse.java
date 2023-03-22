package dtos.response;

import java.time.LocalDateTime;

public class FindInboxResponse {
    private String senderName;
    private  String title;
    private String body;
    private LocalDateTime dateTime = LocalDateTime.now();

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "FindInboxResponse{" +
                "senderName='" + senderName + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
