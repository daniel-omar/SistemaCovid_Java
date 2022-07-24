/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Modelo.Persona;
import com.mysql.jdbc.Statement;

/**
 *
 * @author omar_
 */
public class PersonaDAO {

    private Conexion conexion = null;
    private Connection cn = null;

    public List<Persona> BuscarPersona(Persona oPersona, Date fechaInicio, Date fechaFin) {
        List<Persona> lstPersona = new ArrayList<Persona>();
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            CallableStatement sp = cn.prepareCall("call sp_buscarPersona(?,?,?,?)");
            sp.setString(1, oPersona.getNumeroDocumento());
            sp.setBoolean(2, oPersona.getEsActivo());
            sp.setDate(3, new java.sql.Date(fechaInicio.getTime()));
            sp.setDate(4, new java.sql.Date(fechaFin.getTime()));
            ResultSet rs = sp.executeQuery();
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setIdPersona(rs.getInt("IdPersona"));
                persona.setIdTipoPersona(rs.getInt("IdTipoPersona"));
                persona.setNumeroDocumento(rs.getString("NumeroDocumento"));
                persona.setNombres(rs.getString("Nombres"));
                persona.setApellidoPaterno(rs.getString("ApellidoPaterno"));
                persona.setApellidoMaterno(rs.getString("ApellidoMaterno"));
                persona.setDireccion(rs.getString("Direccion"));
                persona.setTelefono(rs.getString("Telefono"));
                persona.setCorreo(rs.getString("Correo"));
                persona.setEsActivo(rs.getBoolean("EsActivo"));
                persona.setFechaRegistro(rs.getDate("FechaRegistro"));
                persona.setFechaModificacion(rs.getDate("FechaModificacion"));
                lstPersona.add(persona);
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lstPersona;
    }

    public Persona obtenerPersona(int idPersona) {
        Persona persona = null;
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            PreparedStatement pt = cn.prepareStatement("select * from Persona where idPersona=? limit 1");
            pt.setInt(1, idPersona);
            ResultSet rs = pt.executeQuery();
            if (rs.next()) {
                persona = new Persona();
                persona.setIdPersona(rs.getInt("IdPersona"));
                persona.setIdTipoPersona(rs.getInt("IdTipoPersona"));
                persona.setNumeroDocumento(rs.getString("NumeroDocumento"));
                persona.setNombres(rs.getString("Nombres"));
                persona.setApellidoPaterno(rs.getString("ApellidoPaterno"));
                persona.setApellidoMaterno(rs.getString("ApellidoMaterno"));
                persona.setDireccion(rs.getString("Direccion"));
                persona.setTelefono(rs.getString("Telefono"));
                persona.setCorreo(rs.getString("Correo"));
                persona.setEsActivo(rs.getBoolean("EsActivo"));
                persona.setFechaRegistro(rs.getDate("FechaRegistro"));
                persona.setFechaModificacion(rs.getDate("FechaModificacion"));
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return persona;
    }

    public boolean existePersona(Persona persona) {
        boolean result = false;
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            PreparedStatement pt = cn.prepareStatement("select IF(EXISTS(SELECT 1 FROM `persona` WHERE numeroDocumento=?),1,0) as result");
            pt.setString(1, persona.getNumeroDocumento());
            ResultSet rs = pt.executeQuery();
            while (rs.next()) {
                result = rs.getBoolean("result");
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }

    public boolean registrarPersona(Persona persona) {
        boolean rsp = false;
        conexion = new Conexion();
        try {
            cn = conexion.conectar();

            CallableStatement sp = cn.prepareCall("call sp_registrarPersona(?,?,?,?,?,?,?,?,?)");
            sp.setInt(1, persona.getIdTipoPersona());
            sp.setString(2, persona.getNombres());
            sp.setString(3, persona.getApellidoPaterno());
            sp.setString(4, persona.getApellidoMaterno());
            sp.setString(5, persona.getNumeroDocumento());
            sp.setString(6, persona.getCorreo());
            sp.setString(7, persona.getTelefono());
            sp.setString(8, persona.getDireccion());
            sp.setInt(9, persona.getIdPersonaRegistro());
            sp.executeQuery();

            cn.close();
            rsp = true;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rsp;
    }

    public boolean modificarPersona(Persona persona) {
        boolean rsp = false;
        conexion = new Conexion();
        try {
            cn = conexion.conectar();

            CallableStatement sp = cn.prepareCall("call sp_modificarPersona(?,?,?,?,?,?,?,?,?,?)");
            sp.setInt(1, persona.getIdPersona());
            sp.setInt(2, persona.getIdTipoPersona());
            sp.setString(3, persona.getNombres());
            sp.setString(4, persona.getApellidoPaterno());
            sp.setString(5, persona.getApellidoMaterno());
            sp.setString(6, persona.getNumeroDocumento());
            sp.setString(7, persona.getCorreo());
            sp.setString(8, persona.getTelefono());
            sp.setString(9, persona.getDireccion());
            sp.setInt(10, persona.getIdPersonaModificacion());
            sp.executeQuery();

            //ResultSet rs = sp.executeQuery();
            cn.close();
            rsp = true;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rsp;
    }
    public boolean eliminarPersona(Persona persona) {
        boolean rsp = false;

        try {
            cn = conexion.conectar();

            CallableStatement sp = cn.prepareCall("call sp_eliminarPersona(?,?,?)");
            sp.setInt(1, persona.getIdPersona());
            sp.setBoolean(2, persona.getEsActivo());
            sp.setInt(3, persona.getIdPersonaModificacion());

            sp.executeQuery();

            cn.close();
            rsp = true;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rsp;
    }
}
