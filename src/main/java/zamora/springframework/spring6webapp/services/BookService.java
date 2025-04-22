package zamora.springframework.spring6webapp.services;

import zamora.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
