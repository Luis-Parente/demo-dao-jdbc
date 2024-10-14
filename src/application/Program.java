package application;

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
		Seller seller = sellerDao.findById(3);
		
		Department dep = new Department(2, null);
		
		List<Seller> sellerList = sellerDao.findByDepartment(dep);
		
		System.out.println(seller);
		
		for(Seller s : sellerList) {
			System.out.println(s);
		}
		
		List<Seller> sellerList2 = sellerDao.findAll();
		
		for(Seller s : sellerList2) {
			System.out.println(s);
		}
	}

}
