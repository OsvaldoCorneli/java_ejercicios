public class Principal {
    
    public static void main(String[] args) {
       
        Empleado[] empleados = new Empleado[10];

       
        for (int i = 0; i < 5; i++) {
            empleados[i] = new Disenador(); 
        }
        for (int i = 5; i < 10; i++) {
            empleados[i] = new Desarrollador(); 
        }

        
        for (Empleado empleado : empleados) {
            empleado.trabajar();  
            empleado.descansar(); 
            System.out.println();   
        }
    }
}