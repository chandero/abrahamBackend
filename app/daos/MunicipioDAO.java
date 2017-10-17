package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.Municipio;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class MunicipioDAO{

    private Database _db;

    @Inject
    private MunicipioDAO(Database _db, TipoClaseCiiuDAO clase) {
        this._db = _db;
    }

    public List<Municipio> getMunicipio(){
        List<Municipio> _dataList = new ArrayList<Municipio>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT t.COD_MUNICIPIO, t.NOMBRE, t.DPTO FROM \"gen$municipios\" t ORDER BY t.NOMBRE";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Municipio td = new Municipio();
                    td.set_id(rs.getInt("COD_MUNICIPIO"));
                    td.set_descripcion(rs.getString("NOMBRE"));
                    td.set_departamento(rs.getString("DPTO"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }

    public List<Municipio> getMunicipio(String filter){
        List<Municipio> _dataList = new ArrayList<Municipio>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT t.COD_MUNICIPIO, t.NOMBRE, t.DPTO FROM \"gen$municipios\" t WHERE t.NOMBRE LIKE ? or t.DPTO LIKE ? ORDER BY t.NOMBRE";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%"+filter+"%");
            stmt.setString(2, "%"+filter+"%");
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    Municipio td = new Municipio();
                    td.set_id(rs.getInt("COD_MUNICIPIO"));
                    td.set_descripcion(rs.getString("NOMBRE"));
                    td.set_departamento(rs.getString("DPTO"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }    
}