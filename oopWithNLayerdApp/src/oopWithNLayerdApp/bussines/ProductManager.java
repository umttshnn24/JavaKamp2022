package oopWithNLayerdApp.bussines;



import oopWithNLayerdApp.core.loglama.Logger;
import oopWithNLayerdApp.dataAccess.HibernateProductDao;
import oopWithNLayerdApp.dataAccess.JdbcProductDao;
import oopWithNLayerdApp.dataAccess.ProductDao;
import oopWithNLayerdApp.entities.Product;

public class ProductManager  {
	private ProductDao productDao;
	private Logger[] loggers;

	// Bu interface'in tutabildiği bir şey gönder de ne gönderirsen gönder.
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		// iş kuralları
		
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		productDao.add(product);
		
		for (Logger logger: loggers) { //[db,file]
			logger.log(product.getName());
		}

	}

}
