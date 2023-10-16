package com.polarbookshop.catalogservice.domain;

import java.util.Optional;

/**
 * @author brandon
 * @date 15/10/2023
 */
public interface BookRepository {

    Iterable<Book> findAll();

    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    Book save(Book book);

    void deleteByIsbn(String isbn);
}
