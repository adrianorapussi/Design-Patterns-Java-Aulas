package SOLID.LiskovSubstitutionPrinciple;

public class Main {

	public static void main(String[] args) {
		// ------------------------------------------------------
		// Wrong behavior
		Rectangle rectangle = new Rectangle(2,3);
		LiskovSubstitutionPrinciple.useIt(rectangle);

		Rectangle square = new Square();
		square.setWidth(5);
		LiskovSubstitutionPrinciple.useIt(square);
		// ------------------------------------------------------
		// Good behavior
		Rectangle rectangle2 = RectangleFactory.newRectangle(2,3);
		LiskovSubstitutionPrinciple.useIt(rectangle2);

		Rectangle square2 = RectangleFactory.newSquare(2);
		LiskovSubstitutionPrinciple.useIt(square2);
		// ------------------------------------------------------
	}
}
