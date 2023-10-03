package org.feastgroup;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String token="YOR_BOT_TOKEN";
        JDA jda = JDABuilder.createDefault(token).enableIntents(GatewayIntent.GUILD_MODERATION,GatewayIntent.MESSAGE_CONTENT,GatewayIntent.GUILD_MEMBERS,GatewayIntent.AUTO_MODERATION_CONFIGURATION).build();
        jda.addEventListener(new Command());



    }
}