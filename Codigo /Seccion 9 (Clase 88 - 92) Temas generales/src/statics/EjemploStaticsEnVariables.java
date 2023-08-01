package statics;

class SerVivo{
    public SerVivo() {
        System.out.println("Constructor Ser Vivo");
    }
}


class Humano extends SerVivo{
    static  int numeroDeHumanos = 0;
    String nombre;

    public Humano() {
        super();
        System.out.println("Constructor");
    }

    public Humano(String nombre) {
        System.out.println("Constructor sobrecargado");
        this.nombre = nombre;
    }

    //Bloque anonimo
    {
        System.out.println("Bloque anonimo");
        numeroDeHumanos++;
    }
    //Bloque anonimo
    {
        System.out.println("Bloque 2");
    }
}

public class EjemploStaticsEnVariables {

     int x =0;

    public static void main(String[] args) {
       System.out.println(Humano.numeroDeHumanos);
       new Humano();
       new Humano("Angie");
       new Humano();
       new Humano("Viviana");
       System.out.println(Humano.numeroDeHumanos);
    }
}
