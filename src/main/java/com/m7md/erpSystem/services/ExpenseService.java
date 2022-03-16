package com.m7md.erpSystem.services;

import com.m7md.erpSystem.exceptions.ExpenseNotFoundException;
import com.m7md.erpSystem.models.Expenses;
import com.m7md.erpSystem.repos.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepo expenseRepo;

    @Autowired
    public ExpenseService(ExpenseRepo expenseRepo) {
        super();
        this.expenseRepo = expenseRepo;
    }

    public Expenses addEmployee(Expenses expenses) {
        return expenseRepo.save(expenses);
    }

    public List<Expenses> findAllExpenses() {
        return expenseRepo.findAll();
    }

    public Expenses findExpenseById(long id) {
        return expenseRepo.findById(id).orElseThrow(() -> new ExpenseNotFoundException("no expense with id number: " + id));
    }

    public Expenses updateExpense(Expenses expenses) {
        return expenseRepo.save(expenses);
    }

    public void deleteExpenseById(long id) {
        expenseRepo.deleteById(id);
    }
}
