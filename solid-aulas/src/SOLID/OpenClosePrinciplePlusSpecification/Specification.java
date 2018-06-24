package SOLID.OpenClosePrinciplePlusSpecification;

public interface Specification<T> {

	boolean isSatisfied(T item);
}
