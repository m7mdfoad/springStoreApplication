package com.m7md.erpSystem.repos;

import com.m7md.erpSystem.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InvoiceRepo extends JpaRepository<Invoice, Long> {
    Optional<Invoice> findInvoiceById(long id);
}
