package com.curso.ejercicio;

public class Mascota {

    String nombre;
    int edad;
    String raza;
    char sexo;
    double peso;
    String color;
    String especie;

    public Mascota(){

    }

    public Mascota(String nombre,int edad,String especie,char sexo, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.sexo = sexo;
        this.peso = peso;
    }

    public Mascota(String nombre,int edad,String raza, char sexo, double peso, String color, String especie){
        this(nombre,edad,especie,sexo,peso);
        this.raza = raza;
        this.color = color;
    }

    public static void main(String[] args) {
        Mascota  mascota = new Mascota();
        mascota.nombre = "Mascota 1";
        mascota.edad = 10;
        mascota.especie = "Perro";

        Mascota  mascota2 = new Mascota("Mascota 2",9, "gato",'H',12.2);

        Mascota  mascota3 = new Mascota("Mascota 3",9,"egipcio",'M',10.2,"BLANCO","Gato");


    }
}
