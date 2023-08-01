class Ejercicio2{

   public static void main(String[] args) {
     
     outer: for (int i = 0; i <= 20 ; i++) {
         System.out.println("Imprimiendo La Tabla del " + i);
        inner: for (int j = 0; j <= 20 ; j++) {
            if(i % 2 == 0){
               continue outer;
            }
            System.out.println(i + " x " + j +" = " +i*j);
         }
         System.out.println();
      }
   }

}