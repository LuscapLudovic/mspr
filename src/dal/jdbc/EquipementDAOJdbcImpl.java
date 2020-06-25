package dal.jdbc;

import bo.Equipement;
import dal.DALException;
import dal.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class EquipementDAOJdbcImpl implements DAO {

    public static final String selectAll = "SELECT * from equipement";

    @Override
    public List<Equipement> selectAll() throws DALException {
        Connection cnx = null;
        Statement rqt = null;
        ResultSet rs = null;
        List<Equipement> liste = new ArrayList<Equipement>();
        try{
            cnx = JdbcTools.getConnection();
            rqt = cnx.createStatement();
            rs = rqt.executeQuery(selectAll);
            Equipement eqp = null;

            while (rs.next()){
                eqp = new Equipement(rs.getInt("id"),
                                    rs.getString("libelle"));
                liste.add(eqp);
            }
        } catch (SQLException e) {
            throw new DALException("select all ", e);
        } finally {
            try {
                if (rs != null){
                    rs.close();
                }
                if (rqt != null){
                    rqt.close();
                }
                if(cnx!=null){
                    cnx.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return liste;
    }
}
