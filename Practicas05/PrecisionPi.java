public class PrecisionPi {
 public static void main (String [] args ) {


double tolerancia = 0.001;
//Para esta parte de la preactica debemos declarar una nueva variable 
//La condicion en el while sera difererente para nuestro programa 
// porque el error de mi estimación debe de ser mayor o igual a que mi tolerancia 
// Y me define que el error es la distancia entre la estimacion y el valor real de pi (Math.PI.)
// Tambien se va ocupar valor absoluto Math.pow( ) porque el error es la distancia entre esos numeros 	

double numeroDedardosTotales = 0.0;
 
double dardosdentrodeElcirculo = 0.0;
//En este nuestra inicializacion ya no seran cuantos lanzaminetos fueron, sino mas bien sera la estimacion de pi,
// porque la nescitamos definir antes porque queremos que este dentro de nuestra condicion 

double estimacionDePi = 0.001;
//Pones nuestra condicion en while la condicion era que el error de mi estimacion debe de ser mayor o igual que mi tolerancia 
//Para sacar el error debemos utilizar el valor absoluto para evitar distancias negativas 
// es el valor absoluto de nuestra estimacion de pi menos el valor real de pi


while ( numeroDedardosTotales == 0 || Math.abs( estimacionDePi - Math.PI) >= tolerancia) {

double variableX = Math.abs(Math.random());

double variableY =  Math.abs(Math.random());


double distancias = Math.pow(variableX, 2) + Math.pow(variableY, 2);

if ( distancias <= 1){

dardosdentrodeElcirculo++;

}
//Necesitamos in incremento en total para saber con exactitud de lanzamientos realmente 
numeroDedardosTotales++;
//Aqui solo es volver poner el identificador porque ya esta arriba asiganda 
 estimacionDePi = 4.0 * (dardosdentrodeElcirculo / numeroDedardosTotales);

}
//Calculamos el error nuevamente para poder imprimirlo para el usuario, porque en el while no se puede usar 
double error = Math.abs( estimacionDePi - Math.PI);


System.out.println( "Felicidades los hiciste bien, veamos tus resultados");
System.out.println("Tu tenias un total de dardos de:" + numeroDedardosTotales);
System.out.println("Número de dardos dentro del ciculo:" +  (int) dardosdentrodeElcirculo);
System.out.printf("Estimacion de PI: %.6f\n", estimacionDePi);
// %.6f\n esto nos ayudara a mostrar los 6 decimales en la aprximacion de Pi y utilizamos printf para remplazar el valor de mi variable 
System.out.printf("El error que se tenia: %.6f\n", error);
System.out.println("Asi termina esta partida del juego");














































































 }



























































































}