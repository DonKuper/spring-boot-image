package ru.kuper.springbootimage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.kuper.springbootimage.model.ImageObj;
import ru.kuper.springbootimage.util.UtilClass;

@SpringBootApplication
public class SpringBootImageApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootImageApplication.class, args);
//        UtilClass utilClass = (UtilClass)ctx.getBean("utilClass");


    }


}
