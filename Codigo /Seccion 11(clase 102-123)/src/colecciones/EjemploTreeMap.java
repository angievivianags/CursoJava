package colecciones;

import java.util.TreeMap;

class EjemploTreeMap {

    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("zi su", "Futbolista");
        treeMap.put("Angie Galindo", "Programadora");
        treeMap.put("Messi", "Futbolista");
        System.out.println(treeMap.toString());
    }
}
