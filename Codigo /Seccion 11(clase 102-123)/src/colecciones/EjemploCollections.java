package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploCollections {

    public static void main(String[] args) {
        List<String> nombres =  new ArrayList<String>();
        nombres.add("Angie");
        nombres.add("Viviana");
        nombres.add("Leydi");
        nombres.add("Marian");

        Collections.sort(nombres);
        int index = Collections.binarySearch(nombres,"Viviana");
        System.out.println(nombres);
        System.out.println(nombres.get(index));
    }
}
