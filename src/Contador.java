/* Uso de this y static
    Crea una clase Contador que tenga un atributo valor y métodos incrementar()
    y resetear(). Usa this para diferenciar entre parámetros y atributos, y agrega 
    un atributo static total para contar el número de instancias creadas de la clase
    Contador. Prueba creando varias instancias y observa cómo cambia total.*/


public class Contador {
    
    public int valor = 0;
    public static int total = 0;

    Contador(){
        total++;
    }

    public void incrementar(){
        this.valor++;
    }

    public void resetear(){
        this.valor = 0;
    }

    



}
