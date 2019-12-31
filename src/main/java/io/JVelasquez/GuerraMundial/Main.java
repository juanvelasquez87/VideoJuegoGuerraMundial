package io.JVelasquez.GuerraMundial;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int numeroPer;
        double numtoneladas;
        BombarderoB56 lubster = new BombarderoB56("bombardero", 8, 20, 2, 60);
        CamionSuministroHI upper = new CamionSuministroHI("suministro", 4, 40, 2, 30);
        CruceroTypeAlabama titanic = new CruceroTypeAlabama("Crucero", 240, 500, 2, 120);
        JeepRecoon rubicon = new JeepRecoon("Reconocimiento", 5, 4, 4, 240);
        MotoHarley renegade = new MotoHarley("Ataque", 2, 1, 1, 60 );
        PortaAvionesBismark grandFather = new PortaAvionesBismark("Porta", 70, 1000, 20, 840);
        SpeedFighter Speedy = new SpeedFighter("AtaqueA", 2, 4, 2, 140);
        TanqueShermanM4 ruff = new TanqueShermanM4("Tanque", 4, 10, 3, 120);
        //calculo de numero de personas por ataque
        numeroPer = lubster.getNumPersonas()+upper.getNumPersonas()+titanic.getNumPersonas()+rubicon.getNumPersonas()+renegade.getNumPersonas()
        +grandFather.getNumPersonas()+Speedy.getNumPersonas()+ruff.getNumPersonas();
        System.out.println("el numero de personas que se pueden transportar en un ataque combinado son: "+numeroPer);

        //calculo capacidad de toneladas en ataque
        numtoneladas = lubster.getToneladas()+upper.getToneladas()+titanic.getToneladas()+rubicon.getToneladas()+renegade.getToneladas()
                +grandFather.getToneladas()+Speedy.getToneladas()+ruff.getToneladas();
        System.out.println("la capacidad de transportar toneladas en un ataque combinado son: "+numtoneladas);

        //ataque con los vehiculos de ametralladoras "RAFAGABLE"
        ArrayList<RafagAble> ametralladoras = new ArrayList<RafagAble>();
        ametralladoras.add(rubicon);
        ametralladoras.add(ruff);
        ametralladoras.add(Speedy);
        ametralladoras.add(grandFather);
        ametralladoras.add(titanic);
        ametralladoras.add(renegade);

        System.out.println("todos ataquen con ametralladoras: "+ametralladoras);











    }



}
