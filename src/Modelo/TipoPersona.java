/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author omar_
 */
public class TipoPersona {

    private int IdTipoPersona;
    private String Nombre;
    private boolean EsActivo;

    public TipoPersona() {
    }

    public TipoPersona(int idTipoPersona, String nombre) {
        this.IdTipoPersona = idTipoPersona;
        this.Nombre = nombre;
    }

    public int getIdTipoPersona() {
        return IdTipoPersona;
    }

    public void setIdTipoPersona(int IdTipoPersona) {
        this.IdTipoPersona = IdTipoPersona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

    @Override
    public String toString() {
        return this.Nombre;
    }
}
