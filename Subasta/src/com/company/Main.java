package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Subasta camisetaDelDiego = new Subasta(20000.0, "Camiseta usada por diego en la final del mundial de Mexico 1986");

        Oferente of1 = new Oferente("pepe", "loco", "23.454.678", 120000.0);
        Oferente of2 = new Oferente("leo", "messi", "10.454.678", 25000.0);
        Oferente of3 = new Oferente("kun", "aguero", "16.454.678", 23000.0);
        Oferente of4 = new Oferente("juan", "veron", "18.454.678", 15000.0);

        camisetaDelDiego.agregar(of1);
        camisetaDelDiego.agregar(of2);
        camisetaDelDiego.agregar(of3);
        camisetaDelDiego.agregar(of4);

        camisetaDelDiego.notificar(camisetaDelDiego.getMonto());
    }
}
