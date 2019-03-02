package nanoha.spring.cloud.nanohaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NanohaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NanohaEurekaServerApplication.class, args);
    }

}
