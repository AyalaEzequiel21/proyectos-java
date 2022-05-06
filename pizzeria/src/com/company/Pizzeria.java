package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private String nombre;
    private List<Pizza> pizzasVendidas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        pizzasVendidas = new ArrayList<>();
    }

    public void agregarVenta(String pizza){
        try {
            pizzasVendidas.add(PizzaFactory.getInstance().crearPizza(pizza));
        } catch (PizzaFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrarVentas(){
        for (Pizza pizza : pizzasVendidas) {
            System.out.println(pizza);
        }
    }
}
