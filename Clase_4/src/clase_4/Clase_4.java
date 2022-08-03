/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_4;

public class Clase_4 {

    public static void main(String[] args) {
        
        /*
        for(byte i=0; i<=100; i++){
            System.out.println(i);
        }
        */
    
        /*
        int contador =0;
        for (int i=150; i <=425; i++){
            
            if (i%3 == 0) contador++;
        }
        System.out.println(contador);
        //contador = 92
        */
        
        /*
        int i=0;
        short num = 0;
        
        for(i=0; i<=500; i++){
           num=(short)(Math.random()*(301-200)+200);
           System.out.println(num);
        }
        */
        
        //Generar_Aleatorios();
        
        System.out.println(Analizar_Temperaturas(50, 18, 10, 30));
        
        }
    
    static void Generar_Aleatorios() {
        try {
            int i=0;
            int contador = 0;
            int num=0;
            
            for(i=0; !(num==300); i++){
                num = (int)(Math.random()*(301-200)+200);
                contador++;
                
                System.out.println(num);
            }
            System.out.println("Para generar un 300 hiciste: " + contador);
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
    
    static String Analizar_Temperaturas(int temperaturas, int tempMedia, int inicialTemp, int finalTemp) {
        
        int i;
        String salida="";
        short contadorMay = 0, contadorMen = 0, contadorIgual = 0;
        
        try {
            
            for (i = 1; i <= temperaturas; i++){
            
                int actual = (int)(Math.random()*(finalTemp - inicialTemp)+(inicialTemp));
                
                if (actual > tempMedia) contadorMay++;
                else if (actual < tempMedia) contadorMen++;
                else contadorIgual++;
                
                System.out.println(actual);
            }
            
            return ("Tu numero de temperaturas fue: " + temperaturas + 
                "\nLas mayores de la media fueron: " + contadorMay +"\n Las menores a la media fueron: " 
                + contadorMen + "\n Las Iguales a la media fueron: " + contadorIgual);
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
}
