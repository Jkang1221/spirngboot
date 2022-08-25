package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface BookDao extends BaseMapper<Book> {
    //非mp方法
    //@Select("select * from tbl_book where id = #{id}")
    //Book getById(Integer id);

}
