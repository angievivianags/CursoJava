package colecciones;

import java.util.HashSet;

public class EjemploHashSet {

    public static void main(String[] args) {
        HashSet<String> nombre = new HashSet<String>();
        System.out.println(nombre.add("Viviana"));
        nombre.add("Angie");
        System.out.println(nombre.add("Viviana"));
        nombre.add(null);
        System.out.println(nombre.toString());
    }
}
