package clase_11;

public class Clase_11 {

    public static void main(String[] args) {
        
        try {
        
            String txt = "Medellin Campeon";
            String txt1 = "MedeLLIN CampEOn";
            String txt2 = "Murcielago";
            boolean a =false,e =false,i=false,o=false,u=false;

            /*
            int num = 823648234;
            System.out.println("El String tiene" + txt.length() + "Caracteres.");
            System.out.println("La primera Vez que aparece la letra 'e' es en la posicion: " + txt.indexOf("e"));
            System.out.println("La ultima vez que aparece la letra 'e' es: " + txt.lastIndexOf("e"));
            System.out.println("El caracter en la posicion 10 es: " + txt.charAt(10));
            System.out.println("Entre los caracteres 0 y 5 esta escrito: " + txt.substring(0,5));
            System.out.println("Texto en mayusculas: " + txt.toUpperCase());
            System.out.println("Texto en minusculas: " + txt.toLowerCase());
            System.out.println("Sera que tienen el MISMO contenido los Strings? " + txt.equals(txt1));
            System.out.println("Sera que tienen el mismo orden de caracteres sin importar las mayusc o minusc? " + txt.equalsIgnoreCase(txt1));
            System.out.println("" + txt.compareTo(txt1));
            System.out.println("Voy a comvertir otra variable en texto: " + String.valueOf(num));
            */
            
            /*
            System.out.println("Si quiero saber donde encuentro un caracter en toda la linea, hago: ");
            for (byte i = 0; i < txt.length(); i++) {
                
                if (txt.charAt(i) == 'e') {
                    System.out.println(i);
                }
            }
            */
            
            /*
            System.out.println("Si quiero invertir un texto, hago:");
            for (int i = txt.length() - 1; i >= 0; i--) {
                txt2 += txt.charAt(i);
            }
            System.out.println(txt2);
            */
            /*
            System.out.println("Estas son Formas para averiguar si un string tiene o no ciertos caracteres: ");
            //Forma2
            for (byte j = 0; j < txt2.length(); j++) {
                
                switch (txt2.charAt(j)) {
                    case'a' : 
                        a =  true;
                    break;
                    
                    case'e' : 
                        e =  true;
                    break;
                   
                    case'i' : 
                        i =  true;
                    break;
                    
                    case'o' : 
                        o =  true;
                    break;
                    
                    case'u' : 
                        u =  true;
                    break;
                }    
            }
            if (a & e & i & o & u)System.out.println("El string TIENE todas las vocales");
            else System.out.println("NO TIENE todas las vocales");
            */
            
            /*
            //FORMA 2
            if (txt2.contains("a") & txt2.contains("e") & txt2.contains("i") & txt2.contains("o") & txt2.contains("u")) System.out.println("El string TIENE todas las vocales");
            else System.out.println("NO TIENE todas las vocales");
            */
            
            //Utilizando SPLIT
            /*
            String ln = "Colombia-Sur America-5000000";
            String[] caja_ln;
            
            caja_ln = ln.split("-");
            
            for (int j = 0; j < caja_ln.length; j++) {
                System.out.println(caja_ln[j]);
            }
            */
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error: \n" + error);
        } 
        finally {
            System.out.print("Fin de la Ejecucion");            
        }
    }
}
