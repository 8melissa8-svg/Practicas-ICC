import java.util.Scanner;

public class CotizadorPinesFinal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Lo primero debemos pedirle el nombre completo al cliente 
        // Para poder obtener sus datos 
        System.out.println("Ingresa tu nombre completo");

        String nombreDelCliente = ""; // guardamos el dato del cliente aqui, su nombre 

        while (true) {
            nombreDelCliente = entrada.nextLine().trim();
            if (!nombreDelCliente.isEmpty()) {
                break;
            } else {
                System.out.println("El nombre no puede estar vacío. Ingresa tu nombre:");
            }
        }

        char tipoDeCliente = ' ';
        // Ahora vamos empezar con un while para vefiricar que el usuario introduzca bien el caracter 
        // Solo le vamos a pedir su nombre y que tipo de cliente es  
        while (true) {

            System.out.println("Ingresa el tipo de cliente al que perteneces (P, E, R)");
            String entradaTipodeCliente = entrada.nextLine().trim(); // nextLine() solo lo lee y sirve para evitar que el programa no funcione-
                                                                     // En caso de que escriba con espacio o solo letras.
                                                                     // trim() se encarga dr limpiar los errores causados por el usuario-
                                                                     // Como los epsacio en blanco.
            if (entradaTipodeCliente.length() == 1) { // Lo que (entradaTipodeCliente.length()) hace es es revisar si fue introduccido un caracter solo pero en caso-
                                                      // De ser una palabra completa no va funcionar y se lo va a saltar.

                char tipoDeClienteRevisado = Character.toUpperCase(entradaTipodeCliente.charAt(0));  // Funciona es extrae el caracter y lo pone en la posición 0.                                   
                                                                                                    // UpperCase lo que hace es convertir el dato que introdujo el usuario-
                                                                                                    // En mayuscula por si lo introdujo en minuscula el caracter 
                // Ahora vamos a poner una condicion en caso de que si cumple que el usuario introdujo P,R y E
                // Dentro del mismo if porque debe de cumplirse la primera condición
                if (tipoDeClienteRevisado == 'P' || tipoDeClienteRevisado == 'R' || tipoDeClienteRevisado == 'E') {

                    tipoDeCliente = tipoDeClienteRevisado; // Lo que hace es guardar el dato dentro la variable que definimos al principio tipoDeCliente
                    break; // Rompemos el ciclo cuando la entrada sea correcta

                } else {
                    // Aqui simplemnente va volver a repetir el ciclo en caso de que no se cumpla la condición anterior 
                    System.out.println("Debes de introduccir solo tu tipo de cliente la letra");
                }
            }
        }

        // Ahora vamos a empezar a pedir los datos de uno en uno 
        // Empezamos definiendo un centinela no vamos a tomar el 0 porque en nuestras condiciónes lo vamos a tomar en cuenta
        double interesAnualBase = -1;

        while (true) {

            System.out.println("Ingresa la tasa anual base");

            if (entrada.hasNextDouble()) // Lo unico que hace hasNextDouble es revisar si el usuario si introdujo el valor tipo decimal
            {
                interesAnualBase = entrada.nextDouble(); // Aqui lo que hace es es guardar el dato en la variable anterior
                entrada.nextLine(); // Limpia el resto de la línea, el dato introdujo 

                // Vemos que la taza anual sea mayor o igual a 0
                if (interesAnualBase >= 0) {
                    break;  // Rompemos el ciclo porque ya se cumplio que la tasa anual sea mayor que 0
                } else {
                    System.out.println("La tasa anual base no puede ser menor o igual a 0");
                }

            } else {
                // Ahora vamos a verificar que el usuario no haya introduccido letras o texto 
                // Lo que hace ! es decir que la condición es diferente a ser un numero double 
                String errorDato = entrada.next(); // Lee la palabra incorrecta
                entrada.nextLine(); // Limpia el resto de la línea, el dato introdujo 
                System.out.println("No puedes poner este dato " + errorDato + " no es un número valido\n");
            }
        }

        // Vamos a dejar que el usuario intoduzca su capital prestamo
        double precioDelCliente = -1;
        while (true) {
            System.out.println("Ingresa tu capital de prestamo");
 
            if (entrada.hasNextDouble()) {
                precioDelCliente = entrada.nextDouble();
                entrada.nextLine();
                // Para que el numero sea positivo 
                if (precioDelCliente > 0) {
                    break; // Rompemos el ciclo o bucle 
                } else {
                    System.out.println("No esos datos no son validos deben ser números positivos");
                }
            } else {
                // Ahora vamos a verificar que el usuario no haya introduccido letras o texto 
                String errorDato3 = entrada.next();
                entrada.nextLine();
                System.out.println("No puedes poner " + errorDato3 + " no es un número valido");
            }
        }

        // Ahora vamos con los plazos a meses 
        // Lo mismo que arriba ponemos un centinela que empiece dsde -1 porque si vamos a tomar el 0
        int plazoDeMeses = -1;

        while (true) {

            System.out.println("Ingresa el plazo a meses");

            if (entrada.hasNextInt())   // Lo unico que hace hasNextInt() es revisar si el usuario si introdujo el valor tipo entero
            {
                plazoDeMeses = entrada.nextInt();
                entrada.nextLine(); // Limpia el resto de la línea, el dato introdujo 

                // Vemos que la taza anual sea mayor a 0, para que empiece desde el mes uno en adelante 
                if (plazoDeMeses > 0) {
                    break; // Rompemos el bucle ya que cumplio con todo lo necesario 
                } else {
                    System.out.println("Esos valores no estan permitidos, deben ser mayores a 0");
                }

            } else {
                // Ahora vamos a evaular en caso de que meta otro tipo de dato el usuario
                String errorDato2 = entrada.next(); // Lee la palabra incorrecta
                entrada.nextLine(); // Limpia el resto de la línea, el dato introdujo
                System.out.println("No puedes poner este dato " + errorDato2 + " no es un número válido.\n");
            } 
        }

        // Ahora si vamos con las operaciones para sacar el tipo de caso para cada cliente 
        // Volvi a guardar el dato de tasa anual base a otra variable-
        // Y que la anterior fue guardada en un while anterior entonces no se podia ocupar 

        double tasaAplicada = interesAnualBase;
        String tipoTexto = "";

        if (tipoDeCliente == 'P') {
            // Restamos 2.0% a la tasa base
            // Anterorimente se habia definido cuanto se le quitaba de tasa anual por cada tipo de cliente 
            tasaAplicada = interesAnualBase - 2.0;
            if (tasaAplicada < 0) tasaAplicada = 0; // Prevenimos tasas negativas
            tipoTexto = "Preferencial";
            System.out.println("Preferencial");
        }
        if (tipoDeCliente == 'E') {
            // La tasa se queda exactamente igual
            tasaAplicada = interesAnualBase;
            tipoTexto = "Estándar";
            System.out.println("Estandar");
        }
        if (tipoDeCliente == 'R') {
            // Aumentamos 3.0% a la tasa base
            tasaAplicada = interesAnualBase + 3.0;
            tipoTexto = "Riesgo";
            System.out.println("Riesgo");
        }

        // MENU INTERACTIVO
        // Variables fuera del while porque si no se van a estar reiniciando
        int operacionesEfectivas = 0; // Cuenta de operaciones válidas entre nuestro rango de opciones 
        int erroresMenu = 0;          // Cuenta de errores cometidos únicamente en el menú de nuestro maximo 3
        String termino = "";          // explica porque se termina el programa 

        while (true) {
            // Vamos a poner el menu dentro del while para que se repita cada vez que se abra el programa
            // Son 5 opciones 
            System.out.println("\nSistema de prestamos en la Cabaña del misterio");
            System.out.println("Operaciones disponibles ");
            System.out.println("1- Para Cotizar con interes simple");
            System.out.println("2- Cotizar con interes compuesto");
            System.out.println("3- Comparar interes simple y compuesto");
            System.out.println("4- Cambiar el capital del prestamo ");
            System.out.println("0- Para salir del sistema");
            System.out.println("Elige un número porfavor");

            // Vamos a definir una variable para despues guardar el dato dentro
            int numeroElegido = -1;
            // Vamos a poner una variable booleana para los casos cuando no entren en las opciones 
            // Con un dato de tipo false 
            boolean esOpcionValida = false;

            if (entrada.hasNextInt()) { // Verifica si el número que metio el usuario es de tipo entero
                numeroElegido = entrada.nextInt();
                entrada.nextLine();  // Limpia el resto de la línea, el dato introdujo 
                
                // Ponemos nuestra condición si opcion es mayor e igual a 0 
                // Y opcion es menor o igual a 4 por la cantidadad de opciones que hay 
                if (numeroElegido >= 0 && numeroElegido <= 4) {
                    esOpcionValida = true;
                }
            } else {
                String error = entrada.next(); // Lee la palabra incorrecta
                entrada.nextLine(); // Limpia el resto de la linea, el dato que introdujo el usuario
            }

            // En caso de que la opcion sea mayor a 4 o menor a 0
            if (!esOpcionValida) {
                // Maximo de 3 intentos
                erroresMenu++;
                // Tenemos que poner los contadores para que el porgrama sepa cuantas veces se intento 
                System.out.println("Error: Opción no válida. Debes elegir un número entero del 0 al 4, como se muestran en las opciones en el menú.");
                System.out.println("Errores cometidos en el menú: " + erroresMenu + " de 3");

                // Ya una vez alcanzados los 3 errores limites que debemos poner en el programa 
                if (erroresMenu >= 3) {
                    termino = "Se alcanzó el límite de 3 errores permitidos en el menú.";
                    break; // Sale del bucle del menú
                }
                continue; // Vuelve a pedir la opción sin avanzar a los cálculos desde el while
            }

            // La eleccion 0 de nuestro menu
            if (numeroElegido == 0) {
                termino = "El usuario eligió la opción 0 para salir.";
                break; // Sale del bucle del menú
            }

            // Convertimos los meses a años para la formula de interes simple
            double plazodelCliente1 = (double) plazoDeMeses / 12.0;

            // Vamos a empezar a poner las opciones del nuestro menu
            // Primer opción Para cotizar el interes simple 
            if (numeroElegido == 1) {
                // Solo hacemos las operaciones ya definidas en la practica
                double interesSimple = precioDelCliente * (tasaAplicada / 100.0) * plazodelCliente1;
                double totalPagarSimple = precioDelCliente + interesSimple;

                System.out.println("Cotizacion del Interes Simple");    
                System.out.println("Cliente: " + nombreDelCliente);
                System.out.println("Tipo de Cliente: " + tipoDeCliente);
                System.out.println("Capital: $" + precioDelCliente);
                System.out.println("Tasa aplicada: " + tasaAplicada + "%");
                System.out.println("Plazo a meses: " + plazoDeMeses);             
                System.out.println("Interes generado: $" + interesSimple);
                System.out.println("Total a pagar: $" + totalPagarSimple);

                operacionesEfectivas++; // Este nos dira cuantas consultas o calculos hizo dentro del programa 
            }

            // Opcion de nuestro menu interativo
            if (numeroElegido == 2) {
                // Solo hacemos las operaciones ya definidas en la practica 
                double tasaMensual = (tasaAplicada / 100.0) / 12.0;
                double saldoTotal = precioDelCliente;

                System.out.println("Cotizacion de Interes Compuesto ");
                System.out.println("Cliente: " + nombreDelCliente);
                System.out.println("Tipo de Cliente: " + tipoDeCliente); 
                System.out.println("Capital: $" + precioDelCliente);
                System.out.println("Tasa Aplicada: " + tasaAplicada + "%");

                // Aqui vamos a iniciar un bucle de lo que se va aumentado mes por mes 
                // En este caso usamos for para evitar que sea un ciclo infinito aparte sabemos cuantas vuelvas va a dar el ciclo
                for (int mes = 1; mes <= plazoDeMeses; mes++) {
                    saldoTotal = saldoTotal * (1.0 + tasaMensual);
                    System.out.println("Mes " + mes + " | Saldo total mensual: $" + saldoTotal);
                }

                double interesCompuesto = saldoTotal - precioDelCliente;
                System.out.println("Interes Generado: $" + interesCompuesto);
                System.out.println("Total a pagar: $" + saldoTotal);

                operacionesEfectivas++;
            }

            // Vamos a empezar con el la opcion 3
            if (numeroElegido == 3) {
                System.out.println("Comparacion de Intereses");

                // Cálculo Simple
                double interesSimple = precioDelCliente * (tasaAplicada / 100.0) * plazodelCliente1;

                // Cálculo Compuesto (usando la fórmula directa con Math.pow)
                double tasaMensual = (tasaAplicada / 100.0) / 12.0;
                double saldoCompuesto = precioDelCliente * Math.pow(1.0 + tasaMensual, plazoDeMeses);
                double interesCompuesto = saldoCompuesto - precioDelCliente;
                double diferencia = Math.abs(interesSimple - interesCompuesto);

                System.out.println("Interés Simple: $" + interesSimple);
                System.out.println("Interés Compuesto: $" + interesCompuesto);
                System.out.println("Diferencia entre ambos: $" + diferencia);

                if (interesCompuesto > interesSimple) {
                    System.out.println("El Interés Compuesto genera un monto mayor.");
                } else if (interesSimple > interesCompuesto) {
                    System.out.println("El Interés Simple genera un monto mayor.");
                } else {
                    System.out.println("Ambos intereses generan exactamente el mismo monto.");
                }
                operacionesEfectivas++;
            }

            // Ahora vamos con la opcion 4 
            if (numeroElegido == 4) {
                System.out.println("Cambiar el capital del prestamo");

                while (true) {
                    System.out.println("Ingresa el nuevo capital del préstamo ($):");
                    if (entrada.hasNextDouble()) { // Evalua si el dato que introdujo el usuario es decimal
                        double nuevoCapital = entrada.nextDouble();
                        entrada.nextLine(); // Limpia el resto de la línea, el dato introdujo 

                        if (nuevoCapital > 0) {
                            precioDelCliente = nuevoCapital;
                            System.out.println("Capital actualizado exitosamente a: $" + precioDelCliente);
                            break;
                        } else {
                            System.out.println("Esos valores no están permitidos, deben ser mayores a 0.");
                        }
                    } else {
                        String errorDato4 = entrada.next(); // Lee la palabra incorrecta
                        entrada.nextLine(); // Limpia el resto de la línea, el dato introdujo 

                        System.out.println("No puedes poner este dato '" + errorDato4 + "', no es un número válido");
                    }
                }

                operacionesEfectivas++;
            }

            // Tenemos que verificar que el limite de operaciones 
            if (operacionesEfectivas >= 5) {
                termino = "Se alcanzó el límite máximo de 5 operaciones efectivas realizadas.";
                break; // Sale del bucle del menú
            }

        } // Fin del bucle while(true) del menú

        // Al terminar el menu solamnete vamos a impirmir sus datos de forma en general 

        System.out.println("\nResumen del dia de hoy ");
        System.out.println("Nombre del cliente: " + nombreDelCliente);
        System.out.println("Tipo de cliente: " + tipoTexto + " (" + tipoDeCliente + ")");
        System.out.println("Operaciones efectivas realizadas: " + operacionesEfectivas + " / 5");
        System.out.println("Errores cometidos en el menú: " + erroresMenu + " / 3");
        System.out.printf("Capital final registrado: $%.2f\n", precioDelCliente);
        System.out.println("Motivo de término: " + termino);

        entrada.close();
    }
}



























































































