package SOLID.LiskovSubstitutionPrinciple;

public class RectangleFactory {

	// This is a solution for the previous problem generate by the Square class, where it overrides
	// the parent setters which resulted in a wrong behavior
	public static Rectangle newRectangle(int width,int height) {
		return new Rectangle(width,height);
	}
	// Note that we don't need the square class anymore since all kinds of rectangles are a rectangle
	public static Rectangle newSquare(int side) {
		return new Rectangle(side,side);
	}
}
