package com.example.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.domain.Book;
import com.example.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 表现层
//@RestController
@RequestMapping("/books")
public class BookController2 {
    // 业务层
    // 实体用@RequestBody，单个参数使用@PathVariable
    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll() {
//        bookService.
        return bookService.list();

    }

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return bookService.modifyBook(book);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) {
        return bookService.delete(id);
    }

    // ("{id}") 与 @PathVariable连用，拿到在url中的id
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
//        return bookService.page(id);
        return bookService.getPage(currentPage, pageSize);
    }
}
