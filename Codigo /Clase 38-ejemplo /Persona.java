//Definicion de la Clase
class Persona{
   //atributos
   String nombre;
   int edad;
   char genero;

   //metodos
   void imprimirInformacion(){
      System.out.println(" Nombre: " + nombre +" Edad: " + edad + " Genero: " + genero);
   }

  public static void main(String args[]) {
      Persona persona = new Persona();
      persona.nombre = "Angie";
      persona.edad = 24;
      persona.genero = 'F';
      persona.imprimirInformacion();

      Persona otraPersona = new Persona();
      otraPersona.nombre = "Viviana";
      otraPersona.edad = 25;
      otraPersona.genero = 'F';
      otraPersona.imprimirInformacion();
  }
}