package SOLID.LiskovSubstitutionPrinciple;

public class LiskovSubstitutionPrinciple   {

	public static void useIt(Rectangle rectangle){
		/*
			This code works for Rectangle, but not for Squares, because it violates the Liskov substitution principle
			 where a class square is a rectangle, but his setters have been override,
			 which changed the behavior of the base class (rectangle)

			 To correct this we must use a Factory of Rectangle where we create all types of Rectangles
		 */
		int width = rectangle.getWidth();
		rectangle.setHeight(10);
		// Area  = width * 10
		System.out.println("Expected area of "+(width * 10) + ", got "+rectangle.getArea());
	}


}
