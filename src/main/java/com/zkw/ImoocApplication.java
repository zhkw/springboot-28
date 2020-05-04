package com.zkw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImoocApplication {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return builder.sources(ImoocApplication.class);
//    }

    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication.run(ImoocApplication.class,args);

    }
}
