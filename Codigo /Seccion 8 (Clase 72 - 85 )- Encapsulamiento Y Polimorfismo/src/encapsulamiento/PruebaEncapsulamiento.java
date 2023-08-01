package encapsulamiento;

class Examen {
    private float calificacion;
    private float numeroDePreguntas;
    private boolean activo;

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public float getNumeroDePreguntas() {
        return numeroDePreguntas;
    }

    public void setNumeroDePreguntas(float numeroDePreguntas) {
        this.numeroDePreguntas = numeroDePreguntas;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

public class PruebaEncapsulamiento {

    public static void main(String[] args) {
        Examen examen = new Examen();
        examen.setCalificacion(10.0f);
    }
}
