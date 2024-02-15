# JAVA Herencia Ejemplo1

## Ejemplo de herencia entre dos clases

Vamos a suponer que queremos representar empleados de una empresa, se ha definido que va a haber dos tipos: empleados que no son jefes y empleados que son jefes. 

Es un ejemplo claro en el que tenemos que representar objetos de la vida real. Para ello emplearemos las clases Jefe.java y Empleado.java. 

Como Jefe “es un” empleado, en este caso tenemos un ejemplo claro de **RELACIÓN DE HERENCIA**. Es decir la clase JEFE puede heredar de la clase EMPLEADO sus propiedades.

Observa cómo es el constructor de Jefe y el uso de super para llamar al constructor con parámetros de la clase de la que hereda. 
