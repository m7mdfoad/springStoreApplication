package com.m7md.erpSystem.repos;

import com.m7md.erpSystem.models.Expenses;
import com.m7md.erpSystem.models.Supplement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplementRepo extends JpaRepository<Supplement, Long> {
}
