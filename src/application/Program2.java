package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById =====");
        Department dep = departmentDao.findById(3);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll =====");
        List<Department> list = departmentDao.findaAll();
        for (Department d : list){
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: department insert =====");
        Department newDepartment = new Department(null, "Food");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update =====");
        dep = departmentDao.findById(1);
        dep.setName("Notebook");
        departmentDao.update(dep);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: department delete =====");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();
    }
}
