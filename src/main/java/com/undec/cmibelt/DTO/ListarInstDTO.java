package com.undec.cmibelt.DTO;

import java.io.Serializable;

public class ListarInstDTO implements Serializable {
    private int CUE;
    private String Nombre;
    private String Email;
    private Long Id;

    public int getCUE() {
        return CUE;
    }

    public void setCUE(int CUE) {
        this.CUE = CUE;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}
