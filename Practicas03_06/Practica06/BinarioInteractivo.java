//Iniciamos para que el usuario pueda ingresar sus datos 
import java.util.Scanner;
public class BinarioInteractivo {
public static void main (String [] args ){

Scanner entrada = new Scanner (System.in);

char respuesta = 's'; //Variable para guardar mientras su valor 


//El usuario va repetir el programa cada vez que el ponga de respuesta 'S' o 's'
while ( respuesta == 'S' || respuesta == 's' ){
//Primero debemos tener algo que guarde el dato del usuario,
//Usamos el -1 para que no ocupe el 0 
int numeroUsuario = -1;

//Vamos a poner un while dentro de otro porque necesitamos
//Necesitamos confirmar que si se cumple y que no sea un número negativo 
//Como ya pusismos en nuestro primer while una condicion en el segundo solo sera un true or false 
while ( true ){

System.out.println("Ingres un numero positivo en base decimal");

//Verifica si entra el dato es un entero 
if( entrada.hasNextInt()){
numeroUsuario = entrada.nextInt();    //Los convierte de tipo entero 
} else {
 // Usamos String porque puede guardar cualquier tipo de dato 
		String ErrorEndato = entrada.next(); //Tiene que remover el dato para que no estorbe 
         System.out.println("Error: '" + ErrorEndato + "' no es un número entero válido.\n");
         continue; // Vuelve al inicio del bucle a pedir el número otra vez, pero solo es este caso 
}

//Ahora vamos a evaluar los numero negativos, el 0 si esta permitido por eso no entra
if ( numeroUsuario < 0 ){
System.out.println("No aceptamos números negativos, por lo tanto ingresa un número mayor a 0");
} else {   //Vamos a tener que romper el bucle del while con break
//Porque el número ya es mayor a 0 entonces ya no es necesario volver a repetir el while 
//A diferencia del otro no se puede comparar que en el anterior programa 
//Este es un while infinito por el true y se necesita el break para terminarlo  
break; 
}
}


//Una vez terminada la parte del número de usuario, haremos lod calculos
//Aqui vamos a definir nuevamente el numero de usuario, porque el otro quedo en el while y no se puede usar 
String binario = ""; //Lo vamos a guardar en comillas dobles porque no queremos que nos muestre nada 
int segundoNumeroDeUsuario = numeroUsuario;

//Vamos a poner los casos que podrian pasar 
//Si en caso de que el numero sea 0 pues solmente imprime lo mismo
if ( segundoNumeroDeUsuario == 0){
System.out.println("Tu número en dedcimal es:" + numeroUsuario  + "Tu número en binario es 0" );
binario = "0"; //Este lleva comillas porque arriba le asige un valor tipo String
}else{
// Este while cumple una doble función
// Evalúa al inicio que el número sea mayor a 0 para poder entrar a la condición.
// Controla la salida se repite haciendo divisiones sucesivas (% 2 y / 2) 
// hasta que el cociente hasta que llegue a 0 en ese momento la condición (segundoNumeroDeUsuario > 0) 
// se vuelve falsa y el bucle termina automáticamente.
while (segundoNumeroDeUsuario > 0) {
int residuo = segundoNumeroDeUsuario % 2; // Lo que hace es la division entre el numero del usuario y entre 2
                                          // % este es el mododulo obtiene el residuo 
binario = residuo + binario;    //Aqui lo unico que hace es concatenar el residuo con el las comillas dobles 
                                       //Las comillas dobles no van aparecer 
segundoNumeroDeUsuario = segundoNumeroDeUsuario / 2; //Esta operación nos dara el cociente de la operación,
                                                 //Nos dara el valor hasta que lleguemos a nuestra condicicion del while 

}
}

//Ahora solo vamos a imprimir los valores para que el usuario pueda verlo
System.out.println("Conversión de decimal a binario");
System.out.println("Tu número en decimal fue:" + numeroUsuario);
System.out.println("Tu número en binario es:" + binario);

//Vamos a volver a pedirle al usuario que vuleva a poner otro numero 
            System.out.println("¿Quieres convertir otro número? (Escribe 's' o 'S' para entrar, cualquier otra tecla para salir");
            respuesta = entrada.next().charAt(0); // Lee la respuesta y guarda el primer carácter
            
        }

        System.out.println("Listo ahi tienes tus resultados, vuelve pronto");
        


        entrada.close();
}
}








































































































































































































