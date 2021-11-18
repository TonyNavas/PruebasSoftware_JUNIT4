package org.geronimo;

public class Empleado {
    float calcularSalarioBruto(String tipo_Empleado, float ventas_Mes, float Horas_extras){

        if (tipo_Empleado == "VENDEDOR"){
            float SalarioMensual = 1000;
            float SalarioTotal = 0;
            float Horas_Trabajo;
            float T_vendedor;

            if (ventas_Mes >= 1000){
                SalarioTotal = SalarioMensual + 100;
            }
            if (ventas_Mes >= 1500){
                SalarioTotal = SalarioMensual + 200;
            }
            Horas_Trabajo = Horas_extras * 20;
            T_vendedor = SalarioTotal + Horas_Trabajo;
            return T_vendedor;
        }
            else if (tipo_Empleado == ("ENCARGADO")){
                float SalarioMensual = 1500;
                float SalarioTotal = 0;
                float Horas_Trabajo;
                float T_encargado;

                if (ventas_Mes < 1000){
                    Horas_Trabajo = Horas_extras * 20;
                    return SalarioMensual + Horas_Trabajo;
                }
                if (ventas_Mes >= 1000){
                    SalarioTotal = SalarioMensual + 100;
                }
                if (ventas_Mes >= 1500){
                    SalarioTotal = SalarioMensual + 200;
                }
                Horas_Trabajo = Horas_extras * 20;
                T_encargado = SalarioTotal + Horas_Trabajo;
                return T_encargado;
            }
            return 0;
    }
    public double calcularSalarioNeto(float SalarioBruto){
            if (SalarioBruto  < 1000){
                return SalarioBruto;
            }
            if (SalarioBruto >=1000 && SalarioBruto < 1500){
                return SalarioBruto - (SalarioBruto * 0.16);
            }
            if (SalarioBruto > 1500 ){
                return SalarioBruto - (SalarioBruto * 0.18);
            }
        return 0;
    }
}
