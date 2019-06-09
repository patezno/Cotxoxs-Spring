package org.lasencinas.cotxoxsSpring.domain;

import javax.persistence.*;

@Entity
@Table(name = "t_carreras")
public class Carrera {

    @Id
    @Column(name = "c_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "c_tarjeta_credito")
    private String tarjetaCredito;

    @Column(name = "c_origen")
    private String origen;

    @Column(name = "c_destino")
    private String destino;

    @Column(name = "c_distancia")
    private double distancia;

    @Column(name = "c_tiempo_esperado")
    private int tiempoEsperado;

    @Column(name = "c_tiempo_carrera")
    private int tiempoCarrera;

    @Column(name = "c_coste_total")
    private int costeTotal;

    @Column(name = "c_propina")
    private int propina;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "co_nombre")
    private Conductor conductor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getCosteTotal() {
        return costeTotal;
    }

    public void setCosteTotal(int costeTotal) {
        this.costeTotal = costeTotal;
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
}
