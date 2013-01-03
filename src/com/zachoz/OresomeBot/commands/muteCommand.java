package com.zachoz.OresomeBot.commands;




import org.pircbotx.Channel;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.*;
import com.zachoz.OresomeBot.OresomeBot;

@SuppressWarnings("rawtypes")
public class muteCommand extends ListenerAdapter {

    public void onMessage(MessageEvent event) throws Exception {
	 Channel currentchannel = event.getChannel();

	 String userarg = event.getMessage().split(" ")[1];
	 
	  if (event.getMessage().startsWith(".mute") && event.getMessage().contains(userarg))   {

	      if(currentchannel.hasVoice(event.getUser()) || currentchannel.isOp(event.getUser()) ) { 

		  OresomeBot.bot.sendRawLine("mode" + " " + event.getChannel().getName() + " +q " + userarg);

	          event.respond("Muted: " + userarg);

	  } else {
	     event.respond("Only operators and voiced users may mute users.");
	    }
	      
	}  if (event.getMessage().startsWith(".unmute") && event.getMessage().contains(userarg))   {

		      if(currentchannel.hasVoice(event.getUser()) || currentchannel.isOp(event.getUser()) ) { 

			  OresomeBot.bot.sendRawLine("mode" + " " + event.getChannel().getName() + " -q " + userarg);

		    event.respond("Unmuted: " + userarg);

		  } else {
		     event.respond("Only operators and voiced users may unmute users.");
	    }

	}

    }

}


