// Lo primero es escribir todo lo necesario para que el usuario pueda introducir datos 
import java.util.Scanner;
public class PiInteractivo {
 public static void main (String [] args ) {

//Esto es parte de el scanner, para introduccir un dato el usuario
     Scanner entrada = new Scanner(System.in); 

// Cuantos dardos tenemos en total 
//En vez de definir un valor lo que vamos hacer es pedir a el usuario que ingrese su dato 
// El contador empeiza desde 0 para que no lo cuente y sea más seguro 
     double numeroDedardosTotales = 0.0;

//Aui vamos a guardar el valor como un contenedor antes del verdadero valor del usuario
     int valorIngresado = 0;

//Lo primero que haremos es hacer el primer while 
 //Para que el usuario no introduzca valores que no estan permitidos:
 //Como los numeros negativos y valores que no sean enteros 
 //La primera condición es que el numero de dardos sea menor o igual a 0 
 //Asi entrara en  el while sin problema y podemos hacer que el usuario ponga su valor de dardos 
     while ( numeroDedardosTotales <= 0){

     System.out.println(" Ingresa el número de dardos totales que tienes");

//Ahora vamos a empezar con las condicionales para evitar numero negativos y datos no enteros
//El primer if es para evaluar si es entero 
//El .hasNextInt() evaula si son numero entero 
//El .nextInt() los convierte en enteros 
    if (entrada.hasNextInt()) {
     valorIngresado = entrada.nextInt(); // Los convierte en enteros 
}else{   
 // Usamos String porque puede guardar cualquier tipo de dato 
	String entradaError = entrada.next(); //lo tiene que remover porque no hay entero puede ser cualquier dato
         System.out.println("Error: '" + entradaError + "' no es un número entero válido.");
         continue; // Vuelve al inicio del bucle a pedir el número otra vez, pero solo es este caso
      }  // Esto solo si no es un entero 

//Aqui vamos a evaluar si es un numero negativo tanto en nuestro numerototaldedardos,
// Como en el numero total de dardos 
if ( valorIngresado <= 0 ){
    System.out.println ("Tu número de dardos es menor a 0, debe ser un número mayor 0");
}else {
numeroDedardosTotales = valorIngresado; //Esto se hace porque while no entiende que el numero de mi usuario-
                                        // ya metio un dato al menos que cambie numeroDedardostotales 
}                                       // Al cambiar su valor a uno mayor a 0, la condición se vuelve falsa y nos permite salir del bucle.

}

 //Cuantos dardos lograste meter 
double dardosdentrodeElcirculo = 0.0;
// contador para el ciclo while para poder empezr los ciclos, para saber cuantas veces fueron lanzados los dardos
int i = 0;

// Una vez definido la inizialicazion vamos a empezar con la condicion
// Tomaremos en cuenta la condicion inicial  "El numero de dardos lanzados sea menor que el numero de dardos que declaraste", 
// que fue dada en la practica 
// Aqui ocuparemos Math.random para que nos de un numero decimal aleatorio en nuestras variables x y y,
// con la condicion que sea mayor o igual a 0 y menor que 1 
// Para saber si esta dentro de la distancia al origen vamos ocupar esta formula (x * x + y *y menor o igual 1)
// para esto ocuparemos Math.pow para usar potencias 
 // Ahora con nuestros valores aleatorios, vamos a utilizar el valor absoluto para evitar distancias negativas 
while (  i < valorIngresado){

//Definimos variables con en un tipo de dato primitivo double para guardar decimales 
double variableX = Math.abs(Math.random());

double variableY =  Math.abs(Math.random());

//En esta parte vamos hacer la formula de la distancia elevando al cuadrado Math.pow()

double distancias = Math.pow(variableX, 2) + Math.pow(variableY, 2);

//Una vez ya definido nuestras operaciones vamos a empezar con las condiciones 
//Si la distancia da un resultado menos o igual a 1 significa que si cayo dentro del circulo

if ( distancias <= 1){

// Ahora aqui vamos a contar cuantas veces entro dentro del circulo por eso la condicion con
// eso vamos a contar con nuestro operador de incremento cuantas veces entro dentro del circulo 

dardosdentrodeElcirculo++;


}
//El contador de lanzamientos va afuera de if porque no depende si cumple esa condicion o no,
// se cuentan por aparte ya que son cuantos lanzamientos hiciste no cuantos metiste 
i++;


}

//Ahora vamos a sacar la aproximacion de Pi 
//Vamos hacer una simple operacion una multiplicacion y divison,
// multiplicar el resultado de la divison entre el total de dardos y los que estan dentro 
//Se divide entre cuatro porque esta dividio en un cuarto de circulo como en la formula con el despeje 

double estimacionDePi = 4.0 * (dardosdentrodeElcirculo / numeroDedardosTotales);

//Por ultimo solo debemos escribir nuestros resultados para que el usuario las pueda ver 
//Realice una conversion de double a int para que los valores no fueran raros para el usuario,
// en contador no es necesario porque no se utilizo en la aproximacion de pi
System.out.println( "Felicidades los hiciste bien, veamos tus resultados");
System.out.println("Tu tenias un total de dardos de:" + (int) numeroDedardosTotales);
System.out.println("Número de dardos dentro del ciculo:" +  (int) dardosdentrodeElcirculo);
System.out.println("Número de lanzamientos en total:" + i);
// %.6f\n esto nos ayudara a mostrar los 6 decimales en la aprximacion de Pi y utilizamos printf para remplazar el valor de mi variable 
System.out.printf("Estimacion de PI: %.6f\n", estimacionDePi);
System.out.println("Asi termina esta partida del juego");




entrada.close(); //Esto para terminar el Scanner 
}
}