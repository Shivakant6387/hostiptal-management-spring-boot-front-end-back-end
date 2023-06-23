package com.example.hospitalmanagementsystemspringbootrestapi.service;
import java.util.List;

import com.example.hospitalmanagementsystemspringbootrestapi.model.Invoice;
import com.example.hospitalmanagementsystemspringbootrestapi.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Invoiceservice {
    @Autowired
    private InvoiceRepository rep;


    public void save(Invoice entity) {
        rep.save(entity);
    }

    public List<Invoice> view(){
        return rep.findAll();
    }
}
