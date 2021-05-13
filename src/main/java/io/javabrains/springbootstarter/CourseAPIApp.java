package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//1.Tell spring that this is a spring app - annotate main class with m
@SpringBootApplication
public class CourseAPIApp {
    public static void main(String[] args){
        //bootstrap a spring boot application
        //creates a Servlet container + hosts application for you in method
        //starting class called SpringApplication, Method called run, takes in two args
        //two args (class with the main method,  args passed to main method)
        SpringApplication.run(CourseAPIApp.class,args);

    }
}
