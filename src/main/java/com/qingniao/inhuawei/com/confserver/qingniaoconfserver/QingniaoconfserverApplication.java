package com.qingniao.inhuawei.com.confserver.qingniaoconfserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class QingniaoconfserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(QingniaoconfserverApplication.class, args);
    }

}
