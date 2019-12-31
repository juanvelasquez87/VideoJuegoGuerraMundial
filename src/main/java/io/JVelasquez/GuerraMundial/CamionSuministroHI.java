package io.JVelasquez.GuerraMundial;

public class CamionSuministroHI extends Vehiculo implements BombardeAble, LaunchAble{
    public CamionSuministroHI(String transporte, int numPersonas, double toneladas, int numArmas, int nummuniciones){
        super(transporte, numPersonas, toneladas, numArmas, nummuniciones);
    }
}
