/**
 * Clase Ejemplo1
 * Esta clase contiene los distintos tipos de variables primitivas que hay en java, la declaración de constantes y objetos, y diferencia entre conversiones explícitas e implícitas.
 */

public class Ejemplo1 {

    public static void main(String[] args) {

        // a.- Declara una variable primitiva de cada uno de los tipos estudiados.
        
        // Enteros                            Espacio en memoria                   Valores que puede tomar
        byte variableByte = 1;                   // 8 bits                               -128 a 127
        short variableShort = 2;                 // 16 bits                           -32,768 a 32,767
        int variableInt = 3;                     // 32 bits                    -2,147,483,648 a 2,147,483,647
        long variableLong = 4L;                  // 64 bits        -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

        // Punto flotante
        float variableFloat = 1.23f;             // 32 bits        Decimales de precisión simple, aproximadamente 7 dígitos    
        double variableDouble = 4.567;           // 64 bits        Decimales de alta precisión, aproximadamente 15 dígitos  

        // Otros
        char variableChar = 'A';                 // 16 bits                   Guaradda un solo carácter Unicode
        boolean variableBoolean = true;          // Booleano                             True o False

        // b.- Declara una constante numérica de tipo double y otra de tipo int. Presta especial atención a la hora de poner el nombre de estas constantes.

        final double CONSTANTE_DOUBLE = 0.73;
        final int CONSTANTE_INT = 19;

        // c.- Declara un objeto String.

        String objetoString = "Hola Mundo";

        // e.- Muestra en pantalla cada una de las variables, constantes y objetos anteriores, en distintas líneas y especificando el tamaño que ocupan en memoria.
        // f.- Comenta el código explicando que hace cada línea.

        /*
         * En este bloque de código, System.out.println se utiliza para imprimir información en la pantalla.
         * Las líneas que empiezan con \n--- actúan como divisores con un salto de línea.
         * Para las variables primitivas y las constantes, cada línea muestra el valor almacenado y consulta automáticamente su tamaño exacto en memoria
         * (.BYTES para bytes y .SIZE para bits) a través de sus clases envolventes (como Byte, Integer o Double).
         * Para la variable booleana, se imprime su valor junto a una aclaración sobre su consumo de memoria en la máquina virtual de Java.
         * Finalmente, para el objeto String, la última línea muestra el texto guardado y calcula su peso aproximado multiplicando la cantidad de caracteres
         * (.length()) por 2, ya que en Java cada carácter UTF-16 ocupa 2 bytes. 
         */

        System.out.println("\n--- VARIABLES PRIMITIVAS Y SU TAMAÑO EN MEMORIA ---");
        System.out.println("byte: " + variableByte + "       | Tamaño: " + Byte.BYTES + " bytes (" + Byte.SIZE + " bits)");
        System.out.println("short: " + variableShort + "      | Tamaño: " + Short.BYTES + " bytes (" + Short.SIZE + " bits)");
        System.out.println("int: " + variableInt + "        | Tamaño: " + Integer.BYTES + " bytes (" + Integer.SIZE + " bits)");
        System.out.println("long: " + variableLong + "       | Tamaño: " + Long.BYTES + " bytes (" + Long.SIZE + " bits)");
        System.out.println("float: " + variableFloat + "   | Tamaño: " + Float.BYTES + " bytes (" + Float.SIZE + " bits)");
        System.out.println("double: " + variableDouble + " | Tamaño: " + Double.BYTES + " bytes (" + Double.SIZE + " bits)");
        System.out.println("char: " + variableChar + "       | Tamaño: " + Character.BYTES + " bytes (" + Character.SIZE + " bits)");
        System.out.println("boolean: " + variableBoolean + " | Tamaño: 1 bit (depende de la JVM, ocupa habitualmente 1 byte)");

        System.out.println("\n--- CONSTANTES Y SU TAMAÑO ---");
        System.out.println("CONSTANTE_DOUBLE: " + CONSTANTE_DOUBLE + " | Tamaño: " + Double.BYTES + " bytes (" + Double.SIZE + " bits)");
        System.out.println("CONSTANTE_INT: " + CONSTANTE_INT + "      | Tamaño: " + Integer.BYTES + " bytes (" + Integer.SIZE + " bits)");

        System.out.println("\n--- OBJETO STRING Y SU TAMAÑO ---");
        System.out.println("String: " + objetoString + " | Tamaño aproximado del contenido en caracteres/bytes: " + objetoString.length() * 2 + " bytes");

        // g.- ¿Qué diferencia hay entre las conversiones de tipo explícitas y las implícitas? Pon un ejemplo de cada una.

        System.out.println("\n--- CONVERSIONES DE TIPO ---");
        
        // Conversión Implicita (Widening Casting): Ocurre automáticamente cuando se asigna un tipo más pequeño a uno más grande.

        int enteroPequeno = 73;
        double doubleGrande = enteroPequeno; // int pasa a ser double automáticamente sin pérdida de información
        System.out.println("Conversión Implícita (int -> double): " + doubleGrande);

        // Conversión Explícita (Narrowing Casting): Debe hacerse manualmente cuando asignamos un tipo más grande a uno más pequeño.

        double valorDecimal = 0.73;
        int valorEntero = (int) valorDecimal; // (int) fuerza la conversión quitando la parte decimal
        System.out.println("Conversión Explícita (double -> int): " + valorEntero);
    }
}
