package com.company;

public class StateEnReparacion implements StateReparacion{
    @Override
    public StateReparacion nuevaDireccion() throws StateReparacionException{
        throw new StateReparacionException("No puedes cambiar la direccion de tu pedido en esta seccion.");
    }
    @Override
    public StateReparacion presupuestoInicial() throws StateReparacionException {
        throw new StateReparacionException("Ya tienes el presupuesto inicial");
    }

    @Override
    public StateReparacion sumaRepuestos(){
        return this;
    }

    @Override
    public StateReparacion siguiente() {
        return new StateParaEnvio();
    }

    @Override
    public String toString() {
        return "Reparacion";
    }
}
