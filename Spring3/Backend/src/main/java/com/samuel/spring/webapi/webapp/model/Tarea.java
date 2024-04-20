package com.samuel.spring.webapi.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String descripcion;
    private String diaSemana;
    // Otros atributos y getters/setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDiaSemana() {
        return diaSemana;
    }
    
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
    // Otros getters y setters
}
