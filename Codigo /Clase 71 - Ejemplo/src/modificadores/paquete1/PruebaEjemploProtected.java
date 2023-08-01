package modificadores.paquete1;

public class PruebaEjemploProtected extends  EjemploProtected{

    void bar(){
        foo();
    }

    public static void main(String[] args) {
        PruebaEjemploProtected pruebaEjemploProtected = new PruebaEjemploProtected();
        pruebaEjemploProtected.bar();
    }

}
