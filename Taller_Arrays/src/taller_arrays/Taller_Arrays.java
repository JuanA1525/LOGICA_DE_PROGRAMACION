package taller_arrays;

public class Taller_Arrays {

    public static byte[] vEdad = new byte[50]; 
    static String 
            verde = "\u001B[32m",
            rojo = "\u001B[31m",
            amarillo = "\u001B[33m",
            negro = "\u001B[30m",
            cyan = "\u001B[36m",
            reset = "\u001B[0m";
    
    public static void main(String[] args) {
    
        try {
            
            byte edad =5;
            
            Llenar_Vector();
            System.out.println(Imprimir_Vector_Str());
            
            Ordenar_Vector();
            System.out.println(Imprimir_Vector_Str());
            
            System.out.println(Edad_Existe(edad));
            
            System.out.println(Contar_Repetición_Edad(edad));
            
            for (byte i = 0; i < Extraer_Posiciones_Edad(edad).length; i++) {
                System.out.print(Extraer_Posiciones_Edad(edad)[i] + " | ");
            }
            
        } 
        
        catch (Exception error) {
            System.out.print("\nSe presento un error. \n" + error);
        } 
        
        finally {
            System.out.print("\n\nFin de la Ejecucion");            
        }
        
    }
    
    static Boolean Edad_Existe(byte edad) throws Exception {        
        
        boolean existe=false;
        try {
            
            for (byte i = 0; i < vEdad.length; i++) {
                
                if (vEdad[i] == edad) {
                    existe = true;
                }
            }
            
            return existe;
            
        } catch (Exception error) {
            throw new Exception ("Error en EDAD EXISTE\n" + error);
        }
    }
    
    static byte Contar_Repetición_Edad(byte edad) throws Exception {        
        
        byte rep = 0;
        try {
            
            for (byte i = 0; i < vEdad.length; i++) {
                
                if (vEdad[i] == edad) {
                    rep++;
                }
            }
            
            return rep;
            
        } catch (Exception error) {
            throw new Exception ("Error en CONTAR REPETICION EDAD\n" + error);
        }
    }
    
    static byte[] Extraer_Posiciones_Edad(byte edad) throws Exception {        
        
        byte rep = 0;
        byte[] vSalida;
        try {
            
            for (byte i = 0; i < vEdad.length; i++) {
                
                if (vEdad[i] == edad) {
                    rep++;
                }
            }
            
            vSalida = new byte[rep];
            
            for (byte i = 0; i < vSalida.length; i++) {
                
                for (byte j = 0; j < vEdad.length; j++) {
                    
                        if (vEdad[j] == edad) {
                        vSalida[i] = (byte)(j+1);
                    }
                }
            }
            
            return vSalida;
            
        } catch (Exception error) {
            throw new Exception ("Error en: EXTRAR POSICIONES EDAD\n" + error);
        }
    }
    
    static void Llenar_Vector() throws Exception {
        
        try {
            
            for (byte i = 0; i < vEdad.length; i++) {
                
                vEdad[i] = (byte)(Math.random()*(100 - 1)+1);
            }
            
        } catch (Exception error) {
            throw new Exception ("Error en LLENAR VECTOR\n" + error);
        }
    }
    
    static void Ordenar_Vector() throws Exception {
        
        byte num1, num2;
        
        try {
            
            for (byte i = 0; i < vEdad.length; i++) {
                
                for (int j = (i+1); j < vEdad.length; j++) {
                    
                    if (vEdad[i] < vEdad[j]) {
                        
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
            throw new Exception ("Error en IMPRIMIR VERCTOR STR\n" + error);
        }
    }
    
}
