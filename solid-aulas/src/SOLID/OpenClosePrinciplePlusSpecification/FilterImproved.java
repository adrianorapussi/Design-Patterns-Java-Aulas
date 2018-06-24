package SOLID.OpenClosePrinciplePlusSpecification;

import java.util.List;
import java.util.stream.Stream;

public class FilterImproved implements Filter<Product>   {

	@Override
	public Stream<Product> filter(List<Product> items,Specification<Product> spec) {
		return items.stream().filter(product -> spec.isSatisfied(product));
	}
}
