package colecciones;

class BenaGenerico<T>{
    private T  valor;

    public BenaGenerico(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

}

public class EjemploGenerico {
    public static void main(String[] args) {
        BenaGenerico benaGenerico = new BenaGenerico("Alex");
        System.out.println(benaGenerico.getValor());
        benaGenerico.setValor("Pepe");
        System.out.println(benaGenerico.getValor());
        benaGenerico.setValor(100);
        System.out.println(benaGenerico.getValor());

        BenaGenerico<String> benaGenerico2 = new BenaGenerico("Alex");
        System.out.println(benaGenerico2.getValor());
        // benaGenerico2.setValor(100);
    }
}
