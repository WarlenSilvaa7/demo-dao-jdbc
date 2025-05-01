package application;

import model.dao.DaoFactory;
import model.dao.SelleDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args){

        SelleDao selleDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = selleDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2,null);
        List<Seller> list = selleDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll =====");
        list = selleDao.findaAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com",new Date(),4000.0,department);
        selleDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
    }
}
