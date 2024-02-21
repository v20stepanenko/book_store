package com.stepanenko.myvocab.theme1.service.impl;

import com.stepanenko.myvocab.theme1.model.Book;
import com.stepanenko.myvocab.theme1.repository.BookRepository;
import com.stepanenko.myvocab.theme1.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
