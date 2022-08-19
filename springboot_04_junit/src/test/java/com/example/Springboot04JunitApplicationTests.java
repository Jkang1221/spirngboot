package com.example;

import com.example.dao.BookDao;
import com.example.dao.impl.BookDaoImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
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
