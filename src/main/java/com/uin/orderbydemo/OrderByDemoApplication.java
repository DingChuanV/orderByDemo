package com.uin.orderbydemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@MapperScan(basePackages = "com.uin.orderbydemo.mapper")
@EnableOpenApi
@SpringBootApplication
public class OrderByDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderByDemoApplication.class, args);
    }

}
