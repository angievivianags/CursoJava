package com.curso.ejemplo52.herencia;

public class Estudiante  extends Persona{

    int numeroDeCuenta;

    void aprobar(){
        System.out.println("Soy "+ nombre+ " y aprobe mi examen" );
    }

    void reprobar (){
        System.out.println("Soy "+ nombre+ " y reprobe mi examen" );
    }

}
