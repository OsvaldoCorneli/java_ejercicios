import java.util.Scanner;

public class CadenasYMetodosCadena {

    public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

        /*Módulo 4: Cadenas y métodos de cadenas
Cadenas en Java:



Crea una variable String que almacene tu nombre completo. Imprime el nombre usando print y println en diferentes líneas para observar cómo funciona cada uno.
Métodos para cadenas:*/

String nombre = "Osvaldo Corneli";

System.out.print(nombre);
System.out.println(nombre);

//observo que ya que el print esta antes del println se imprimen todo en una misma linea.

/*
Escribe un programa que almacene una cadena y luego imprima su longitud usando el método length(), y conviértela a mayúsculas con toUpperCase().
Métodos de formato:
*/

String frase = "La cantidad de letras de este mensaje es";

int tamano = frase.length();

System.out.format("%s %d" , frase.toUpperCase(), tamano);
System.out.println();



/*
Escribe un programa que pida al usuario su nombre y edad, y usa el método String.format() para mostrar un mensaje en el formato: "Hola, [nombre]. Tienes [edad] años."
Comparar cadenas:
*/

System.out.println("Ingresa tu nombre: ");
String name = teclado.nextLine();

System.out.println("Ingrese su edad: ");
int age = teclado.nextInt();
teclado.nextLine();
System.out.format("Hola, %s. Tienes %d años.", name,age);



/*
Crea un programa que compare dos cadenas introducidas por el usuario usando equals() y equalsIgnoreCase(). Muestra los resultados de la comparación.
Concatenación:
*/

System.out.println();

System.out.println("Ingresa una palabra: ");
String word1 = teclado.nextLine();

System.out.println("Ingresa otra palabra ");
String word2 = teclado.nextLine();

boolean iguales = word1.equalsIgnoreCase(word2);

System.out.println(iguales ? "las palabras son iguales" : "las palabras son distintas");



/*
Haz un programa que concatene dos cadenas dadas por el usuario y las muestre en una sola línea. Usa tanto el operador + como el método concat(). */
    
System.out.print("Ingresa una cadena: ");
String cadena1 = teclado.nextLine();

System.out.print("Ingresa otra cadena: ");

String cadena2 = teclado.nextLine();

System.out.println(cadena1.concat(" ").concat(cadena2));

System.out.println(cadena1 + " " +cadena2);

teclado.close();
}
   ;
}
