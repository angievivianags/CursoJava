package herencia;

public class Persona {

    String nombre;
    String fechaNacimiento;

    Persona(String nombre, String fechaNacimiento){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {

    }

    void dormir(){
        System.out.println("Soy "+ nombre+ " y estoy durmiendo" );
    }
    void respirar(){
        System.out.println("Soy "+ nombre+ " y estoy respirardo" );
    }
    void comer(){
        System.out.println("Soy "+ nombre+ " y estoy comiendo" );
    }

}
