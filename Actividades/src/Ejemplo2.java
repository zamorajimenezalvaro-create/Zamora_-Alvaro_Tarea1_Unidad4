/**
 * Clase Ejemplo2
 * Esta clase gira entorno al uso de variables, mostrando de forma simple como declararlas, mostrarlas e intercambiarlas haciendo uso de variables auxiliares.
 */

public class Ejemplo2 {

    public static void main(String[] args) {

        //a.- Declara e inicializa tres variables int en la misma instrucción (a=1, b=2, c=3).

        int a = 1, b = 2, c = 3;

        // b.- Declara e inicializa tres variables double en la misma instrucción (d=4.5, e=5.7, f=6.9).

        double d = 4.5, e = 5.7, f = 6.9;

        // c.- Muestra las variables en dos líneas, la primera línea mostrará las variables tipo entero y la segunda línea mostrará las variables tipo double.

        System.out.println("Variables tipo entero: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Variables tipo double: d = " + d + ", e = " + e + ", f = " + f);

        // d.- Realiza los siguiente intercambios de valores: en b guarda c, en c guarda a, en a guarda b. Muestra por pantalla el resultado.

        // Usamos una variable auxiliar para no perder el valor inicial de b
        int auxInt = b;
        b = c; // b toma el valor de c (3)
        c = a; // c toma el valor de a (1)
        a = auxInt; // a toma el valor original de b (2)

        System.out.println("\nResultado tras intercambio de enteros (a<-b, b<-c, c<-a):");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // e.- Realiza los siguientes intercambios de valores: en e guarda f, en f guarda d, en d guarda e. Muestra por pantalla el resultado.
        
        // Usamos una variable auxiliar para no perder el valor inicial de e
        double auxDouble = e;
        e = f; // e toma el valor de f (6.9)
        f = d; // f toma el valor de d (4.5)
        d = auxDouble; // d toma el valor original de e (5.7)

        System.out.println("\nResultado tras intercambio de doubles (d<-e, e<-f, f<-d):");
        System.out.println("d = " + d + ", e = " + e + ", f = " + f);
    }
}