package com.stepanenko.myvocab.theme1.service;

import com.stepanenko.myvocab.theme1.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
