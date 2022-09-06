

package clase_10;
import java.util.Scanner;
public class Clase_10_Menu_Gordo {
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {

        byte op1=0, op2=0, op3=0, op4=0;

        do {

            System.out.println("Buenos Dias por favor seleccione su Opcion:\n"
                    + "1. Docentes.\n"
                    + "2. Estudiantes. \n"
                    + "3. Empleados. \n"
                    + "9. Salir");
            op1 = teclado.nextByte();
            
            switch (op1){

                case 1 :
                    do {
                        System.out.println("Elije la opcion: \n"
                            + "1. Cursos.\n"
                            + "2. Reporte de Notas. \n"
                            + "9. Salir");
                        op2 = teclado.nextByte();
                        
                        switch (op2){
                            case 1 : 
                                do {
                                    System.out.println("Elija la Opcion: \n"
                                        + "1. Seleccion de Periodo\n"
                                        + "2. Seleccion de NRC\n"
                                        + "9. Salir.");
                                    op3 = teclado.nextByte();
                                    
                                    switch (op3){
                                    
                                        case 1 : 
                                            System.out.println("--- Elegiste Seleccionar Periodo ---\n");
                                            op3 =9;
                                        break;
                                        
                                        case 2 : 
                                            do {
                                                System.out.println("Elija la Opcion: \n"
                                                    + "1. Lista de Estudiantes.\n"
                                                    + "2. Reportar Faltas.\n"
                                                    + "9. Salir.");
                                                op4 = teclado.nextByte();
                                                
                                                switch (op4){
                                                    case 1 : 
                                                        System.out.println("--- Elegiste Lista de Estudiantes ---\n");
                                                        op4 =9;
                                                    break;
                                                    
                                                    case 2 :
                                                        System.out.println("--- Elegiste Reportar Faltas ---\n");
                                                        op4=9;
                                                    break;
                                                }
                                            } while (op4 != 9);
                                        break;
                                    }
                                } while (op3 != 9);
                            break;
                            
                            case 2 :
                                do {
                                    System.out.println("Elija la Opcion: \n"
                                        + "1. Asignar Porcentajes.\n"
                                        + "2. Reportar Notas.\n"
                                        + "9. Salir.\n");
                                    op3 = teclado.nextByte();
                                    
                                    switch(op3){
                                        case 1 : 
                                            System.out.println("--- Elegiste Asignar Porcentajes ---\n");
                                            op3 =9;
                                        break;
                                        case 2 : 
                                            System.out.println("--- Elegiste Reportar Notas ---\n");
                                            op3 =9;
                                        break;
                                    }
                                } while (op3 !=9);
                            break;
                        }
                        
                    } while (op2 != 9);
                break;
                
                case 2 :
                    do {
                        System.out.println("Elije la opcion: \n"
                            + "1. Cancelar Materia.\n"
                            + "2. Consultar Notas. \n"
                            + "9. Salir\n");
                        op2 = teclado.nextByte();
                        
                        switch (op2){
                            
                            case 1 :
                                System.out.println("--- Elegiste Cancelar Materia --- \n");
                                op2 =9;
                            break;
                            
                            case 2 :
                                System.out.println("--- Elegiste Consular Notas --- \n Selecciona tu NRC \n");
                                op2 =9;
                            break;
                        }
                    } while (op2 != 9); 
                break;
                
                case 3 : 
                    do {
                        System.out.println("Elije la opcion: \n"
                            + "1. Certificados.\n"
                            + "2. Solicitar Lisencias. \n"
                            + "9. Salir\n");
                        op2 = teclado.nextByte();
                        
                        switch (op2){
                            
                            case 1 : 
                                do {
                                    System.out.println("Elija la opcion:\n"
                                        + "1. Tributanos.\n"
                                        + "2. Carta Laboral.\n"
                                        + "9. Salir.\n");
                                    op3 = teclado.nextByte();
                                    
                                    switch(op3){
                                        case 1 : 
                                            System.out.println("--- Elegiste Tributanos --- \n");
                                            op3 =9;
                                        break;
                                        
                                        case 2 : 
                                            System.out.println("--- Elegiste Carta Laboral --- \n");
                                            op3 =9;
                                        break;
                                    }
                                } while (op3 !=9);
                            break;
                            
                            case 2 :
                                do {
                                    System.out.println("Elija la opcion:\n"
                                        + "1. Remunerada.\n"
                                        + "2. NO Remunerada.\n"
                                        + "9. Salir.\n");
                                    op3 = teclado.nextByte();
                                    
                                    switch(op3){
                                        case 1 : 
                                            System.out.println("--- Remunerada --- \n");
                                            op3 =9;
                                        break;
                                        
                                        case 2 : 
                                            System.out.println("--- NO Remunerada --- \n");
                                            op3 =9;
                                        break;
                                    }
                                } while (op3 != 9);
                            break;
                        }
                    } while (op2 != 9);
                break;
            }
        } while (op1 != 9);
    }
}