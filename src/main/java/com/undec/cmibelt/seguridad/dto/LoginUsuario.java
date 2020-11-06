package com.undec.cmibelt.seguridad.dto;

import javax.validation.constraints.NotBlank;

public class LoginUsuario {

    @NotBlank
    private String password;
    @NotBlank
    private String nombreUsuario;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
