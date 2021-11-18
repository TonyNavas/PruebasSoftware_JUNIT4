# PruebasSoftware_JUNIT4

Solución a los casos de la practica:

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F1.PNG?alt=media&token=2377d9f9-8af0-4229-9bcd-175404d6a894)

Para dar solucion a este ejercicio se realiza validación mediante condiciones:

Luego creamos una condicion, cuando el tipo de empleado sea igual a "VENDEDOR", luego declaramos los atributos dependiendo del tipo de empleado, en este caso el VENDEDOR su salario mensual es de 1000.

Decimos, si sus ventas son mayores a 1000 dolares, su salario total será igual a su salario mensual que son 1000 dolares + 100 dolares como compensación.

Igual hacemos el mismo procedimiento per cuando las ventas sean mayores a 1500 dolares la compensacion aumenta.

Luego declaramos las horas de trabajo "Horas_Trabajo" = "Horas_Extras", por cada hora extra se pagan 20 dolares, así que multiplicamos por 20.
![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F2.PNG?alt=media&token=9e71900f-2588-4131-ba65-442b242c1573)

Y hacemos lo mismo en caso de que el tipo de empleado sea "ENCARGADO".

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F3.PNG?alt=media&token=dab4c673-f599-48ae-81da-b029d1ddbcec)

Luego para calcular el salario NETO creamos un matodo:

Hacemos una condicion cuando el salario bruto sea menor que 1000 dolares a este no se le aplicara retención.

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F4.PNG?alt=media&token=63b91e69-c73b-4643-a033-21b98722f5a0)

Hacemos otra condicion, cuando el salario bruto sea mayor que 1000 y menor que 1500 dolares, entonces se aplicara una retencion del 16%.

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F5.PNG?alt=media&token=63ab5344-05da-4264-8c2b-a9b8dd7c02d0)

Y por ultimo cuando el salario bruto sea mayor que 1500 entonces se le aplicara una retencion del 18%.

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F6.PNG?alt=media&token=24802fd9-1165-41f6-86b7-60c01db65ef8)

# Pruebas 

Para hacer las pruebas creamos la clase de EmpleadoTest, dentro de la clase creamos un metodo llamado "pruebaEmpleado" anteponiendo un @Test para indicar que se esta realizando una prueba.

Creamos un nuevo objeto de la clase Empleado y utilizamos el metodo de ``Assert.assertEquals()`` que es el que permite determinar el estado de si pasa el estado de prueba o no.

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F7.PNG?alt=media&token=1015fda8-1fa4-4353-8fb6-93ee650e3fa6)

Hacemos lo mismo para probar el caso que sea un empleado de tipo "ENCARGADO".

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F8.PNG?alt=media&token=7c978491-b753-4137-abb0-c22972014d54)

Igual hacemos lo mismo para probar el SalarioNeto:

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F9.PNG?alt=media&token=0b2aec36-44bb-4372-8ed9-b2197709dd05)

Y ejecutamos cada uno de los metodos para comprobar que el caso pasa la prueba.

Ejecutamos la clase que contiene todos los metodos para las pruebas:

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F10.PNG?alt=media&token=f82ba820-b4cb-4c0e-9a26-3c42a5887085)

Y podemos ver que todos los casos si pasaron la prueba:

![alt-text](https://firebasestorage.googleapis.com/v0/b/restaurant-687a2.appspot.com/o/JUNIT%2F11.PNG?alt=media&token=35ff4117-53a3-4670-a5bd-515b22af161f)



