package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {
    @Override
    public boolean saveBook(Book book) {
        return false;
    }

    @Override
    public boolean modifyBook(Book book) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
