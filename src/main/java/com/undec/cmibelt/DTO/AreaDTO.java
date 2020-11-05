package com.undec.cmibelt.DTO;

import java.io.Serializable;
import java.util.Date;

public class AreaDTO implements Serializable {

    private Long Id;
    private String Nombre;
    private String Descripcion;
    private Date FechaCrecion;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getFechaCrecion() {
        return FechaCrecion;
    }

    public void setFechaCrecion(Date fechaCrecion) {
        FechaCrecion = fechaCrecion;
    }
}
