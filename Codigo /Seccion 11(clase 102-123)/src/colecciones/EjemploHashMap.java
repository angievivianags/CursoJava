package colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap();
        diccionario.put("raidentrance", "Es la cuenta del instructor");
        diccionario.put("Java", "es el lenguaje que estamos aprendiendo");
        diccionario.put(null, "representa la aucencia de un objeto");
        diccionario.put("Java", "es el lenguaje mas chevere");
         System.out.println(diccionario);
         for (String llave: diccionario.keySet()){
            System.out.println(llave + " = "+diccionario.get(llave));
         }

        for (Map.Entry<String,String> entry: diccionario.entrySet()){
            System.out.println(entry.getKey() + " = "+entry.getValue());
        }



    }
}
