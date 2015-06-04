package mlo55;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
@EnableConfigServer
public class ConfigurationServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigurationServerApplication.class, args);
    }
}
