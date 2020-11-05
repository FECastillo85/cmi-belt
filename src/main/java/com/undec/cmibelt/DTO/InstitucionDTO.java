package com.undec.cmibelt.DTO;

import javax.swing.text.html.Option;
import java.io.Serializable;

public class InstitucionDTO implements Serializable {

    private Long Id;
    private String Nombre;
    private int Numero;
    private String Descripcion;
    private int CUE;
    private String Email;
    private String Telefono;
    private String direccionCalle;
    private String direccionLocalidad;
    private String direccionBarrio;
    private int direccionNum;
    private int direccionCP;
    private String direccionProvincia;





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

    public int getCUE() {
        return CUE;
    }

    public void setCUE(int CUE) {
        this.CUE = CUE;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }

    public String getDireccionCalle() {
        return direccionCalle;
    }

    public void setDireccionCalle(String direccionCalle) {
        this.direccionCalle = direccionCalle;
    }

    public String getDireccionLocalidad() {
        return direccionLocalidad;
    }

    public void setDireccionLocalidad(String direccionLocalidad) {
        this.direccionLocalidad = direccionLocalidad;
    }

    public String getDireccionBarrio() {
        return direccionBarrio;
    }

    public void setDireccionBarrio(String direccionBarrio) {
        this.direccionBarrio = direccionBarrio;
    }

    public int getDireccionNum() {
        return direccionNum;
    }

    public void setDireccionNum(int direccionNum) {
        this.direccionNum = direccionNum;
    }

    public int getDireccionCP() {
        return direccionCP;
    }

    public void setDireccionCP(int direccionCP) {
        this.direccionCP = direccionCP;
    }

    public String getDireccionProvincia() {
        return direccionProvincia;
    }

    public void setDireccionProvincia(String direccionProvincia) {
        this.direccionProvincia = direccionProvincia;
    }
}
