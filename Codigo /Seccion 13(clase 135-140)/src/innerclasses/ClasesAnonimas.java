package innerclasses;

class EjemploAnonima{
    void foo(){
        System.out.println("Foo");
    }
}

public class ClasesAnonimas {

    public static void main(String[] args) {
        EjemploAnonima obj = new EjemploAnonima(){
            @Override
            void foo(){
                System.out.println("Bar");
            }
        };
        obj.foo();
    }
}
