
package primario;

import java.util.Scanner;


public class Ejercicio4 {
    public Ejercicio4(){
        
    }
    public void piso() {
        
        int pisoMaximo = 10; 
        int pisoMinimo = 1; 

        
        Scanner elevador = new Scanner(System.in);

      
        System.out.println("Ingrese el piso al que desea ir (1 a " + pisoMaximo + "): ");
        int pisoDeseado = elevador.nextInt();

     
        if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo) {
            System.out.println("El ascensor se mueve al piso " + pisoDeseado);
        } else {
            System.out.println("Error: El piso ingresado no es valido. Por favor, ingrese un piso entre " + pisoMinimo + " y " + pisoMaximo);
            piso();
        }

        
    }
}

