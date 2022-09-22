package clase_12;

import java.io.*;
import java.text.DecimalFormat;

public class Ventas_Archivos {
    
    static String patron = "$#,###.#";
    static DecimalFormat formato = new DecimalFormat(patron);

    public static void main(String[] args) {
        
        Ventas_Anio();
    }
    
    static void Ventas_Anio() {
        
        try {
            FileReader arcVentas = new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Ventas_anio.txt\\");
            BufferedReader datVentas = new BufferedReader(arcVentas);
            
            FileWriter escArc = new FileWriter("C:/Users/juana/OneDrive/Documentos/Pruebas Archivos/Resultado_Ventas_Anio.txt");
            PrintWriter lnEsc = new PrintWriter(escArc);
            
            String ln, salida="", anioAct;
            long vtasAnio=0;
            String[] ventas;
            
            ln = datVentas.readLine();
            while(ln != null){
                ventas = ln.split("@");
                anioAct = ventas[0];
                
                while(anioAct.equals(ventas[0]) & ln != null){
                    
                    vtasAnio += Long.parseLong(ventas[1]);
                    ln = datVentas.readLine();
                    if(ln != null)ventas = ln.split("@");
                }
                
                lnEsc.println("Ventas para el año " + anioAct + ": " + formato.format(vtasAnio));
                vtasAnio = 0;
                
            }
            datVentas.close();
            lnEsc.close();
            
        } catch (Exception error) {
            System.out.println("\n Se presento un error. \n" + error);
        }
    }
}
