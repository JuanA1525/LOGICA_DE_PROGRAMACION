/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion_1;

public class SESION_1 {

    public static void main(String[] args) {
        
        try {
            Comparar_Cadenas((byte)6);
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } 
        finally {
            System.out.print("Gracias por usar el servicio de Porras.");            
        }
        
        
    }
    
    static boolean Comparar_Cadenas(byte cantidad){
        
        try {
            byte i; 
            byte random;
            char caracter;
            String cadena1=""; 
            String cadena2="";
            
            for(i=1; i<=cantidad; i++){
                
                random = (byte)(Math.random()*(123-97)+97);
                caracter = ((char)(random));
                cadena1 = cadena1 + String.valueOf(caracter);
                
                random = (byte)(Math.random()*(123-97)+97);
                caracter = ((char)(random));
                cadena2 = cadena2 + String.valueOf(caracter);
            }
            
            System.out.println(cadena1 + "->" + cadena2);
            
            if(String.valueOf(cadena1).equals(cadena2)) {
                
                System.out.println("LAS CADENAS SON IGUALES");
                return true;
            }
            else{
                
                System.out.println("LAS CADENAS NO SON IGUALES");
                return false;
            }  
        } 
        catch (Exception error) {
            
            System.out.print("\n Se presento un error en Comparar Cadenas. \n" + error);
            return false;
        }
    }
}
