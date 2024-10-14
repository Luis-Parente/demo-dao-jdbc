package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = new Department(null , "Novel");
		departmentDao.insert(dep);
		
		
		dep = departmentDao.findById(5);
		dep.setName("Game");
		departmentDao.update(dep);
		
		
		List<Department> depList = departmentDao.findAll();
		for(Department d : depList) { 
			System.out.println(d);
		}
		
		departmentDao.deleteById(8);
		
		List<Department> depList2 = departmentDao.findAll();
		for(Department d : depList2) { 
			System.out.println(d);
		}
		
	}

}
