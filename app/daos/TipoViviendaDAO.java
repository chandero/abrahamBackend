package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoVivienda;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoViviendaDAO{

    private Database db;

    @Inject
    private TipoViviendaDAO(Database db) {
        this.db = db;
    }

    public List<TipoVivienda> getTipoVivienda(){
        List<TipoVivienda> _dataList = new ArrayList<TipoVivienda>();

        PreparedStatement stmt;
        Connection conn = db.getConnection();
        try {
            String sql;
            sql = "SELECT r.ID_TIPOVIVIENDA, r.DESCRIPCION_TIPO FROM \"gen$tipovivienda\" r";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoVivienda td = new TipoVivienda();
                    td.set_id(rs.getInt("ID_TIPOVIVIENDA"));
                    td.set_descripcion(rs.getString("DESCRIPCION_TIPO"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}