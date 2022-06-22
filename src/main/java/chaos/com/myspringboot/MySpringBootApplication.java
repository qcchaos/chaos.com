package chaos.com.myspringboot;

import chaos.com.myspringboot.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.time.Period;

@SpringBootApplication
public class MySpringBootApplication {

    Person person = new Person();

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }

}
