package org.simple.book.service.impl;

import org.simple.book.dao.BookMapper;
import org.simple.book.pojo.Book;
import org.simple.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public int insert(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int deleteByBookID(Integer bookID) {
        return bookMapper.deleteByBookID(bookID);
    }

    @Override
    public int updateByBookID(Book book) {
        return bookMapper.updateByBookID(book);
    }

    @Override
    public Book selectByBookID(Integer bookID) {
        return bookMapper.selectByBookID(bookID);
    }

    @Override
    public List<Book> selectAll() {
        return bookMapper.selectAll();
    }
}
