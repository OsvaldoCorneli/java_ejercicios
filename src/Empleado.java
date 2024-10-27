/*/*
Clases abstractas y Principio de Sustitución
    Crea una clase abstracta Empleado con métodos trabajar() y descansar(). 
    Luego, crea dos clases, Desarrollador y Diseñador, que hereden de Empleado
    e implementen sus propios métodos trabajar() y descansar(). 
    Crea una lista de empleados y usa el principio de sustitución
    para iterar sobre ellos y llamarlos a trabajar y descansar.
 */
 
 public abstract class Empleado{

    public abstract void trabajar();

    public abstract void descansar();


 }