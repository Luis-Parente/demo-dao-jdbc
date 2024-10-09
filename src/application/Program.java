package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Department obj = new Department(1, "Computer");

		Seller obj2 = new Seller(21, "Thomas", "thomas@hotmail.com", LocalDate.parse("09/10/2024", fmt1), 2998.77, obj);
		
		System.out.println(obj);
		System.out.println(obj2);
	}

}
