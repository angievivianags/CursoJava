package innerclasses;

abstract class FiguraAnonima{
    abstract void food();
}
public class EjemploAnonimasAbastractas {

    public static void main(String[] args) {
        FiguraAnonima figuraAnonima = new FiguraAnonima() {
            @Override
            void food() {
                System.out.println("Foo");
            }
        };
        figuraAnonima.food();
    }
}
