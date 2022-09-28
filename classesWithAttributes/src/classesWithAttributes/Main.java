package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.name="Laptop";
		product.description="Monster";
		product.price=5000;
		product.stockAmount=2;
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		

	}

}
