/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.EstadoIncorporacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Modelo.FichaSintomatologica;
import Modelo.Incorporacion;
import Modelo.Persona;
import com.mysql.jdbc.Statement;
import java.sql.Types;

/**
 *
 * @author omar_
 */
public class IncorporacionDAO {

    private Conexion conexion = null;
    private Connection cn = null;

    public List<Incorporacion> ListarIncorporacionPorEstado(int IdEstadoIncorporacion) {
        List<Incorporacion> lstIncorporacion = new ArrayList<Incorporacion>();
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            CallableStatement sp = cn.prepareCall("call sp_listarIncorporacionPorEstado(?)");
            sp.setInt(1, IdEstadoIncorporacion);
            ResultSet rs = sp.executeQuery();
            while (rs.next()) {
                Incorporacion incorporacion = new Incorporacion();
                incorporacion.setIdIncorporacion(rs.getInt("IdIncorporacion"));
                incorporacion.setIdEstadoIncorporacion(rs.getInt("IdEstadoIncorporacion"));
                
                EstadoIncorporacion oEstadoIncorporacion=new EstadoIncorporacion();
                oEstadoIncorporacion.setIdEstadoIncorporacion(rs.getInt("IdEstadoIncorporacion"));
                oEstadoIncorporacion.setNombre(rs.getString("NombreEstadoIncorporacion"));
                incorporacion.setoEstadoIncorporacion(oEstadoIncorporacion);
                
                Persona oPersonaRegistro=new Persona();
                oPersonaRegistro.setIdPersona(rs.getInt("IdPersonaRegistro"));
                oPersonaRegistro.setNombres(rs.getString("NombresPersonaRegistro"));
                oPersonaRegistro.setApellidoPaterno(rs.getString("ApellidoPaternoPersonaRegistro"));
                oPersonaRegistro.setApellidoMaterno(rs.getString("ApellidoMaternoPersonaRegistro"));
                incorporacion.setIdPersonaRegistro(rs.getInt("IdPersonaRegistro"));
                incorporacion.setoPersonaRegistro(oPersonaRegistro);
                
                incorporacion.setFechaRegistro(rs.getDate("FechaRegistro"));
                incorporacion.setFechaModificacion(rs.getDate("FechaModificacion"));
                lstIncorporacion.add(incorporacion);
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lstIncorporacion;
    }
    
    public Incorporacion obtenerIncorporacion(int idIncorporacion) {
        Incorporacion incorporacion = null;
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            CallableStatement sp = cn.prepareCall("call sp_obtenerIncorporacion(?)");
            sp.setInt(1, idIncorporacion);
            ResultSet rs = sp.executeQuery();
            if (rs.next()) {
                incorporacion = new Incorporacion();
                incorporacion.setIdIncorporacion(rs.getInt("IdIncorporacion"));
                incorporacion.setIdEstadoIncorporacion(rs.getInt("IdEstadoIncorporacion"));
                
                EstadoIncorporacion oEstadoIncorporacion=new EstadoIncorporacion();
                oEstadoIncorporacion.setIdEstadoIncorporacion(rs.getInt("IdEstadoIncorporacion"));
                oEstadoIncorporacion.setNombre(rs.getString("NombreEstadoIncorporacion"));
                incorporacion.setoEstadoIncorporacion(oEstadoIncorporacion);
                incorporacion.setIdFichaSintomatologica(rs.getInt("IdFichaSintomatologica"));
                
                Persona oPersonaRegistro=new Persona();
                oPersonaRegistro.setIdPersona(rs.getInt("IdPersonaRegistro"));
                oPersonaRegistro.setNombres(rs.getString("NombresPersonaRegistro"));
                oPersonaRegistro.setApellidoPaterno(rs.getString("ApellidoPaternoPersonaRegistro"));
                oPersonaRegistro.setApellidoMaterno(rs.getString("ApellidoMaternoPersonaRegistro"));
                incorporacion.setIdPersonaRegistro(rs.getInt("IdPersonaRegistro"));
                incorporacion.setoPersonaRegistro(oPersonaRegistro);
                incorporacion.setFechaRegistro(rs.getDate("FechaRegistro"));
                incorporacion.setFechaModificacion(rs.getDate("FechaModificacion"));
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return incorporacion;
    }
    
    public boolean actualizarEstadoIncorporacion(int idIncorporacion,int idEstadoIncorporacion,int idPersonaModificacion) {
        boolean rsp = false;
        conexion = new Conexion();
        try {
            cn = conexion.conectar();

            CallableStatement sp = cn.prepareCall("call sp_actualizarEstadoIncorporacion(?,?,?)");
            sp.setInt(1, idIncorporacion);
            sp.setInt(2, idEstadoIncorporacion);
            sp.setInt(3, idPersonaModificacion);
            sp.executeQuery();

            cn.close();
            rsp = true;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rsp;
    }
    
    public List<Incorporacion> ListarIncorporacionPorEmpleado(int IdEmpleado) {
        List<Incorporacion> lstIncorporacion = new ArrayList<Incorporacion>();
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            CallableStatement sp = cn.prepareCall("call sp_listarIncorporacionPorPersona(?)");
            sp.setInt(1, IdEmpleado);
            ResultSet rs = sp.executeQuery();
            while (rs.next()) {
                Incorporacion incorporacion = new Incorporacion();
                incorporacion.setIdIncorporacion(rs.getInt("IdIncorporacion"));
                incorporacion.setIdEstadoIncorporacion(rs.getInt("IdEstadoIncorporacion"));
                
                EstadoIncorporacion oEstadoIncorporacion=new EstadoIncorporacion();
                oEstadoIncorporacion.setIdEstadoIncorporacion(rs.getInt("IdEstadoIncorporacion"));
                oEstadoIncorporacion.setNombre(rs.getString("NombreEstadoIncorporacion"));
                incorporacion.setoEstadoIncorporacion(oEstadoIncorporacion);
                
                Persona oPersonaRegistro=new Persona();
                oPersonaRegistro.setIdPersona(rs.getInt("IdPersonaRegistro"));
                oPersonaRegistro.setNombres(rs.getString("NombresPersonaRegistro"));
                oPersonaRegistro.setApellidoPaterno(rs.getString("ApellidoPaternoPersonaRegistro"));
                oPersonaRegistro.setApellidoMaterno(rs.getString("ApellidoMaternoPersonaRegistro"));
                incorporacion.setIdPersonaRegistro(rs.getInt("IdPersonaRegistro"));
                incorporacion.setoPersonaRegistro(oPersonaRegistro);
                
                incorporacion.setFechaRegistro(rs.getDate("FechaRegistro"));
                incorporacion.setFechaModificacion(rs.getDate("FechaModificacion"));
                lstIncorporacion.add(incorporacion);
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lstIncorporacion;
    }
     public boolean registrarIncorporacion(int idFicha,int idPersonaRegistro) {
        boolean respuesta = false;
        conexion = new Conexion();
        try {
            cn = conexion.conectar();

            CallableStatement sp = cn.prepareCall("call sp_registrarIncorporacion(?,?)");
            sp.setInt(1, idFicha);
            sp.setInt(2, idPersonaRegistro);
            sp.executeQuery();
            cn.close();
            respuesta=true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return respuesta;
    }
}
