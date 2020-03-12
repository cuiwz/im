package com.cuiwz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 扫描mybatis mapper包路径
@MapperScan(basePackages = "com.cuiwz.mapper")
public class IMApplication {
    public static void main(String[] args) {
        SpringApplication.run(IMApplication.class, args);
    }
}
