package colecciones;

import java.util.TreeSet;

class Perro implements Comparable<Perro>{
    String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro [" + "nombre=" + nombre + "]";
    }

    @Override
    public int compareTo(Perro perro) {
        return nombre.compareTo(perro.getNombre());
        //return perro.getNombre().compareTo(nombre);
    }
}

public class Ejemplocomparables {

    public static void main(String[] args) {
        TreeSet<Perro> set = new TreeSet<Perro>();
        set.add(new Perro("Paco"));
        set.add(new Perro("Baco"));
        set.add(new Perro("Bruno"));
        set.add(new Perro("Corbatin"));

        System.out.println(set.toString());

    }
}
