package com.example.hospitalmanagementsystemspringbootrestapi.service;
import java.util.List;

import com.example.hospitalmanagementsystemspringbootrestapi.model.Prescription;
import com.example.hospitalmanagementsystemspringbootrestapi.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository repository;
    public void save(Prescription Prescription) {
        repository.save(Prescription);
    }

    public List<Prescription> findByPatientName(String patientName){

        return repository.findByPatientName(patientName);
    }
}