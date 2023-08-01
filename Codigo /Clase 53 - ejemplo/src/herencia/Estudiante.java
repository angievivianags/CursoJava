package herencia;

public class Estudiante  extends Persona{

    int numeroDeCuenta;

    Estudiante(String nombre, String fechaNacimiento, int numeroDeCuenta){
        super(nombre,fechaNacimiento);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    @Override
    void dormir(){
        super.dormir();
        System.out.println("Soy "+ nombre+ " ,soy estudiante yo no duermo" );
    }

    void aprobar(){
        System.out.println("Soy "+ nombre+ " y aprobe mi examen" );
    }

    void reprobar (){
        System.out.println("Soy "+ nombre+ " y reprobe mi examen" );
    }

}
