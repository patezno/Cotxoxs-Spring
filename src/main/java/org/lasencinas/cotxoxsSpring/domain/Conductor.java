package org.lasencinas.cotxoxsSpring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_conductores")
public class Conductor {

    public Conductor() {
    }

    @Id
    @Column(name = "co_nombre")
    private String nombre;

    @Column(name = "co_modelo")
    private String modelo;

    @Column(name = "co_matricula")
    private String matricula;

    @Column(name = "co_valoracion_media")
    private double valoracionMedia;

    @Column(name = "co_ocupado")
    private boolean ocupado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public void setValoracionMedia(double valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
