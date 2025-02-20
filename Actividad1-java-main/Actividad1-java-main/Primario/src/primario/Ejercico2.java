/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primario;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Ejercico2 {
    public Ejercico2(){
        
    }
    public void sensor() {
        
        Scanner programa = new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura actual (Â°C): ");
        double temperatura = programa.nextDouble();
        
        if (temperatura >= 18 && temperatura <= 25) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura esta fuera del rango deseado.");
        }
        
    }

}

