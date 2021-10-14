/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.Service;

import com.reto2.sa.reto2g8.entity.Rol;
import com.reto2.sa.reto2g8.repository.RolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class RolService {
    
    @Autowired
    private RolRepository repository;
    
    public Rol saveRol(Rol rol){
      return repository.save(rol);
    }
    
    public List<Rol> rolAll(){
        return repository.findAll();
    }
}
