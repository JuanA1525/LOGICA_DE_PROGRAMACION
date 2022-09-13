package parcial2_japv;

public class Parcial2_JAPV {

    public static void main(String[] args) {
        System.out.println(Pintar_triangulo_inv((byte)25));
        System.out.println(Jugar_21((byte)6));
    }
    
    static String Pintar_triangulo_inv(byte num_base){
        
        String triangulo="";
        byte numRenglones, renglon=0;
        
        if ((num_base%2) == 0) numRenglones = (byte)(num_base /2);
        else numRenglones = (byte)((num_base /2)+1);
        
        try{
           
            for (byte i = numRenglones; i > 0; i--){
                
                for (byte j = 1; j <= renglon; j++) {
                    triangulo += " ";
                }
                
                for (byte j = num_base; j > 0; j--) {
                    
                    triangulo += "*";
                }
                num_base -=2;
                
                for (int j = 1; j <= renglon; j++) {
                    triangulo += " ";
                }
                triangulo+="\n";
                renglon += 1;
            }
            
            return triangulo;
        }
        catch(Exception e){
            return "Error";
        }
    }
    
    static String Jugar_21(byte jugadores){
        
        try{
            
            byte carta, sumaCartas=0;
            String salida="";
            
            if(jugadores>0 & jugadores<7){
            
                for (byte i = 1; i <= jugadores; i++) {

                    for (byte j = 1; j <= 3; j++) {

                        carta = (byte)(Math.random()*(11-1)+1);
                        sumaCartas += carta;
                    }

                    if (sumaCartas == 21) {
                        salida += "Jugador " + i + ", Puntos " + sumaCartas + " --> Juego Perfecto\n";
                    }
                    else if (sumaCartas > 21) {
                        salida += "Jugador " + i + ", Puntos " + sumaCartas + " --> Se Paso\n";
                    }
                    else {
                        salida += "Jugador " + i + ", Puntos " + sumaCartas + " --> Faltaron Puntos\n";
                    }
                    sumaCartas = 0;
                }
            }
            else salida = "# de Jugadores Invalido";
            return salida;
        }
        catch (Exception e){
            return "Error";
        }
    }
}
