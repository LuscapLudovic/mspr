package dal;

import dal.jdbc.EquipementDAOJdbcImpl;

public class DAOFactory {
    public static EquipementDAOJdbcImpl getEquipementDAO() { return new EquipementDAOJdbcImpl(); }
}
