package controller;

import model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookController {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}