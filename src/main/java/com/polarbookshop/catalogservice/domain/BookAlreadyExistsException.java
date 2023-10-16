package com.polarbookshop.catalogservice.domain;

/**
 * @author brandon
 * @date 16/10/2023
 */
public class BookAlreadyExistsException extends RuntimeException {

    public BookAlreadyExistsException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
