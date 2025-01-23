package com.yadhu.employe_management.services;

import com.yadhu.employe_management.model.Employe;
import com.yadhu.employe_management.repository.EmployeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeService {
    private final EmployeRepository repository;

    public Employe postEmploye(Employe employe)
    {
        return repository.save(employe);
    }
}
