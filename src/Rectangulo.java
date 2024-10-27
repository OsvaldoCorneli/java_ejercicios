/*
 * Cálculo de área y perímetro
    Crea una clase Rectangulo con atributos base y altura. 
    Implementa métodos para calcular y devolver el área y el perímetro. 
    Luego, instancia la clase y muestra el área y perímetro de un rectángulo.
 */

 public class Rectangulo{

        private float base;
        private float altura;

        public Rectangulo(){
    
        }

        public Rectangulo(float base, float altura){
            this.base = base;
            this.altura = altura;
        }
       
        public float calcularArea(){

            return base*altura;

        }

        public float calcularPerímetro(){

            return base+base+altura+altura;

        }

        public void setBase(float base){
            this.base = base;
        }
        
        public void setAltura(float altura){
            this.altura = altura;
        }

        public float getBase(){
            return this.base;
        }

        public float getAltura(){
            return this.altura;
        }


 }

