/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_6;
import java.io.*;

public class Clase_6 {

    //VARIABLES GLOBALES    
    static File archivo;
    static FileReader ciudades;
    static BufferedReader datosCiudades;
    
    public static void main(String[] args) {

        //Imprimir_Ciudades();
        Leer_Mediciones();
        //Promediar_Mediciones();
        //Contar_Ganar();

    }
    static void Imprimir_Ciudades() {
        
        try {
            
            // UBICO EL ARCHIVO A OPERAR
            archivo = new File("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Ciudades.txt");
            
            //ABRO EL ARCHIVO EN SOLO LECTURA
            ciudades = new FileReader(archivo);
            
            //CARGO LOS ARCHIVOS EN MEMORIA PARA OPERARLO
            datosCiudades = new BufferedReader(ciudades);
            
            String linea = datosCiudades.readLine(); // LEE LA PRIMERA LINEA
            if (linea != null)System.out.println(linea);
            else System.out.println("Archivo Vacio.");
            datosCiudades.close();
            
            while (linea != null){
                System.out.println(linea);
                linea = datosCiudades.readLine();
            }
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
    
    static void Leer_Mediciones() {
        short contador=1;
        
        try {    
            archivo = new File("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Mediciones.txt");
            FileReader mediciones = new FileReader(archivo);
            BufferedReader datosMed = new BufferedReader(mediciones);
        
            String linea = datosMed.readLine();
            
            while(linea != null){
                System.out.println("Medicion " + contador + ": " + linea);
                contador ++;
                linea = datosMed.readLine();
            
            }
            
            datosMed.close();
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
    static void Promediar_Mediciones() {
        short contador=1;
        float suma=0;
        
        try {    
            archivo = new File("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Mediciones.txt");
            FileReader mediciones = new FileReader(archivo);
            BufferedReader datosMedPromedio = new BufferedReader(mediciones);
        
            String linea = datosMedPromedio.readLine();
            
            while(linea != null){
                suma = suma + Float.parseFloat(linea);
                System.out.println("Medicion " + contador + ": " + linea);
                contador ++;
                linea = datosMedPromedio.readLine();
            }
            
            System.out.println("El Promedio de sus mediciones es: " + (suma/(contador - 1)));
            datosMedPromedio.close();
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
    
    static void Contar_Ganar() {
        byte contador=0;
        
        try {
            archivo = new File("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Palabras.txt");
            FileReader palabras = new FileReader(archivo);
            BufferedReader datosPal = new BufferedReader(palabras);
            
            String linea = datosPal.readLine();
            
            while(linea != null){
                
                System.out.println(linea);
                if (linea.equals("GANAR")){
                    
                    contador++;
                }
                
                linea = datosPal.readLine();
            }
            
            System.out.println("GANAR salio: " + contador + "veces.");
            datosPal.close();
            
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error );
        }
    }
}
