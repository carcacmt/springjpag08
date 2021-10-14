/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.Service;

import com.reto2.sa.reto2g8.entity.Cargo;
import com.reto2.sa.reto2g8.repository.CargoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class CargoService {
    @Autowired
    private CargoRepository repository;
    
    public List<Cargo> getCargoAll(){
        return repository.findAll(); 
    }
    
    public Cargo saveCargo(Cargo cargo){
        return repository.save(cargo);
    }
    
}
