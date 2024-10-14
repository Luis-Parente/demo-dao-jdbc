package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=============Find by id====================");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n========================Find by department====================");
		Department dep = new Department(2, null);
		
		List<Seller> sellerList = sellerDao.findByDepartment(dep);
		for(Seller s : sellerList) {
			System.out.println(s);
		}
		
		System.out.println("\n===========================Find all==============================");
		List<Seller> sellerList2 = sellerDao.findAll();
		
		for(Seller s : sellerList2) {
			System.out.println(s);
		}
		
		System.out.println("\n=====================================Insert seller =======================");
		Seller sel = new Seller(null, "Luis", "Luis@gmail.com", LocalDate.parse("14/10/2024", fmt1), 1250.00, new Department(3, "Fashion"));
		sellerDao.insert(sel);
		
		System.out.println("\n=====================================Update seller =======================");
		seller.setName("Marco");
		sellerDao.update(seller);
		System.out.println(seller);
	}

}
