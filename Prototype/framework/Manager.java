package framework;
import java.util.*;

public class Manager {
	private HashMap showcase = new HashMap();
	public void register(String productName, Product product) {
		showcase.put(productName, product);
	}
	public Product create(String productName) {
		Product p = (Product)showcase.get(productName);
		return p.createClone();
	}
}