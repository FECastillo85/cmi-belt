package com.undec.cmibelt.DTO;

import com.undec.cmibelt.entity.Area;
import com.undec.cmibelt.entity.Institucion;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UnidadInstitucionalDTO implements Serializable {

    private Long Id;
    private String Nombre;
    private String Descripcion;
    private Date FechaCreacion;
    private List<Area> listaArea;
    private Institucion Institucion;

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

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public List<Area> getListaArea() {
        return listaArea;
    }

    public void setListaArea(List<Area> listaArea) {
        this.listaArea = listaArea;
    }

    public com.undec.cmibelt.entity.Institucion getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(com.undec.cmibelt.entity.Institucion institucion) {
        Institucion = institucion;
    }
}
