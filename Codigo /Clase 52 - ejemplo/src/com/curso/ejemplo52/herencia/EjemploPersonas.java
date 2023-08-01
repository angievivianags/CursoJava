package com.curso.ejemplo52.herencia;

public class EjemploPersonas {

    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Angie";
        e.fechaNacimiento = "30-12-1997";
        e.numeroDeCuenta = 1202323;

        e.dormir();
        e.aprobar();
        e.reprobar();


    }
}
