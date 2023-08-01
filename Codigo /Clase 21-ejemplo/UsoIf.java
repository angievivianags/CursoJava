import java.util.Scanner; 

class UsoIf{

   public static void main(String[] args) {
       int edad = 24;
       boolean puedeEntrar =  edad >= 18;
       if( puedeEntrar ){
         System.out.println("Puede Ingresar al flujo");
       }else{
         System.out.println("Solo se permiten mayores de edad");
       }
   }

  
}