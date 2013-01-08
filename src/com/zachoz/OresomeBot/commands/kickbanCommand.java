package com.zachoz.OresomeBot.commands;


import org.pircbotx.Channel;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.*;
import com.zachoz.OresomeBot.OresomeBot;

@SuppressWarnings("rawtypes")
public class kickbanCommand extends ListenerAdapter {
    

    public void onMessage(MessageEvent event) throws Exception {
	if (event.getMessage().split(" ").length > 1) {
	 Channel currentchannel = event.getChannel();

	 String userarg = event.getMessage().split(" ")[1];
	 
	  if (event.getMessage().startsWith("!kickban") && event.getMessage().contains(userarg))   {

	      if(currentchannel.hasVoice(event.getUser()) || currentchannel.isOp(event.getUser()) ) { 

	      OresomeBot.bot.ban(currentchannel, userarg);
	      OresomeBot.bot.sendRawLineNow("kick " + event.getChannel().getName() + " " + userarg + " " + "Banned" );

	    event.respond("Banned and kicked: " + userarg);

	  } 

	}

    }
    }

}



    



