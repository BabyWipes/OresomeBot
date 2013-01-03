package com.zachoz.OresomeBot;

import org.pircbotx.PircBotX;

import com.zachoz.OresomeBot.commands.*;

public class OresomeBot {
    
 /*
    joinCommand jc;
    
    public OresomeBot(joinCommand joinc) {
	jc = joinc;
    }

*/
    public static PircBotX bot = new PircBotX();
    public static void main(String[] args) throws Exception {
 
        
        bot.getListenerManager().addListener(new Hello());
        bot.getListenerManager().addListener(new joinCommand());
        bot.getListenerManager().addListener(new partCommand());
        bot.getListenerManager().addListener(new banCommand());
        bot.getListenerManager().addListener(new unbanCommand());
        bot.getListenerManager().addListener(new kickCommand());
        bot.getListenerManager().addListener(new kickbanCommand());
        bot.getListenerManager().addListener(new muteCommand());
        bot.getListenerManager().addListener(new helpCommand());
        bot.getListenerManager().addListener(new infoCommand());
        bot.getListenerManager().addListener(new sayCommand());
        
        // Bot details will be defined via a config file in the future.
        
        // Bot configuration.
        bot.setVersion("OresomeBotv2");
        bot.setLogin("OresomeBotv2");
        bot.setName("OresomeBotv2");
        bot.connect("irc.freenode.net");
        bot.setVerbose(true);
        
        // Channels to auto-join.
        bot.joinChannel("#oresomecraft");
        bot.joinChannel("#oresomecraft-chat");
        bot.joinChannel("#OresomeBot");
        bot.joinChannel("#Zachoz");
        

}




}
    


