class Ejercicio3{

   public static void main(String[] args) {
      int numero = 10;
      int factorial = 10;
     for (int i = numero-1; i > 0; i--) {
         factorial *= i;
     }
     System.out.println( "El factorial de "+ numero +" es "+factorial);
   }

}