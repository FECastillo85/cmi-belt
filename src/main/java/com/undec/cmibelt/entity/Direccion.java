package com.undec.cmibelt.entity;

import javax.persistence.*;

@Entity
public class Direccion {

    public Direccion() {
    }

    public Direccion(String calle, String localidad, String barrio, int num, String provincia, int cp) {
        Calle = calle;
        Localidad = localidad;
        Barrio = barrio;
        Num = num;
        Provincia = provincia;
        CP = cp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;

    @Column
    private String Calle;

    @Column
    private String Localidad;

    @Column
    private String Barrio;

    @Column
    private int Num;

    @Column
    private String Provincia;

    @Column
    private int CP;

  //  @OneToOne
  //  @JoinColumn(name= "FK_institucion",updatable = false, nullable = false)
  //  private Institucion institucion;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String calle) {
        Calle = calle;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String localidad) {
        Localidad = localidad;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String barrio) {
        Barrio = barrio;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }
}
