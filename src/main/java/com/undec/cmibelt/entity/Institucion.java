package com.undec.cmibelt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Institucion {

    public Institucion() {
    }

    public Institucion(String nombre, int numero, String descripcion, Direccion dirección, int CUE, String telefono, String email, Date fechaCreacion, List<UnidadInstitucional> listaUnidadInstitucional) {
        Nombre = nombre;
        Numero = numero;
        Descripcion = descripcion;
        Dirección = dirección;
        this.CUE = CUE;
        Telefono = telefono;
        Email = email;
        FechaCreacion = fechaCreacion;
        this.listaUnidadInstitucional = listaUnidadInstitucional;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;
    @Column
    private String Nombre;
    @Column
    private int Numero;
    @Column
    private String Descripcion;
    @Column
    private int CUE;
    @Column
    private String Telefono;
    @Column
    private String Email;
    @Column
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date FechaCreacion;

    @Column
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private Date FechaModificacion;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Direccion Dirección;

    @OneToMany(mappedBy = "institucion")
    private List<UnidadInstitucional> listaUnidadInstitucional;

    /*
    @OneToMany(mappedBy = "institucion")
    private List<Area> listaArea;
*/

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

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @JsonIgnore
    public Direccion getDirección() {
        return Dirección;
    }

    public void setDirección(Direccion dirección) {
        Dirección = dirección;
    }

    public int getCUE() {
        return CUE;
    }

    public void setCUE(int CUE) {
        this.CUE = CUE;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        FechaModificacion = fechaModificacion;
    }

    public List<UnidadInstitucional> getListaUnidadInstitucional() {
        return listaUnidadInstitucional;
    }

    public void setListaUnidadInstitucional(List<UnidadInstitucional> listaUnidadInstitucional) {
        this.listaUnidadInstitucional = listaUnidadInstitucional;
    }

    /*
    public List<Area> getListaArea() {
        return listaArea;
    }

    public void setListaArea(List<Area> listaArea) {
        this.listaArea = listaArea;
    }


     */
}
