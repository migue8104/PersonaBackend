package com.example.persona.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Pais")

public class Pais implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "nombre")
    private String nombre;

    public Pais(String nombre) {
        super();
        this.nombre = nombre;
    }

    public Pais() {

    }

    public long getId() {
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
}
