package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

        Pizzeria pizzeria = new Pizzeria("Pizza Loca");

        pizzeria.agregarVenta("MUZZA");
        pizzeria.agregarVenta("ESPECIAL");

        pizzeria.agregarVenta("ANANA");

        pizzeria.agregarVenta("COMBI-LOCA");

        pizzeria.mostrarVentas();
    }
}
