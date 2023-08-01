package colecciones;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Gato{
    String nombre;
    String apellido;

    public Gato(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Gato [" + "nombre=" + nombre + ", apellido="+apellido+"]";
    }
}

class OrdenamientoPorNombres implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getNombre().compareTo(gato2.getNombre());
    }
}

class OrdenamientoPorApellidos implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getApellido().compareTo(gato2.getApellido());
    }
}

public class EjemploComparable {

    public static void main(String[] args) {
        Set<Gato> gatos = new TreeSet<Gato>(new OrdenamientoPorNombres());
        gatos.add(new Gato("mia","miu"));
        gatos.add(new Gato("lala","lo"));
        gatos.add(new Gato("lola","sa"));
        gatos.add(new Gato("copo","ra"));

        System.out.println(gatos.toString());


        Set<Gato> gatos2 = new TreeSet<Gato>(new OrdenamientoPorApellidos());
        gatos2.add(new Gato("mia","miu"));
        gatos2.add(new Gato("lala","lo"));
        gatos2.add(new Gato("lola","sa"));
        gatos2.add(new Gato("copo","ra"));

        System.out.println(gatos2.toString());
    }
}
