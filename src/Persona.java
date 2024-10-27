/*
 * Clase Persona
    Crea una clase Persona con atributos privados nombre, edad, y altura. 
    Implementa un constructor para inicializar estos valores y crea métodos get y set
    para cada atributo. Agrega un método imprimirInfo() que imprima la información 
    completa de la persona.
 */

public class Persona {
    private String nombre;
    private int edad;
    private float altura;

    public Persona(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;

    }

    public String getNombre() {
        return this.nombre;

    }

    public int getEdad() {
        return this.edad;

    }

    public float getAltura() {
        return this.altura;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void imprimirInfo(){
        System.out.println("El nombre de la persona es "+this.nombre+" su edad es "+this.edad+" y su altura es "+this.altura);
    }



}