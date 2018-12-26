package com.pluralsight.java;

public class CalcEngine {

	public static void main(String[] args) {
//		double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//		char[] opCodes = {'d', 'a', 's', 'm'};
//		double[] results = new double[opCodes.length];
//      commit test 123
//      commit test 1234

		//Declare math equations array
		MathEquation[] equations = new MathEquation[4];
		//Call the Create method on line 28 and pass in values
		//Replace create method with constructor
		equations[0] = new MathEquation('d', 100.0d, 50.0d);
		equations[1] = new MathEquation('a', 25.0d, 92.0d);
		equations[2] = new MathEquation('s', 225.0d, 17.0d);
		equations[3] = new MathEquation('m', 11.0d, 3.0d);
	
		
		
		//Go Through the Math Eqaution array
		for(MathEquation equation: equations) {
			equation.execute();
			System.out.println("result = ");
			System.out.println(equation.getResult());
		}
	}
	
	//method to used create a new instance and setting all of the values
	//Also to avoid running it four different 
	
	/* REMOVE THIS CREATE METHOD - USING CONSTRUCTORS INSTEAD
	 * 
	 */
	/*public static MathEquation create(double leftVal, double rightVal, char opCode) {
		MathEquation equation = new MathEquation();
		
		/*updated to use mutator methods*/
	    /*quation.setLeftVal(leftVal);
		equation.setRightVal(rightVal);
		equation.setOpCode(opCode);
		
		return equation;*/
		
	
	
}
