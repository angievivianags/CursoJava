import java.util.Scanner; 

class UsoIfElse{

   public static void main(String[] args) {
       int edad = 15;
       boolean esMayorDeEdad =  edad >= 18;
       boolean esMenorDeQuince =  edad <= 15;

       if( esMayorDeEdad ){
         System.out.println("Puede Ingresar al flujo");
       } else if(esMenorDeQuince){
        System.out.println("Llamar a sus padres y no permitir entrar");
       } else{
         System.out.println("Solo se permiten mayores de edad");
       }
   }

  
}