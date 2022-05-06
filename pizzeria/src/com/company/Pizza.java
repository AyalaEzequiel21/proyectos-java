package com.company;

public abstract class Pizza {

    private String nombre;
    private String descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "Pizza: " + nombre + " tiene un precio de " + calcularPrecio() + " pesos.";
    }
}
