package org.geronimo;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {
 @Test
    public void PruebaEmpleado(){
        Empleado EP = new Empleado();
        Assert.assertEquals(1360.0, EP.calcularSalarioBruto("VENDEDOR", 2000,8), 0.001);
        Assert.assertEquals(1260.0, EP.calcularSalarioBruto("VENDEDOR", 1500,3), 0.001);
        Assert.assertEquals(1360.0, EP.calcularSalarioBruto("VENDEDOR", (float) 1499.99f,0), 0.001);
    }
 @Test
    public void PruebaEncargado(){
     Empleado EPE = new Empleado();
     Assert.assertEquals(1760.0, EPE.calcularSalarioBruto("ENCARGADO", 1250,8), 0.001);
     Assert.assertEquals(1600.0, EPE.calcularSalarioBruto("ENCARGADO", 1000,0), 0.001);
     Assert.assertEquals(1560.0, EPE.calcularSalarioBruto("ENCARGADO", 999.99f,3), 0.001);
     Assert.assertEquals(1500.0, EPE.calcularSalarioBruto("ENCARGADO", 500,0), 0.001);
     Assert.assertEquals(1660.0, EPE.calcularSalarioBruto("ENCARGADO", 0,8), 0.001);
 }
@Test
    public void ProbarSalarioNeto(){
     
}

}
