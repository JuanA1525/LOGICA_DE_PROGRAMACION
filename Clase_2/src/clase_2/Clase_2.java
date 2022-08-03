/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_2;


import java.util.Scanner; // SOLICITAR INFO AL USUSARIO
import javax.swing.JOptionPane;

/**
 *
 * @author juana
 */
public class Clase_2 {

    public static void main(String[] args) {
        try {
            /*
            //VARIABLES...
            Scanner teclado = new Scanner(System.in);// LEE TECLADO
            byte edad = 0;
            
            //PROCESO...
            System.out.println("Ingresa tu Edad: \n");
            edad = teclado.nextByte();
            
            //SALIDA...
            System.out.println("TU EDAD ES: " + edad);
            System.out.println("NACISTE EN EL: " + Math.abs(edad - 2022));
            */
            
            /*
            //VARIABLES...
            String edad_txt;
            byte edad;
            
            //PROCESO...
            edad_txt = JOptionPane.showInputDialog("Digite su Edad: ");
            edad = Byte.parseByte(edad_txt);
            
            //SALIDA...
            JOptionPane.showMessageDialog(null, "Usted nacio en el: " + Math.abs(edad - 2022));
            */
            
            /*
            System.out.println("Result Divicion: " + (13/3));
            System.out.println("Result Sobrante: " + (13%3));
            */
            
            //VARIABLES
            long partida =0;
            
            //ENTRADA
            Scanner teclado = new Scanner(System.in);
            System.out.println("POR FAVOR DAME # de Habitantes: ");
            int hab = teclado.nextInt();
            System.out.println("DAME EL AREA TOTAL");
            int area = teclado.nextInt();
            
            //PROCESO Y SALIDA
            if (hab > 100000 && area > 20000){
                partida = 500000000;
            }
            else if(hab > 100000 && area <= 20000){
                partida = 450000000;
            }
            else if(hab <= 100000 && hab >= 80000 && area > 20000){
                partida = 600000000;
            }
            else{
                partida = 300000000;
            }
            
            //SALIDA 
            System.out.println("TU PARTIDA ES: " + partida);
            
            
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        } finally {
            System.out.print("Fin de la Ejecucion");            
        }
    }
}
