## TRABAJO PRACTICO 7

### Funcionalidad

Este proyecto esta contruido en java y sirve para gestionar una o varias de compras que hacen una o varias personas, 
tiene implementada la serializacion para contruir un archivo 'compras.dat' y una clase  capaz de leer ese fichero y mostrar la 
lista de las compras realizadas.

### Compuesto por..

El proyecto esta compuesto por 5 clases cada una con una funcion diferente:

Person.java --> Clase que sirve para crear objetos Person con las diferentes características que pueda tener una persona.

Producto.java --> Clase que sirve para crear objetos Producto con las diferentes características que pueda tener un producto.

Compra.java --> Contiene los datos de los productos y personas, implementada para serializar.

Demo1.java --> Es la clase encargada de gestionar las compras, aquí se da uso a las anteriores clases ya que es la que vamos a ejecutar para hacer las compras introduciendo
los datos mediante teclado. En ella se crea el archivo 'compras.dat' en el que se guardan los datos de las compras realizadas.

CompraReadSerial.java --> Su uso esta basado en ser capaz de leer el 'compras.dat' para así mostrar la lista de compras.



### Como ejecutar

Para ejecutar hay que seguir los siguientes comandos:

1.javac Demo1.java

2.java Demo1 

3.javac CompraReadSerial.java

4.java CompraReadSerial
