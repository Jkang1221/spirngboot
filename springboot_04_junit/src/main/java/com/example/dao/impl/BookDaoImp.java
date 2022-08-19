package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImp implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao is running");
    }
}
