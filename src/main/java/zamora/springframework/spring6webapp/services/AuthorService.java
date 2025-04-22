package zamora.springframework.spring6webapp.services;

import zamora.springframework.spring6webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}

