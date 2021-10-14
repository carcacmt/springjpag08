/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.Service;

import com.reto2.sa.reto2g8.entity.Empleado;
import com.reto2.sa.reto2g8.repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepository repository;
    
    
    public Empleado SaveEmpleado(Empleado empleado){
        return repository.save(empleado);
    }
    public List<Empleado> getEmpleados(){
        return repository.findAll();
    }
}
