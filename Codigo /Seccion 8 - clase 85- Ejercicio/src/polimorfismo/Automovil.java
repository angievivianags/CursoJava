package polimorfismo;

public class Automovil implements Trasporte{

    @Override
    public void encender() {
        System.out.println("Automovil encendido");
    }

    @Override
    public void estaciona() {
        System.out.println("Automovil etacionado");
    }
}
