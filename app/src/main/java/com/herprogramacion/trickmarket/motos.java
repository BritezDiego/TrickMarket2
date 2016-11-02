package com.herprogramacion.trickmarket;

public class motos {
    private String nombre;
    private String descripcion;
    private int idThumbnail;
    public motos(String nombre, String descripcion, int idThumbnail) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idThumbnail = idThumbnail;
    }

    public motos(){
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getIdThumbnail() {
        return idThumbnail;
    }
}