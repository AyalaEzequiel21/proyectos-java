package com.company;

public class StatePresupuesto implements StateReparacion{

    @Override
    public StateReparacion nuevaDireccion() throws StateReparacionException{
        throw new StateReparacionException("No puedes cambiar la direccion de tu pedido en esta seccion.");
    }

    @Override
    public StateReparacion presupuestoInicial() {
        return this;
    }

    @Override
    public StateReparacion sumaRepuestos() throws StateReparacionException{
        throw new StateReparacionException("Aun no puedes agregar los respuestos.");
    }

    @Override
    public StateReparacion siguiente() {
        return new StateEnReparacion();
    }

    @Override
    public String toString() {
        return "Presupuesto";
    }
}
