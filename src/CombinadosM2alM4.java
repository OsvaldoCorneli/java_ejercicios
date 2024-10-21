import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CombinadosM2alM4 {

  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    /*
     * Ejercicios Combinados
     * Conversión de Temperatura:
     * 
     * Crea un programa que le pida al usuario una temperatura en grados Celsius y
     * la convierta a Fahrenheit utilizando la fórmula
     * 𝐹 = 𝐶×95+32F=C× 59+32. Imprime el resultado en una cadena que indique el valor convertido.
     * Calculadora de Promedio:
     */

      // System.out.print("Ingrese un numero en grados Celsius para su conversion en Fahrenheit: ");
      //  double celsius = teclado.nextDouble();

      //  double fahrenheit = (celsius * 1.8) + 32;

      //  System.out.println(celsius + " Celsius son " + fahrenheit + " fahrenheit");


    /*
     * Pide al usuario que ingrese tres calificaciones. Calcula el promedio y
     * muestra si el promedio es "Aprobado" (mayor o igual a 6)
     * o "Reprobado". Usa tanto concatenación de cadenas como el método
     * String.format().
     * 
     */

      // System.out.print("ingrese primera nota de 0 al 10: ");
      // int nota1 = teclado.nextInt();

      // System.out.print("Ingresa segunda nota de 0 al 10: ");
      // int nota2 = teclado.nextInt();

      // System.out.print("Ingrese tercera nota de 0 al 10: ");
      // int nota3 = teclado.nextInt();
      // teclado.nextLine();
      
      // int promedio = (nota1 + nota2 + nota3)/3;

      // String mensaje = "La nota final es %d";

      // String resultadoMensaje = String.format(mensaje,promedio);

      // String mensajeFinal = promedio >= 6 ? resultadoMensaje.concat(" alumno aprobado") : resultadoMensaje.concat(" alumno desaprobado");

      // System.out.println(mensajeFinal);


    /*
     * Pide al usuario que ingrese dos cadenas. Luego, concatena las cadenas y
     * muestra el resultado tanto en mayúsculas como en minúsculas.
     */


      // System.out.println("Ingresa una cadena de String: ");
      // String primerCadena = teclado.nextLine();
      // System.out.println("Ingresa segunda cadena de String: ");
      // String segundaCadena = teclado.nextLine();

      // String mensaje1 = String.format("%s %s", primerCadena, segundaCadena);

      // String mensaje2 = primerCadena.concat(" ").concat(segundaCadena);
      
      // System.out.println(mensaje1.toUpperCase());
      // System.out.println(mensaje1.toLowerCase());
      // System.out.println(mensaje2.toUpperCase());
      // System.out.println(mensaje2.toLowerCase());


    /*
     Números Positivos y Negativos.
        Solicita al usuario que ingrese tres números enteros. Utiliza operadores 
        lógicos para verificar cuántos de ellos son positivos y cuántos son negativos.
         Imprime el conteo de cada uno.
     */

      // int positivosNum = 0;
      // int negativoNum = 0;
      // int cero = 0;

      // System.out.print("Ingresa un numero: ");
      // int num1 = teclado.nextInt();
      // System.out.print("Ingresa un segundo numero: ");
      // int num2 = teclado.nextInt();
      // System.out.print("Ingresa un tercer numero: ");
      // int num3 = teclado.nextInt();
      // teclado.nextLine();
      // int casos = num1 > 0 ? positivosNum++ : num1 < 0 ? negativoNum++ : cero++;
      // casos = num2 > 0 ? positivosNum++ : num2 < 0 ? negativoNum++ : cero++;
      // casos = num3 > 0 ? positivosNum++ : num3 < 0 ? negativoNum++ : cero++;

      // System.out.printf("La cantidad de numeros positivos es de %d , de numeros negativos es de %d y numeros cero es de %s", positivosNum, negativoNum, cero);
      // System.out.println();
    /*
    * Calculadora Básica:
     * Crea un programa que le pida al usuario dos números y una operación (suma,
     * resta, multiplicación,
     * división). Realiza la operación elegida e imprime el resultado, incluyendo la
     * operación en una frase.
     * Generador de Contraseñas:
     * 
     */
      // System.out.print("Ingresa un numero: ");
      // int valor1 = teclado.nextInt();
      // System.out.print("Ingresa un segundo numero: ");
      // int valor2 = teclado.nextInt();
      // teclado.nextLine();
      // System.out.println("ingrese una operacion: 'suma' , 'resta' , 'multiplicacion' o 'division': ");
      // String operacion = teclado.nextLine();
       
      // int resultado1 = operacion.equalsIgnoreCase("suma") ? valor1 + valor2 : operacion.equalsIgnoreCase("resta") ? valor1 - valor2 : 
      // operacion.equalsIgnoreCase("multiplicacion") ? valor1 * valor2 : operacion.equalsIgnoreCase("division") ? valor1 / valor2 : 0;

      // String resultadoFinal1 = resultado1 != 0 ? String.format("el resultado de la %s es igual a %d", operacion,resultado1 ) : "La operacion no es valida"; 


      // System.out.println(resultadoFinal1);

      // teclado.close();

    /*
     * Solicita al usuario que ingrese una palabra clave y una longitud deseada para
     * la contraseña.
     * Genera una contraseña aleatoria que contenga la palabra clave y complete
     * el resto con caracteres aleatorios hasta alcanzar la longitud especificada.
     * Palabras Palíndromas:
     */
  ;



    /*
     * Pide al usuario que ingrese una palabra y verifica si es un palíndromo
     * (se lee igual de izquierda a derecha que de derecha a izquierda).
     * Imprime el resultado indicando si es o no un palíndromo.
     * Menú Interactivo:
     */

    /*
     * Crea un programa que muestre un menú con opciones
     * (por ejemplo, calcular el área de un círculo, convertir temperaturas, contar
     * vocales, etc.).
     * El usuario selecciona una opción y el programa ejecuta la función
     * correspondiente.
     * Asegúrate de manejar errores, como ingresar opciones no válidas.
     */

  }

}
