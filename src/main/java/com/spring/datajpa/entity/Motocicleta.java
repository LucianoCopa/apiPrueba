package com.spring.datajpa.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
public class Motocicleta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequenceName = "MOTOCICLETA_SEQ_SQL", name = "moto_seq_jpa")
    private Long id;
    private Integer modelo;
    private Integer cilindrada;
    private String marcaDetalle;
    private boolean frenosAbs;
    private Double precio;

    private Date fechaAlta;
    private Date fechaModificacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarcaDetalle() {
        return marcaDetalle;
    }

    public void setMarcaDetalle(String marcaDetalle) {
        this.marcaDetalle = marcaDetalle;
    }

    public boolean isFrenosAbs() {
        return frenosAbs;
    }

    public void setFrenosAbs(boolean frenosAbs) {
        this.frenosAbs = frenosAbs;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
