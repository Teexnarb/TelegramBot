package pro.sky.telegrambot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class NotificationTask {
    public String getNotification;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "chat_Id")
    private Long chatId;
    @Column(name = "message")
    private String message;
    @Column(name = "timeSnd")
    private LocalDateTime timeSnd;

    public NotificationTask(Long chatId, String message, LocalDateTime timeSnd) {
        this.chatId = chatId;
        this.message = message;
        this.timeSnd = timeSnd;
    }

    public NotificationTask() {

    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeSnd() {
        return timeSnd;
    }

    public void setTimeSnd(LocalDateTime timeSnd) {
        this.timeSnd = timeSnd;
    }


    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotificationTask that = (NotificationTask) o;
        return Objects.equals(id, that.id) && Objects.equals(chatId, that.chatId) && Objects.equals(message, that.message) && Objects.equals(timeSnd, that.timeSnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, message, timeSnd);
    }

    @Override
    public String toString() {
        return "NotificationTask{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", message='" + message + '\'' +
                ", timeSnd=" + timeSnd +
                '}';
    }
}