package pro.sky.telegrambot.command;

import com.pengrad.telegrambot.model.CallbackQuery;
import com.pengrad.telegrambot.model.Message;

public interface Command {
    void execute(Message message, CallbackQuery callbackQuery);
}