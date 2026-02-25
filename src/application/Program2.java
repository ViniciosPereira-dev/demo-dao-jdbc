package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n === Test FindById === ");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n === Test FindAll === ");
		List<Department> list = departmentDao.findAll();
		for(Department newDep : list) {
			System.out.println(newDep);
		}
	
		System.out.println("\n === Test Insert === ");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("New department Id: " + newDepartment.getId());
		
		System.out.println("\n === Test Update === ");
		dep = departmentDao.findById(5);
		dep.setName("Music");
		departmentDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println("\n === Test Delete === ");
		System.out.println("Enter id to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("DELETE completed ");
		
		

	}

}
