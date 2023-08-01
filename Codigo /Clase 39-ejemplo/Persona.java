
//Definicion de la Clase
class Persona{
   //atributos
   String nombre;
   int edad;
   char genero;

   Persona(String nombre, int edad, char genero){
      System.out.println( "Esto es un constructor");
      this.nombre = nombre;
      this.edad = edad;
      this.genero = genero;
   }

   //metodos
   void imprimirInformacion(){
      System.out.println(" Nombre: " + nombre +" Edad: " + edad + " Genero: " + genero);
   }

    //metodos
    void jugarVideoJuegos(Persona p){
      System.out.println( nombre +"esta jugando con " + p.nombre);
   }

  public static void main(String[] args) {
      Persona persona = new Persona( "Angie",24,'F');
      persona.imprimirInformacion();

      Persona otraPersona = new Persona("Viviana",25,'F');
      otraPersona.imprimirInformacion();

      persona.jugarVideoJuegos(otraPersona);

  }
}
