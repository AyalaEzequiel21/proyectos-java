package com.company;

public interface StateReparacion {

    public StateReparacion nuevaDireccion() throws StateReparacionException;
    public StateReparacion presupuestoInicial() throws StateReparacionException;
    public StateReparacion sumaRepuestos() throws StateReparacionException;
    public StateReparacion siguiente();
}
