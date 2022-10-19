package com.example.bot.configuration;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
//@PropertySource("application.properties")
public class BotConfig {

    @Value("NotifyMeKateBot")
    String botName;

    @Value("5396777008:AAH7axkMNTr-yR1NxtgSW0RspLQd8Fxo2n8")
    String token;

//    @Value("${bot.owner}")
//    Long ownerId;

}
