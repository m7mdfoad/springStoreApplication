package com.m7md.erpSystem.repos;

import com.m7md.erpSystem.models.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepo extends JpaRepository<Expenses, Long> {
}
