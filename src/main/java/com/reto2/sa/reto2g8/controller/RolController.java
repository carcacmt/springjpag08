/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.controller;

import com.reto2.sa.reto2g8.Service.RolService;
import com.reto2.sa.reto2g8.entity.Rol;
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
@RequestMapping("/api/Rol/")
public class RolController {
    
    @Autowired
    private RolService service;
    
    @GetMapping("/all")
    public List<Rol> findAllRol(){
        return service.rolAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity addRol(@RequestBody Rol rol){
        service.saveRol(rol);
        return ResponseEntity.status(201).build();
    }
}
