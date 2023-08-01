import java.util.Scanner; 

class EjerciciosDeSeccion1{

   public static void main(String[] args) {

      Scanner leer = new Scanner(System.in);
      int opcion = 0;
      double insert1 = 0;
      double insert2 = 0;

      System.out.println("Bienvenido");
      
      while(opcion < 4){
         opcion = 0;
         System.out.println("Selecciona la opcion que desea realizar:");
         System.out.println("1 -> Calcular area de un Cuadrado");
         System.out.println("2 -> Calcular area de un Triangulo");
         System.out.println("3 -> Calcular area de un Rectangulo");
         System.out.println("4 -> Salir del programa");


         opcion = leer.nextInt(); 
            switch (opcion){
             case 1:{
                System.out.println("Usted eligió la opcion 1. Calculo del Area del Cuadrado");
                System.out.println("Por favor ingrese el valor del lado del Cuadrado:");
                insert1 = leer.nextDouble(); 
                System.out.println("El area del cuadrado es: " + calcularAreaDeCuadrado(insert1));
                break;
            }
            case 2:{
               System.out.println("Usted eligió la opcion 1. Calculo del Area del Triangulo");
               System.out.println("Por favor ingrese el valor de la base del Triangulo:");
               insert1 = leer.nextDouble(); 
               System.out.println("Por favor ingrese el valor de la altura del Triangulo:");
               insert2 = leer.nextDouble();
               System.out.println("El area del triangulo es: " + calcularAreaDeTriangulo(insert1, insert2));
               break;
            }
            case 3:{
               System.out.println("Usted eligió la opcion 1. Calculo del Area del Rectangulo");
               System.out.println("Por favor ingrese el valor de la ancho del Rectangulo:");
               insert1 = leer.nextDouble(); 
               System.out.println("Por favor ingrese el valor de la largo del Rectangulo:");
               insert2 = leer.nextDouble();
               System.out.println("El area del rectangulo es: " + calcularAreaDeRectangulo(insert1, insert2));
                break;
            }
            case 4:{
               System.out.println("Usted eligió la opcion 4. Salir del programa");
               opcion = 4;
               break;
            }
            default: {
                System.out.println("Opcion incorrecta");
                break;
            }
         }
      }
      
   }

   public static double calcularAreaDeCuadrado(double lado){
      return lado*lado;
   }

   public static double calcularAreaDeTriangulo(double base, double altura){
      return (base * altura)/2;
   }

   public static double calcularAreaDeRectangulo(double ancho, double largo){
      return largo * ancho;
   }

}