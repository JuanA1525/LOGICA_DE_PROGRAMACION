package taller_stings_archivosord;

import java.io.*;

public class Taller_Stings_ArchivosOrd {

    public static void main(String[] args) {

        System.out.println(Jugar_Triki());
        
    }
    
    static String Jugar_Triki() {
        
        try {
            FileReader lectorJuegos = new FileReader("C:\\Users\\juana\\OneDrive - UPB\\LOGICA DE PROGRAMACION\\Taller_String_Archivos\\triqui.txt");
            BufferedReader datTriki = new BufferedReader(lectorJuegos);
            
            
            String[] noms, vLn;
            byte[] ptos;
            String ln, salida ="",  J1, J2, Ganador;
            char pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8, pos9, simJ1;
            byte contJugadores = 0, posGanador=0, ptosMax=0, rep=0;
            
            ln = datTriki.readLine();
            while(ln != null){
                
                contJugadores++;
                ln = datTriki.readLine();
            }
            datTriki.close();
            noms = new String[contJugadores];
            ptos = new byte[contJugadores];
            
            lectorJuegos = new FileReader("C:\\Users\\juana\\OneDrive - UPB\\LOGICA DE PROGRAMACION\\Taller_String_Archivos\\triqui.txt");
            datTriki = new BufferedReader(lectorJuegos);
            
            ln = datTriki.readLine();
            for (byte i = 1; i <= contJugadores; i++) {
                
                vLn = ln.split("@");
                noms[(i-1)] = vLn[0];    
                ln = datTriki.readLine();
            }
            datTriki.close();
            lectorJuegos = new FileReader("C:\\Users\\juana\\OneDrive - UPB\\LOGICA DE PROGRAMACION\\Taller_String_Archivos\\triqui.txt");
            datTriki = new BufferedReader(lectorJuegos);
            
            ln = datTriki.readLine();
            for(byte j = 1; j <= contJugadores; j++){
                
                vLn = ln.split("@");
                J1 = vLn[0]; 
                J2 = vLn[2];
                
                simJ1 = vLn[1].charAt(0);
                
                pos1 = vLn[4].charAt(0);
                pos2 = vLn[4].charAt(1);
                pos3 = vLn[4].charAt(2);
                
                pos4 = vLn[5].charAt(0);
                pos5 = vLn[5].charAt(1);
                pos6 = vLn[5].charAt(2);
                
                pos7 = vLn[6].charAt(0);
                pos8 = vLn[6].charAt(1);
                pos9 = vLn[6].charAt(2);
                
                if ((pos1 & pos2 & pos3) == 'X' || (pos1 & pos2 & pos3) == 'O') {

                    if (pos1 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else if ((pos4 & pos5 & pos6) == 'X' || (pos4 & pos5 & pos6) == 'O') {

                    if (pos4 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else if ((pos7 & pos8 & pos9) == 'X' || (pos7 & pos8 & pos9) == 'O') {

                    if (pos7 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else if ((pos1 & pos4 & pos7) == 'X' || (pos1 & pos4 & pos7) == 'O') {

                    if (pos1 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else if ((pos2 & pos5 & pos8) == 'X' || (pos2 & pos5 & pos8) == 'O') {

                    if (pos2 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else if ((pos3 & pos6 & pos9) == 'X' || (pos3 & pos6 & pos9) == 'O') {

                    if (pos3 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else if ((pos3 & pos5 & pos7) == 'X' || (pos3 & pos5 & pos7) == 'O') {

                    if (pos3 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else if ((pos1 & pos5 & pos9) == 'X' || (pos1 & pos5 & pos9) == 'O') {

                    if (pos1 == simJ1) {
                        
                        Ganador = J1;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    }
                    
                    else{
                        Ganador = J2;
                        
                        for (int i = 0; i < noms.length; i++) {
                            if (noms[i].equals(Ganador)) {
                                posGanador=(byte)i;
                            }
                        }
                        
                        ptos[posGanador] += 2;
                    } 
                }
                
                else{
                    
                    Ganador = "EMPATE!!";
                    
                    for (int i = 0; i < noms.length; i++) {
                        
                        if (noms[i].equals(J1)) {
                            ptos[i]+=1;
                        }
                        
                        else if (noms[i].equals(J2)) {
                            ptos[i]+=1;
                        }
                    }
                }
                
                salida += "\nPartida #" + j + " Ganador: " +Ganador;
                ln = datTriki.readLine();
            }
            
            for (int i = 0; i < noms.length; i++) {
                if (ptos[i] > ptosMax) {
                    ptosMax = ptos[i];
                    posGanador = (byte)i;
                }
            }
            
            for (int i = 0; i < noms.length; i++) {
                if (ptos[i] == ptos[posGanador]) {
                    rep++;
                }
            }
            
            if (posGanador > 1) {
                salida += "\n\nHUBO UN EMPATE GENERAL!!!";
            }
            else{
                salida += "\n\nEl Ganador del Torneo fue: " + noms[posGanador] + " Con un total de " + ptos[posGanador] + " Puntos!";
            }
            
            return salida;
        } 
        
        catch (Exception error) {
            System.out.print("\nSe presento un error. En Fucnion ---> \n" + error);
            return "" + -1;
        }
    }
}