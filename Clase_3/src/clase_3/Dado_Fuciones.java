/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_3;


public class Dado_Fuciones {
    
    public static void main(String[] args) {

        try {
            //VARIABLES
            byte cara_dado = (byte)(Math.random()*6+1);
            
            //ENTRADAS
            //PROCESO
            //SALIDA
            System.out.println("La cara es: \n" + Obtener_Cara_Dado(cara_dado) +"\n" );
            
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } finally {
            System.out.print("Fin de la Ejecucion");            
        }

    }   
    static String Obtener_Cara_Dado(byte nro_cara){
        
        try {
            
            switch(nro_cara){
                case 1 : return "Uno";
                case 2 : return "Dos";
                case 3 : return "tres";
                case 4 : return "Cuatro";
                case 5 : return "Cinco";
                case 6 : return "Seis";
                default : return "Error";
            }
        } catch (Exception error) {
            
            System.out.print("\n Se presento un error. \n" + error);
            return ("ERROR DE ENTRADA");
        } finally {
            
            System.out.print("Fin de la Ejecucion");            
        }
    }   
}
