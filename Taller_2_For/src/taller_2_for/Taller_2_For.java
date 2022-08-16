/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_2_for;
import java.util.Scanner;

public class Taller_2_For {
static Scanner teclado = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        byte seleccion=0;
        
        System.out.println("Bienvenido al Sistema del Taller #2 \nPor favor elija una de las siguientes funciones a probar:"
            + "\n1. Imprimir Raices"
            + "\n2. Generar Aleatorios"
            + "\n3. Suma de Aleatorios"
            + "\n4. Simular Sorteo");
        seleccion = teclado.nextByte();

        if(seleccion > 0 && seleccion < 5){
            
            switch (seleccion){
            
                case 1 : {
                    //
                    // IMPRIMIR RAICES
                    //
                    //VARIABLES
                    short num;
        
                    //ENTRADAS
                    System.out.println("Bienvenido a la Funcion: Imprimir Raices.\nPor favor ingresa la cantidad de numeros a Calcular");
                    num = teclado.nextShort();
        
                    //PROCESO Y SALIDAS
                    Calcular_Raices(num);
                } break;
                case 2 : {
                
                     //
                    // GENERAR ALEATORIOS
                    //
                    //VARIABLES
                    short numMin, numMax;
        
                    //ENTRADAS
                    System.out.println("Bienvenido a la Funcion: Generar Aleatorios. \nPor favor ingresa el maximo del rango");
                    numMax = teclado.nextShort();
        
                    System.out.println("\nPor favor ingresa el minimo del rango");
                    numMin = teclado.nextShort();
        
                    //PROCESO Y SALIDAS
                    Generar_Aleatorios(numMin, numMax);
                } break;
                case 3 : {
                    
                    //
                    // SUMA ALEATORIOS
                    //
                    //VARIABLES
                    short numMin, numMax, cantidad;
        
                    //ENTRADAS
                    System.out.println("Bienvenido a la Funcion: Generar Aleatorios. \nPor favor ingresa el maximo del rango");
                    numMax = teclado.nextShort();
        
                    System.out.println("\nPor favor ingresa el minimo del rango");
                    numMin = teclado.nextShort();
        
                    System.out.println("\nPor favor ingresa el Numero de aleatorios a Sumar");
                    cantidad = teclado.nextShort();
        
                    //PROCESO Y SALIDAS
                    System.out.println(Sumar_Aleatorios(cantidad, numMin, numMax));
                } break;
                case 4 : Sortear(); break;
            }
        }
    }
    //ZONA DE FUNCIONES
    static void Calcular_Raices(short numRaices) {
        try {
            short i;
            short contador = 0;
            for(i=1; i<= numRaices; i++){
                contador++;
                short num = (short)(Math.random()*(255-2)+2);
                System.out.println("Numero "+ contador +": " + num + "  -->  Raiz: " + Math.sqrt((double)num));
            }
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
    
    static void Generar_Aleatorios(short min, short may) {
        
        try {
            short i =0, aleatorio=0, contador=0, pares=0, inpares=0;
            if (min >= may) System.out.println("El rango es incorrecto");
            
            else{
                
                for(i=1; i<=900; i++){
                    aleatorio = (short)(Math.random()*((may+1)-min)+min);
                    contador++;
                    System.out.println("Numero " + contador + ": " + aleatorio);
                    
                    if ((aleatorio % 2) == 0) pares++;
                    else if ((aleatorio % 2) != 0) inpares++;
                }
                System.out.println("\nSe han Generado " + contador + " Numeros. \nPares: " + pares + "\nInpares: " + inpares);
            }
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
    
    static short Sumar_Aleatorios(short cantidad, short min, short max) {
        
        short suma=0, aleatorio=0,i,contador=0;
        try {
            if(!(min >= max)){
                
                for(i=1; i <= cantidad; i++){
                
                    contador++;
                    aleatorio = (short)(Math.random()*((max+1)-min)+min);
                    suma = (short)(suma + aleatorio);
                    System.out.println("Numero " + contador + ": " + aleatorio);
                }
                System.out.println("La suma de Aleatorios es: ");
                return suma;
            }else {System.out.println("RANGO EQUIVOCADO, INTENTE DE NUEVO. ");return suma;} 
        } catch (Exception error) {
            System.out.print("\n Se presento un error. Rango Equivocado.\n" + error);
            return suma;
        }
    }
    
    static void Sortear() {
        
        byte contador, d1=0,d2=0,d3=0,d4=0;
        String premio="", premioSerie=""; 
        short serie=0;
        
        try {
            for(contador=20;contador>=1; contador--){
                
                if (contador == 20) System.out.println("\n====== PREMIOS MENORES =======");
                else if (contador == 5) System.out.println("\n====== PREMIOS SECOS =======");
                else if (contador == 1) System.out.println("\n====== PREMIO MAYOR =======");
                
                d1 = (byte)(Math.random()*(5-1)+1);
                d2 = (byte)(Math.random()*(5-1)+1);
                d3 = (byte)(Math.random()*(5-1)+1);
                d4 = (byte)(Math.random()*(5-1)+1);
                serie = (short)(Math.random()*(151-100)+100);
                
                premio = "" + d1+d2+d3+d4;
                premioSerie = "" + premio + " - Serie: " + serie;
                
                System.out.println("Sorteo #" + contador + " - Numero Premiado: " + premioSerie);
            }
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
    }
}
