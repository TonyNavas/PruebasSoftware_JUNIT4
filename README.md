# PruebasSoftware_JUNIT4

Solución a los casos de la practica:

![alt-text](Capturas\1.PNG)

Para dar solucion a este ejercicio se realiza validación mediante condiciones:

Luego creamos una condicion, cuando el tipo de empleado sea igual a "VENDEDOR", luego declaramos los atributos dependiendo del tipo de empleado, en este caso el VENDEDOR su salario mensual es de 1000.

Decimos, si sus ventas son mayores a 1000 dolares, su salario total será igual a su salario mensual que son 1000 dolares + 100 dolares como compensación.

Igual hacemos el mismo procedimiento per cuando las ventas sean mayores a 1500 dolares la compensacion aumenta.

Luego declaramos las horas de trabajo "Horas_Trabajo" = "Horas_Extras", por cada hora extra se pagan 20 dolares, así que multiplicamos por 20.
![alt-text](Capturas\3.PNG)

Y hacemos lo mismo en caso de que el tipo de empleado sea "ENCARGADO".

![alt-text](Capturas\3.PNG)

Luego para calcular el salario NETO creamos un matodo:

Hacemos una condicion cuando el salario bruto sea menor que 1000 dolares a este no se le aplicara retención.

![alt-text](Capturas\4.PNG)

Hacemos otra condicion, cuando el salario bruto sea mayor que 1000 y menor que 1500 dolares, entonces se aplicara una retencion del 16%.

![alt-text](Capturas\5.PNG)

Y por ultimo cuando el salario bruto sea mayor que 1500 entonces se le aplicara una retencion del 18%.

![alt-text](Capturas\6.PNG)

# Pruebas 

Para hacer las pruebas creamos la clase de EmpleadoTest, dentro de la clase creamos un metodo llamado "pruebaEmpleado" anteponiendo un @Test para indicar que se esta realizando una prueba.

Creamos un nuevo objeto de la clase Empleado y utilizamos el metodo de ``Assert.assertEquals()`` que es el que permite determinar el estado de si pasa el estado de prueba o no.

![alt-text](Capturas\7.PNG)

Hacemos lo mismo para probar el caso que sea un empleado de tipo "ENCARGADO".

![alt-text](Capturas\8.PNG)

Igual hacemos lo mismo para probar el SalarioNeto:

![alt-text](Capturas\9.PNG)

Y ejecutamos cada uno de los metodos para comprobar que el caso pasa la prueba.

Ejecutamos la clase que contiene todos los metodos para las pruebas:

![alt-text](Capturas\10.PNG)

Y podemos ver que todos los casos si pasaron la prueba:

![alt-text](Capturas\11.PNG)



