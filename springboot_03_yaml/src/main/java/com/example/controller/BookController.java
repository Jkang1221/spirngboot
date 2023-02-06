package com.example.controller;

import com.example.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    //读取yaml里面的单一数据
    @Value("${country}")
    private String country1;
    @Value("${user1.name}")
    private String name1;
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById() {
        System.out.println("springboot is running");
        System.out.println("country1===>" + country1);
        System.out.println("user.name===>" + name1);
        System.out.println("env===>" + env.getProperty("city"));
        System.out.println("mydatasource" + myDataSource);
        return "springboot is running";
    }
}
