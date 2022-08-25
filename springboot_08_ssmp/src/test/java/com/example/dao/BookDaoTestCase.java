package com.example.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;
    @Test
    void testByid(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("testType1");
        book.setName("testName");
        book.setDescription("testDescription");
        bookDao.insert(book);
    }
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(13);
        book.setType("testType111");
        book.setName("testName111");
        book.setDescription("testDescription");
        bookDao.updateById(book);
    }
    @Test
    void  testDelete(){
        bookDao.deleteById(12);
    }
    @Test
    void testGetAll(){
        bookDao.selectList(null);
    }
    @Test
    void testGetPage(){
        IPage page = new Page(1,5);
        bookDao.selectPage(page,null);
    }
    @Test
    void  testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2() {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Book::getName,"Spring");
        bookDao.selectList(lqw);
    }

    @Test
    void testGetBy3() {
        String name = "srping";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        //方式一:
        // if(name != null) lqw.like(Book::getName,name);
        //方式二:
        lqw.like(name != null,Book::getName,name);
        bookDao.selectList(lqw);
    }
}
