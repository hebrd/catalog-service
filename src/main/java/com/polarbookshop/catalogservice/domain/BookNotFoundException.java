package com.polarbookshop.catalogservice.domain;

/**
 * @author brandon
 * @date 16/10/2023
 */
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String isbn) {
        super("The book with ISBN " + isbn + " was not found.");
    }
}
