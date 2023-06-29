package com.example.demo;

import com.example.demo.java8mcq.A;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.stream.Collectors;


@SpringBootApplication
public class Demo  {
     public static void main(String args[]) {


        ConfigurableApplicationContext applicationContext1 =  SpringApplication.run(Demo.class,args);


        RestTemplate restTemplate1 = (RestTemplate) applicationContext1.getBean("bean1");
        // RestTemplate restTemplate2 = (RestTemplate) applicationContext1.getBean("bean2");
       //  System.out.println(restTemplate2);

        //ConfigurableApplicationContext applicationContext2 = SpringApplication.run(Demo.class,args);

        System.out.println(restTemplate1);




      // System.out.println(s.get());






    }




}
