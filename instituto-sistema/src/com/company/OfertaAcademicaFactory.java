package com.company;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;

    public static final String CURSO_FRONT_END = "CURSOFRONT";
    public static final String CURSO_BACK_END = "CURSOBACK";
    public static final String CURSO_FULL_STACK = "CURSOFULL";

    private OfertaAcademicaFactory() {
    }

    public static OfertaAcademicaFactory getInstance(){
        if (instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOferta(String codigo) throws OfertaAcademicaFactoryException{

        switch (codigo){
            case CURSO_FRONT_END :
                return new Curso("Front End", "Enfocado al diseño de la interfaz de una aplicacion o sitio web.",16, 2, 1000.0);
            case CURSO_BACK_END:
                return  new Curso("Back End", "Enfocado a la parte logica de un programa, es todo el trabajo que ocurre por detras, lo que no vemos.", 20, 2, 900.0);
            case CURSO_FULL_STACK:
                ProgramaIntensivo fullstack = new ProgramaIntensivo("Full Stack", "EL curso Front y Back juntos", 20.0);
                fullstack.agregarOferta(crearOferta(CURSO_FRONT_END));
                fullstack.agregarOferta(crearOferta(CURSO_BACK_END));
                return fullstack;
        }
        throw new OfertaAcademicaFactoryException("Codigo incorrecto.");
    }
}
