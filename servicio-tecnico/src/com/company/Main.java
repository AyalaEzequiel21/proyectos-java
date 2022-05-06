package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Reparacion reparacion = new Reparacion("Batidora", "Av mitre 1234");
        reparacion.agregarValorPresupuesto(100.0);
        reparacion.siguiente();
        reparacion.agregarRepuestos(50.0);
        reparacion.siguiente();
        reparacion.cambiarDireccion("Alem 321");
        reparacion.siguiente();
    }
}
