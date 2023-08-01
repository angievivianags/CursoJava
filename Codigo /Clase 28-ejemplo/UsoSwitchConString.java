class UsoSwitchConString{

   public static void main(String[] args) {
      String opcion = "uno" ;
      switch (opcion) {
         case "cero":
            System.out.println("Caso Cero");
            break;
         case "uno":
            System.out.println("Caso Uno");
            break;
         case "dos":
            System.out.println("Caso Dos");
            break;
         case "tres":
            System.out.println("Caso Tres");
            break;
         case "cuatro":
            System.out.println("Caso Cuatro");
         break;
         default:
            System.out.println("Caso Default");
         break;
      }
   }

}