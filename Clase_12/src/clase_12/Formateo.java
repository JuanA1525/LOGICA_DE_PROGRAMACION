
package clase_12;

import java.text.DecimalFormat;

public class Formateo {
    
    //ATRIBUTOS DE COLORES
    static String 
            verde = "\u001B[32m",
            rojo = "\u001B[31m",
            azul = "\u001B[34m",
            negro = "\u001B[30m",
            amarillo = "\u001B[33m",
            cyan = "\u001B[36m",
            morado = "\u001B[35m",
            blanco = "\u001B[37m",
            reset = "\u001B[0m";
    
    static String patron = "$#,###.#";
    static DecimalFormat formato = new DecimalFormat(patron);
            
    public static void main(String[] args) {
        
        float num = 832465.345f;
        
        try {
            
            System.out.println("HOLA");
            System.out.println(verde + "HOLA");
            System.out.println(rojo + "HOLA");
            System.out.println(negro + "HOLA");
            System.out.println(morado + "HOLA");
            System.out.println(amarillo + "HOLA");
            System.out.println(blanco + "HOLA");
            System.out.println(cyan + "HOLA");
            System.out.println(azul + "HOLA");
            System.out.println(reset + "HOLA");
            
            System.out.println("Numero Sin formato: " + num + "\nNumero Formateado: " + formato.format(num));
            
        } 
        
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } 
        
        finally {
            System.out.print("Fin de la Ejecucion");            
        }
    }
}
