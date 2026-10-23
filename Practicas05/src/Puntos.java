public class Puntos {
   public static void  main (String [] args ) { 




   int puntos = 67; 

   if( puntos >= 96 && puntos <= 120 ) {

System.out.println("Tus puntos obtenidos fueron:" + puntos + "Sacaste 10");

   } else if ( puntos >= 84 && puntos <= 95){
   	System.out.println("Tus puntos fueron" + puntos + "Sacaste 9 ");

   } else if ( puntos >= 76 && puntos <= 83){
   
   System.out.println("Tus puntos fueron:" + puntos + "Sacaste 8" );

   } else if ( puntos >= 63 && puntos <= 75){
   
   System.out.println("Sacaste 7");
   
   } else if ( puntos >= 56 && puntos <= 62){

    System.out.println("Sacaste 6");

   } else if ( puntos >= 0 && puntos <= 55){

   System.out.println("Tus puntos fueron:" + puntos + "Sacaste 0 ");
   }
}
}