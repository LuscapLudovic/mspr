package bll;

import bo.Equipement;
import dal.DALException;
import dal.DAO;
import dal.DAOFactory;

import java.util.List;

public class EquipementManager {

    private static DAO dao;

    public EquipementManager() throws BLLException{
        dao = DAOFactory.getEquipementDAO();
    }

    /**
     *
     * @return
     * @throws BLLException
     */
    public List<Equipement> getEquipement() throws BLLException{
        List<Equipement> equipements = null;

        try{
            equipements = dao.selectAll();
        } catch (DALException e){
            e.printStackTrace();
            throw new BLLException("Erreur récupération catalogue", e);
        }
        return equipements;
    }
}
