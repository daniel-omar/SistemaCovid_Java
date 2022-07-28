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
public class Ficha {
    private int IdFicha;
    private Date FechaRegistro;
    private Date FechaModificacion;
    private int IdPersonaRegistro;
    private int IdPersonaModificacion;
    private boolean EsActivo;

    public Ficha() {
    }

    public Ficha(int IdFicha, Date FechaRegistro, Date FechaModificacion, int IdPersonaRegistro, int IdPersonaModificacion, boolean EsActivo) {
        this.IdFicha = IdFicha;
        this.FechaRegistro = FechaRegistro;
        this.FechaModificacion = FechaModificacion;
        this.IdPersonaRegistro = IdPersonaRegistro;
        this.IdPersonaModificacion = IdPersonaModificacion;
        this.EsActivo = EsActivo;
    }

    public int getIdFicha() {
        return IdFicha;
    }

    public void setIdFicha(int IdFicha) {
        this.IdFicha = IdFicha;
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

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }
    
}
