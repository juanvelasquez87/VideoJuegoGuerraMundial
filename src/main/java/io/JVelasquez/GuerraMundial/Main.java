package io.JVelasquez.GuerraMundial;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int numeroPer;
        BombarderoB56 lubster = new BombarderoB56("bombardero", 8, 20, 2, 60);
        CamionSuministroHI upper = new CamionSuministroHI("suministro", 4, 40, 2, 30);
        CruceroTypeAlabama titanic = new CruceroTypeAlabama("Crucero", 240, 500, 2, 120);
        JeepRecoon rubicon = new JeepRecoon("Reconocimiento", 5, 4, 4, 240);
        MotoHarley renegade = new MotoHarley("Ataque", 2, 1, 1, 60 );
        PortaAvionesBismark grandFather = new PortaAvionesBismark("Porta", 70, 1000, 20, 840);
        SpeedFighter Speedy = new SpeedFighter("AtaqueA", 2, 4, 2, 140);
        TanqueShermanM4 ruff = new TanqueShermanM4("Tanque", 4, 10, 3, 120);
        numeroPer = lubster.getNumPersonas()+upper.getNumPersonas()+titanic.getNumPersonas()+rubicon.getNumPersonas()+renegade.getNumPersonas()
        +grandFather.getNumPersonas()+Speedy.getNumPersonas()+ruff.getNumPersonas();
        System.out.println("el numero de personas que se pueden transportar en un ataque combinado son: "+numeroPer);










    }



}
