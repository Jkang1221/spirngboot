package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;
// command + f12
public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);
    boolean modifyBook(Book book);
    boolean delete(Integer id);

    IPage<Book> getPage(int currentPage,int pageSize);
}
