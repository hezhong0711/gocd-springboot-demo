package demo.springboot.gocd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GoCDSpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoCDSpringBootDemoApplication.class, args);
    }

}
