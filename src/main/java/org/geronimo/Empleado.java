package org.geronimo;

public class Empleado {
    float calcularSalarioBruto(String tipo_Empleado, float ventas_Mes, float Horas_extras){

        if (tipo_Empleado == "vendedor"){
            float SalarioMensual = 1000;
            float SalarioTotal = 0;
            float Horas_Trabajo;
            float T_vendedor;

            if (ventas_Mes >= 1000){
                SalarioTotal = SalarioMensual + 100;
            if (ventas_Mes >= 1500){
                SalarioTotal = SalarioMensual + 200;
            }
            Horas_Trabajo = Horas_extras * 20;
            T_vendedor = SalarioTotal + Horas_Trabajo;
            return T_vendedor;
            }
        }
    }
}
