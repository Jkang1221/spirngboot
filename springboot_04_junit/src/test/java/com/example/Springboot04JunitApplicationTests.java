package com.example;

import com.example.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 如果跟引导class不在同一个目录下，需要在springbootTest里面加一个classes

@SpringBootTest(classes = Springboot04JunitApplicationTests.class)
class Springboot04JunitApplicationTests {
    //1. 注入要测试的对象
    //2. 执行要测试的对象对应的方法
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.save();
    }

}
