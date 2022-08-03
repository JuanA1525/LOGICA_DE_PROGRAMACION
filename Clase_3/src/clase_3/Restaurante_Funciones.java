/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_3;
import java.util.Scanner;

public class Restaurante_Funciones {
    
        public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        try {
            
            //VARIABLES
            byte entrada_num;
            byte fuerte_num;
            byte bebida_num;
            
            
            //ENTRADAS
            System.out.println("Bienvenido al Restaurante PORRAS \n");
            System.out.println("Digite como desea su Menu: \n");
            
            System.out.println("Seleccione su Entrada: \n 1. Cevivhe \n 2. Crema \n 3. Patacones.");
            entrada_num = teclado.nextByte();
            
            System.out.println("Seleccione su Fuerte: \n 1. Pollo \n 2. Carne \n 3. Pecado.");
            fuerte_num = teclado.nextByte();
            
            System.out.println("Seleccione su Entrada: \n 1. Cerveza \n 2. Jugo \n 3. Gaseosa.");
            bebida_num = teclado.nextByte();
            
            //PROCESO
            
            //SALIDA
            System.out.println("\n" + ComprarComida(entrada_num, fuerte_num, bebida_num));
            
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
    
    static String ComprarComida(byte entrada, byte fuerte, byte bebida){
        
        String menu_txt = "Tus Selecciones no son Validas";
        try {
            
            String entrada_txt ="";
            String fuerte_txt;
            String bebida_txt;
            
            switch (entrada){
                case 1 : entrada_txt = "Ceviche"; break;
                case 2 : entrada_txt = "Crema"; break;
                case 3 : entrada_txt = "Patacones"; break;
                default : entrada_txt = "Entrada no Valida";
            }
            switch (fuerte){
                case 1 : fuerte_txt = "Pollo"; break;
                case 2 : fuerte_txt = "Carne"; break;
                case 3 : fuerte_txt = "Pescado"; break;
                default : fuerte_txt = "Fuerte no Valida";
            }
            switch (bebida){
                case 1 : bebida_txt = "Cerveza"; break;
                case 2 : bebida_txt = "Jugo"; break;
                case 3 : bebida_txt = "Gaseosa"; break;
                default : bebida_txt = "Bebida no Valida";
            }
            
            menu_txt = "El menu elegido es: \n Entrada: " + entrada_txt + "\n Fuerte: " + fuerte_txt + "\n Bebida: " + bebida_txt + "\n \nGracias por trabajar con Nosotros";
            return menu_txt;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return menu_txt;
        }
    }
}
