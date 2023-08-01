package exceptions;

public class EjemploThrow {

    /*
        Manejar excepciones sera una de dos cosas
                atrapar la excepcion con un Try catch
                Propagar la excepcion a quien invoco el metodo
     */
    static double dividir(int a ,int b) throws Exception {
        if(b != 0){
            return a/b;
        }else{
            throw new Exception("No se puede dividir entre 0");
        }
    }

    public static void main(String[] args) {
        double resultado = 0;
        try {
            resultado = dividir(10,4);
            System.out.println("Resultado "+resultado);
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}
