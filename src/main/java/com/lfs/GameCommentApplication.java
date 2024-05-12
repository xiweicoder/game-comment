package com.lfs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lfs.mapper")
@SpringBootApplication
public class GameCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameCommentApplication.class, args);
    }

}
