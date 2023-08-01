package colecciones;

class Transporte {}

class Auto extends  Transporte{}

class Deportivo extends Auto{}

class BenaGenerico2<T extends Transporte>{
    private T  valor;

    public BenaGenerico2(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

}

public class EjemploGenerico2 {
    public static void main(String[] args) {
        BenaGenerico2 benaGenerico = new BenaGenerico2(new Auto());
        System.out.println(benaGenerico.getValor());

        BenaGenerico2<Deportivo> benaGenerico2 = new BenaGenerico2(new Deportivo());
        System.out.println(benaGenerico2.getValor());

    }
}
