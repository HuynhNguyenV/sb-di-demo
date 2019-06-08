package com.sun.sbdidemo;

import com.sun.sbdidemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbDiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SbDiDemoApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        controller.getHello();
    }

}
