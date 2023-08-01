package innerclasses;

public class ClasesANivelDeMetodo {

    static  void  foo(){
        class ClaseInternaDeMetodo{
            void bar(){
                System.out.println("Bar");
            }
        }
        ClaseInternaDeMetodo claseInternaDeMetodo = new ClaseInternaDeMetodo();
        claseInternaDeMetodo.bar();
    }

    public static void main(String[] args) {
        foo();
    }
}
