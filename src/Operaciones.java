/*Sobrecarga de métodos y constructores
    Crea una clase Operaciones con un método suma()
    que pueda sumar dos, 
    tres o cuatro números. Implementa este método 
    con sobrecarga, aceptando diferentes números de parámetros. Prueba 
    llamando a cada versión del método para verificar que todas funcionan 
    correctamente. */

public class Operaciones {

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public float suma(float numero1, float numero2) {
        return numero1 + numero2;
    }

    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public int suma(int... numeros) {
        int suma = 0;
        for (int numero : numeros)
            suma += numero;

        return suma;

    }

    public float suma(float... numeros) {
        float suma = 0;
        for (float numero : numeros)
            suma += numero;

        return suma;

    }

    public double suma(double... numeros) {
        double suma = 0;
        for (double numero : numeros)
            suma += numero;

        return suma;

    }

}