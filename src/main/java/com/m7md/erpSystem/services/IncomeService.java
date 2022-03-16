package com.m7md.erpSystem.services;

import com.m7md.erpSystem.exceptions.IncomeNotFoundException;
import com.m7md.erpSystem.models.Income;
import com.m7md.erpSystem.repos.IncomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

    private IncomeRepo incomeRepo;

    @Autowired
    public IncomeService(IncomeRepo incomeRepo) {
        super();
        this.incomeRepo = incomeRepo;
    }

    public Income addIncome(Income income) {
        return incomeRepo.save(income);
    }

    public List<Income> findAllIncome() {
        return incomeRepo.findAll();
    }

    public Income findIncomeById(long id) {
        return incomeRepo.findById(id).orElseThrow(() -> new IncomeNotFoundException("Income with id no: " + id + " is not found"));
    }

    public Income upgradeIncome(Income income) {
        return incomeRepo.save(income);
    }

    public void deleteIncomeById(long id) {
        incomeRepo.deleteById(id);
    }
}

