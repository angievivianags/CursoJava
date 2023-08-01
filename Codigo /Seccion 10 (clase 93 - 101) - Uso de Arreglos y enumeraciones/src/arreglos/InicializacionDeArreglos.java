package arreglos;

public class InicializacionDeArreglos {

    static void imprimiArreglo(String arreglo[]){
        for (String valor: arreglo) {
            System.out.println(valor);
        }
    }

    public static void main(String[] args) {
        //Explicita
        String nombres[] = new String[3];
        nombres[0] = "a";
        nombres[1] = "b";
        nombres[2] = "c";
        imprimiArreglo(nombres);

        //Implicita
        String nombres2[] ={"a","b","c"};
        imprimiArreglo(nombres2);

        //Anonima
        String nombres3[] = new String[]{"a","b","c"};
        imprimiArreglo(nombres3);
        imprimiArreglo(new String[]{"a","b","c"});


    }
}
