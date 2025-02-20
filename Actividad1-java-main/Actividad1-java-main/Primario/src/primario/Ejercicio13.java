
package primario;

import java.util.Scanner;

public class Ejercicio13 {
    public Ejercicio13(){
    
    }
    public void compras(){
        System.out.println("Bienvenido a la tienda");
        Scanner respuesta = new Scanner(System.in);
        int totalCompraMomento;
        int totalCompra=0;
        int control = 0;
        while(control==0){
            
            
            System.out.println("Ingrese el precio del producto que va a comprar: ");
            int precioProducto= respuesta.nextInt();
            System.out.println("Ingrese la cantidad que desea de ese producto: ");
            int cantidadProducto= respuesta.nextInt();
            totalCompraMomento =precioProducto *cantidadProducto;
            System.out.println("El total de esta compra fue:: "+totalCompraMomento);
            System.out.println("Desea hacer otra compra: (0)Si---(1)No");
            int eleccion = respuesta.nextInt();
            if(eleccion==0){
                totalCompra=totalCompra+totalCompraMomento;
                System.out.println("En camino");
            }else{
                totalCompra=totalCompra+totalCompraMomento;
                System.out.println("Muchas gracias por su compra el monto fina fue de: "+totalCompra);
                control = 1 ;
            }
            
            


        }
        
    }
}
