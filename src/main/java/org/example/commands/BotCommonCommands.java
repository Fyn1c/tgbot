package org.example.commands;

import org.example.commands.AppBotCommand;

public class BotCommonCommands {
    @AppBotCommand(name = "/hello", description = "when request hello",
            showInHelp = true)
    String hello(){
        return "Привет!)";
    }
    @AppBotCommand(name = "/bye", description = "when request bye",
            showInHelp = true)
    String bye(){
        return "Пока!";
    }
    @AppBotCommand(name = "/help", description = "when request help",
            showInKeyboard = true)
    String help(){
        return "Вы воспользовались командой /help. В дальнейшем в данном разделе будут все доступные команды бота.";
    }
}
