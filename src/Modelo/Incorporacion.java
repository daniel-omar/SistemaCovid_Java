/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author omar_
 */
public class Incorporacion {

    private int IdIncorporacion;
    private int IdEstadoIncorporacion;
    private EstadoIncorporacion oEstadoIncorporacion;
    private Date FechaRegistro;
    private Date FechaModificacion;
    private int IdPersonaRegistro;
    private int IdPersonaModificacion;
    private int IdFichaSintomatologica;
    private FichaSintomatologica oFichaSintomatologica;
    private boolean EsActivo;
    private Persona oPersonaRegistro;
    private Persona oPersonaModificacion;
    
    public Incorporacion() {
    }

    public int getIdIncorporacion() {
        return IdIncorporacion;
    }

    public void setIdIncorporacion(int IdIncorporacion) {
        this.IdIncorporacion = IdIncorporacion;
    }

    public int getIdEstadoIncorporacion() {
        return IdEstadoIncorporacion;
    }

    public void setIdEstadoIncorporacion(int IdEstadoIncorporacion) {
        this.IdEstadoIncorporacion = IdEstadoIncorporacion;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public Date getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(Date FechaModificacion) {
        this.FechaModificacion = FechaModificacion;
    }

    public int getIdPersonaRegistro() {
        return IdPersonaRegistro;
    }

    public void setIdPersonaRegistro(int IdPersonaRegistro) {
        this.IdPersonaRegistro = IdPersonaRegistro;
    }

    public int getIdPersonaModificacion() {
        return IdPersonaModificacion;
    }

    public void setIdPersonaModificacion(int IdPersonaModificacion) {
        this.IdPersonaModificacion = IdPersonaModificacion;
    }

    public int getIdFichaSintomatologica() {
        return IdFichaSintomatologica;
    }

    public void setIdFichaSintomatologica(int FichaSintomatologica) {
        this.IdFichaSintomatologica = FichaSintomatologica;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

    public EstadoIncorporacion getoEstadoIncorporacion() {
        return oEstadoIncorporacion;
    }

    public void setoEstadoIncorporacion(EstadoIncorporacion oEstadoIncorporacion) {
        this.oEstadoIncorporacion = oEstadoIncorporacion;
    }

    public FichaSintomatologica getoFichaSintomatologica() {
        return oFichaSintomatologica;
    }

    public void setoFichaSintomatologica(FichaSintomatologica oFichaSintomatologica) {
        this.oFichaSintomatologica = oFichaSintomatologica;
    }

    public Persona getoPersonaRegistro() {
        return oPersonaRegistro;
    }

    public void setoPersonaRegistro(Persona oPersonaRegistro) {
        this.oPersonaRegistro = oPersonaRegistro;
    }

    public Persona getoPersonaModificacion() {
        return oPersonaModificacion;
    }

    public void setoPersonaModificacion(Persona oPersonaModificacion) {
        this.oPersonaModificacion = oPersonaModificacion;
    }
    
    
    
}
