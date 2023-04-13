package com.ga;

import com.ga.constant.AdressConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@Slf4j
public class GaApplication {
    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(GaApplication.class, args);
        log.info("GameArea后端启动成功！");

        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        AdressConst.httpAdress = AdressConst.httpAdress + ip + ":" + port;
        log.info(AdressConst.httpAdress);
        log.info("\t\n----------------------------------------------------------\n\t" +
                "swagger-ui: \thttp://" + ip + ":" + port + path + "/swagger-ui/index.html\n\t" +
                "----------------------------------------------------------");
    }
}
