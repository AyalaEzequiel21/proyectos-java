package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Instituto instituto = new Instituto();

        instituto.agregarOferta("CURSOFRONT");
        instituto.agregarOferta("CURSOBACK");

        instituto.agregarOferta("CURSOFULL");
        instituto.generarInforme();
    }
}
