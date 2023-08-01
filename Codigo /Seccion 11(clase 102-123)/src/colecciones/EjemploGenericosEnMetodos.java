package colecciones;


import java.util.Arrays;
import java.util.List;

public class EjemploGenericosEnMetodos {

    static double sumarValores(List<? extends Number> valores){
        double suma = 0.0;
        for (Number valor : valores){
            suma += valor.doubleValue();
        }
        return  suma;
    }

    public static void main(String[] args) {
       double sumarValores = sumarValores(Arrays.asList(10.45,11.14,17, new Float(17), new Integer(300)));
       System.out.println("Suma ="+ sumarValores);
    }
}
