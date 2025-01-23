package com.yadhu.employe_management.services;

import com.yadhu.employe_management.model.Employe;
import com.yadhu.employe_management.repository.EmployeRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeService {
    @Autowired
    private EmployeRepository repository;

    public Employe postEmploye(Employe employe)
    {

         repository.save(employe);
        return employe;
    }
    public List<Employe> getEmploye()
    {
        return repository.findAll();

    }
}
