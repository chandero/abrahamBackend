package daos;

import java.util.List;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import models.TipoCiiu;
import models.TipoClaseCiiu;
import java.sql.Connection;
import javax.inject.Inject;

import play.db.*;

public class TipoCiiuDAO{

    private Database _db;
    private TipoClaseCiiuDAO _clase;

    @Inject
    private TipoCiiuDAO(Database _db, TipoClaseCiiuDAO clase) {
        this._db = _db;
        this._clase = clase;
    }

    public List<TipoCiiu> getTipoCiiu(){
        List<TipoCiiu> _dataList = new ArrayList<TipoCiiu>();

        PreparedStatement stmt;
        Connection conn = _db.getConnection();
        try {
            String sql;
            sql = "SELECT t.ID_CIIU, t.ID_CLASE_CIIU, t.DESCRIPCION_CIIU FROM \"gen$tiposciiu\" t";
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            //Extract data from result set
            if (rs != null){
                while(rs.next()){
                    TipoCiiu td = new TipoCiiu();
                    td.set_id(rs.getString("ID_CIIU"));
                    String _clase_id = rs.getString("ID_CLASE_CIIU");
                    TipoClaseCiiu  tcc = new TipoClaseCiiu(); //this._clase.getTipoClaseCiiu(_clase_id);
                    tcc.set_id(_clase_id);
                    td.set_clase(tcc);
                    td.set_descripcion(rs.getString("DESCRIPCION_CIIU"));
                    _dataList.add(td);
                }
            }
        } catch ( Exception e){
            e.printStackTrace();
        }

        return _dataList;
    }
}