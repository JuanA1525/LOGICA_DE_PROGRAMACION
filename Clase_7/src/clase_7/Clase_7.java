/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_7;
import java.io.*;

public class Clase_7 {
    
    public static void main(String[] args) {
    
        try {
         
            FileReader lectorEst = new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Manejo 2 Archivos\\Estudiantes.txt");
            BufferedReader datosEst = new BufferedReader(lectorEst);
            
            FileReader lectorNotas = new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Manejo 2 Archivos\\Notas.txt");
            BufferedReader datosNotas = new BufferedReader(lectorNotas);
            
            int cantEst=0, cantNotas=0;
            String lineaEst = datosEst.readLine();
            String lineaNotas = datosNotas.readLine();
            
            if (lineaEst == null || lineaNotas == null) System.out.println("Error: Archivo Vacio.");
            else{
                
                while(lineaEst != null || lineaNotas != null){
                    
                    if(lineaEst != null) cantEst++;
                    if(lineaNotas != null) cantNotas++;

                    lineaEst = datosEst.readLine();
                    lineaNotas = datosNotas.readLine();
                }
                
                System.out.println("Lineas Estudiantes: " + cantEst);
                System.out.println("Lineas Notas: " + cantNotas);
                
                if(cantEst == cantNotas)System.out.println("Los archivos TIENEN las mismas lineas");
                else System.out.println("Los archivos NO tienen las mismas lineas");
            }
        } 
        
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } 
        
        finally {
            System.out.print("Fin de la Ejecucion");            
        }        
    }
}
