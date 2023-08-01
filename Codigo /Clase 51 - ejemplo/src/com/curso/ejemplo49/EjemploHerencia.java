package com.curso.ejemplo49;

class Animal{

    String nombre;

    public void respirar(){
        System.out.println("Soy un animal y estoy respirando");
    }

}

class Perro extends Animal{

}

class Gato extends  Animal{

}


public class EjemploHerencia {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Perro perro = new Perro();
        perro.nombre = "Bruno";
        perro.respirar();

        Gato gato = new Gato();
        gato.nombre = "Amor";
        gato.respirar();

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Object);

        System.out.println(perro instanceof Animal);
        System.out.println(perro instanceof Object);
        System.out.println(perro instanceof Perro);

    }

}
