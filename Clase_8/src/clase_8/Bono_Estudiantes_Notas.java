/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_8;

import java.io.BufferedReader;
import java.io.FileReader;

public class Bono_Estudiantes_Notas {
    
    public static void main(String[] args) {
        
        try {
            
            String archivo = "C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Estudiantes_Notas.txt";
            
            System.out.println(Sacar_Promedios(archivo));
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
    
    public static String Sacar_Promedios(String archivo){
        try {
            
            BufferedReader buffer = new BufferedReader(new FileReader(archivo));
            String nombre_est = "", cadena_est = "", cadena_final = "", linea;
            float verificar, nota1 = 0,  nota2 = 0, nota3 = 0, nota_promedio = 0, nota_may = 0, nota_men = 0, nota_prom_global = 0;
            byte ganaron_curso = 0, perdieron_curso = 0, nro_est = 0;
            
            linea = buffer.readLine();
            
            while(linea != null){
                
                
                nombre_est = linea;
                
                
                try {
                    
                    linea = buffer.readLine();
                    nota1 = Float.parseFloat(linea) * 0.2f;
                    linea = buffer.readLine();
                    nota2 = Float.parseFloat(linea) * 0.4f;
                    linea = buffer.readLine();
                    nota3 = Float.parseFloat(linea) * 0.4f;
                    
                } catch (Exception e) {
                    return "El archivo no tiene la estructura esperada.";
                }
                
                nota_promedio = nota1 + nota2 + nota3;
                
                nota_men = nota_promedio;
                
                if(nota_promedio >= 3) ganaron_curso++;
                else perdieron_curso++;
                
                if (nota_promedio > nota_may) {
                    nota_may = nota_promedio;
                }
                
                if(nota_promedio < nota_men){
                    nota_men = nota_promedio;
                }
                
                nota_prom_global = nota_prom_global + nota_promedio;
                nro_est++;
                
                cadena_est = cadena_est + "\nEl estudiante " + nombre_est + " tuvo como nota: "  + Math.round(nota_promedio*100.0)/100.0;
                
                linea = buffer.readLine();
            }
            
            nota_prom_global = nota_prom_global / nro_est;
            
            cadena_final = "Las notas definitivas fueron: " + cadena_est + "\nLa cantidad de estudiantes en el curso es: " + nro_est + " estudiantes\nGanaron curso: " + ganaron_curso + "\n Perdieron curso: " + perdieron_curso + "\n Nota mas alta: " + Math.round(nota_may*100.0)/100.0 + "\n Nota mas baja: " + Math.round(nota_men*100.0)/100.0 + "\nPromedio Final Global: " + Math.round(nota_prom_global*100.0)/100.0;
            buffer.close();
            return cadena_final;
            
        } catch (Exception e) {
            return "Error: \n" + e;
        }
    }   
}
