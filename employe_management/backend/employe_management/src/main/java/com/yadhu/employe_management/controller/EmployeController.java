package com.yadhu.employe_management.controller;


import com.yadhu.employe_management.model.Employe;
import com.yadhu.employe_management.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Api")
public class EmployeController {
 @Autowired
    private EmployeService service;

@PostMapping("/post")
 public Employe postEmploye(@RequestBody Employe employe)
 {
     return service.postEmploye(employe);
 }
    @GetMapping("/getAllEmployees")
 public List<Employe> getAllEmploye(){
    return service.getEmploye();
 }



}
