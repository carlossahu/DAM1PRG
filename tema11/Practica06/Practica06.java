package com.programacionOO.tema11.Practica06;

import java.util.ArrayList;

public class Practica06 {
    private final String[] opcionesMenu = {"Altas...","Alquilar multimedia a socio", "Devolver multimedia", "Listar..."};
    private final String[] opcionesAltas = {"Nueva pelicula","Nuevo videojuego","Nuevo socio"};
    private final String[] opcionesListar = {"Todos los objetos multimedia","Todas las peliculas (A-Z)", "Todos los videojuegos (por año)","Historico de alquileres de un socio (por año)", "Alquileres activos de socios","Socios con recargos" };

    Tienda tienda;

    public Practica06(int init) throws RecargosPendientesException {
        //todo implement Tienda
        tienda = new Tienda(init);
    }
    //todo: altas

    //todo : alquilar multimedia
    // 1- elegir socio
    // 2- elegir productos
}
