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
public class Persona {

    private int IdPersona;
    private int IdTipoPersona;
    private TipoPersona oTipoPersona;
    private String NumeroDocumento;
    private String Nombres;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String Direccion;
    private String Telefono;
    private String Correo;
    
    private int IdPersonaRegistro;
    private int IdPersonaModificacion;
    
    private Date FechaRegistro;
    private Date FechaModificacion;
    private boolean EsActivo;

    public Persona() {
    }

    public int getIdPersona() {
        return IdPersona;
    }

    public void setIdPersona(int IdPersona) {
        this.IdPersona = IdPersona;
    }

    public int getIdTipoPersona() {
        return IdTipoPersona;
    }

    public void setIdTipoPersona(int IdTipoPersona) {
        this.IdTipoPersona = IdTipoPersona;
    }

    public TipoPersona getoTipoPersona() {
        return oTipoPersona;
    }

    public void setoTipoPersona(TipoPersona oTipoPersona) {
        this.oTipoPersona = oTipoPersona;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
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

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }
    
    
}
