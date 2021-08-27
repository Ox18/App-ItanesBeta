package com.example.mapbox.model;

public class Lugar {
    private int id;
    private int idPaquete;
    private String nombre;
    private String descripcion;
    private String photoURI;
    private Float coordinateA;
    private Float coordinateB;

    public Float getCoordinateA() {
        return coordinateA;
    }

    public void setCoordinateA(Float coordinateA) {
        this.coordinateA = coordinateA;
    }

    public Float getCoordinateB() {
        return coordinateB;
    }

    public void setCoordinateB(Float coordinateB) {
        this.coordinateB = coordinateB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPhotoURI() {
        return photoURI;
    }

    public void setPhotoURI(String photoURI) {
        this.photoURI = photoURI;
    }
}
