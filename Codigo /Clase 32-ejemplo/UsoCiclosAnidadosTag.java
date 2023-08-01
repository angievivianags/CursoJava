class UsoWhile{

   public static void main(String[] args) {
      
      outer: for (int i = 0; i <= 10 ; i++) {
         System.out.println("Imprimiendo La Tabla del " + i);
         inner: for (int j = 0; j <= 10 ; j++) {
            if(i % 2 == 0){
               break inner;
            }
            System.out.println(i + " x " + j +" = " +i*j);
         }
      
      }


      outer: for (int i = 0; i <= 10 ; i++) {
         System.out.println("Imprimiendo La Tabla del " + i);
         inner: for (int j = 0; j <= 10 ; j++) {
            if(i % 2 == 0){
               break outer;
            }
            System.out.println(i + " x " + j +" = " +i*j);
         }
      
      }
   }

}