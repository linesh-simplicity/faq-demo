package com.thoughtworks.faq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FAQApplicationRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FAQApplicationRunner.class, args);
    }
}