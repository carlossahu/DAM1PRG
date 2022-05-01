package com.programacionOO.tema11.Practica06.MultimediaItems;

import com.programacionOO.tema11.Practica06.Formato;
import com.programacionOO.tema11.Practica06.Multimedia;

import java.util.GregorianCalendar;

public class Pelicula extends Multimedia {

    private int duracionMinutos;
    private String actor;
    private String actriz;


    public Pelicula(String titulo, String autor, Formato formato, GregorianCalendar fecha, int duracionMinutos, String actor, String actriz) {
        super(titulo, autor, formato, fecha);
        this.duracionMinutos = duracionMinutos;
        this.actor = actor;
        this.actriz = actriz;

    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "duracionMinutos=" + duracionMinutos +
                ", actor principal='" + actor + '\'' +
                ", actriz principal='" + actriz + '\'' +
                '}';
    }
}