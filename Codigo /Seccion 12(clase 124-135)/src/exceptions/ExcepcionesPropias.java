package exceptions;

class TituloIncorrectoException extends RuntimeException{

    public TituloIncorrectoException(String error) {
        super(error);
    }
}

public class ExcepcionesPropias {

    static void crearCurso(String titulo){
        if(!titulo.toUpperCase().equals(titulo)){
            throw new TituloIncorrectoException("El titulo debe estar en mayusculas");
        }
        System.out.println("Titulo Correcto");
    }

    public static void main(String[] args) {
        crearCurso("JAVA DESDE CERO A PROFUNDIDAd");
    }
}
