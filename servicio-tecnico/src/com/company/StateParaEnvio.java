package com.company;

public class StateParaEnvio implements StateReparacion{
    @Override
    public StateReparacion nuevaDireccion() throws StateReparacionException {
        return this;
    }

    @Override
    public StateReparacion presupuestoInicial() throws StateReparacionException {
        throw new StateReparacionException("Tu articulo ya esta reparado y listo para ser enviado");
    }

    @Override
    public StateReparacion sumaRepuestos() throws StateReparacionException {
        throw new StateReparacionException("Tu articulo ya esta reparado y listo para ser enviado");
    }

    @Override
    public StateReparacion siguiente() {
        return new StateFinalizado();
    }

    @Override
    public String toString() {
        return "Para enviar";
    }
}
