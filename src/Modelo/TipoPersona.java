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
    private int Descripcion;
    private boolean EsActivo;

    public TipoPersona() {
    }

    public int getIdTipoPersona() {
        return IdTipoPersona;
    }

    public void setIdTipoPersona(int IdTipoPersona) {
        this.IdTipoPersona = IdTipoPersona;
    }

    public int getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(int Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }
    
}
