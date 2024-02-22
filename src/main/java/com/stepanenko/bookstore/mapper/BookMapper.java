package com.stepanenko.bookstore.mapper;

import com.stepanenko.bookstore.dto.BookDto;
import com.stepanenko.bookstore.dto.CreateBookRequestDto;
import com.stepanenko.bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDto bookToBookDto(Book book);

    Book createBookRequestDtoToBook(CreateBookRequestDto dto);
}
