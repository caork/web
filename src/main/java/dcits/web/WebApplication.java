package dcits.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

    //relevant packages testing
    public static void checking(){
        Testing checking = new Testing();
        checking.testing();
    }

    public static void main(String[] args) {
        checking();
        SpringApplication.run(WebApplication.class, args);
    }

}
