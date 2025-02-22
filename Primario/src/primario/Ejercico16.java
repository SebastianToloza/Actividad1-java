
package primario;

import java.util.Random;
import java.util.Scanner;


public class Ejercico16 {
    public Ejercico16(){
    
    }
    
    public int adivina(){       
        Random aleatoreo= new Random();
        int numeroAleatoreo=aleatoreo.nextInt(100);
        return numeroAleatoreo;
    }
    public void ejecucion(){
        int numRandom = adivina();
        System.out.println("Eligw un numero entre el 1 y el 100");
        Scanner respuesta = new Scanner(System.in);
        int controlador=0;
        while(controlador==0){
            int numero = respuesta.nextInt();

            if (numRandom>numero){
                System.out.println("El numero que quieres adivina es mayor"); 
               


            }else if(numRandom<numero){
                System.out.println("El numero que quieres adivina es menor");          
         
            }else{
                System.out.println("Felicitaciones has ganado");
                controlador=1;
            }
        }
    
    
    }
}
