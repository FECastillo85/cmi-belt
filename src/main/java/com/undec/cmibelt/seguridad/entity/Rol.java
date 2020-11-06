package com.undec.cmibelt.seguridad.entity;

import com.sun.istack.NotNull;
import com.undec.cmibelt.seguridad.enums.RolNombre;

import javax.persistence.*;

@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol() {
    }

    public Rol(com.undec.cmibelt.seguridad.enums.RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.undec.cmibelt.seguridad.enums.RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(com.undec.cmibelt.seguridad.enums.RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
}
