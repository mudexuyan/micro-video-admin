package edu.ustc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VideosApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideosApplication.class,args);
    }
}