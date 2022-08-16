/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Taller_1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        // VARIABLES GENERALES  
        Scanner teclado = new Scanner(System.in);
        String patron_num = "$###, ###. ##";
        DecimalFormat formato = new DecimalFormat(patron_num);
        byte seleccion=0;
        
        try {
            
            System.out.println("Muy buenos Dias. Bienvenido al menu de Opciones del Taller #1\nA continuacion veras "
                + "las diferentes opciones del menu. \n\nPor favor marca con el numero inficado por opcion.\n\n"
                + "1. Verificar Orden\n2. Calcular Costo\n3. Calcular Propina y Costo Total\n4. Estimar Cambio\n5. Evaluar Residuo"
                + "\n6. Evaluar Mayor\n7. Mayor al Cubo o al Cuadrado\n8. Calcular Salario\n9. Comparar Numeros\n"
                + "10. Informar Dias de la Semana\n11. Calcular Invitacion Salida\n12. Revisar Mes\n13. Formatear Fecha"
                + "\n14. Calcular Bono\n15. Seleccionar Habitacion\n16. Calcular Obsequi\n17. Calcular Placa");
            seleccion = teclado.nextByte();
            
            switch(seleccion){
                
                case 1 : {
                    int num1 =0;
                    int num2 =0;
           
                    //ENTRADAS
                    System.out.println("Digite el Primer Numero: ");
                    num1 = teclado.nextInt();
                    System.out.println("Digite el Segundo Numero: ");
                    num2 = teclado.nextInt();

                    //PROCESO Y SALIDA
                    System.out.println(Verificar_Orden(num1, num2));
                }break;
                case 2 : {
                    //VARIABLES
                    int duracionMin = 0;
            
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor Favor digite la duracion de su llamada en minutos: ");
                    duracionMin = teclado.nextInt();
                        
                    //PROCESO Y SALIDA
                    System.out.println("El costo de tu llamada es de: " + Calcular_Costo(duracionMin) +"$");
                }break;
                case 3 : {
                    //VARIABLES
                    float cuenta =0.0f;
                    byte satisfaccion =0;
           
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor Favor Digite el valor de su cuenta.");
                    cuenta = teclado.nextFloat();
                    System.out.println("Gracias. \nDe 1 a 3, siendo 1. mal y 3. Perfecto, ¿Que tan satisfecho te sientes con nuestro servicio? ");
                    satisfaccion = teclado.nextByte();

                    //PROCESO Y SALIDA
                    System.out.println("Gracias por su Informacion.\n\nEl valor de la propina es: \n" + formato.format(Calcular_Propina(cuenta, satisfaccion)));
                    System.out.println("EL PRECIO TOTAL A PAGAR ES: \n" + formato.format(Calcular_Valor_Pagar(cuenta, Calcular_Propina(cuenta, satisfaccion))));
                }break;
                case 4 : {
                    // ESTIMAR CAMBIO
                    //
                    //VARIABLES
                    int pesos =0;
           
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor Favor Digite su valor en PESOS.");
                    pesos = teclado.nextInt();

                    //PROCESO Y SALIDA
                    System.out.println(Estimar_Cambio(pesos));
                }break;
                case 5 : {
                        
                    //VARIABLES
                    int nominador =0;
                    int denominador =0;
           
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor Favor Digite su DIVIDENDO.");
                    nominador = teclado.nextInt();

                    System.out.println("\nPor Favor Digite su DIVISOR.");
                    denominador = teclado.nextInt();

                    //PROCESO Y SALIDA
                    if(denominador == 0)System.out.println("Error de Entrada: El divisor no puede ser 0");
                    else if(Evaluar_Residuo(nominador, denominador))System.out.println("La division SI es exacta.");
                    else System.out.println("La division NO es exacta.");
            
                    System.out.println("\nGracias por usar Nuestros Servicios.");
                }break;
                case 6 : {
                    
                    //VARIABLES
                    short val1  = 0;
                    short val2  = 0;
                    short val3  = 0;
           
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor Favor Digite su Primer Numero.");
                    val1 = teclado.nextShort();
            
                    System.out.println("\nPor Favor Digite su Segundo Numero.");
                    val2 = teclado.nextShort();
 
                    System.out.println("\nPor Favor Digite su Tercer Numero.");
                    val3 = teclado.nextShort();

                    //PROCESO Y SALIDA
                    System.out.println("El mayor numero dentro de los ingresados es: " + Evaluar_Mayor(val1, val2, val3));
                }break;
                case 7 : {
                    
                    //VARIABLES
                    short valor1  = 0;
                    short valor2  = 0;
           
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor Favor Digite su Primer Numero.");
                    valor1 = teclado.nextShort();
            
                    System.out.println("\nPor Favor Digite su Segundo Numero.");
                    valor2 = teclado.nextShort();
            
                    //PROCESO Y SALIDA
                    System.out.println(Numero_Cubo_Cuadrado(valor1, valor2));
                }break;
                case 8 : {
                    
                    //VARIABLES
                    short valorHora  = 0;
                    String nom = "Nombre";
                    short horas = 0;
           
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor favor escribe tu NOMBRE: ");
                    nom = teclado.nextLine();
            
                    System.out.println("\nPor Favor Digite su VALOR POR HORA");
                    valorHora = teclado.nextShort();

                    System.out.println("\nPor Favor Digite su # DE HORAS");
                    horas = teclado.nextShort();
            
                    //PROCESO Y SALIDA
                    System.out.println(Calcular_Salario(nom, valorHora, horas));
                }break;
                case 9 : {
                    
                    System.out.println(Comparar_Numeros());
                }break;
                case 10 : {
                    
                    //VARIABLES
                    byte dia = 0;
           
                    //ENTRADAS
                    System.out.println("Buenos Dias. \nPor favor escribe en numeros tu DIA DE LA SEMANA: ");
                    dia = teclado.nextByte();
            
                    //PROCESO Y SALIDA
                    System.out.println(Informar_Dia_Semana(dia));
                }break;
                case 11 : {
                    
                    //VARIABLES
                    byte numero = (byte)(Math.random()*(6-1)+1);
                    String jugador = "";   
                    String color="";
            
                    //ENTRADAS
                    System.out.println("Jugador Escribe tu Nombre! ");
                    jugador = teclado.nextLine();
            
                    //PROCESO Y SALIDA
                    switch (numero){
                        case 1 : color="Verde"; break;
                        case 2 : color="Azul"; break;
                        case 3 : color="Roja"; break;
                        case 4 : color="Amarilla"; break;
                        case 5 : color="Blanca"; break;
                        case 6 : color="Blanca"; break;
                    }
            
                    System.out.println(jugador + " Tu bola es: " + color);
                    System.out.println("Recuerda que: ");
                    System.out.println(Calcular_Invitacion());
                }break;
                case 12 : {
                    
                    System.out.println(Revisar_Mes());
                }break;
                case 13 : {
                    
                    //VARIABLES
                    byte dia = 0;
                    byte mes = 0;
                    short anio = 0;
                        
                    //ENTRADAS
                    System.out.println("Buenos Dias, Escribe el dia: ");
                    dia = teclado.nextByte();
            
                    System.out.println("Escribe el mes en numeros: ");
                    mes = teclado.nextByte();
            
                    System.out.println("Buenos Dias, Escribe el año: ");
                    anio = teclado.nextShort();
            
                    //PROCESO Y SALIDA
                    System.out.println(Formatear_Fecha(dia, mes, anio));;
                }break;
                case 14 : {
                    
                    //VARIABLES
                    int valorHora = 0;
                    byte id = 0;
                        
                    //ENTRADAS
                    System.out.println("Buenos Dias, Por favor ingresa el ultimo digito de tu ID: ");
                    id = teclado.nextByte();
            
                    System.out.println("Ingresa tu Valor por Hora");
                    valorHora = teclado.nextInt();
            
                    //PROCESO Y SALIDA
                    System.out.println("De acuerdo a la informacion brindada: "
                        + "\nTu bono es de: " + Calcular_Bono(valorHora, id));
                }break;
                case 15 : {
                    
                    //VARIABLES
                    int id = 0;
                    String nom = "";
                    byte nroHab = (byte)(Math.random()*(5-1)+1);
                        
                    //ENTRADAS
                    System.out.println("Buenos Dias, Por favor ingresa tu NOMBRE: ");
                    nom = teclado.nextLine();
            
                    System.out.println( nom + " Ingresa tu ID: ");
                    id = teclado.nextInt();
            
                    //PROCESO Y SALIDA
                    System.out.println(nom + " De acuerdo a la informacion brindada: \n"
                        + Seleccionar_Habitacion(id, nom, nroHab));
                }break;
                case 16 : {
                    
                    //VARIABLES
                    byte plato = 0;
                                    
                    //ENTRADAS
                    System.out.println("Buenos Dias, Por favor ingresa tu Seleccion de plato: \n"
                            + " - 1. Plato Arroz\n - 2. Plato Carne\n - 3. Plato Pez\n");
                    plato = teclado.nextByte();
            
                    //PROCESO Y SALIDA
                    System.out.println(Calcular_Obsequio(plato));
                }break;
                case 17 : {
                    
                    //VARIABLES
                    byte numPlaca = 0;
                    byte dia = 0;
            
                    //ENTRADAS
                    System.out.println("Buenos Dias.\nPor Favor Ingrese el Numero Final de su Placa: ");
                    numPlaca = teclado.nextByte();
            
                    System.out.println("Gracias ahora, que dia quieres evaluar. \n1.Lunes \n2.Martes \n3.Miercoles \n4.Jueves \n5.Viernes");
                    dia = teclado.nextByte();
            
                    //PROCESO Y SALIDA
                    if (dia < 1 || dia > 5) System.out.println("Error de Entrada. Solo hay 5 Dias.");
                    else if (Evaluar_PicoPlaca(numPlaca, dia) == false) System.out.println("De acuerdo con tus datos hoy NO tienes pico y placa!!");
                    else System.out.println("De acuerdo con tus datos hoy hay pico y placa  --> :(");
                }break;
                default : System.out.println("NO EXISTE LA OPCION INGRESADA, POR FAVOR INTENTA DE NUEVO!"); 
            }
        }       
        catch (Exception error) {   
            System.out.print("\nSe presento un error. \n" + error);
        }
        finally {   
            System.out.print("\nFin de la Ejecucion \n");            
        }
    }
    
    //
    // --- ZONA DE FUNCIONES ---
    //
    static String Verificar_Orden(int num1, int num2) {
        
        String result = ""; 
        try {
            if(num1 < num2) {result = "\n Los numeros estan de forma CRECIENTE,  \n"; return result;}
            else if(num1 > num2){ result = " \nLos numeros estan de forma DECRECIENTE.  "; return result;}
            else {result = "\n Los numeros son Iguales. \n"; return result;}
        } 
        catch (Exception error) {
            result = "Error de entrada";
            System.out.print("\n Se presento un error. \n" + error);
            return result;
        }
    }
    
    static float Calcular_Costo(int minDuracion) {
        
        float costo =0.0f;
        try {
            if (minDuracion <= 3){
                costo = 0.05f;
                return costo;
            }
            else{
                minDuracion = minDuracion - 3;
                costo = (float)(0.05 + ((float)((minDuracion - 3) * 0.1)));
                return costo;
            }
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return costo;
        }
    }
    
    static float Calcular_Propina(float valorCuenta, byte satisfaccion) {
        
        float valorPropina = 0.0f;
        try {
            
            switch(satisfaccion){
                case 1 : valorPropina = (float)((valorCuenta) *0.03); return valorPropina;
                case 2 : valorPropina = (float)((valorCuenta) *0.07); return valorPropina;
                case 3 : valorPropina = (float)((valorCuenta) *0.10); return valorPropina;
                default : return valorPropina;
            }
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return valorPropina;
        }
    }
    
    static float Calcular_Valor_Pagar(float propina, float valorCuenta) {
        
        float total = 0.0f;
        float impuesto = 0.0f;
        
        try {
            impuesto = (float)(valorCuenta * 0.08);
            total = valorCuenta + impuesto + propina;
            return total;
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return total;
        }
    }
    
    static String Estimar_Cambio(int montoPesos) {
        
        final float usDollar = 4455.0f;
        final float euro = 4560.0f;
        final float canDollar = 4365.0f;
        final float yen = 34.7f;
        
        float pesoUsDollar=0;
        float pesoEuro=0;
        float pesoCanDollar=0;
        float pesoYen=0.0f;
        
        String valoresFinales="Error de Entrada.";
        
        try {
            pesoUsDollar = montoPesos / usDollar;
            pesoEuro = montoPesos / euro;
            pesoCanDollar = montoPesos / canDollar;
            pesoYen = montoPesos / yen;
            
            valoresFinales = ("El monto: " + montoPesos +"$ Equivale a: \n\n - Dolares Americanos: " + pesoUsDollar +
            "$ \n - Dolares Canadienses: " + pesoCanDollar + "S \n - Euros: " + pesoEuro + "$ \n - Yenes: " + pesoYen + "$ \n\n Gracias por Usar Nuestro Servicio. ") ;
            return valoresFinales;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return valoresFinales;
        }
    }
    
    static boolean Evaluar_Residuo(int val1, int val2) {
        boolean resultado = false;
        
        try {
            int residuo = val1 % val2;
            
            if(residuo == 0){resultado = true;}
            
            return resultado;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return resultado;
        }
    }
    
    static short Evaluar_Mayor(short num1, short num2, short num3) {

        short resultado = 0;
        try {
            if(num1 == num2 && num2 == num3){resultado = num1; return resultado;}
            else if(num1 >= num2 && num1 >= num3){resultado = num1; return resultado;}
            else if(num2 >= num1 && num2 >= num3){resultado = num2; return resultado;}
            else if(num3 >= num1 && num3 >= num2){resultado = num3; return resultado;}
            else return resultado;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return resultado;
        }
    }
    
    static String Numero_Cubo_Cuadrado(short num1, short num2) {
        
        short resultado = 0;
        int resultadoCuadrado = 0;
        int resultadoCubo = 0;
        String salida = "Error de Entrada.";
        
        try {
            if (num1 >= num2){resultado = num1; resultadoCuadrado = (int)Math.pow((double)resultado, 2); resultadoCubo = (int)Math.pow((double)resultado, 3);}
            else {resultado = num2; resultadoCuadrado = (int)Math.pow((double)resultado, 2); resultadoCubo = (int)Math.pow((double)resultado, 3);}
            
            salida = ("El numero mayor es: " + resultado +"\n El numero al cuadrado es: " + resultadoCuadrado + "\n El numero al cubi es: " + resultadoCubo + "\n\n Gracias por usar Nuestros servicios.");
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
    
    static String Calcular_Salario(String nom, int precioHora, short horas){
    
        String salida = "";
        int salarioHoras = 0;
        double descuento = 0;
        
        if (horas >= 172 && horas <= 200){
            
            salarioHoras = precioHora * horas;
            if(salarioHoras > 2100000){
                descuento = salarioHoras * 0.06;
            }
            
            salida = "Bienvenido al Sistema: " + nom + "\n - Valor por Hora: " + precioHora + "$\n - Cantidad de Horas: "
            + horas + "\n - Valor Bruto a Recibir: " + salarioHoras + "$\n - Descuento: " + descuento + "$\n - Valor Neto a Recibir: "
            + ((int)salarioHoras-descuento) + "$";
            
            return salida;
        }
        else{
            salida = "Las Horas Digitadas Son Invalidas";
            return salida;
        }
    }
    
    static String Comparar_Numeros(){
        
        String salida = "";
        short nro1, nro2, nro3, nro4, nro5, nroCom;
        
        try {
            
            System.out.println("Buenos Dias. \nPor favor digite el numero 1: ");
            nro1 = teclado.nextShort();
            
            System.out.println("Buenos Dias. \nPor favor digite el numero 2: ");
            nro2 = teclado.nextShort();
            
            System.out.println("Buenos Dias. \nPor favor digite el numero 3: ");
            nro3 = teclado.nextShort();
            
            System.out.println("Buenos Dias. \nPor favor digite el numero 4: ");
            nro4 = teclado.nextShort();
            
            System.out.println("Buenos Dias. \nPor favor digite el numero 5: ");
            nro5 = teclado.nextShort();
            
            System.out.println("Buenos Dias. \nPor favor digite el numero A COMPARAR: ");
            nroCom = teclado.nextShort();
            
            
            if (nroCom == nro1) salida = "El numero a Comparar es Igual al numero 1";
            else if (nroCom == nro2) salida = "El numero a Comparar es Igual al numero 2";
            else if (nroCom == nro3) salida = "El numero a Comparar es Igual al numero 3";
            else if (nroCom == nro4) salida = "El numero a Comparar es Igual al numero 4";
            else if (nroCom == nro5) salida = "El numero a Comparar es Igual al numero 5";
            else salida = "No hay un numero igual al Numero a Comparar.";
            
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida = "Error de entrada";
        }
    }
    
    static String Informar_Dia_Semana(byte dia) {
        
        String salida = "";
        try {
            if (dia >= 2 && dia <= 6){
            
                switch (dia){
                    case 2 : salida = "Es LUNES, dia: Laboral"; break;
                    case 3 : salida = "Es MARTES, dia: Laboral"; break;
                    case 4 : salida = "Es MIERCOLES, dia: Laboral"; break; 
                    case 5 : salida = "Es JUEVES, dia: Laboral"; break;
                    case 6 : salida = "Es VIERNES, dia: Laboral"; break; 
                }
            }
            
            else if(dia == 1 || dia == 7){
                
                switch (dia){
                    
                    case 1 : salida = "Es DOMINGO, dia: NO Laboral"; break;
                    case 7 : salida = "Es SABADO, dia: NO Laboral"; break;
                }
            }
            else salida = "Error de entrada, Digito invalido.";
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
    
    static String Calcular_Invitacion() {
        
        String salida = "\nVerde: Invita a las Cervezas. \nAzul: Invita a la Pizza. \nRojo: Invita al Postre. \nAmarillo: Invita al Parqueadero. \nBlamco: DISFRUTAS!! ";
        try {
            return salida;
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
    
    static String Revisar_Mes() {
        
        String salida = "";
        try {
            byte mes_num = 0;
            byte numDias = 0;
            
            System.out.println("Usuario, Por favor ingresa en NUMEROS tu MES: ");
            mes_num = teclado.nextByte();
            
            if(mes_num == 1 || mes_num == 3 || mes_num == 5 || mes_num == 7 || mes_num == 8 || mes_num == 10 || mes_num == 12) numDias = 31;            
            else if(mes_num == 4 || mes_num == 6 || mes_num == 9 || mes_num == 11) numDias = 30;
            else numDias = 28;
            
            switch (mes_num){
                
                case 1 : salida = "Tu mes es ENERO, tiene: " + numDias + " Dias."; break;
                case 2 : salida = "Tu mes es FEBRERO, tiene: " + numDias + " Dias."; break;
                case 3 : salida = "Tu mes es MARZO, tiene: " + numDias + " Dias."; break;
                case 4 : salida = "Tu mes es ABRIL, tiene: " + numDias + " Dias."; break;
                case 5 : salida = "Tu mes es MAYO, tiene: " + numDias + " Dias."; break;
                case 6 : salida = "Tu mes es JUNIO, tiene: " + numDias + " Dias."; break;
                case 7 : salida = "Tu mes es JULIO, tiene: " + numDias + " Dias."; break;
                case 8 : salida = "Tu mes es AGOSTO, tiene: " + numDias + " Dias."; break;
                case 9 : salida = "Tu mes es SEPTIEMBRE, tiene: " + numDias + " Dias."; break;
                case 10 : salida = "Tu mes es OCTUBRE, tiene: " + numDias + " Dias."; break;
                case 11 : salida = "Tu mes es NOVIEMBRE, tiene: " + numDias + " Dias."; break;
                case 12 : salida = "Tu mes es DICIEMBRE, tiene: " + numDias + " Dias."; break;
                default : salida = "Solo Hay 12 Meses, Entrada Invalida";
            }
            
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
    
    static String Formatear_Fecha(byte dia, byte mes, short anio) {
        
        String salida = "";
        try {
            String mesTxt = "ERROR DE ENTRADA.";
            short numDias = 0;
            if (anio >= 1950 && anio <=2020){
            
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) numDias = 31;            
                else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) numDias = 30;
                else if (mes == 2) numDias = 28;
                else if (mes < 1 || mes > 12) {salida = "Error de entrada... Solo hay 12 meses."; return salida;}
                else {salida = "Dias del mes Equivocados... Entrada Invalida."; return salida;} 
            
                switch(mes){
                    case 1 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Enero";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 2 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Febrero";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 3 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Marzo";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 4 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Abril";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 5 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Mayo";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 6 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Junio";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 7 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Julio";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 8 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Agosto";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 9 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Septiembre";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 10 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Octubre";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;
                    case 11 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Noviembre";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;     
                    case 12 : {
                        if (dia > 1 || dia < numDias)mesTxt = "Diciembre";
                        else {salida = "Error de Entrada: Numero de Dias por mes Invalido."; return salida;}
                    }break;
                }
            }
            else {salida = "Error de Entrada: Año Invalido...";return salida;}
            
            salida = "La Fecha ingresada fue: \n"
                + dia + " de " + mesTxt + " del Año " + anio;
            
            return salida;
        } 
        catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }

    static int Calcular_Bono(int valHora, byte id){
        
        int bono = 0;
        float bonoPar = 1.12f;
        float bonoInPar = 1.165f;
        try {
            
            if((id % 2) == 0){
            
                bono = (int)(valHora * 8.5 * bonoPar);   
                return bono;
            }
            else{bono = (int)(valHora * 8.5 * bonoInPar); return bono;}
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return bono;
        }
    }

    static String Seleccionar_Habitacion(int id, String nom, byte habitacion) {
        
        byte nroCamas=0;
        String color="";
        byte planta=0;
        
        String salida = "";
        try {
            
            switch(habitacion){
            
                case 1 : color = "Azul"; nroCamas = 2; planta = 1; break;
                case 2 : color = "Roja"; nroCamas = 1; planta = 1; break;
                case 3 : color = "Verde"; nroCamas = 3; planta = 2; break;
                case 4 : color = "Rosa"; nroCamas = 2; planta = 2; break;
                case 5 : color = "Gris"; nroCamas = 1; planta = 3; break;
                default : color = "ERROR DE ENTRADA";
            }
            
            salida = "Su habitacion es la: " + color + "\nTiene " + nroCamas + 
                " Camas y se encuentra en la planta #" + planta + "\nGracias por usar nuestros servicios. ";
            
            return salida;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
    
    static String Calcular_Obsequio(byte numPlato) {
        
        String salida = "";
        String obsequio = "";
        try {
            
            switch(numPlato){
            
                case 1 : obsequio = "Postre";break;
                case 2 : obsequio = "Bebida";break;
                case 3 : obsequio = "Postre y Bebida";break;
                default : salida = "ERROR DE ENTRADA";
            }
             
            return salida = "Felicidades! Segun tu eleccion te obsequiaremos: " + obsequio;
        } catch (Exception error) {
            
            System.out.print("\n Se presento un error. \n" + error);
            return salida;
        }
    }
    
    static boolean Evaluar_PicoPlaca(byte numPlaca, byte dia) {
        
        boolean pico = false;
        try {
            switch(dia){
            
                case 1 : if(numPlaca == 6 || numPlaca ==9) pico=true; else pico=false; break;
                case 2 : if(numPlaca == 2 || numPlaca ==3) pico=true; else pico=false; break;
                case 3 : if(numPlaca == 4 || numPlaca ==8) pico=true; else pico=false; break;
                case 4 : if(numPlaca == 0 || numPlaca ==7) pico=true; else pico=false; break;
                case 5 : if(numPlaca == 5 || numPlaca ==1) pico=true; else pico=false; break;
                default : pico=false;
            }
            return pico;
            
        } catch (Exception error) {
            System.out.print("\n Se presento un error. \n" + error);
            return pico;
        }
    }
}