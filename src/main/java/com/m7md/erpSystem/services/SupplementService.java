package com.m7md.erpSystem.services;

import com.m7md.erpSystem.exceptions.IncomeNotFoundException;
import com.m7md.erpSystem.exceptions.SupplementNotFoundException;
import com.m7md.erpSystem.models.Supplement;
import com.m7md.erpSystem.repos.SupplementRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplementService {

    private SupplementRepo supplementRepo;

    public Supplement addSupplement(Supplement supplement) {
        return supplementRepo.save(supplement);
    }

    public List<Supplement> findAllSupplements() {
        return supplementRepo.findAll();
    }

    public Supplement findSupplementById(long id) {
        return supplementRepo.findById(id).orElseThrow(()->new SupplementNotFoundException("Supplement with id no: "+ id+ " is not found"));
    }

    public Supplement upgradeSupplement(Supplement supplement) {
        return supplementRepo.save(supplement);
    }

    public void deleteSupplement(long id) {
        supplementRepo.deleteById(id);
    }
}

