package modificadores;

class Prueba{
    @SuppressWarnings("unused")
   private String nombre;

   public Prueba (){

   }

   void foo(){

   }
}


public class EjemploPrivate {

    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.foo();
    }
}
