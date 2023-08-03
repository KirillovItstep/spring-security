package org.itstep.mapper;


import org.itstep.mapstruct.AuthorDto;
import org.itstep.mapstruct.BookDto;
import org.itstep.persistence.Author;
import org.itstep.persistence.Book;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper{
    BookDto bookToBookDto(Book book);

    List<BookDto> bookToBookDto(List<Book> book);

    AuthorDto authorToAuthorDto(Author author);

    Book bookDtoToBook(BookDto bookDto);

    Author authorDtoToAuthor(AuthorDto authorDto);
}

