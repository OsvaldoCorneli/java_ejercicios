/*
 * Declaración de variables:
    Crea un programa que declare variables de diferentes tipos de datos 
    (int, float, char, boolean, String) y les asigne valores. 
    Imprime el valor de cada una usando print y println.
 */


public class DatosyVariables{

    public static void main(String[] args){
        //aqui muestro como puedo declarar la variable y despues asignarle el valor con el =
        int numeros;
        float decimal;
        char letra;
        boolean verdad;
        String oracion;


        numeros = 12;
        decimal = 11.2f;
        letra = 's' ;
        verdad = true;
        oracion = "Esto es una oracion";

        //aqui muestro como puedes declarar la variables y su valor al mismo tiempo
        int numero2 = 2;
        float decimal2 = 2.2f;
        char letra2 = 'd';
        boolean mentira = false;
        String oracion2 = "Esta es otra oracion";

        //estas son variables constantes o sea no puedes modificar su valor
        final float pii = 3.1415f;
        final double peso = 200.224123;


        //aqui imprimo por consola con println que ln es salto de linea si utilizo print solo estaria todo junto en una misma linea

        System.out.println("La variable imprimesa es "+ pii);
        System.out.println("La variable imprimesa es "+ peso);
        System.out.println("La variable imprimesa es "+ numeros);
        System.out.println("La variable imprimesa es "+ decimal);
        System.out.println("La variable imprimesa es "+ letra);
        System.out.println("La variable imprimesa es "+ verdad);
        System.out.println("La variable imprimesa es "+ oracion);
        System.out.println("La variable imprimesa es "+ numero2);
        System.out.println("La variable imprimesa es "+ decimal2);
        System.out.println("La variable imprimesa es "+ letra2);
        System.out.println("La variable imprimesa es "+ mentira);
        System.out.println("La variable imprimesa es "+ oracion2);

        //tambien se puede declarar variables del mismo tipo en una sola linea

        int numero3 = 12, numero4 = 23, numero5 = 19;

        System.out.println("La variable imprimesa es "+ numero3);
        System.out.println("La variable imprimesa es "+ numero4);
        System.out.println("La variable imprimesa es "+ numero5);



        /*Tipos de datos en Java:

        Declara tres variables de tipo int, realiza una operación aritmética con ellas, 
        y almacena el resultado en otra variable. Luego imprime el resultado. */

        int num1, num2, resultado;

        num1 = 23;
        num2 = 87;

        resultado = num1 + num2;
        System.out.println("El resultado es: "+ resultado);
        resultado = num1 - num2;
        System.out.println("El resultado es: "+ resultado);
        resultado = num1 * num2;
        System.out.println("El resultado es: "+ resultado);
        resultado = num2 / num1;
        System.out.println("El resultado es: "+ resultado);

           /*Palabras reservadas:
            Escribe un código que intente usar una palabra reservada de Java como nombre de variable, 
            e identifica el error que aparece. (Ej: int class = 5;) */ 

            // int class = 5;
            // int public = 19;
            // int main = 12;
            // el codigo esta comentado para poder compilar los otros ejercicios
            //Lo que interprete del error es que dice que es una expression ilegal que no pudo compilar por el error un error java:87;


            /*Declaración múltiple de variables:
            Declara dos variables de tipo double en una sola línea y asígnales un valor.
             Luego, realiza una operación de suma y muestra el resultado. */

             double numeroDouble = 2.32, numeroDouble2 = 2.43;

             double resultadoDouble = numeroDouble + numeroDouble2;

             System.out.println("El resultado de la suma de los Double es: "+ resultadoDouble);



            /*Constantes:
            Declara una constante de tipo final int para representar el valor del número pi con dos decimales. Luego,
             usa esa constante para calcular el área de un círculo de radio dado por el usuario. */

             final float pi = 3.1415f; //el ejercicio pide un int pero no se puede porque pi es un numero decimal

             int number = 2;

             float area = (pi *  ((float)number*(float)number));

             System.out.println("El radio es de: "+ area);




    }


}