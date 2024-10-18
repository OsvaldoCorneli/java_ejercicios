import java.util.Scanner;
public class Operadores {

    public static void main(String[] args) {

        /*Módulo 3: Operadores
        Operadores aritméticos:

        Crea un programa que solicite al usuario dos números enteros y realice las operaciones
        básicas (suma, resta, multiplicación, división y módulo). Imprime los resultados de cada operación.
        Casting:
        */
        
        int numero1;
        int numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("ingresa el primer numero: ");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("el resultado de "+ numero1 + " + " + numero2 + " es igual a " + resultado);


        /*
        Crea un programa que almacene un valor 
        decimal en una variable double y lo convierta a int mediante casting. 
        Imprime ambos valores para observar la diferencia.
        Operadores relacionales:
        */
        
        double valor = 12.85;
        int valor2 = (int) valor;
        
        System.out.println("Double: "+ valor + " y el casting es: "+valor2);

        // lo que veo en las dos impresion es que el casting devuelve el valor entero y elimina el decimal.. 

        /*
        Escribe un programa que pida al usuario su edad y compare si es mayor de edad (18 años o más). 
        Usa operadores relacionales para imprimir un mensaje adecuado.
        Operadores lógicos:
        */

        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        boolean esMayor = edad >= 18;
        
        System.out.println("El usuario es mayor de edad? "+ esMayor);
       


        
        
        /*
        Haz un programa que solicite dos números enteros y use operadores lógicos para verificar si ambos son positivos. 
        Muestra un mensaje que diga si ambos números son mayores a cero o no.
        Operador ternario:
        */

        System.out.println("Ingrese el primer numero entero: ");
        int entero1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int entero2 = teclado.nextInt();
        
        boolean resultado1 = entero1 > 0;
        boolean resultado2 = entero1 < 0;
        boolean resultado3 = entero1 == 0;

        System.out.println("¿El primer entero es positivo? "+ resultado1 + " ¿es negativo? "+resultado2+ " ¿es cero? "+resultado3);

        resultado1 = entero2 > 0;
        resultado2 = entero2 < 0;
        resultado3 = entero2 == 0;

        System.out.println("¿El segundo entero es positivo? "+ resultado1 + " ¿es negativo? "+resultado2+ " ¿es cero? "+resultado3);
        
       

        
        /*
        Crea un programa que le pida al usuario su calificación (de 0 a 10) y determine si ha aprobado o no utilizando el operador ternario. 
        Imprime "Aprobado" si la nota es mayor o igual a 6, y "Reprobado" si es menor. */

        System.out.println("Ingrese su clasificacion: ");
        int clasificacion = teclado.nextInt();

        System.out.println(clasificacion >= 6 ? "Aprobado" : "Reprobado");

        teclado.close();
    }

}