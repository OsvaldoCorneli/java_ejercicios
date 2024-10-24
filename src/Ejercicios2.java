import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
        /*
         * 1. Condicional simple
         * Escribe un programa que solicite al usuario un número entero. Si el número es
         * mayor que 100,
         * muestra un mensaje indicando que es "un número grande". Si es menor o igual a
         * 100,
         * indica que es "un número pequeño".
         */

        Scanner teclado = new Scanner(System.in);
        // System.out.print("Ingrese un numero entero: ");
        // int numero = teclado.nextInt();
        // teclado.nextLine();

        // if(numero > 100){
        // System.out.println("un número grande");
        // }else{
        // System.out.println("un número pequeño");
        // }

        /*
         * 2. Else if
         * Escribe un programa que reciba la calificación de un estudiante
         * (entre 0 y 100) e imprima la evaluación:
         * 90-100: "Excelente" ____ 70-89: "Bueno" ____ 50-69: "Regular" ____ 0-49:
         * "Reprobado"
         */
        // int opcion = 0;
        // do{

        // System.out.print("Ingresar la nota del alumno: ");
        // int nota = teclado.nextInt();
        // teclado.nextLine();

        // if(nota >= 90 && nota <= 100){
        // System.out.println("Excelente");
        // }
        // else if(nota < 90 && nota >= 70){
        // System.out.println("Bueno");
        // }else if(nota < 70 && nota >= 50){
        // System.out.println("Regular");
        // }else if( nota < 50 && nota >= 0){
        // System.out.println("Reprobado");
        // }
        // else{
        // System.out.println("Nota ingresada incorrecta");
        // }

        // System.out.println("ingrese 9 para salir cualquier otro numero para
        // continuar: ");
        // opcion = teclado.nextInt();
        // teclado.nextLine();
        // }while(opcion != 9);

        /*
         * 3. Condiciones anidadas
         * Crea un programa que pida tres números enteros y determine cuál es el mayor y
         * si ese número es positivo o negativo. Si hay números iguales, indica que son
         * iguales.
         */

        // System.out.print("Ingrese primer numero entero: ");
        // int numero1 = teclado.nextInt();
        // System.out.print("Ingrese primer numero entero: ");
        // int numero2 = teclado.nextInt();
        // System.out.print("Ingrese primer numero entero: ");
        // int numero3 = teclado.nextInt();
        // teclado.nextLine();
        // boolean bandera = false;

        // if(numero1 == numero2 && numero1 > numero3){
        // if (numero1 > 0) {
        // System.out.printf("los numeros %d y %d son positivo y los mayores", numero1,
        // numero2);
        // System.out.println("");
        // } else if (numero1 < 0) {
        // System.out.printf("los numeros %d y %d son negativos y los mayores", numero1,
        // numero2);
        // System.out.println("");
        // } else {
        // System.out.printf("los numeros %d y %d son los dos mayores", numero1,
        // numero2);
        // System.out.println("");
        // }
        // }

        // if(numero1 == numero2 && numero1 > numero3){
        // bandera = true;
        // if (numero1 > 0) {
        // System.out.printf("los numeros %d y %d son positivo y los mayores", numero1,
        // numero2);
        // System.out.println("");
        // } else if (numero1 < 0) {
        // System.out.printf("los numeros %d y %d son negativos y los mayores", numero1,
        // numero2);
        // System.out.println("");
        // } else {
        // System.out.printf("los numeros %d y %d son los dos mayores", numero1,
        // numero2);
        // System.out.println("");
        // }
        // }
        // if(numero2 == numero3 && numero2 > numero1){
        // bandera = true;
        // if (numero1 > 0) {
        // System.out.printf("los numeros %d y %d son positivo y los mayores", numero3,
        // numero2);
        // System.out.println("");
        // } else if (numero1 < 0) {
        // System.out.printf("los numeros %d y %d son negativos y los mayores", numero3,
        // numero2);
        // System.out.println("");
        // } else {
        // System.out.printf("los numeros %d y %d son los dos mayores", numero3,
        // numero2);
        // System.out.println("");
        // }
        // }
        // if(numero1 == numero3 && numero1 > numero2){
        // bandera = true;
        // if (numero1 > 0) {
        // System.out.printf("los numeros %d y %d son positivo y los mayores", numero3,
        // numero1);
        // System.out.println("");
        // } else if (numero1 < 0) {
        // System.out.printf("los numeros %d y %d son negativos y los mayores", numero3,
        // numero1);
        // System.out.println("");
        // } else {
        // System.out.printf("los numeros %d y %d son los dos mayores", numero3,
        // numero1);
        // System.out.println("");
        // }
        // }

        // if (numero1 > numero2 && numero1 > numero3 && !bandera) {
        // if (numero1 > 0) {
        // System.out.printf("El numero %d es positivo y el mayor de los 3", numero1);
        // System.out.println("");
        // } else if (numero1 < 0) {
        // System.out.printf("El numero %d es mayor negativo y el mayot de los 3",
        // numero1);
        // System.out.println("");
        // } else {
        // System.out.printf("El numero %d es el mayor de los 3", numero1);
        // System.out.println("");
        // }

        // }
        // if (numero2 > numero1 && numero2 > numero3 && !bandera) {
        // if (numero1 > 0) {
        // System.out.printf("El numero %d es positivo y el mayor de los 3", numero2);
        // System.out.println("");

        // } else if (numero1 < 0) {
        // System.out.printf("El numero %d es mayor negativo y el mayot de los 3",
        // numero2);
        // System.out.println("");
        // } else {
        // System.out.printf("El numero %d es el mayor de los 3", numero2);
        // }

        // }
        // if (numero3 > numero1 && numero3 > numero2 && !bandera) {
        // if (numero1 > 0) {
        // System.out.printf("El numero %d es positivo y el mayor de los 3", numero3);
        // System.out.println("");
        // } else if (numero1 < 0) {
        // System.out.printf("El numero %d es mayor negativo y el mayot de los 3",
        // numero3);
        // System.out.println("");
        // } else {
        // System.out.printf("El numero %d es el mayor de los 3", numero3);
        // }

        // }

        /*
         * 4. Switch
         * Haz un programa que solicite un número del 1 al 7 y muestre el día de la
         * semana correspondiente
         * (1 para "Lunes", 2 para "Martes", etc.). Si el número no está en el rango,
         * muestra un mensaje de error.
         */

        // String mensaje = """
        // Ingrese un numero del 1 al 7:
        // 1) Lunes,
        // 2) Martes,
        // 3) Miercoles,
        // 4) Jueves,
        // 5) Viernes,
        // 6) Sabado,
        // 7) Domingo,
        // """;
        // System.out.println(mensaje);
        // int opcion = teclado.nextInt();
        // teclado.nextLine();

        // switch (opcion) {
        // case 1:
        // System.out.println("Lunes");
        // break;
        // case 2:
        // System.out.println("Martes");
        // break;
        // case 3:
        // System.out.println("Miercoles");
        // break;
        // case 4:
        // System.out.println("Jueves");
        // break;
        // case 5:
        // System.out.println("Viernes");
        // break;
        // case 6:
        // System.out.println("Sabado");
        // break;
        // case 7:
        // System.out.println("Domingo");
        // break;
        // default:
        // System.out.println("ERROR! Opcion no correcta! ");
        // break;
        // }

        /*
         * 5. Ciclo while
         * Escribe un programa que siga pidiendo números al usuario hasta que el número
         * introducido sea 0.
         * Al finalizar, muestra la suma de todos los números introducidos.
         */

        // int numeroEjCinco = 1;
        // while(numeroEjCinco != 0){
        // System.out.print("Ingrese un numero entero: ");
        // numeroEjCinco = teclado.nextInt();
        // teclado.nextLine();
        // }

        /*
         * 6. Ciclo do while
         * Escribe un programa que solicite una contraseña al usuario.
         * Si la contraseña ingresada es incorrecta, el programa debe pedir
         * la contraseña de nuevo hasta que sea correcta. La contraseña correcta es
         * "java123".
         */

        // boolean flag = true;
        // do{
        // System.out.println("Ingrese la contraseña");
        // String password = teclado.nextLine();
        // if(password.equals("java123")){
        // System.out.println("Contraseña correcta!");
        // flag = false;
        // }else{
        // System.out.println("la contraseña ingresada es incorrecta");
        // }

        // }while(flag);

        /*
         * 7. Ciclo for
         * Escribe un programa que imprima los primeros 10
         * números enteros positivos (del 1 al 10) usando un ciclo for.
         */

        // for(int i = 0; i<10; i++, System.out.println("El numero es: "+i) ){}

        /*
         * 8. Recorrer un arreglo
         * Crea un programa que declare un arreglo de 5 enteros, los inicialice
         * con valores ingresados por el usuario y luego imprima el valor más alto de
         * ese arreglo.
         */

        // int arreglo[] = new int[5];

        // for (int i = 0; i < arreglo.length; i++) {
        //     System.out.println("Ingrese un numero: ");
        //     arreglo[i] = teclado.nextInt();
        // }

        // int mayorNumero = 0;
        // for (int i = 0; i < arreglo.length; i++) {
        //     if (i == 0) {
        //         if (arreglo[i] > arreglo[i + 1] || arreglo[i] == arreglo[i + 1]) {
        //             mayorNumero = arreglo[i];
        //         } else {
        //             mayorNumero = arreglo[i + 1];
        //         }

        //     }
        //     if (arreglo[i] > mayorNumero) {
        //         mayorNumero = arreglo[i];
        //     }

        // }

        // System.out.println("El numero mayor es " + mayorNumero);

        /*
         * 9. Foreach
         * Crea un arreglo de nombres de tus amigos o familiares y
         * recórrelo con un ciclo foreach para imprimir cada nombre
         * en una línea separada.
         */

         String personas[] = {"Homar", "Gaston", "Pedro", "Rober", "Osvaldo" };

        for(String persona : personas){

            System.out.println("El nombre es "+persona);

        }


        /*
         * 10. Matriz bidimensional
         * Crea un programa que genere una matriz de 3x3 llena de números enteros
         * aleatorios. Luego, recorre la matriz y muestra la suma de
         * todos sus elementos.
         */

        int matrix[][] = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random()*101);
            }
        }
        int sumar = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("["+matrix[i][j]+"]");
                sumar += matrix[i][j];
            }
            System.out.println("");
        }

        System.out.printf("la suma es de %d",+ sumar);

        teclado.close();
    }
}
