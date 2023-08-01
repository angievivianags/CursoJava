package exceptions;

public class ReglasTryCatchFinally {

    static void test(){
        try {
            System.out.println("Bloque Try");
            return ;
        }finally {
            System.out.println("Bloque finally");
        }
    }

    public static void main(String[] args) {
        //el bloque con try catch
        try {

        }catch (Exception e){

        }

        //el bloque con try muchos catch
        // primero excepciones especificas y luego las mas generales
        try {

        }catch (NullPointerException e){

        }catch (RuntimeException e){

        }catch (Exception e){

        }

        //el bloque con try finally
        try {

        } finally {

        }

        //el bloque con try catch finally
        try {

        }catch (Exception e){

        } finally {

        }
    }
}
