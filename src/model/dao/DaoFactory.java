package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SelleDao createSellerDao(){
        return new SellerDaoJDBC();
    }
}
