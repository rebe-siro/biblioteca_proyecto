package model;

public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private String status;
    private String location;

    public Book(int id, String title, String author, String category, String status, String location) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status = status;
        this.location = location;
    }
    // Getters and Setters
}