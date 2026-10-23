public class CotizadorPines {
 public static void main ( String [] args) {

//Anterior codigo de la practica anterior 
 	String nombreDelprimerCliente = "Robie Valentino";
     int preciodelCliente1 = 12899; 
     double interesAnual = 0.15;
     double plazodelCliente1 = 21.0 / 12.0;
//tipo del cliente 
//Existen varios tipos de cliente 
//Este programa le vamos agregar los tipos de clientes como se van clasificando 
     
     char tipoDeCliente = 'P';
//Vamos a validar que no den errores ni negativos 
// usando condiciones con el operador or 
     if ( preciodelCliente1 <= 0 || plazodelCliente1 <= 0 || interesAnual <= 0){

       System.out.println( "Eso esta mal, no debe de dar valores negativos ");
 // usamos otra condicion porque 
     } else  if  ( tipoDeCliente != 'P' && tipoDeCliente != 'E' && tipoDeCliente != 'R'){

       System.out.println("Error, debes de ser tipo de cliente P, R o E para poder acceder a los datos");
     }
// Debemos evaluar las demas posibilidaes que no fueron evaluadas anteriormente,
//Como si el usuario si valiera P, E o R que nos va imprimir 
      else{

//Bueno empezare con las condiciones para este tipo de cliente 
//En este caso lo que hare es evaluar a cada cliente por casos. Si cliente vale P pasa esto, si cliente es R paso esto asi sucesivamente 

     if ( tipoDeCliente == 'P'){
          //restamos 0.15-0.2 como fue estabelcido
       double tasaAplicada = 0.13;
//Las operaciones que se realizaron en la practica, pero con nuevo valor de interesAplcado 
       double interes1 = (preciodelCliente1 * tasaAplicada * plazodelCliente1);
       double totalResultados1 = preciodelCliente1 + interes1;
      double plazo1 = totalResultados1 / 21;

      System.out.println("Para el tipo de cliente P ");
      System.out.println("Interes:" +  interes1);
      System.out.println("Total:" +  totalResultados1);
      System.out.println("Plazo:" +  plazo1);
  }


        if(tipoDeCliente == 'E'){
// En este caso se queda igual 
         double tasaAplicado2 = 0.15;
//Las tres operaciones que se realizaron anteriormente en la practica, pero con nuevo valor de interesAplicado 
         double interes2 = (preciodelCliente1 * tasaAplicado2 * plazodelCliente1);
         double totalResultados2 = preciodelCliente1 + interes2;
         double plazo2 = totalResultados2 / 21;

        System.out.println("Para el tipo de cliente E ");
        System.out.println("Interes:" +  interes2);
        System.out.println("Total:" +  totalResultados2);
        System.out.println("Plazo:" +  plazo2);


}
        if (tipoDeCliente == 'R'){
// En este caso vamos aumentarle 0.3 al valor inicial de la tasa 
     double tasaAplicado3 = 0.18;
// Las operaciones que se realizaron anteriormente en la practica, pero con nuevo valor de interesAplicado
     double interes3 = ( preciodelCliente1 * tasaAplicado3 * plazodelCliente1);
     double totalResultados3 = preciodelCliente1 + interes3;
     double plazo3 = totalResultados3 / 21;

    System.out.println("Para el tipo de cliente R ");
    System.out.println("Interes:" +  interes3);
    System.out.println("Total:" +  totalResultados3);
    System.out.println("Plazo:" +  plazo3);
}

}




























































 }




















































}