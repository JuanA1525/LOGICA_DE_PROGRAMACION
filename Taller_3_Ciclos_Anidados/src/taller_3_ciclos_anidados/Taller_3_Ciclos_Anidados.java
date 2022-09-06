/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_3_ciclos_anidados;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller_3_Ciclos_Anidados {
    
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int cantBombillos;
        byte jugadores, anios;
        
        //
        //SIMULAR VENTAS
        //
        //System.out.println("Por Favor ingrese el numero de Años a calcular: ");
        //anios = teclado.nextByte();
        //System.out.println(Simular_Ventas(anios));
        
        //
        // EMPACAR BOMBILLOS
        //
        System.out.println("Por Favor ingrese el numero de Bombillos a empacar: ");
        cantBombillos = teclado.nextInt();
        Empacar_Bombillos(cantBombillos);
        
        //
        // Jugar 21
        //
        //System.out.println("Por Favor ingrese la cantidad de Jugadores: ");
        //jugadores = teclado.nextByte();
        //System.out.println(Jugar_21(jugadores));
        

    }
    
    static String Simular_Ventas(byte anios) {
        
        try {
            int ventasMes =0, ventaTotal=0;
            String salida="", ventaAnio="";
            String patron_num = "$ ###,###,###.##";
            DecimalFormat formato = new DecimalFormat(patron_num);
            
            for (int anio = 1; anio <= anios; anio++) {
                
                for (int mes = 1; mes <= 12; mes++) {
                    
                    ventasMes = (int)(Math.random()*(10000001-10000)+10000);
                    ventaTotal += ventasMes;
                }
                
                ventaAnio = "Total de Ventas año #" + anio + ": " + formato.format(ventaTotal) + "\n";
                salida += ventaAnio;
                ventaTotal = 0;
            }
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return "" + -1;
        }
    }
    
    static void Empacar_Bombillos(int cantBombillos) {
        
        try {
            int cantCajas=cantBombillos/30, cantPallets= cantCajas/16, bombillosSobrantes= (cantBombillos - (cantPallets*16*30)), bombillo=0, contCajas=0, cantCajasLlenas = (cantCajas - (bombillosSobrantes/30)) ;
            String infoCaja="", infoPallet="", infoBombs="";
            
            
            if(!(cantPallets < 1)){
                System.out.println("Cantidad de Bombillos a Empacar: " + cantBombillos);
                System.out.println("Cantidad de Bombillos sobrantes: " + bombillosSobrantes);
                System.out.println("Cantidad de Cajas: " + cantCajasLlenas);
                System.out.println("Cantidad de Pallets Necesarios: " + cantPallets);
                
                for (int Pallet = 1; Pallet <= cantPallets; Pallet++) {

                    for (int Caja = 1; Caja <= 16; Caja++) {

                        contCajas++;
                        infoBombs = "B" + bombillo + " - B" + (bombillo+30);
                        bombillo += 30;

                        infoCaja += "Caja #" + contCajas + ": " + infoBombs + "\n";
                    }

                    infoPallet += "Pallet #" + Pallet + ": \n" + infoCaja + "\n";
                    infoCaja ="";
                }

                System.out.println("\n" + infoPallet);
            }
            else{
                System.out.println("Cantidad de Bombillos muy Baja, por favor intente de nuevo.");
            }
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            System.out.println("-1\nDato ingresado Invalido");
        }
    }
    
    static String Jugar_21(byte jugadores) {
        
        byte carta, ptos=0;
        String salida = "", cartasJugador="", datosJugador="", estadoJugador;
        try {
            if(jugadores > 0 && jugadores < 7){
            
                for (int jugador = 1; jugador <= jugadores; jugador++) {
                    
                    for (int cartas = 1; cartas <= 3; cartas++) {
                        
                        carta = (byte)(Math.random()*(11 - 1)+1);
                        ptos += carta; 
                        cartasJugador += "Carta #"+ cartas + ": " + carta + "\n";
                    }
                    
                    if (ptos == 21) estadoJugador = "21 -> Juego Perfecto!!!\n\n";
                    else if (ptos < 21) estadoJugador = ptos + " -> Faltaron Puntos.\n\n";
                    else estadoJugador = ptos + " -> Sobraron Puntos.\n\n";
                    
                    datosJugador += " --- Jugador #" + jugador + ": ---\n" + cartasJugador + "\nPuntos Totales: " + ptos + "\n" + estadoJugador; 
                    salida += datosJugador;
                    datosJugador = "";
                    cartasJugador = "";
                    ptos = 0;
                }
                return salida;
            }
            else return "Cantidad de jugadores invaloda";
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return "" + -1;
        }
    }
}
