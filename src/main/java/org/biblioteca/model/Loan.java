package model;

import java.util.Date;

public class Loan {
    private int id;
    private int userId;
    private int bookId;
    private Date loanDate;
    private Date returnDate;
    private String status;

    public Loan(int id, int userId, int bookId, Date loanDate, Date returnDate, String status) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    // Getters and Setters
}