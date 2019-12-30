package io.JVelasquez.GuerraMundial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehiculoTest {
    Vehiculo veic;
    @Before
    public void setUp() throws Exception {
        veic = new Vehiculo("bombardero", 8, 20, 2, 60);
    }

    @Test
    public void getTransporte() {
        Assert.assertEquals("el trans no es el esperado ", "bombardero", veic.getTransporte());
    }

    @Test
    public void getNumPersonas() {
        Assert.assertEquals("el numero no es el esperado ", 8, veic.getNumPersonas());
    }

    @Test
    public void getToneladas() {
        Assert.assertEquals("el tonelaje no es ", 20, veic.getToneladas(), 0);

    }

    @Test
    public void getNumArmas() {
        Assert.assertEquals("el numero de armas no es igual ", 2, veic.getNumArmas());
    }

    @Test
    public void getNummuniciones() {
        Assert.assertEquals("las municiones no son igual ", 60, veic.getNummuniciones());
    }
}