/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_1;
// import java.math.BigInteger;

/**
 *
 * @author juana
 */
public class Clase_1 {


    public static void main(String[] args) {

     // 1. DEFINICION DE VARIABLES Y CONSTANTES.
        
        // ENTEROS
        byte contador_in, contador_out = 0; //in esta declarado y out declarado e inicializado.
        final short vol_m3 = 800; // el "final" me lo declara como una constante. 
        final int sal_fijo = 90000000;
        int sal_var = 0;
        long tam_continente = 2837648324868368263L; 
        
                
        // REALES
        float nota1 = 0.0f; // la "f" me declara el 0.0 como un float y no como double.
        float nota2 = (float)0.0; // Hago un casteo o una conversion para entregar a la variable un float.
        double coord_x = 35.723497010503; 
        
        // LOGICOS BOOLEAN
        boolean encendido = false;
        
        // CHAR
        char letra = 'a';
        char letra_as_min = (char)97; // 97 es un numero, para que me lo convierta a la letra "a" debo hacer casteo
        char letra_as_may = (char)97 - 32;
        
        char letra_as_may_conv = (char)((short)letra_as_min - 32); //hago 2 conversiones para pasar de char a numero y vice versa.
        
     // 2. INSTRICIONES PARA OBTENCION DE DATOS DE ENTRADA.
        
     // 3. OPERACIONES Y PROCESOS.
        
     // 4. DATOS DE SALIDA.
    
        System.out.println(letra_as_may_conv);
    }
}
