package com.company;

public class Reparacion{

    private String nombreArticulo;
    private StateReparacion estadoActual;
    private Double valorDePresupuesto;
    private String direccionEntrega;

    public Reparacion(String nombreArticulo, String direccionEntrega) {
        this.nombreArticulo = nombreArticulo;
        this.estadoActual = new StatePresupuesto();
        this.valorDePresupuesto = 0.0;
        this.direccionEntrega = direccionEntrega;
    }

    public void cambiarDireccion(String direccionNueva){
        direccionEntrega = direccionNueva;
        try {
            estadoActual = estadoActual.nuevaDireccion();
        } catch (StateReparacionException e) {
            e.printStackTrace();
        }
    }

    public Double agregarValorPresupuesto(Double valorBasico){
        try {
            estadoActual = estadoActual.presupuestoInicial();
        } catch (StateReparacionException e) {
            e.printStackTrace();
        }
        valorDePresupuesto += valorBasico;
        return valorDePresupuesto;
    }

    public Double agregarRepuestos(Double valorRepuesto){
        valorDePresupuesto += valorRepuesto;
        try {
            estadoActual =estadoActual.sumaRepuestos();
        } catch (StateReparacionException e) {
            e.printStackTrace();
        }
        return valorDePresupuesto;
    }

    public void siguiente(){
        estadoActual = estadoActual.siguiente();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String mensaje ="Tu articulo " + nombreArticulo + " esta en: " + estadoActual
                + ", su presupuesto es de: " + valorDePresupuesto
                + " y su direccion de envio es: " + direccionEntrega + ".";

        return mensaje;
    }
}
