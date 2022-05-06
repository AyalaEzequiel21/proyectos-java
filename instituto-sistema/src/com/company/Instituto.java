package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOferta(String codigo){
        try {
            ofertasAcademicas.add(OfertaAcademicaFactory.getInstance().crearOferta(codigo));
        } catch (OfertaAcademicaFactoryException e) {
            e.printStackTrace();
        }
    }

    public void generarInforme(){
        for (OfertaAcademica ofertasAcademica : ofertasAcademicas) {
            System.out.println(ofertasAcademica);
        }
    }
}
