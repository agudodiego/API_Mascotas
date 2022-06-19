package com.agudodiego.demoApi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String apodo;
    private String fechaNac;
    private String especie;
    private String raza;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String apodo, String fechaNac, String especie, String raza) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
        this.fechaNac = fechaNac;
        this.especie = especie;
        this.raza = raza;
    }
}
