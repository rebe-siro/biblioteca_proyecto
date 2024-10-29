package controller;

import model.Loan;
import java.util.ArrayList;
import java.util.List;

public class LoanController {
    private List<Loan> loans = new ArrayList<>();

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public List<Loan> getAllLoans() {
        return loans;
    }
}