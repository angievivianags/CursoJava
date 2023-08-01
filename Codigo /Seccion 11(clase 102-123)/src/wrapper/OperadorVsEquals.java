package wrapper;
class  Perro{
    String nombre;

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Perro){
            Perro prr = (Perro) obj;
            if( prr.getNombre().equals(nombre)){
               return true;
            }else{
                return false;
            }
        }else {
          return false;
        }
    }
}
public class OperadorVsEquals {
    public static void main(String[] args) {
        // ==
        Perro p = new Perro("Chabelita");
        Perro p1 = new Perro("Rocky");
        System.out.println(p == p1);

        Perro p2 = new Perro("Chabelita");
        Perro p3 = p2;
        System.out.println(p2 == p3);
        System.out.println(p2.equals(p3));

        Perro p4 = new Perro("Chabelita");
        Perro p5 = p2;
        p5.nombre = "nombre";
        System.out.println(p4.equals(p5));
    }
}
