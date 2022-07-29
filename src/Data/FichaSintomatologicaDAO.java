/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Modelo.EstadoIncorporacion;
import java.sql.Connection;
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
public class FichaSintomatologicaDAO {

    private Conexion conexion = null;
    private Connection cn = null;

    public FichaSintomatologica obtenerIncorporacion(int idFicha) {
        FichaSintomatologica fichaSintomatologica = null;
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            CallableStatement sp = cn.prepareCall("select * from fichasintomatologica where IdFicha=? limit 1");
            sp.setInt(1, idFicha);
            ResultSet rs = sp.executeQuery();
            if (rs.next()) {
                fichaSintomatologica = new FichaSintomatologica();
                fichaSintomatologica.setIdFichaSintomatologica(rs.getInt("IdFichaSintomatologica"));
                fichaSintomatologica.setIdFicha(rs.getInt("IdFicha"));

                fichaSintomatologica.setSensacionAlzaTermica(rs.getBoolean("SensacionAlzaTermica"));
                fichaSintomatologica.setTosEstornudo(rs.getBoolean("TosEstornudo"));
                fichaSintomatologica.setExpectoracionFlema(rs.getBoolean("ExpectoracionFlema"));
                fichaSintomatologica.setContactoPositivo(rs.getBoolean("ContactoPositivo"));
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return fichaSintomatologica;
    }

    public int registrarFichaSintomatologica(FichaSintomatologica fichaSintomatologica) {
        int idFicha = 0;
        conexion = new Conexion();
        try {
            cn = conexion.conectar();

            CallableStatement sp = cn.prepareCall("call sp_registrarFichaSintomatologica(?,?,?,?,?,?)");
            sp.setBoolean(1, fichaSintomatologica.getSensacionAlzaTermica());
            sp.setBoolean(2, fichaSintomatologica.getTosEstornudo());
            sp.setBoolean(3, fichaSintomatologica.getExpectoracionFlema());
            sp.setBoolean(4, fichaSintomatologica.getContactoPositivo());
            sp.setInt(5, fichaSintomatologica.getIdPersonaRegistro());
            sp.registerOutParameter("v_idFicha", Types.INTEGER);
            sp.execute();
            ResultSet rs = sp.getResultSet();
            rs.next();
            idFicha = sp.getInt("v_idFicha");
            
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return idFicha;
    }
}
