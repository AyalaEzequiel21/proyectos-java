package com.company;

public class StateFinalizado implements StateReparacion{
    @Override
    public StateReparacion nuevaDireccion() throws StateReparacionException {
        throw new StateReparacionException("Tu articulo ya fue reparado y enviado.");
    }

    @Override
    public StateReparacion presupuestoInicial() throws StateReparacionException {
        throw new StateReparacionException("Tu articulo ya fue reparado y enviado.");
    }

    @Override
    public StateReparacion sumaRepuestos() throws StateReparacionException {
        throw new StateReparacionException("Tu articulo ya fue reparado y enviado.");
    }

    @Override
    public StateReparacion siguiente() {
        return this;
    }

    @Override
    public String toString() {
        return "Finalizado";
    }
}
