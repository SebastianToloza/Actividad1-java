/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primario;

import java.util.Scanner;

public class Ejercicio14 {
    public Ejercicio14(){
        
    }
    public float distanciaTotal(){
        System.out.println("Cual es distancia de su recorrido: ");
        Scanner respuesta = new Scanner(System.in);
        float distancia = respuesta.nextFloat();
        return distancia;
    }
    
    public float velocidadCoche(){
        System.out.println("Cual es la velocidad promedio de su vehiculo: ");
        Scanner respuesta = new Scanner(System.in);
        float velocidad = respuesta.nextFloat();
        return velocidad;
    }
    
    public void calcularTiempo(float distanciaTotal,float velocidadCoche){
        float tiempo =distanciaTotal/velocidadCoche;
        if(tiempo<1){
            tiempo=tiempo*60;
            System.out.println("Su viaje tardara: "+tiempo+" minutos");
        }else{
            System.out.println("Su viaje tardara: "+tiempo+" horas");
        }
    }
    
    public void resultado(){
        Scanner respuesta = new Scanner(System.in);
        int control = 0;
        while(control==0){
            float distancia=distanciaTotal();
            float velocidada=velocidadCoche();
            calcularTiempo(distancia,velocidada);
            System.out.println("Desea realizar otro viaje : (0)Si---(1)No");
            int eleccion = respuesta.nextInt();
            if(eleccion==0){
                System.out.println("En camino");
            }else{
                System.out.println("Muchas gracias por realizar su viaje por nuestra pagina");
                control = 1 ;
            }

        }
        
    }
}
