public class Principal {
    
    public static void main(String[] args){

        Rectangulo rectangulo = new Rectangulo(23f, 23.2f);

        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());

        Rectangulo rectangulo2 = new Rectangulo();

        rectangulo2.setBase(65f);
        rectangulo2.setAltura(24.35f);

        System.out.println(rectangulo2.calcularArea());
        System.out.println(rectangulo2.calcularPerimetro());


    }


}
