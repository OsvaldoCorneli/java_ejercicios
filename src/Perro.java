public class Perro extends Animal {

    @Override
    public void hacerSonido(){
        System.out.println("Guau");
    }

    @Override
    public void comer(){
        System.out.print("El perro ");
        super.comer();
        
    }

}
