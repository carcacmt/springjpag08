/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.Service;

import com.reto2.sa.reto2g8.entity.Departamento;
import com.reto2.sa.reto2g8.repository.DepartamentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class DepartamentoService {
    @Autowired
    private DepartamentoRepository repository;
    
    public List<Departamento> getDepartamentoAll(){
        return repository.findAll();
    }
    
    public Departamento saveDepartamento(Departamento departamento){
        return repository.save(departamento);
    }    
    
}
