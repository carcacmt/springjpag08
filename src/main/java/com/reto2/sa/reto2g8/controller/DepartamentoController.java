/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.controller;

import com.reto2.sa.reto2g8.Service.DepartamentoService;
import com.reto2.sa.reto2g8.entity.Departamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DELL
 */
@RestController
@RequestMapping("/api/Departamento/")
public class DepartamentoController {
    
    @Autowired
    private DepartamentoService service;
    
    @GetMapping("/all")
    public List<Departamento> findAllDepartamentos(){
        return service.getDepartamentoAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addDepartamento(@RequestBody Departamento departamento){
        service.saveDepartamento(departamento);
        return ResponseEntity.status(201).build();
    }
}
