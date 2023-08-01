package herencia;

public class Empleado extends Persona{

    float sueldo;

    Empleado (String nombre, String fechaNacimiento, float sueldo){
        super(nombre,fechaNacimiento);
        this.sueldo =sueldo;
    }

    void trabajar(){
        System.out.println("Soy "+ nombre+ " y trabajo" );
    }

    void cobrar(){
        System.out.println("Soy "+ nombre+ " y cobro" + sueldo);
    }
}
