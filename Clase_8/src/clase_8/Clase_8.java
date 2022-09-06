/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this templaten
 */
package clase_8;
import java.util.Scanner;


public class Clase_8 {

    public static void main(String[] args) {

        try {
            
            byte opcion =0, opcion2 =0;

            
            do{
                Scanner teclado = new Scanner(System.in);

                System.out.println(  """
                    
                Elija la Opcion: 
                1. Comprar Tiquetes. 
                2. Cancelar Tiquetes.
                3. Salir.
                                         
                """); 
            
            opcion = teclado.nextByte();
            
            
                
                switch(opcion){
                
                    case 1 : 
                        do{
                            System.out.println("Elija la Opcion deseada. \n"
                                + " 1. Tiquetes Nacionales.\n"
                                + " 2. Tiquetes Internacionales.\n"
                                + " 3. Salir.");
                            opcion2 = teclado.nextByte();
                        
                            switch(opcion2){
                              
                                case 1 :
                                    System.out.println("Elegiste Nacional.");
                                    opcion2 =3;
                                break;
                                case 2 : 
                                    System.out.println("Elegiste Internacional.");
                                    opcion2 =3;
                                break;         
                            }
                        }while(opcion2 !=3);
                            
                    break;
                
                    case 2 : 
                        do{
                            System.out.println("Elija la Opcion deseada.\n"
                                + " 1. Con # de Compra.\n"
                                + " 2. Con Documento de Identidad.\n"
                                + " 3. Salir.");
                        
                            opcion2 = teclado.nextByte();
                    
                    
                            switch(opcion2){
                        
                                case 1 : 
                                    System.out.println("Elegiste Con # de Compra.\n");
                                    opcion2 = 3;
                                break;
                                case 2 : 
                                    System.out.println("Elegiste Con Documento de Identidad.\n");
                                    opcion2 = 3;
                                break;
                            }   
                        }while(opcion2 != 3);
                    break;
                }
            } while(opcion != 3);
            
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } 
        finally {
            System.out.print("Fin de la Ejecucion");            
        }
        
    }
    
}
