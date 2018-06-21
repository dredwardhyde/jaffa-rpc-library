package com.test;

import com.transport.lib.zeromq.TransportConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import java.net.UnknownHostException;

@Configuration
@ComponentScan({"com.test"})
@EnableAutoConfiguration
@Import(TransportConfig.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
