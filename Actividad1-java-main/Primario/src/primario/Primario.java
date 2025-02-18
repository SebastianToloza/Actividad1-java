package primario;

import java.util.Scanner;


public class Primario {
    
    public static void main(String[] args) {
        int opcion=1000;
        Scanner respuesta = new Scanner(System.in);

        do{
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("Que ejercicio desea ejecutar: ");
            int eleccion =  respuesta.nextInt();
            
            switch(eleccion){
                case 1:
                    
                    System.out.println("\n----------------------------------------------");
                    Ejercicio1 trabajo1 = new Ejercicio1();
                    trabajo1.factura();
                    break;
                
                case 2:
                    System.out.println("\n----------------------------------------------");
                    Ejercico2 trabajo2 = new Ejercico2();
                    trabajo2.sensor();
                    break;
                case 3  :
                    System.out.println("\n----------------------------------------------");
                    Ejercicio3 trabajo3 = new Ejercicio3();
                    trabajo3.tomaPeso();
                    break;
                    
                case 4:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio4 trabajo4 = new Ejercicio4();
                    trabajo4.piso();
                    break;
                case 5:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio5 trabajo5 = new Ejercicio5();
                    trabajo5.umbral();
                    break;
                case 6:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio6 trabajo6 = new Ejercicio6();
                    trabajo6.revisionUmbral();
                    break;
                case 7:
                    System.out.println("\n----------------------------------------------");
                    break;
                case 8:
                 
                    System.out.println("\n----------------------------------------------");
                    break;
                case 9:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio9 trabajo9 = new Ejercicio9();
                    trabajo9.asignaPelicula();
                    break;
                case 10:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio10 trabajo10 = new Ejercicio10();
                    trabajo10.decicion();
                    break;
                case 11:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio11 trabajo11 = new Ejercicio11();
                    trabajo11.menu();
                    break;
                default:
                    System.out.println("opcion invalida");
                    
            }
            
            
        }while(opcion>0);
        
    }
    
}
