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
public class FichaSintomatologica extends Ficha{

    private int IdFichaSintomatologica;
    private boolean SensacionAlzaTermica;
    private boolean TosEstornudo;
    private boolean ExpectoracionFlema;
    private boolean ContactoPositivo;
    
    public FichaSintomatologica() {
        super();
    }

    public FichaSintomatologica(int IdFicha, Date FechaRegistro, Date FechaModificacion, int IdPersonaRegistro, int IdPersonaModificacion, boolean EsActivo) {
        super(IdFicha, FechaRegistro, FechaModificacion, IdPersonaRegistro, IdPersonaModificacion, EsActivo);
    }

    public int getIdFichaSintomatologica() {
        return IdFichaSintomatologica;
    }

    public void setIdFichaSintomatologica(int IdFichaSintomatologica) {
        this.IdFichaSintomatologica = IdFichaSintomatologica;
    }

    public boolean getSensacionAlzaTermica() {
        return SensacionAlzaTermica;
    }

    public void setSensacionAlzaTermica(boolean SensacionAlzaTermica) {
        this.SensacionAlzaTermica = SensacionAlzaTermica;
    }

    public boolean getTosEstornudo() {
        return TosEstornudo;
    }

    public void setTosEstornudo(boolean TosEstornudo) {
        this.TosEstornudo = TosEstornudo;
    }

    public boolean getExpectoracionFlema() {
        return ExpectoracionFlema;
    }

    public void setExpectoracionFlema(boolean ExpectoracionFlema) {
        this.ExpectoracionFlema = ExpectoracionFlema;
    }

    public boolean getContactoPositivo() {
        return ContactoPositivo;
    }

    public void setContactoPositivo(boolean ContactoPositivo) {
        this.ContactoPositivo = ContactoPositivo;
    }
    
}
