package com.java.apirest.apirest.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Esta anotación indica que la clase es una entidad de la base de datos.
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Esta anotación indica que el campo se autoincrementa.
    private Long id;
    private String nombre;
    private String descripción;
    private Double precio;







    //^ Getters y Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripción() {
        return descripción;
    }
    public void setDescripción(String descripcion) {
        this.descripción = descripcion;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
}
