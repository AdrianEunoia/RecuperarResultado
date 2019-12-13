package com.adrian.recuperarresultado.Util;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int telefono;
    private boolean carnet;

    // Constructor
    public Persona(String nombre, int telefono, boolean carnet) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.carnet = carnet;
    }
    // Getters // Setters
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public boolean isCarnet() {
        return carnet;
    }
}
