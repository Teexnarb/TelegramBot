package pro.sky.telegrambot.command;

import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.Message;
import pro.sky.telegrambot.entity.NotificationTask;
import pro.sky.telegrambot.receiver.TelegramBotClient;
import pro.sky.telegrambot.repository.NotificationTaskRepository;
import pro.sky.telegrambot.service.NotificationTaskService;

import java.util.List;

public class CommandNotificationInfo implements Command{
    private final TelegramBotClient botClient;
    private final NotificationTaskService notificationTaskService;

    private NotificationTaskRepository notificationTaskRepository;

    public CommandNotificationInfo(TelegramBotClient botClient, NotificationTaskService notificationTaskService) {
        this.botClient = botClient;
        this.notificationTaskService = notificationTaskService;
    }

    public void execute(Message message, CallbackQuery callbackQuery) {
        List<pro.sky.telegrambot.entity.NotificationTask> notifications = notificationTaskRepository.getAllNotifications();
        for (NotificationTask notification : notifications) {
            botClient.sendMessage(callbackQuery.message().chat().id(), notification.toString());
        }
    }
}