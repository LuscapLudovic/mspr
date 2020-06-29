package bll;

import dal.DALException;
import dal.DAO;
import dal.DAOFactory;

import java.util.List;

public class EquipementManager {

    private static DAO dao;

    /**
     *
     * @throws BLLException
     */
    public EquipementManager() throws BLLException{
        dao = DAOFactory.getEquipementDAO();
    }

    /**
     *
     * @throws BLLException
     */
    public void getEquipement() throws BLLException{
        List equipements = null;

        try{
            equipements = dao.selectAll();
            System.out.println(equipements.toString());
        } catch (DALException e){
            e.printStackTrace();
            throw new BLLException("Erreur récupération catalogue", e);
        }
    }
}
