package arreglos;

enum SaborPalomitas{
    CHILE("Chile",12.0f), MANTEQUILLA("Mantequilla",10.0f),
    QUESO("Queso",15.0f),CARAMELO ("Caramero",14.0f);

    private String nombreDeVenta;
    private float precio;

    SaborPalomitas(String nombreDeVenta, float precio) {
        this.nombreDeVenta = nombreDeVenta;
    }

    public String getNombreDeVenta() {
        return nombreDeVenta;
    }

    public void setNombreDeVenta(String nombreDeVenta) {
        this.nombreDeVenta = nombreDeVenta;
    }
}

public class EjemploEnumeraciones {

    public static void main(String[] args) {
        SaborPalomitas caramelo = SaborPalomitas.CARAMELO;
        System.out.println(caramelo.getNombreDeVenta());
    }

}
