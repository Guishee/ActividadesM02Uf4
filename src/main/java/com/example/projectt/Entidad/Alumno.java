package com.example.projectt.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String correo;
    private String dniNumero;
    private String dniLetra;

    public Alumno() {
    }

    public Alumno(String nombre, String correo, String dniNumero, String dniLetra) {
        this.nombre = nombre;
        this.correo = correo;
        this.dniNumero = dniNumero;
        this.dniLetra=dniLetra;
    }

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDniNumero() {
        return dniNumero;
    }

    public void setDniNumero(String dni) {
        this.dniNumero = dni;
    }

    public String getDniLetra() {
        return dniLetra;
    }

    public void setDniLetra(String dniLetra) {
        this.dniLetra = dniLetra;
    }
}
