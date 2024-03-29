package com.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.domain.Book;
// MyBatisPlus
// command + f12 调出提示窗口
public interface IBookService extends IService<Book> {
    boolean saveBook(Book book);
    boolean modifyBook(Book book);
    boolean delete(Integer id);
    IPage<Book> getPage(int currentPage, int pageSize);
    IPage<Book> getPage(int currentPage, int pageSize, Book book);


}
