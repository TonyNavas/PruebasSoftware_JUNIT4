package org.geronimo;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {
 @Test
    public void PruebaEmpleado(){
        Empleado EP = new Empleado();
        Assert.assertEquals(1360.0, EP.calcularSalarioBruto("VENDEDOR", 2000,8), 0.001);
        Assert.assertEquals(1260.0, EP.calcularSalarioBruto("VENDEDOR", 1500,3), 0.001);
    }
}
