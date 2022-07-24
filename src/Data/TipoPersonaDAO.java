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
import Modelo.TipoPersona;
import com.mysql.jdbc.Statement;

/**
 *
 * @author omar_
 */
public class TipoPersonaDAO {

    private Conexion conexion = null;
    private Connection cn = null;

    public  List<TipoPersona> listarTipoPersona() {
        List<TipoPersona> lstTipoPersona = new ArrayList<TipoPersona>();
        conexion = new Conexion();
        try {

            cn = conexion.conectar();
            PreparedStatement pt = cn.prepareStatement("select * from TipoPersona where EsACtivo=1");
            ResultSet rs = pt.executeQuery();
            while (rs.next()) {
                TipoPersona tipoPersona=new TipoPersona();
                tipoPersona.setIdTipoPersona(rs.getInt("IdTipoPersona"));
                tipoPersona.setNombre(rs.getString("Nombre"));
                lstTipoPersona.add(tipoPersona);
            }
            cn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return lstTipoPersona;
    }
}
