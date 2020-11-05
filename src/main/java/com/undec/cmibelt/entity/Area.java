package com.undec.cmibelt.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Area {

    public Area() {
    }

    public Area(String nombre, String descripcion, Date fechaCreacion, UnidadInstitucional unidadInstitucional) {
        Nombre = nombre;
        Descripcion = descripcion;
        FechaCreacion = fechaCreacion;
        this.unidadInstitucional = unidadInstitucional;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;
    @Column
    private String Nombre;
    @Column
    private String Descripcion;
    @Column
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date FechaCreacion;

    @ManyToOne
    @JoinColumn(name = "unidad_nombre")
    private UnidadInstitucional unidadInstitucional;

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

    public UnidadInstitucional getUnidadInstitucional() {
        return unidadInstitucional;
    }

    public void setUnidadInstitucional(UnidadInstitucional unidadInstitucional) {
        this.unidadInstitucional = unidadInstitucional;
    }
}
