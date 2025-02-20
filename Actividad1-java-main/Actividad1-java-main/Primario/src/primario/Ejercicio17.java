
package primario;

import java.util.Scanner;

public class Ejercicio17 {
    public Ejercicio17(){
    }
    
    public String pedirTitulo(){
        System.out.println("Escriba el titulo del libro que desea registar");
        Scanner respuesta = new Scanner(System.in);
        String titulo = respuesta.nextLine();
        return titulo;
    
    }
    
    public String pedirAutor(){
        System.out.println("Escriba el Autor del libro que desea registar");
        Scanner respuesta = new Scanner(System.in);
        String autor = respuesta.nextLine();
        return autor;
    
    }
    public String pedirNumeroPaginas(){
        System.out.println("Escriba el numero de paginas del libro que desea registar");
        Scanner respuesta = new Scanner(System.in);
        String pagina = respuesta.next();
        return pagina;
    
    }
    public void registo(){
        String totalLibros="";
        int control=1;
        Scanner respuesta = new Scanner(System.in);
        
        do{
            String titulo = pedirTitulo();
            String autor = pedirAutor();
            String paginas = pedirNumeroPaginas();
            String libros=titulo+"           "+autor+"           "+paginas;
            
            System.out.println("Desea realizar otro viaje : (0)Si---(1)No");
            int eleccion = respuesta.nextInt();
            if(eleccion==0){
                totalLibros=totalLibros+libros+"\n";
            }else{
                totalLibros=totalLibros+libros+"\n"; 
                control=0;
                
            }
            
            
            
        }while(control==1);
        System.out.println("titulo----------------autor----------------paginas");
        System.out.println(totalLibros);
         

    }
}
