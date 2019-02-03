package com.pluralsight.java;

public class CalcEngine {

	public static void main(String[] args) {
//		useMathEquation();
//      useCalculatorBase();
		
	String[] statements = {
			"divide 100.0 50.0",
			"add 25.0 92.0",
			"subtract 225.0 17.0",	
			"multiply 11.0 3.0"
	};
	
	CalculateHelper helper = new CalculateHelper();
	for(String statement:statements) {
		helper.process(statement);
		System.out.println(helper);
	}
}

		//Declare math equations array
	static void useMathEquation() {
		MathEquation[] equations = new MathEquation[4];
		//Call the Create method on line 28 and pass in values
		//Replace create method with constructor
		equations[0] = new MathEquation('d', 100.0d, 50.0d);  // 100.0 / 50.0 = 2.0
		equations[1] = new MathEquation('a', 25.0d, 92.0d);
		equations[2] = new MathEquation('s', 225.0d, 17.0d);
		equations[3] = new MathEquation('m', 11.0d, 3.0d);
	
		
		
		//Go Through the Math Eqaution array
		for(MathEquation equation: equations) {
			equation.execute();
			System.out.println("result = ");
			System.out.println(equation.getResult());
		}
	
	System.out.println();
	System.out.print("Using Overloads");
	System.out.println();
	
	double leftDouble = 9.0d;
	double rightDouble = 4.0d;
	int leftInt = 9;
	int rightInt = 4;
	
	MathEquation equationOverload = new MathEquation('d');
	
	equationOverload.execute(leftDouble, rightDouble);
	System.out.println("result= ");
	System.out.println(equationOverload.getResult());
	
	/*passing in int values instead of doubles*/
	equationOverload.execute(leftInt, rightInt);
	System.out.println("result= ");
	System.out.println(equationOverload.getResult());
	
	/*passing both int and double values instead of just int/doubles*/
	equationOverload.execute((double)leftInt, rightInt);
	System.out.println("result= ");
	System.out.println(equationOverload.getResult());
	
	System.out.println();
	System.out.println("Using Inheritance ");
	System.out.println();
	
	/* testing the Calculator Class */
	
	CalculateBase[] calculators = {
			new Divider(100.0d, 50.0d),
			new Adder(25.0d, 92.0d),
			new Subtracter(225.0d, 17.0d),
			new Multiplier(11.0d, 3.0d)
			
	};
	
	for (CalculateBase calculator:calculators) {
		calculator.calculate();
		System.out.print("result=");
		System.out.println(calculator.getResult());
	}
	}
		
		
		
		
	}
	

	
	
		
	
	

