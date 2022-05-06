package com.company;

public class PizzaFactory {

    private static PizzaFactory instance;

    public static final String MUZZARELLA = "MUZZA";
    public static final String MUZZARELLA_GRANDE = "MUZZA-GRANDE";
    public static final String ESPECIAL = "ESPECIAL";
    public static final String ESPECIAL_GRANDE = "ESPECIAL-GRANDE";
    public static final String ANANA = "ANANA";
    public static final String ANANA_GRANDE = "ANANA-GRANDE";
    public static final String COMBINADA_LOCA = "COMBI-LOCA";





    public PizzaFactory() {
    }

    public static PizzaFactory getInstance(){
        if (instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String nombre) throws PizzaFactoryException{

        switch (nombre){
            case MUZZARELLA :
                return new PizzaSimple("Muzzarella", "Terrible pizza de muzza.", 700.0, false);
            case MUZZARELLA_GRANDE:
                return new PizzaSimple("Muzzarella", "Terrible pizza de muzza.", 700.0, true);
            case ESPECIAL:
                return new PizzaSimple("Especial", "La mejor pizza especial.", 850.0, false);
            case ESPECIAL_GRANDE:
                return new PizzaSimple("Especial", "La mejor pizza especial", 850.0, true);
            case ANANA:
                return new PizzaSimple("Anana", "Para los raros una buena pizza con anana", 950.0, false);
            case ANANA_GRANDE:
                return new PizzaSimple("Anana", "Para los raros una buena pizza con anana", 950.0, true);
            case COMBINADA_LOCA:
                PizzaCombinada combinadaLoca = new PizzaCombinada("Combinada Loca", "Mitad especial y mitad anana.");
                combinadaLoca.agregarGustos(crearPizza(ESPECIAL));
                combinadaLoca.agregarGustos(crearPizza(ANANA));
                return combinadaLoca;


        }
        throw new PizzaFactoryException("Codigo incorrecto.");
    }

}
