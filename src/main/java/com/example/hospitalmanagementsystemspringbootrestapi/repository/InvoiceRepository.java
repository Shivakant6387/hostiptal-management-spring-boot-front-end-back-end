package com.example.hospitalmanagementsystemspringbootrestapi.repository;

import com.example.hospitalmanagementsystemspringbootrestapi.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
