package oopWithNLayerdApp;

import oopWithNLayerdApp.bussines.ProductManager;
import oopWithNLayerdApp.core.loglama.DatabaseLogger;
import oopWithNLayerdApp.core.loglama.FileLogger;
import oopWithNLayerdApp.core.loglama.Logger;
import oopWithNLayerdApp.core.loglama.MailLogger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone Xr", 10000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(),new MailLogger() };

		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}