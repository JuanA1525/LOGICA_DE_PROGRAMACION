package clase_11;
import java.io.*;

public class Escritura_Archivos {

    public static void main(String[] args) {
        
        try {
        
            FileWriter aPrueba = new FileWriter("C:/Users/juana/OneDrive/Documentos/Pruebas Archivos/Prueba_Escritura");
            PrintWriter ln = new PrintWriter(aPrueba);
            
            ln.println("Estoy Imprimiendo esto en el archivo.");
            
            aPrueba.close();
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } 
        finally {
            System.out.print("Fin de la Ejecucion");            
        }
    }
}
