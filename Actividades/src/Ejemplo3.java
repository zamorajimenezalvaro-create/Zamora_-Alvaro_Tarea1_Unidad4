/**
 * Clase Ejemplo3
 * Esta clase evalúa operaciones relacionaes mostrando el resultado con booleanos.
 */

public class Ejemplo3 {

    public static void main(String[] args) {

        // a.- Declara e inicializa dos variables int (a=10,  b=20).

        int a = 10, b = 20;

        // b.- Declara cuatro variables booleanas.

        boolean esMenor;
        boolean esMayor;
        boolean esIgual;
        boolean esDistinto;

        // c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales: a<b, a>b, a==b, a!=b.

        esMenor = (a < b);      // Evalúa si 10 < 20 (true)
        esMayor = (a > b);      // Evalúa si 10 > 20 (false)
        esIgual = (a == b);     // Evalúa si 10 es igual a 20 (false)
        esDistinto = (a != b); // Evalúa si 10 es diferente de 20 (true)

        // d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.

        System.out.println("Resultados de las operaciones relacionales (a = " + a + ", b = " + b + "):");
        System.out.println("a < b  : " + esMenor);
        System.out.println("a > b  : " + esMayor);
        System.out.println("a == b : " + esIgual);
        System.out.println("a != b : " + esDistinto);
    }
}