package SOLID.OpenClosePrinciplePlusSpecification;

import java.util.List;
import java.util.stream.Stream;

/**
 * This class is not a good example of the open closed principle, because for
 * every new filter we must add a new kind of implementation here
 */
public class ProductFilter {

	public Stream<Product> filterByColor(List<Product> products, Color color){
		return products.stream().filter(product -> product.color == color);
	}

	public  Stream<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(product -> product.size == size);
	}

	public Stream<Product> filterByColorAndSize(List<Product> products, Color color,Size size){
		return products.stream().filter(product -> product.color == color && product.size == size);
	}


}
