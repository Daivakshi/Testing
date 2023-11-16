package Lab1;

public class Triangle {
	/**
	 * This method expects to receive three numbers that form a scalene. 
	 * @param side1: side a of a triangle
	 * @param side2: side b of a triangle
	 * @param side3: side c of a triangle
	 * @return This method returns True, if a, b, and c can form a triangle and the triangle is a scalene. 
	 * Otherwise, it returns false. 
	 * @pre 2 <= side1 <= 10
	 * @pre 5 <= side2 <= 15
	 * @pre 10 <= side3 <= 19
	 **/
	
	public boolean isScalene(int side1, int side2, int side3) {
		boolean isScalene = false; 
		
		if (isValid(side1, side2, side3) &&
			   isSideValid(side1, 2, 10) &&
			   isSideValid(side2, 5, 15) &&
			   isSideValid(side3, 10, 19) &&
			   side1 != side2 && side2 != side3 && side1 != side3)
			isScalene = true; 
		
		return isScalene;	
	}
	/**
	 * A <code>side</code> is valid if it is between <code>min</code> and <code> max </code>
	 * @param side is the side of a triangle
	 * @param min is the <code>min</code> value that is accepted for the side
	 * @param max is the <code> max </code> value the is accepted for the side
	 * @return returns true, if the side is between <code>min</code> and <code> max </code>. 
	 */
	public boolean isSideValid(int side, int min, int max) {
		boolean isValid = false;
		
		if (side >= min && side <= max) 
			isValid = true;
		return isValid;
	}

	/**
	 * This method verifies that the inputs can form a triangle.
	 * @param side1 presents the first side
	 * @param side2 presents the second side
	 * @param side3 presents the third side
	 * @return returns true, if the three inputs can form a triangle, 
	 * otherwise it returns false. 
	 */
	public boolean isValid(int side1, int side2, int side3) {
		boolean isValid = false;
		if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1+side3 > side2))
			isValid = true; 
		return isValid; 		
	}
}
