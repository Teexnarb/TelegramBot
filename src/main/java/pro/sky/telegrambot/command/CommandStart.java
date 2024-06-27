package pro.sky.telegrambot.command;


import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.Message;
import pro.sky.telegrambot.receiver.TelegramBotClient;

public class CommandStart implements Command {
    private final TelegramBotClient botClient;

    public CommandStart(TelegramBotClient telegramBotClient) {
        this.botClient = telegramBotClient;
    }

    @Override
    public void execute(Message message, CallbackQuery callbackQuery) {
        botClient.sendMessage(message.chat().id(), """
                Привет! 
                Чтобы создать напоминание, сообщи мне дату, время (с точностью до минуты) и текст напоминания в формате: 
                12.03.2024 22:05:09 Выполнить курсовую работу
                """);
    }
}