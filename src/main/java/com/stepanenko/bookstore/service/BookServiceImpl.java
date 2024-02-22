package com.stepanenko.bookstore.service;

import com.stepanenko.bookstore.dto.BookDto;
import com.stepanenko.bookstore.dto.CreateBookRequestDto;
import com.stepanenko.bookstore.exception.EntityNotFoundException;
import com.stepanenko.bookstore.mapper.BookMapper;
import com.stepanenko.bookstore.model.Book;
import com.stepanenko.bookstore.repository.BookRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookDto> findAll() {
        return bookRepository.findAll().stream()
                       .map(bookMapper::bookToBookDto)
                       .collect(Collectors.toList());
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookRepository.findById(id)
                      .orElseThrow(
                            () -> new EntityNotFoundException("Book not found with id:  " + id));
        return bookMapper.bookToBookDto(book);
    }

    @Override
    public BookDto createBook(CreateBookRequestDto createBookRequestDto) {
        Book book = bookMapper.createBookRequestDtoToBook(createBookRequestDto);
        Book savedBook = bookRepository.save(book);
        return bookMapper.bookToBookDto(savedBook);
    }
}
