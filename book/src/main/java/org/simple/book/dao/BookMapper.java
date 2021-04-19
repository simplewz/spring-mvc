package org.simple.book.dao;

import org.simple.book.pojo.Book;

import java.util.List;

public interface BookMapper {

    public int insert(Book book);

    public int deleteByBookID(Integer bookID);

    public int updateByBookID(Book book);

    public Book selectByBookID(Integer bookID);

    public List<Book> selectAll();

}
