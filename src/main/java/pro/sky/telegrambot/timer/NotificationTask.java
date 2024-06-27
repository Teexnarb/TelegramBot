package pro.sky.telegrambot.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pro.sky.telegrambot.notificationService.NotificationTaskService;
import pro.sky.telegrambot.repository.NotificationTaskRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
public class NotificationTask {

    private final NotificationTaskRepository notificationTaskRepository;
    private final NotificationTaskService notificationTaskService;

    public NotificationTask(NotificationTaskRepository notificationTaskRepository, NotificationTaskService notificationTaskService) {
        this.notificationTaskRepository = notificationTaskRepository;
        this.notificationTaskService = notificationTaskService;
    }
}