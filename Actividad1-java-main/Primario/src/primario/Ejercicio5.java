/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primario;

import java.util.Scanner;

public class Ejercicio5 {
    public Ejercicio5(){
        
    }
    public void umbral(){
        System.out.println("Escriba el umbral ");
        Scanner respuesta = new Scanner(System.in);
        double temperatura = respuesta.nextDouble();
        if(temperatura>30){
            System.out.println("El umbra de temperatura es muy lato");
            umbral();
        
        }else{
            System.out.println("La temperatura es adecuada");
        }
            
    }
}
