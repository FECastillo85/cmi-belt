package com.undec.cmibelt.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class UnidadInstitucional {

    public UnidadInstitucional() {
    }

    public UnidadInstitucional(String nombre, String descripcion, Date fechaCreacion, Institucion institucion, List<Area> listaAreas) {
        Nombre = nombre;
        Descripcion = descripcion;
        FechaCreacion = fechaCreacion;
        this.institucion = institucion;
        this.listaAreas = listaAreas;
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
    @JoinColumn(name = "institucion_nombre")
    private Institucion institucion;

    @OneToMany(mappedBy = "unidadInstitucional")
    private List<Area> listaAreas;


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

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public List<Area> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(List<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }
}
