/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial1_japv;
import java.util.Scanner;
        

public class Parcial1_JAPV {

    public static void main(String[] args) {
        try {
            System.out.println(Simular_Juego((byte)3));
            System.out.println(Cifrar_Caracter());
        } 
        catch (Exception error) {
            
            System.out.print("\n Se presento un error. \n" + error);
        } 
        finally {
            System.out.print("\nFin de la Ejecucion");            
        }
  
        
    }
    static String Simular_Juego(byte jugadores) {
        
        String salida="", ganador="", salidaTotal="";
        byte jugador1=0, jugador2=0, jugador3=0, jugador4=0, jugador5=0, jugador6=0; 
        try {
            
            if (jugadores > 1 && jugadores < 7){
                
                if(jugadores == 2){
                
                    jugador1 = (byte)((Math.random()*(12-1))+1);
                    jugador2 = (byte)((Math.random()*(12-1))+1);
                    
                    if(jugador1>=jugador2){ganador = "Jugador 1"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador1 + " Puntos";}
                    else if(jugador1<=jugador2){ganador = "Jugador 2"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador2 + " Puntos";}
                }
                else if(jugadores == 3){
                    
                    jugador1 = (byte)((Math.random()*(12-1))+1);
                    jugador2 = (byte)((Math.random()*(12-1))+1);
                    jugador3 = (byte)((Math.random()*(12-1))+1);
                    
                    if(jugador1>=jugador2 && jugador1>=jugador3){ganador = "Jugador 1"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador1 + " Puntos";}
                    else if(jugador2>=jugador1 && jugador2>=jugador3){ganador = "Jugador 2"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador2 + " Puntos";}
                    else if(jugador3>=jugador2 && jugador3>=jugador1){ganador = "Jugador 3"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador3 + " Puntos";}
                }
                else if(jugadores == 4){
                
                    jugador1 = (byte)((Math.random()*(12-1))+1);
                    jugador2 = (byte)((Math.random()*(12-1))+1);
                    jugador3 = (byte)((Math.random()*(12-1))+1);
                    jugador4 = (byte)((Math.random()*(12-1))+1);
                    
                    if(jugador1>=jugador2 && jugador1>=jugador3 && jugador1>=jugador4){ganador = "Jugador 1"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador1 + " Puntos";}
                    else if(jugador2>=jugador1 && jugador2>=jugador3 && jugador2>=jugador4){ganador = "Jugador 2"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador2 + " Puntos";}
                    else if(jugador3>=jugador2 && jugador3>=jugador1 && jugador3>=jugador4){ganador = "Jugador 3"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador3 + " Puntos";}
                    else if(jugador4>=jugador1 && jugador4>=jugador2 && jugador4>=jugador3){ganador = "Jugador 4"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador4 + " Puntos";}
                }
                else if(jugadores == 5){
                
                    jugador1 = (byte)((Math.random()*(12-1))+1);
                    jugador2 = (byte)((Math.random()*(12-1))+1);
                    jugador3 = (byte)((Math.random()*(12-1))+1);
                    jugador4 = (byte)((Math.random()*(12-1))+1);
                    jugador5 = (byte)((Math.random()*(12-1))+1);
                    
                    if(jugador1>=jugador2 && jugador1>=jugador3 && jugador1>=jugador4 && jugador1>=jugador5){ganador = "Jugador 1"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador1 + " Puntos";}
                    else if(jugador2>=jugador1 && jugador2>=jugador3 && jugador2>=jugador4 && jugador2>=jugador5){ganador = "Jugador 2"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador2 + " Puntos";}
                    else if(jugador3>=jugador2 && jugador3>=jugador1 && jugador3>=jugador4 && jugador3>=jugador5){ganador = "Jugador 3"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador3 + " Puntos";}
                    else if(jugador4>=jugador1 && jugador4>=jugador2 && jugador4>=jugador3 && jugador4>=jugador5){ganador = "Jugador 4"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador4 + " Puntos";}
                    else if(jugador5>=jugador1 && jugador5>=jugador2 && jugador5>=jugador3 && jugador5>=jugador4){ganador = "Jugador 5"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador5 + " Puntos";}
                }
                else if(jugadores == 6){
                
                    jugador1 = (byte)((Math.random()*(12-1))+1);
                    jugador2 = (byte)((Math.random()*(12-1))+1);
                    jugador3 = (byte)((Math.random()*(12-1))+1);
                    jugador4 = (byte)((Math.random()*(12-1))+1);
                    jugador5 = (byte)((Math.random()*(12-1))+1);
                    jugador6 = (byte)((Math.random()*(12-1))+1);
                    
                    if(jugador1>=jugador2 && jugador1>=jugador3 && jugador1>=jugador4 && jugador1>=jugador5 && jugador1>=jugador6){ganador = "Jugador 1"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador1 + " Puntos";}
                    else if(jugador2>=jugador1 && jugador2>=jugador3 && jugador2>=jugador4 && jugador2>=jugador5 && jugador2>=jugador6){ganador = "Jugador 2"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador2 + " Puntos";}
                    else if(jugador3>=jugador2 && jugador3>=jugador1 && jugador3>=jugador4 && jugador3>=jugador5 && jugador3>=jugador6){ganador = "Jugador 3"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador3 + " Puntos";}
                    else if(jugador4>=jugador1 && jugador4>=jugador2 && jugador4>=jugador3 && jugador4>=jugador5 && jugador4>=jugador6){ganador = "Jugador 4"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador4 + " Puntos";}
                    else if(jugador5>=jugador1 && jugador5>=jugador2 && jugador5>=jugador3 && jugador5>=jugador4 && jugador5>=jugador6){ganador = "Jugador 5"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador5 + " Puntos";}
                    else if(jugador6>=jugador1 && jugador6>=jugador2 && jugador6>=jugador3 && jugador6>=jugador4 && jugador6>=jugador5){ganador = "Jugador 6"; salida="El ganador fue: \n" + ganador + " Con un total de " + jugador6 + " Puntos";}
                }

                salidaTotal = "Juego Simulado, Resultados: " + "\nJugador 1 = " + jugador1 + "\nJugador 2 = " + jugador2 + "\nJugador 3 = " + jugador3
                    + "\nJugador 4 = " + jugador4+ "\nJugador 5 = " + jugador5 + "\nJugador 6 = " + jugador6 + "\n" + salida; 
            }
            else salidaTotal = "Numero de Jugadores Invalido";
            
            return salidaTotal;
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salidaTotal = "Error en Simular Juego";
        }
    }
    
    static String Cifrar_Caracter() {
        
        short caracter, cifrado;
        String salida="Error den Cifrar Caracter";
        
        try {
            caracter = (short)((Math.random()*(123-97))+97);
            cifrado = (short)(219-caracter);
            
            salida = (char)caracter+"->"+(char)cifrado;
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
}
