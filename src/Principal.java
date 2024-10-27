/*
 
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

        Banco cuentaBanco = new Banco();

        Banco.Cuenta cuenta1 = cuentaBanco.new Cuenta(2444, "osvaldo");

        cuentaBanco.agregarCuenta(cuenta1);

        cuenta1.depositarDinero(556);

        cuenta1.retirarDinero(2999);
        
        




    }


}
