/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;

public class Invitados_Premios {
    
    public static void main(String[] args) {
    
        
        try {
            
            FileReader aInv = new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Invitados.txt");
            FileReader aPrem = new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Premios.txt");
            
            BufferedReader datInv = new BufferedReader(aInv);
            BufferedReader datPrem;
            
            String lnInv = datInv.readLine(), lnPrem = "";
            byte dado, contPrem=1;
            
            while (lnInv != null){
                
                dado = (byte)(Math.random()*(7+1)-1);
                datPrem = new BufferedReader(aPrem);
                lnPrem = datPrem.readLine();
                
                while(lnPrem != null & contPrem < dado){
                    contPrem++;
                    lnPrem = datPrem.readLine();
                }
                System.out.println("Premio Invitado " +lnInv+ ": "+ lnPrem);
                datPrem.close();
                
                lnInv = datInv.readLine();
            }
            datInv.close();
            
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } 
        finally {
            System.out.print("Fin de la Ejecucion");            
        }
        
        
    }
}
