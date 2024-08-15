package com.mindhub.todolist.models.Utils;

import com.mindhub.todolist.models.UserEntity;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Java {
    @Bean
    public CommandLineRunner initData(){
        return args -> {
            UserEntity userEntity = new UserEntity"Poppeta40", "123456", "poppeta@java.com")
        };
    }
}
