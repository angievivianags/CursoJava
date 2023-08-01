package colecciones;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(1);
        array.add("String");
        array.add(new Object());

        System.out.println(array.toString());
        System.out.println(array.size());

        ArrayList<String> arrayStrings = new ArrayList();
        arrayStrings.add("sdfer");
        arrayStrings.add("String");
        arrayStrings.add("sds");
        arrayStrings.add("sdfer");
        arrayStrings.add("String");
        arrayStrings.add("sds");
        arrayStrings.add("sdfer");
        arrayStrings.add("String");
        arrayStrings.add("sds");
        arrayStrings.add("sdfer");
        arrayStrings.add("String");
        arrayStrings.add("sds");
        arrayStrings.add(5,"Viviana");
        System.out.println(arrayStrings.toString());
        System.out.println(arrayStrings.size());
    }
}
