
public class NuevoEjercicios{
 
    public static void main(String[] args){

        /* 
Declaración de Variables y Constantes

Declara tres variables de diferentes tipos de datos: una cadena, 
un número, y un booleano. Declara también una constante para el 
valor de pi. Imprime el valor de cada uno en la consola.
*/

String cadena = "Esta es una cadena";
int numero = 23;
boolean booleano = true;
final double pi = 3.14;

System.out.println(cadena + " " + numero + " " + booleano + " " + pi);

/*
Conversión de Tipos de Datos

Crea una variable de tipo cadena con un valor numérico,
y conviértela en un número entero y en un número decimal. 
Imprime los resultados de ambas conversiones.
*/

String cadenaNumerica = "34";

int entero = Integer.parseInt(cadenaNumerica);

double decimal = (double) entero;

System.out.println("Entero: "+entero+" Decimal: "+decimal);



/*
Concatenación e Interpolación de Cadenas

Declara dos variables con tu nombre y tu apellido,
y concaténalas en una tercera variable para crear 
tu nombre completo. Luego, utiliza interpolación para
imprimir un mensaje como "Hola, mi nombre es [nombre completo]".
*/

String nombre = "Osvaldo";
String apellido = "Corneli";

String mensaje = "Hola, mi nombre es "+nombre+ " "+ apellido;
String otroMensaje = String.format("Hola, mi nombre es %s %s",nombre, apellido);

System.out.println(mensaje);
System.out.println(otroMensaje);



/*
Uso de Comillas Dobles y Simples

Crea una cadena que incluya comillas dobles y otra que incluya comillas simples.
Imprime ambas en la consola y explica las diferencias entre ambas en cada lenguaje.
*/

String comilladoble = "Este es un \"Mensaje\" que incluye comillas dobles";
String comillasSimple = "este es un 'Mensaje' que incluye comillas simple";

System.out.println(comilladoble);
System.out.println(comillasSimple);

/*
Heredoc y Nowdoc (solo en PHP)

Escribe un bloque de texto largo usando Heredoc y Nowdoc en PHP,
 y el equivalente más cercano en Java y JavaScript para almacenar 
 texto largo en una variable.
*/

String variable = "Esto es una variable";
String textoLarge = String.format("Esto es un texto largo donde puedo concatenar variables tambien como por ejemplo \"%s\", ", variable);

System.out.println(textoLarge);
/*
Extracción y Búsqueda en Cadenas

Declara una cadena que contenga una oración. 
Encuentra la posición de una palabra específica 
en la cadena e imprime su índice. Extrae esa palabra
usando el índice obtenido.
*/

String oracion = "Esto es una oracion donde necesito buscar una palabra.";
String buscar = "necesito";

boolean existe = oracion.contains(buscar);

int indice = oracion.indexOf(buscar);

String respuesta = existe ? String.format("La palabra %s existe en la oracion, en el indice %d ", buscar,indice): "la palabra no existe";

System.out.println(respuesta);



/*
Reemplazo y Formato de Texto

Declara una cadena con una frase y reemplaza una palabra específica por otra.
Luego, cambia todo el texto a mayúsculas y minúsculas.
*/




/*
Uso de Operadores Aritméticos

Declara dos números y realiza las operaciones aritméticas básicas: suma, resta,
multiplicación, división y módulo. Imprime los resultados de cada operación.
*/



/*
Operadores de Comparación y Lógicos

Declara dos variables con valores numéricos y compara 
si el primero es mayor que el segundo. Si es así, imprime 
"Es mayor"; si no, imprime "Es menor o igual".
 Añade un operador lógico para verificar si ambos 
 números son mayores que cero antes de hacer la comparación.
*/


/*
Operadores de Comparación y Lógicos
Declara dos variables con valores numéricos y compara si el 
primero es mayor que el segundo. Si es así, imprime "Es mayor"; 
si no, imprime "Es menor o igual". Añade un operador lógico para verificar 
si ambos números son mayores que cero antes de hacer la comparación.
*/


/*
Operador Ternario y Operador de Fusión Nula (o equivalente)

Declara una variable que puede ser nula y usa un operador
 ternario para verificar si es nula. 
 Si es así, asígnale un valor predeterminado; si no, 
 imprime su valor actual.
*/
        

    }
    


}