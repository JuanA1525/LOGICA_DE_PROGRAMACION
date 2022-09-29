package clase_13;

public class Operaciones_Array {
    
    static String 
            verde = "\u001B[32m",
            rojo = "\u001B[31m",
            amarillo = "\u001B[33m",
            negro = "\u001B[30m",
            cyan = "\u001B[36m",
            reset = "\u001B[0m";
    
    static byte[] vEdad = new byte[50];
    
    public static void main(String[] args) {
        
        try {
            
            //LLENAR EL VECTOR DE ALEATORIOS
            System.out.println("Vector Generado:");
            Llenar_Vector();
            System.out.println(Imprimir_Vector_Str());
            
            //ORDENAR EL VECTOR
            System.out.println("\nVector Ordenado:");
            Ordenar_Vector();
            System.out.println(Imprimir_Vector_Str());
            
            //ELIMINAR ELEMENTOS DEL VECTOR
            System.out.println("\nEliminar Elemento:");
            Eliminar_Elemento((byte)5);
            System.out.println(Imprimir_Vector_Str());
            
            //ELIMINAR POSICIONES DEL VECTOR
            System.out.println("\nEliminar Posicion:");
            Eliminar_Posicion((byte)9);
            System.out.println(Imprimir_Vector_Str());
            
            //IMPRIMIR VECTOR
            System.out.println("\nVector Impreso como Str:");            
        }
        
        catch (Exception error) {
            System.out.print("\n--- Se presento un error ---\n" + error);
        } 
        
        finally {
            System.out.print("\n\nFin de la Ejecucion");            
        }
    }   
    
    static void Llenar_Vector() throws Exception {
        
        try {
            for (byte i = 0; i < vEdad.length; i++) {
                
                vEdad[i] = (byte)(Math.random()*(100 - 1)+1);
            }
        }
        catch (Exception error) {
            throw new Exception ("Error en LLENAR VECTOR\n" + error);
        }
    }
    
    static void Ordenar_Vector() throws Exception {
        
        byte num1, num2;
        
        try {
            
            for (byte i = 0; i < vEdad.length; i++) {
                
                for (int j = (i+1); j < vEdad.length; j++) {
                    
                    if (vEdad[i] > vEdad[j]) {
                        
                        num1 = vEdad[i];
                        num2 = vEdad[j];
                        
                        vEdad[i] = num2;
                        vEdad[j] = num1;
                    }
                }
            }
        } 
        
        catch (Exception error) {
            throw new Exception ("Error en ORDENAR VECTOR\n" + error);
        }
    }
    
    static void Eliminar_Elemento(byte khei) throws Exception {
        
        try {
            // Comprobamos que el key si esta en el elemento
            
            if (khei >= 1 & khei < vEdad.length) {
                
                vEdad[khei-1] = 0;
            }
            else{
                throw new Exception("El Elemento NO ES VALIDO");
            }
        }
        catch (Exception error) {
            throw new Exception ("Error en ELIMINAR ELEMENTO\n" + error);
        }
    }
    
    static void Eliminar_Posicion(byte khei) throws Exception {
        
        try {
            
            // Comprobamos que el key si esta en el elemento
            if (khei >= 1 & khei < vEdad.length) {
                
                vEdad[khei] = 0;
            }
            else{
                throw new Exception("El Elemento NO ES VALIDO");
            }
        }
        catch (Exception error) {
            throw new Exception ("Error en ELIMINAR ELEMENTO\n" + error);
        }
    }
    
    static String Imprimir_Vector_Str() throws Exception {
        
        String salida="";
        try {
            for (byte i = 0; i < vEdad.length; i++) {
                
                if (vEdad[i] >= 18) {
                    salida += (verde + vEdad[i] + reset + " | " + reset);
                }
                else if (vEdad[i] < 18 & vEdad[i] > 0) {
                    salida += (rojo + vEdad[i] + reset + " | " + reset);
                }   
                else if (vEdad[i] == 0){
                    salida += (cyan + vEdad[i] + reset + " | " + reset);
                }
            }
            return salida;
        }
        catch (Exception error) {
            throw new Exception ("Error en ELIMINAR ELEMENTO\n" + error);
        }
    }
}
