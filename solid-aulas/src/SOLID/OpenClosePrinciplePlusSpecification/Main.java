package SOLID.OpenClosePrinciplePlusSpecification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN,Size.SMALL);
		Product tree = new Product("Tree", Color.BLUE,Size.LARGE);
		Product house = new Product("House", Color.RED,Size.MEDIUM);

		List<Product> products = new ArrayList<>();
		products.add(apple);
		products.add(tree);
		products.add(house);
		ProductFilter productFilter = new ProductFilter();
		System.out.println("Green products (old):");
		productFilter.filterByColor(products,Color.GREEN).forEach(product -> System.out.println(" - " + product.name + " is Green"));

		FilterImproved filter = new FilterImproved();
		System.out.println("Green products (new):");
		filter.filter(products,new ColorSpecification(Color.GREEN)).forEach(product -> System.out.println(" - " + product.name + "is green"));

		System.out.println("Large blue items");
		filter.filter(products, new AndSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE))).forEach(product -> System.out.println(" - " +product.name+ " is large and blue"));
	}
}
