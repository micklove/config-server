package mlo55;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration
@SpringBootApplication
public class EchoServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EchoServerApplication.class, args);
    }
}
