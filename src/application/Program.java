package application;

import model.dao.DaoFactory;
import model.dao.SelleDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args){

        SelleDao selleDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = selleDao.findById(3);

        System.out.println(seller);
    }
}
