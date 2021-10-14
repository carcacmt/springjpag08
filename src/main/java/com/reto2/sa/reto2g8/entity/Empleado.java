/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto2.sa.reto2g8.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DELL
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    private int id_emp;
    private String nombre;
    private String state="created";
    @ManyToOne
    @JoinColumn(name="cargo_id_cargo")
    @JsonIgnoreProperties("empleados")
    private Cargo cargo;
    @ManyToOne
    @JoinColumn(name="rol_id_rol")
    @JsonIgnoreProperties("empleados")
    private Rol rol;
        
}
