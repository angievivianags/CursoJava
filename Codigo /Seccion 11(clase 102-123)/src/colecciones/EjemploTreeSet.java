package colecciones;

import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Angie");
        set.add("Viviana");
        set.add("Galindo");
        set.add("Viviana");
        set.add("Suarez");
        System.out.println(set.toString());
    }
}
