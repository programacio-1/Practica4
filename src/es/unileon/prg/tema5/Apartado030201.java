package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion
	System.out.println("La cadena es: " + cadena);
	System.out.println("El tamaño de la cadena es: " + cadena.length() + " caracteres");
	System.out.println("El caracter en la posicion media es: " + cadena.charAt (cadena.length()/2));
	char caracter = cadena.charAt (cadena.length()/2);
	int ascii = (int) caracter;
	System.out.println("El caracter es en codigo ascii es: " + ascii);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion
	System.out.println("La primera cadena es: " + cadena);
	System.out.println("La segunda cadena es: "+ otraCadena);
	System.out.println("La diferencia entre la primera cadena y la segunda es: " + cadena.compareTo(otraCadena));
	System.out.println("La diferencia entre las dos cadenas sin tener en cuenta las mayusculas es: " + cadena.compareToIgnoreCase(otraCadena));
	cadena = cadena.toLowerCase();
	otraCadena = otraCadena.toLowerCase();	
	System.out.println("La diferencia entre las dos cadenas en minusculas es :" + cadena.compareTo(otraCadena));
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador 
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");

         String cadena = "Viaje al Parnaso ";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion
	String concat1 = cadena + otraCadena;
	String concat2 = cadena.concat(otraCadena);
	//concatenacion con +
	System.out.println(concat1);
	//concatenacion con metodo concat
	System.out.println(concat2);
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion
	 System.out.println("La cadena acaba por Parsano: " + cadena.endsWith("Parnaso"));
	 System.out.println("La cadena empieza por Viaje: " + cadena.startsWith("Viaje"));
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio de modificacion
	 System.out.println("La letra p se encuentra en la posicion " + cadena.indexOf("p"));
	 System.out.println("La subcadena Par se encuentra en la posicion " + cadena.indexOf("Par"));
	 System.out.println("La ultima ocurrencia de la letra a es " + cadena.lastIndexOf("a"));
	 System.out.println("La letra a empezando por la 3 posicion esta en la posicion " + cadena.indexOf("a",3));
        // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	 System.out.println(cadena.replace("a", "*"));
	 System.out.println(cadena.replaceAll("Parnaso", "Olimpo"));
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
	 int medio;
	 int inicioJ;
	 int finalS;

	 medio = cadena.length()/2;
	 inicioJ = cadena.indexOf("j");
	 finalS = cadena.lastIndexOf("s");

	 System.out.println(cadena.substring(medio));
	 System.out.println(cadena.substring(inicioJ,finalS));
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
	 int esp1;
	 int esp2;

	 esp1 = cadena.indexOf(" ");
	 esp2 = cadena.lastIndexOf(" ");

	 System.out.println(cadena.substring(esp1+1,esp2-2));
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
	 System.out.println("Numero " + String.valueOf(numero));
	 System.out.println("Expresion " + String.valueOf(expresion));
	 System.out.println("Entero Grande " + String.valueOf(enteroGrande));
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion
	 System.out.println("La comparacion de las cadenas es: " + cadena.compareTo(otraCadena));
        // Fin modificacion
      }
   }
