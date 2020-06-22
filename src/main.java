import bll.BLLException;
import bll.EquipementManager;
import bo.Equipement;

public class main {
    public static void main(String[] args) throws BLLException {
        EquipementManager em = new EquipementManager();
        em.getEquipement();
    }
}



