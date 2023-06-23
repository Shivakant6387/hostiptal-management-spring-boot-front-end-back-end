package com.example.hospitalmanagementsystemspringbootrestapi.repository;

import com.example.hospitalmanagementsystemspringbootrestapi.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription,String> {
    List<Prescription> findByPatientName(String patientName);
}

