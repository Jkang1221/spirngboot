package com.example.dao;

import com.example.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from user where id = #{id}")
    public Book getById(Integer id);
//    @Select("Select * from user")

}
