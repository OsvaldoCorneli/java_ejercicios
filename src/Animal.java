/*Herencia y super
Crea una clase Animal con un método hacerSonido(). 
Luego, crea una clase Perro que herede de Animal 
y sobreescriba el método hacerSonido()
 para que imprima "Guau". Crea instancias de ambas 
 clases y llama al método en cada una. */

 public class Animal{

    public void hacerSonido(){
        System.out.println("Sonido de Animal");
    }

    public void comer(){
        System.out.print("esta comiendo");
    }

 }