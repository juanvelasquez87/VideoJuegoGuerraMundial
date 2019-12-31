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

        BombarderoB56 big = new BombarderoB56("bombardero", 8, 20, 2, 60);
        BombarderoB56 bigger = new BombarderoB56("bombardero", 8, 20, 2, 60);
        JeepRecoon tracker = new JeepRecoon("Reconocimiento", 5, 4, 4, 240);
        JeepRecoon wrangler = new JeepRecoon("Reconocimiento", 5, 4, 4, 240);
        TanqueShermanM4 tank = new TanqueShermanM4("Tanque", 4, 10, 3, 120);
        TanqueShermanM4 machine = new TanqueShermanM4("Tanque", 4, 10, 3, 120);
        MotoHarley rusty = new MotoHarley("Ataque", 2, 1, 1, 60 );
        MotoHarley roadbike = new MotoHarley("Ataque", 2, 1, 1, 60 );
        SpeedFighter silver = new SpeedFighter("AtaqueA", 2, 4, 2, 140);
        CruceroTypeAlabama caribean = new CruceroTypeAlabama("Crucero", 240, 500, 2, 120);
        PortaAvionesBismark hercules = new PortaAvionesBismark("Porta", 70, 1000, 20, 840);
        PortaAvionesBismark zeus = new PortaAvionesBismark("Porta", 70, 1000, 20, 840);
        ArrayList<RafagAble> ametralladoras = new ArrayList<RafagAble>();
        ametralladoras.add(rubicon);
        ametralladoras.add(ruff);
        ametralladoras.add(Speedy);
        ametralladoras.add(grandFather);
        ametralladoras.add(titanic);
        ametralladoras.add(big);
        ametralladoras.add(bigger);
        ametralladoras.add(tracker);
        ametralladoras.add(wrangler);
        ametralladoras.add(machine);
        ametralladoras.add(roadbike);
        ametralladoras.add(silver);
        ametralladoras.add(caribean);
        ametralladoras.add(zeus);
        ametralladoras.add(hercules);
        ametralladoras.add(tank);
        ametralladoras.add(rusty);
        System.out.println("todos ataquen con ametralladoras: ");

        //ataque con bombarderos
        BombarderoB56 bigboy = new BombarderoB56("bombardero", 8, 20, 2, 60);
        BombarderoB56 jacker = new BombarderoB56("bombardero", 8, 20, 2, 60);
        CamionSuministroHI truck = new CamionSuministroHI("Reconocimiento", 5, 4, 4, 240);
        CamionSuministroHI trucker = new CamionSuministroHI("Reconocimiento", 5, 4, 4, 240);
        TanqueShermanM4 machinegun = new TanqueShermanM4("Tanque", 4, 10, 3, 120);
        TanqueShermanM4 machinehero = new TanqueShermanM4("Tanque", 4, 10, 3, 120);


        ArrayList<BombardeAble> bombarderos = new ArrayList<BombardeAble>();
        bombarderos.add(bigboy);
        bombarderos.add(jacker);
        bombarderos.add(truck);
        bombarderos.add(trucker);
        bombarderos.add(machinegun);
        bombarderos.add(machinehero);

        System.out.println("todos bombardean");

        //ataque con lazer
        MotoHarley ren = new MotoHarley("Ataque", 2, 1, 1, 60 );
        MotoHarley renzo = new MotoHarley("Ataque", 2, 1, 1, 60 );
        CruceroTypeAlabama buster = new CruceroTypeAlabama("Crucero", 240, 500, 2, 120);
        CruceroTypeAlabama busterix = new CruceroTypeAlabama("Crucero", 240, 500, 2, 120);

        ArrayList<LazerAble> lazer = new ArrayList<LazerAble>();
        lazer.add(ren);
        lazer.add(renzo);
        lazer.add(buster);
        lazer.add(busterix);

        System.out.println("todos lanzan lazers");















    }



}
