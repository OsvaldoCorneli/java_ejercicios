/*
 

Clases anidadas
Crea una clase Banco que contenga una clase Cuenta. La clase Cuenta debe tener 
atributos saldo y titular y métodos para depositar y retirar dinero. 
La clase Banco debe contener una lista de cuentas 
y un método agregarCuenta(Cuenta cuenta) para añadir cuentas al banco.

Herencia y super
Crea una clase Animal con un método hacerSonido(). 
Luego, crea una clase Perro que herede de Animal y sobreescriba el método hacerSonido()
 para que imprima "Guau". Crea instancias de ambas clases y llama al método en cada una.

Clases abstractas y Principio de Sustitución
Crea una clase abstracta Empleado con métodos trabajar() y descansar(). 
Luego, crea dos clases, Desarrollador y Diseñador, que hereden de Empleado
 e implementen sus propios métodos trabajar() y descansar(). 
 Crea una lista de empleados y usa el principio de sustitución para iterar sobre ellos y llamarlos a trabajar y descansar.
 */




public class Principal {
    
    public static void main(String[] args){

        Contador contador = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();
        Contador contador4 = new Contador();
        Contador contador5 = new Contador();
        
        
        int total = contador.total;

        System.out.println(total);

        Contador contador6 = new Contador();
        Contador contador7 = new Contador();
        Contador contador8 = new Contador();
        Contador contador9 = new Contador();
        Contador contador10 = new Contador();

        System.out.println("El contador final es "+ contador.total);
    }


}
