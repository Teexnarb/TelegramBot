package pro.sky.telegrambot.listener;

import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.Message;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot.command.Command;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class CommandProcessor {
    private final ConcurrentHashMap<String, Command> commandMap = new ConcurrentHashMap<>();

    public CommandProcessor(@Qualifier("commandStart") Command commandStart,
                            @Qualifier("commandNotificationInfo") Command commandNotificationInfo) {
        commandMap.put("/start", commandStart);
        commandMap.put("/allNotificationInfo", commandNotificationInfo);
    }

    public void process(String command, Message message, CallbackQuery callbackQuery) {
        if (commandMap.containsKey(command)) {
            commandMap.get(command).execute(message, callbackQuery);
        }
    }
}