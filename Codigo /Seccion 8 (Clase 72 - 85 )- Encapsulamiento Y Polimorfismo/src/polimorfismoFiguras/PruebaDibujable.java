package polimorfismoFiguras;

public class PruebaDibujable {

    void probarDibujar( Dibujable dibujable){
        dibujable.dibujar();
    }

    public static void main(String[] args) {
        PruebaDibujable pruebaDibujable = new PruebaDibujable();
        pruebaDibujable.probarDibujar(new Circulo("Verde",10.5f));
        pruebaDibujable.probarDibujar(new Rectangulo("Rojo",12.5f,10.5f));
        pruebaDibujable.probarDibujar(new Imagen());

        System.out.println(new Circulo("Verde",10.5f) instanceof Dibujable);
    }
}
