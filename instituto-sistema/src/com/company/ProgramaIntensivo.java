package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private List<OfertaAcademica> cursos;
    private Double bonificacion;

    public ProgramaIntensivo(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        cursos = new ArrayList<>();
    }

    public void agregarOferta(OfertaAcademica oferta){
        cursos.add(oferta);
    }

    @Override
    public Double calcularPrecio() {
        Double precioFinal = 0.0;
        for (OfertaAcademica curso : cursos) {
            precioFinal += curso.calcularPrecio();
        }
        return precioFinal - (precioFinal * bonificacion) / 100;
    }



    @Override
    public String getNombre() {
        return super.getNombre();
    }


}
