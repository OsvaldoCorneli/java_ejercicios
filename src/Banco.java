/*
 * Clases anidadas
    Crea una clase Banco que contenga una clase Cuenta.
    La clase Cuenta debe tener 
    atributos saldo y titular y métodos para depositar y retirar dinero. 
    La clase Banco debe contener una lista de cuentas 
    y un método agregarCuenta(Cuenta cuenta) para añadir cuentas al banco.*/

import java.util.ArrayList;

public class Banco{

    ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>  ();

    public void agregarCuenta(Cuenta cuenta){
        cuentas.add(cuenta);

    }


    
    public class Cuenta{

        private double saldo;
        public String titular; 

        public Cuenta(double saldo, String titular){
            this.saldo = saldo;
            this.titular = titular;
        }

        public double getSaldo(){
            return this.saldo;
        }

        public void setSaldo(double saldo){
            this.saldo = saldo;
        }

        public void retirarDinero(double saldo){
            this.saldo -= saldo;
            System.out.println("Retiraste $"+ saldo + " y tu nuevo saldo es $"+this.saldo);
        }

        public void depositarDinero(double saldo){
            this.saldo += saldo;
            System.out.println("depositaste $"+ saldo + " y tu nuevo saldo es $"+this.saldo);
        }


    }


}
