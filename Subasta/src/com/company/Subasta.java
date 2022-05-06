package com.company;

import java.util.ArrayList;
import java.util.List;

public class Subasta implements Observable{

    private Double monto;
    private String descripcion;
    private List<Observador> oferentes;

    public Subasta(Double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        oferentes = new ArrayList<>();
    }

    @Override
    public void agregar(Observador o) {
        oferentes.add(o);
    }

    @Override
    public void quitar(Observador o) {
        oferentes.remove(o);
    }


    @Override
    public void notificar(Double monto) {
        for (Observador oferente : oferentes ) {
            oferente.actualizar(monto);
        }

    }

    public Double getMonto() {
        return monto;
    }
}
