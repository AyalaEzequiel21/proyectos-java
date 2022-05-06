package com.company;

public class Curso extends OfertaAcademica{

    private Integer horasMensuales;
    private Integer mesesDuracion;
    private Double valorPorHora;

    public Curso(String nombre, String descripcion, Integer horasMensuales, Integer mesesDuracion, Double valorPorHora) {
        super(nombre, descripcion);
        this.horasMensuales = horasMensuales;
        this.mesesDuracion = mesesDuracion;
        this.valorPorHora = valorPorHora;
    }



    @Override
    public Double calcularPrecio() {
        Double precioFinal = (horasMensuales * valorPorHora) * mesesDuracion;
        return precioFinal;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public Integer getMesesDuracion() {
        return mesesDuracion;
    }

}