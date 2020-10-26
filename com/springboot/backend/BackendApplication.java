package com.springboot.backend;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.springboot.backend.dao.mapper")//扫描指定包下接口
@SpringBootApplication(scanBasePackages = "com.springboot.backend.controller")
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
