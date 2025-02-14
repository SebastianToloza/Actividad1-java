package primario;

import java.util.Scanner;


public class Primario {
    
    public static void main(String[] args) {
        int opcion=1000;
        do{
            System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            System.out.println("Que ejercicio desea ejecutar: ");
            Scanner respuesta = new Scanner(System.in);
            int Eleccion =  respuesta.nextInt();
            switch(Eleccion){
                case 1:
                    System.out.println("\n----------------------------------------------");
                    Ejercicio1 trabajo1 = new Ejercicio1();
                    trabajo1.factura();
                
                    
                    
                case 2:
                    
                    
                
                
            }
            
            
        }while(opcion>0);
        
    }
    
}
