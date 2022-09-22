package clase_13;


public class Arrays {


    public static void main(String[] args) {
        
        try {
            /*
            // --- FORMA 1 ---
            byte[] v_edades; // DECLARACION DEL VECTOR EDADES
            v_edades = new byte[10]; // LE DOY AL VECTOR UN TAMANIO
            
            // --- FORMA 2 ---
            float[] v_notas = new float[4];// NOMBRO Y DOY TAMANIO EN UNA SOLA LINEA
            
            // --- FORMA 3 ---
            double[] v_temperaturas = {15.3 , 12.1 , 14.5, 12, 10, 34.9}; // NOMBRO Y ASIGNO DATOS
            
            
            //RECORRIDO
            //llena el array con randoms
            for (int i = 0; i < v_edades.length; i++) {
                
                v_edades[i] = (byte)(Math.random()*(91 - 1)+1);
            }
            //lee el array indice por indice
            for (int i = 0; i < v_edades.length; i++) {
                
                System.out.println(v_edades[i]);
            }
            */
            
            float[] v_temperaturas = Inicializar_Temperaturas();
            
            if (v_temperaturas.length == 1) {
                
                System.out.println("Hubo un error en la funcion");
            }
            else{
                for (int i = 0; i < v_temperaturas.length; i++) {
                    System.out.println("Temperatura " + (i+1) + " = " + v_temperaturas[i]);
                }
            }
        }
        
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
        }
        
        finally {
            System.out.print("Fin de la Ejecucion");            
        }
        
    }
    
    public static float[] Inicializar_Temperaturas(){
        
        try {
        
            byte tamanio = (byte)((Math.random()*100) + 1);
            float [] v_salida = new float[tamanio];
            
            for (int i = 0; i < tamanio; i++) {
                
                v_salida[i] = 0;
            }
            
            return v_salida;
        }
        
        catch (Exception error) {

            System.out.print("\n Se presento un error. \n" + error);        
            return new float[1];
        }
    }
}