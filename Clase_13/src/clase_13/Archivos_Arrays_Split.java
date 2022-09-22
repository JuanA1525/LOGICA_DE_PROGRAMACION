package clase_13;
import java.io.*;
import java.text.DecimalFormat;

public class Archivos_Arrays_Split {

    static String mascara = "$#,###.0";
    static DecimalFormat formato = new DecimalFormat(mascara);
   
    static String 
        verde = "\u001B[32m",
        rojo = "\u001B[31m",
        reset = "\u001B[0m";
    
    public static void main(String[] args) {
        
        try {
            
            int[] v_Vtas = Cargar_Ventas();
            
            for (int i = 0; i < v_Vtas.length; i++) {
                
                if (v_Vtas[i] < 400000){
                    
                    System.out.println("Venta #" + (i+1) + " = " + rojo + formato.format(v_Vtas[i]) + reset);
                }
                else System.out.println("Venta #" + (i+1) + " = " + verde + formato.format(v_Vtas[i]) + reset);   
            }
        } 
        
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } 
        
        finally {
            System.out.print("Fin de la Ejecucion");            
        }
    }
    
    static int[] Cargar_Ventas() {
        
        try {
            
            FileReader lectorVtas = new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\ventas_desde_excel.csv");
            BufferedReader datVtas = new BufferedReader(lectorVtas);
            
            int[] v_salida;
            int pos = 0, cantLineas = 0;
            
            String v_split[];
            String ln="";
            
            ln=datVtas.readLine();
            
            while(ln != null){
                cantLineas ++;
                ln=datVtas.readLine();
            }
            datVtas.close();
            
            if (cantLineas == 0) {
                System.out.println("El Archivo esta VACIO");
                return new int[0];
            }
            else{
                lectorVtas = new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\ventas_desde_excel.csv");
                datVtas = new BufferedReader(lectorVtas);
                v_salida = new int[cantLineas];
                
                ln = datVtas.readLine();
                
                while(ln != null){
                    v_split = ln.split(",");
                    v_salida[pos] = Integer.parseInt(v_split[1]);
                    pos++;
                    
                    ln = datVtas.readLine();
                }
                
                datVtas.close();
            }
            
            return v_salida;
        } 
        
        catch (Exception error) {
            System.out.print("\nSe presento un error EN LA FUNCION. \n" + error);
            return new int[1];
        }
    }
}
