package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("Image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(6);
		product2.setUnitPrice(6500);
		product2.setUnitsInStock(6);
		product2.setImageUrl("Image1.jpg");

		Product product3 = new Product();
		product3.setName("Beko Kahve Makinesi");
		product3.setDiscount(5);
		product3.setUnitPrice(5500);
		product3.setUnitsInStock(5);
		product3.setImageUrl("Image1.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		
		IndividualCustomer IndividualCustomer = new IndividualCustomer ();
		IndividualCustomer.setPhone("05552225566");
		IndividualCustomer.setCustomerNumber("12345");
		IndividualCustomer.setFirstname("Umut");
		IndividualCustomer.setLastname("ŞAHİN");
		
		CorporateCustomer corporateCustomer =new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("ŞAHİN TURİZM");
		corporateCustomer.setPhone("05336669988");
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCustomerNumber("54321");
		

	}

}
