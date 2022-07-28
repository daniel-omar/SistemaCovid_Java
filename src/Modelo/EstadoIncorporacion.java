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
public class EstadoIncorporacion {

    private int IdEstadoIncorporacion;
    private String Nombre;
    private boolean EsActivo;

    public EstadoIncorporacion(int IdEstadoIncorporacion, String Nombre, boolean EsActivo) {
        this.IdEstadoIncorporacion = IdEstadoIncorporacion;
        this.Nombre = Nombre;
        this.EsActivo = EsActivo;
    }

    public EstadoIncorporacion() {
    }

    public int getIdEstadoIncorporacion() {
        return IdEstadoIncorporacion;
    }

    public void setIdEstadoIncorporacion(int IdEstadoIncorporacion) {
        this.IdEstadoIncorporacion = IdEstadoIncorporacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean getEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

}
