package com.github.kfcfans.oms.server;

import com.github.kfcfans.oms.server.core.akka.OhMyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 启动入口
 *
 * @author tjq
 * @since 2020/3/29
 */
@SpringBootApplication
public class OhMyApplication {

    public static void main(String[] args) {

        // 先启动 ActorSystem
        OhMyServer.init();

        // 再启动SpringBoot
        SpringApplication.run(OhMyApplication.class, args);
    }

}