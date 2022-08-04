/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_5;
import java.util.Scanner;

public class Clase_5 {
static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        byte partidas =0;
        
        System.out.println("Por favor digite el # de partidas a Simular: ");
        partidas = teclado.nextByte();
        
        System.out.println(Simular_Partidas(partidas));
   
    }
    
    static String Simular_Partidas(byte partidas) {
        
        String salida="";
        byte jugador=0, i = 0;
        short puntos1=0, puntos2=0, puntos3=0, puntos4=0;
        String mayor="";
        short mayornum=0;
        
        try {
        
            for(i=1; i<=partidas;i++){
                
                if (partidas < 10 || partidas > 20) return "Las partidas deben ser entre 10 y 20";  
                
                jugador = ((byte)(Math.random()*(5-1)+1));
                
                switch(jugador){
                    
                    case 1 : puntos1 = (short)(puntos1 + 3);break;
                    case 2 : puntos2 = (short)(puntos2 + 3);break;
                    case 3 : puntos3 = (short)(puntos3 + 3);break;
                    case 4 : puntos4 = (short)(puntos4 + 3);break;

                }
                
                if (puntos1 > mayornum) {mayornum = puntos1; mayor = "Jugador 1"; salida = "El Ganador es: " + mayor + " con: " +puntos1 + " puntos.";  }
                else if (puntos2 > mayornum) {mayornum = puntos2; mayor = "Jugador 2"; salida = "El Ganador es: " + mayor + " con: " +puntos2 + " puntos.";}
                else if (puntos3 > mayornum) {mayornum = puntos3; mayor = "Jugador 3"; salida = "El Ganador es: " + mayor + " con: " +puntos3 + " puntos.";}
                else if (puntos4 > mayornum) {mayornum = puntos4; mayor = "Jugador 4"; salida = "El Ganador es: " + mayor + " con: " +puntos4 + " puntos.";}
            }

            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida = "error de entrada";
        }
    }
    
    static String Encontrar_Mayor() {
        
        try {
            short mayor=0;
            short aleatorio=0;
            short i =0;
            short contador = 0;
            
            for(i=0; i<20; i++){
                
                aleatorio = (short)(Math.random()*(501-10)+10);
                contador++;
                System.out.println("Numero " + contador + ": " + aleatorio);
                if (aleatorio > mayor) mayor = aleatorio;
            }
            return "El numero mayor de los Generasdos es: " + mayor;
             
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. En Encontrar mayor \n" + error);
            return "Error en Funcion";
        }
    }
        static void Generar_Letras() {
        try {
            byte nro_ascii=0;
            short i;
            for(i=1; i<=50; i++){
                
                nro_ascii = (byte)(Math.random()*(91-65)+65);
                System.out.println((char)nro_ascii + "--" + (char)(nro_ascii + 32));
            }
            
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            System.out.println("Error en Letras");
        }
    }
}
