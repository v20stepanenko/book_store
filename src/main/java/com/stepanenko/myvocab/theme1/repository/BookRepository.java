package com.stepanenko.myvocab.theme1.repository;

import com.stepanenko.myvocab.theme1.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();

}
