package polimorfismoFiguras;


public class Rectangulo extends Figura implements Dibujable{

    private double largo;
    private double ancho;

    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea(){
        return ancho*largo;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando Rectangulo");
    }
}
