package io.JVelasquez.GuerraMundial;

public class Vehiculo {
    private String tipoVehiculo;
    private int numPersonas;
    private double toneladas;
    private int numArmas;
    private int nummuniciones;

    public Vehiculo(String transporte, int numPersonas, double toneladas, int numArmas, int nummuniciones){
        this.tipoVehiculo = transporte;
        this.numPersonas = numPersonas;
        this.toneladas = toneladas;
        this.numArmas = numArmas;
        this.nummuniciones = nummuniciones;
    }

    public String getTransporte() {
        return tipoVehiculo;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public double getToneladas() {
        return toneladas;
    }

    public int getNumArmas() {
        return numArmas;
    }

    public int getNummuniciones() {
        return nummuniciones;
    }
}
