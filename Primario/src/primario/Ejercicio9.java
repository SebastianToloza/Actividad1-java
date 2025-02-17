
package primario;

import java.util.Scanner;

public class Ejercicio9 {
    public Ejercicio9(){
    }
    public String comprobarEdades(){
        System.out.println("Escriba la edad de la persona");
        Scanner respuesta = new Scanner(System.in);
        int edad = respuesta.nextInt();
        if(edad>0 && edad<=7){
            String edadPersona = "niño";
            return edadPersona;
        }else if(edad>7 && edad<=17){
            String edadPersona = "adolecente";
            return edadPersona;

        }else if(edad>17 && edad<=30){
            String edadPersona = "Adulto";
            return edadPersona;

        }else if(edad>30){
            String edadPersona = "adulto mayor";
            return edadPersona;

        }else{
            return null;
        }
            
    }
    public void asignaPelicula(){
        String edad=comprobarEdades();
        switch(edad){
            case "niño":
                System.out.println("");
                break;
            case "adolecente":
                System.out.println("");
                break;
            case  "Adulto":
                System.out.println("");
                break;
                
                
            case "adulto mayor":
                System.out.println("");
                break;
        }   
    }
}
