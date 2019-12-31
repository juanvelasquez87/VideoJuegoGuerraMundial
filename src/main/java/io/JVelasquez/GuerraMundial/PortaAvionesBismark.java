package io.JVelasquez.GuerraMundial;

public class PortaAvionesBismark extends Vehiculo implements RafagAble, LaunchAble{
    public PortaAvionesBismark(String transporte, int numPersonas, double toneladas, int numArmas, int nummuniciones){
        super(transporte, numPersonas, toneladas, numArmas, nummuniciones);
    }
}
