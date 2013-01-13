package com.zachoz.OresomeBot.commands;

import org.pircbotx.Channel;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.*;
import com.zachoz.OresomeBot.OresomeBot;

@SuppressWarnings("rawtypes")
public class KickCommand extends ListenerAdapter {

    public void onMessage(MessageEvent event) throws Exception {
	if (event.getMessage().split(" ").length > 1) {
	    Channel currentchannel = event.getChannel();
	    String userarg = event.getMessage().split(" ")[1];
	    String message = event.getMessage();
	    String[] ArrSay = message.split(" ");
	    String outsay = "";

	    if (event.getMessage().startsWith(".kick") && event.getMessage().contains(userarg)) {

		if (currentchannel.hasVoice(event.getUser()) || currentchannel.isOp(event.getUser())) {
		    if (ArrSay.length > 2) {

			for (int i = 2; i < ArrSay.length; i++) {
			    outsay += ArrSay[i];
			    if (i != ArrSay.length - 1) {
				outsay += " ";
			    }
			}
		    }

		    OresomeBot.bot.sendRawLineNow("kick " + event.getChannel().getName() + " " + userarg + " " + outsay);

		}
	    }
	}

    }

}