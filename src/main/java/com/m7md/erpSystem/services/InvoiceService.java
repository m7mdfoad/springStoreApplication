package com.m7md.erpSystem.services;

import com.m7md.erpSystem.exceptions.UserNotFoundException;
import com.m7md.erpSystem.models.Invoice;
import com.m7md.erpSystem.repos.InvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.UUID;

@Service
public class InvoiceService {

    private InvoiceRepo invoiceRepo;

    @Autowired
    public InvoiceService(InvoiceRepo invoiceRepo){
        super();
        this.invoiceRepo = invoiceRepo;
    }
    public Invoice addInvoice(Invoice invoice){
        invoice.setInvoiceCode(UUID.randomUUID().toString());
        return invoiceRepo.save(invoice);
    }
    public Invoice updateInvoice(Invoice invoice){
        return invoiceRepo.save(invoice);
    }
    public List<Invoice> findAllInvoices(){
        return invoiceRepo.findAll();
    }
    public Invoice findInvoiceById(long id){
        return invoiceRepo.findInvoiceById(id).orElseThrow(()-> new UserNotFoundException("Invoice number "+id +" is not found"));
    }
    public void deleteInvoice(long invoiceId){
        invoiceRepo.deleteById(invoiceId);
    }

}
