package com.stepanenko.bookstore.service;

import com.stepanenko.bookstore.dto.BookDto;
import com.stepanenko.bookstore.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    List<BookDto> findAll();

    BookDto findById(Long id);

    BookDto createBook(CreateBookRequestDto bookDto);
}
