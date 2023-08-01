package modificadores;

class Prueba{
   private String nombre;

   public Prueba (){

   }

   private void foo(){

   }
}


public class EjemploPrivate {

    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.foo();
    }
}
