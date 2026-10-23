
public class EstimacionPi {
 public static void main (String [] args ) {

// Cuantos dardos tenemos en total 
 	//Vamos a guardar todo los tipos en una variable double para poder las operaciones bien en la estimacion de pi con puntos decimal 
double numeroDedardosTotales = 1000000.0;
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
while (  i < numeroDedardosTotales){

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





















































 }





































}