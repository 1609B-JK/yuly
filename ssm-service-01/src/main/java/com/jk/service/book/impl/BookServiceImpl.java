package com.jk.service.book.impl;

import com.jk.entity.book.Book;
import com.jk.mapper.book.BookMapper;
import com.jk.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2017/5/16.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public void insertBookInfo(Book book) {
        bookMapper.insertBookInfo(book);
    }
}
