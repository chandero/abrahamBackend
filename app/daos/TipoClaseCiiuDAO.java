package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoClaseCiiu;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoClaseCiiuDAO{

    private Database db;

    @Inject
    private TipoClaseCiiuDAO(Database db) {
        this.db = db;
    }

    public List<TipoClaseCiiu> getTipoClaseCiiu(){
        List<TipoClaseCiiu> _dataList = new ArrayList<TipoClaseCiiu>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_CLASE_CIIU, t.DESCRIPCION_CLASE_CIIU FROM \"gen$tiposClaseCiiu\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoClaseCiiu td = new TipoClaseCiiu();
                    td.set_id(rs.getString("ID_CLASE_CIIU"));
                    td.set_descripcion(rs.getString("DESCRIPCION_CLASE_CIIU"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }

    public TipoClaseCiiu getTipoClaseCiiu(String _id){
        List<TipoClaseCiiu> _dataList = new ArrayList<TipoClaseCiiu>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_CLASE_CIIU, t.DESCRIPCION_CLASE_CIIU FROM \"gen$tiposclaseciiu\" t WHERE t.ID_CLASE_CIIU = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1,_id);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoClaseCiiu td = new TipoClaseCiiu();
                    td.set_id(rs.getString("ID_CLASE_CIIU"));
                    td.set_descripcion(rs.getString("DESCRIPCION_CLASE_CIIU"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList.get(0);
    }    
}