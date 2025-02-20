
package primario;

import java.util.Scanner;


public class Ejercicio6 {
    public Ejercicio6(){
        
    }
    public void revisionUmbral(){
        
        System.out.println("Escriba la temperatura");
        Scanner respuesta = new Scanner(System.in);
        double temperatura = respuesta.nextDouble();
        if(temperatura>50){
            System.out.println("El umbral de temperatura es muy alto");
        }else{
            System.out.println("Escriba el piso al que desea ir");
            int piso = respuesta.nextInt();
        }
        
    }
}
