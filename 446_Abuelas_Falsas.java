package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author dby_x86
 */
public class Abuelas_Falsas {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numeroPruebas = scan.nextInt(); 
        
        while ( numeroPruebas > 0 ) {
            
            /*Limpieza del buffer*/ scan.nextLine();
            
            boolean esAbuela = false; // Daré por hecho que será falsa.
            String nombreCorrecto = scan.next(); 
            int cantidadNombres = Integer.parseInt(scan.next());
           
            if ( cantidadNombres > 1 ) {
                for ( int i = 0; i < cantidadNombres; i++ ) {
                    String nombre = scan.next();
                    if ( nombre.equals(nombreCorrecto) && i != (cantidadNombres - 1) ) {
                        break; // No hará falta comprobar más, por tanto paramos la ejecución y procedemos a mostrar el output.
                    } else if ( nombre.equals(nombreCorrecto) ) {
                        esAbuela = true; // Se ha dicho el nombre correcto en último lugar, por tanto sí es abuela.
                    }
                }
            }
            
            System.out.println(esAbuela ? "VERDADERA" : "FALSA");
            numeroPruebas--;
            
        }
        
    }
    
}
