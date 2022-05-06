package com.company;

public class Oferente implements Observador{

    private String nombre;
    private String apellido;
    private String dni;
    private Double montoTope;

    public Oferente(String nombre, String apellido, String dni, Double montoTope) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.montoTope = montoTope;
    }

    @Override
    public void actualizar(Double monto) {
        if (montoTope > monto){
            accionar();
        }
    }

    public void accionar(){
        System.out.println(getNombre() +" " + getApellido() + " esta dispuesto a pagar: " + getMontoTope());
    }

    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getDni() {
        return dni;
    }


    public Double getMontoTope() {
        return montoTope;
    }

}
