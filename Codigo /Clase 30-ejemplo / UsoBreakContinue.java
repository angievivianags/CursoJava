class  UsoBreakContinue{

   public static void main(String[] args) {
     
      int tabla = 2;
      for (int i = 0; i <= 10 ; i++) {
         if (i % 2 == 0) {
            //se salta
            continue;
         }
         System.out.println(tabla + " x " + i +" = " +i*tabla);
      }

      for (int i = 0; i <= 10 ; i++) {
         if (i % 2 == 0) {
            //rompe el ciclo completo
            break;
         }
         System.out.println(tabla + " x " + i +" = " +i*tabla);
      }

   }

}