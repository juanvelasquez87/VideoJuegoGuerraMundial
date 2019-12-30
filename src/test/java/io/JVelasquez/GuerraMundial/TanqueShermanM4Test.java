package io.JVelasquez.GuerraMundial;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Before;
import org.w3c.dom.ls.LSOutput;

import static org.junit.Assert.*;

public class TanqueShermanM4Test {
    TanqueShermanM4 tanque;
    @Before
    public void setUp() throws Exception {
        tanque = new TanqueShermanM4("Tanque", 4, 10, 3, 120);

    }
}