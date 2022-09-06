/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_8;

import java.io.BufferedReader;
import java.io.FileReader;


public class Reto_Archivos {

    public static void main(String[] args) {
        
        try {
            
            String archivo = "C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Estudiantes_Notas.txt";
            
            System.out.println(Resumir_Resultados_Curso(archivo));
            System.out.println(Datos_Estudiantes(archivo));
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
    }
    
    public static String Resumir_Resultados_Curso(String archivo){
        try {
            
            BufferedReader buffer = new BufferedReader(new FileReader(archivo));
            String nombre_est = "", cadena_est = "", cadena_final = "", linea, est_error="0";
            float verificar, nota1 = 0,  nota2 = 0, nota3 = 0, nota_promedio = 0, nota_may = 0, nota_men = 0, nota_prom_global = 0.0f;
            byte ganaron_curso = 0, perdieron_curso = 0, nro_est = 0;
            
            linea = buffer.readLine();
            
            while(linea != null){
                
                
                nombre_est = linea;
                
                try {
                    
                    linea = buffer.readLine();
                    nota1 = Float.parseFloat(linea);
                    
                    linea = buffer.readLine();
                    nota2 = Float.parseFloat(linea);
                    
                    linea = buffer.readLine();
                    nota3 = Float.parseFloat(linea);
                    
                    if ((nota1 > 5 || nota1 < 0) || (nota2 > 5 || nota2 < 0) || (nota3 > 5 || nota3 < 0)){
                        
                        nota1 =-1;
                        nota2 =-1; 
                        nota3 =-1;
                    } 
                                        
                } catch (Exception e) {
                    return "El archivo no tiene la estructura esperada.";
                }
                nota_promedio = (nota1 + nota2 + nota3)/3;
                
                if(nota_promedio == -1){
                    est_error = est_error + "\n" + nombre_est;
                }else{
                    
                    nota_men = nota_promedio;
                
                    if(nota_promedio >= 3) ganaron_curso++;
                    else perdieron_curso++;

                    if (nota_promedio > nota_may) {
                        nota_may = nota_promedio;
                    }

                    if(nota_promedio < nota_men){
                        nota_men = nota_promedio;
                    }
                    System.out.println(nota_promedio);
                    nota_prom_global = (float)(nota_prom_global + nota_promedio);
                    System.out.println(nota_prom_global);
                    nro_est++;

                    cadena_est = cadena_est + "\nEl estudiante " + nombre_est + " tuvo como nota: "  + Math.round(nota_promedio*100.0)/100.0;

                    linea = buffer.readLine();
                }

                nota_prom_global = ((nota_prom_global/nro_est)*100) ;

                cadena_final = "La cantidad de estudiantes en el curso es: " + nro_est + " estudiantes\nGanaron curso: " + ganaron_curso + "\nPerdieron curso: " + perdieron_curso + "\nNota mas alta: " + Math.round(nota_may*100.0)/100.0 + "\nNota mas baja: " + Math.round(nota_men*100.0)/100.0 + "\nPromedio Final Global: " + nota_prom_global;

            }
            return cadena_final;
                
        } catch (Exception e) {
            return "Error: \n" + e;
        }
    }   
    
        public static String Datos_Estudiantes(String archivo){
        try {
            
            BufferedReader buffer = new BufferedReader(new FileReader(archivo));
            String nombre_est = "", cadena_est = "", cadena_final = "", linea, est_error="0";
            float verificar, nota1 = 0,  nota2 = 0, nota3 = 0, nota_promedio = 0, nota_may = 0, nota_men = 0, nota_prom_global = 0;
            byte ganaron_curso = 0, perdieron_curso = 0, nro_est = 0;
            
            linea = buffer.readLine();
            
            while(linea != null){
                
                
                nombre_est = linea;
                
                try {
                    
                    linea = buffer.readLine();
                    nota1 = Float.parseFloat(linea);
                    
                    linea = buffer.readLine();
                    nota2 = Float.parseFloat(linea);
                    
                    linea = buffer.readLine();
                    nota3 = Float.parseFloat(linea);
                    
                    if ((nota1 > 5 || nota1 < 0) || (nota2 > 5 || nota2 < 0) || (nota3 > 5 || nota3 < 0)){
                        
                        nota1 =-1;
                        nota2 =-1; 
                        nota3 =-1;
                        
                    } 
                                        
                } catch (Exception e) {
                    return "El archivo no tiene la estructura esperada.";
                }
                nota_promedio = (nota1 + nota2 + nota3)/3;
                
                if(nota_promedio == -1){
                    est_error = est_error + "\n" + nombre_est;
                }else{
                    
                    cadena_est = cadena_est + "\nEl estudiante " + nombre_est + " tuvo como nota: "  + Math.round(nota_promedio*100.0)/100.0;

                    linea = buffer.readLine();
                }

                nota_prom_global = nota_prom_global / nro_est;

                cadena_final = cadena_est + "\nLos estudiantes con error son: " + est_error;

            }
            return cadena_final;
                
        } catch (Exception e) {
            return "Error: \n" + e;
        }
    }   
}
