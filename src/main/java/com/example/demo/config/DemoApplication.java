package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan({"com.example"})
public class DemoApplication {
    public static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        Environment env = SpringApplication.run(DemoApplication.class, args).getEnvironment();
        LOG.info("启动成功！");
        LOG.info("地址：\t http://192.168.10.164:{}", ((ConfigurableEnvironment) env).getProperty("server.port"));
    }

}
