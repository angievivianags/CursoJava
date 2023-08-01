package exceptions;

class RecursosDev4j implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Liberando Recursos");
    }

    void foo(){
        System.out.println("foo");
    }
}

public class EjemploTryWithResources {

    public static void main(String[] args) throws Exception {
        try (RecursosDev4j recursosDev4j = new RecursosDev4j()) {
            // codigo para acceder a una base de datos
            recursosDev4j.foo();
        }
    }
}
