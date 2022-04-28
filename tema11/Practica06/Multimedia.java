package com.programacionOO.tema11.Practica06;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Objects;

public abstract class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private GregorianCalendar fecha;

    public Multimedia(String titulo, String autor, Formato formato, GregorianCalendar fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.format(fecha.getTime());
        return "Mutlimedia{" +
                "titulo = '" + titulo + '\'' +
                ", autor = '" + autor + '\'' +
                ", formato = " + formato +
                ", fecha = " + sdf +
                '}';
    }
    //COMPARA SI DOS OBJETOS SON IGUALES
    @Override
    public boolean equals(Object multimedia) {
        if (this == multimedia) return true;
        if (multimedia == null || this.getClass() != multimedia.getClass()) return false;
        Multimedia multimedia1 =(Multimedia) multimedia;
        return this.titulo.equals(multimedia1.titulo) && autor.equals(multimedia1.autor) && formato == multimedia1.formato;
    }

}
