package clase_9;
import java.io.*;

public class Clase_9 {

    public static void main(String[] args) {
        
        //System.out.println("El Numero calculado fue: " + Calcular_Score());
        System.out.println(Empacar_Cajas());
    }
    
    static long Calcular_Score() {
        
        try {
            FileReader ar_Juego =  new FileReader("C:\\Users\\juana\\OneDrive\\Documentos\\Pruebas Archivos\\Archivo_Juego.txt");
            BufferedReader datJuegos =  new BufferedReader(ar_Juego);
            
            String line = "", move ="";
            int ptos = 0;
            long saldo = 0;
            
            
            line = datJuegos.readLine();
            
            while(line != null){
                move = line;
                
                switch(move){
                    
                    case ("D") :
                        line = datJuegos.readLine();
                        ptos = Integer.parseInt(line);
                        saldo += ptos;
                    break;
                    
                    case("I") :
                        line = datJuegos.readLine();
                        ptos = Integer.parseInt(line);
                        saldo -= ptos;
                    break;
                    
                    case("A") :
                        line = datJuegos.readLine();
                        ptos = Integer.parseInt(line);
                        saldo += ptos;
                        saldo = (long)Math.pow(saldo, 3);
                    break;
                    
                    default : return -1;
                }
                
                line = datJuegos.readLine();
            }
            
            datJuegos.close();
            return saldo;
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return -1;
        }
    }
    
    static String Empacar_Cajas() {
        
        int consFrasco = 500, nro = (int)(Math.random()*(200001-100000)+100000);
        String salida="", txtFrascos="|";
        
        try {
            
            while((nro%6) != 0){
                nro = (int)(Math.random()*(2001-1000)+1000);
            }
            
            System.out.println("\nNumero de Frascos = " + nro);
            System.out.println("Cajas a Empacar = " + nro/12 + "\n");
            
            System.out.println("Informacion Cajas: ");
            
            for (int caja = 1; caja <= (nro/12); caja++) {
                
                for (int frascos = 1; frascos <= 12; frascos++) {
                
                    txtFrascos += consFrasco + "|";
                    consFrasco++;
                }
                salida += "C-" + caja + " = " + txtFrascos + "\n";
                txtFrascos = "|";
            }
            
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return "" + error;
        }
    }
}
