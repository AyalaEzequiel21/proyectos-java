package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{

    private List<Pizza> gustos;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        gustos = new ArrayList<>();
    }

    public void agregarGustos(Pizza pizza){
        gustos.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        Double precioFinal= 0.0;

        for (Pizza gusto : gustos) {
            precioFinal += gusto.calcularPrecio() ;
        }
        return precioFinal/ gustos.size();
    }
}
