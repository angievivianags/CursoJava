package polimorfismoFiguras;

public class PruebaFiguras {

    void imprimirArea(Figura figura){
        System.out.println("El color de la figura es " + figura.getColor() +" y su area es "+ figura.calcularArea());
    }

    public static void main(String[] args) {
        PruebaFiguras p = new PruebaFiguras();
        p.imprimirArea(new Circulo("Azul", 10.0));
        p.imprimirArea(new Cuadrado("Rojo", 12.0));
        p.imprimirArea(new Rectangulo("Morado", 10.0 , 5.0));

    }
}
