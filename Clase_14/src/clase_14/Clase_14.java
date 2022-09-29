
package clase_14;

public class Clase_14 {


        public static void main(String[] args) {
        try {
            
            //Varias formas de declarar una matriz:
            
            long[][] m_ventas;
            m_ventas = new long[5][6];
            
            char[][] m_caracteres = new char[32][12];
            
            char[][] m_triqui = {{'X','O','X'},{'O','O','X'},{'X','O','X'}};
            
            
            System.out.println("La matriz de caracteres tiene: " + m_caracteres.length + " filas.");
            System.out.println("La matriz de caracteres tiene: " + m_caracteres[1].length + " columnas.");
            
            
            System.out.println("\nVeamos la matriz de triqui:\n");
            for (int i = 0; i < m_triqui.length; i++) {
                for (int j = 0; j < m_triqui[1].length; j++) {
                    System.out.print(m_triqui[i][j] + " | ");
                }
                System.out.println("");
            }
            
            System.out.println("\nInicialicemos las ventas:");
            Inicializar_ventas(m_ventas);
            
            Imprimir_matriz(m_ventas);
            
            System.out.println("\nLlenemos las ventas:");
            Llenar_ventas(m_ventas);
            
            Imprimir_matriz(m_ventas);
            
            System.out.println("\nVeamos una matriz y un vector.\n");
            
            long[] v_totales = Totalizar_col(m_ventas);
            
            for (int i = 0; i < v_totales.length; i++) {
                System.out.print(v_totales[i] + " | ");
            }
            
            
        } catch (Exception e) {
            System.out.println("Error:\n" + e);
        }
    }
    
    public static long[][] Inicializar_ventas(long[][] matriz) throws Exception{
        try {
            
            for(int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[1].length; j++) {
                    matriz[i][j] = 0;
                }
            }
            
            return matriz;
            
        } catch (Exception e) {
            throw new Exception("Error inicializando las ventas.");
        }
    }
    
    public static long[][] Llenar_ventas(long[][] matriz) throws Exception{
        try {
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[1].length; j++) {
                    matriz[i][j] = (long)(Math.random()*(100));
                }
            }
            
            return matriz;
            
        } catch (Exception e) {
            throw new Exception("Error llenando las ventas");
        }
    }
    
    public static void Imprimir_matriz(long[][] matriz){
        try {
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[1].length; j++) {
                    System.out.print(matriz[i][j] + " | ");
                }
                System.out.println("");
            }
            
        } catch (Exception e) {
            System.out.println("Error imprimiendo la matriz.");
        }
    }
    
    public static long[] Totalizar_col(long[][] matriz) throws Exception{
        try {
            
            long[] v_totales = new long[matriz[1].length];
            //long suma_filas;
            
            for (int i = 0; i < matriz[1].length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    v_totales[i] += matriz[j][i];
                }
            }
            
            return v_totales;
            
        } catch (Exception e) {
            throw new Exception("Error devolviendo el vector.");
        }
    }
}
