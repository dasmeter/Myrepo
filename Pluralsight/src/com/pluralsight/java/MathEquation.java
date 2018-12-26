package com.pluralsight.java;

public class MathEquation {
	private double leftVal;	
	private double rightVal;	
	private char opCode;	
	private double result;
	
	/* Add Accessor */
	public double getLeftVal() {return leftVal;}
	/* Add Mutators*/
	public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
	
	public double getRightVal() {return rightVal;}
	public void setRightVal(double rightVal) {this.rightVal = rightVal;}
	public char getOpCode() {return opCode;}
	public void setOpCode(char opCode) {this.opCode = opCode;}
	
	/* only add accessor no mutator */
	public double getResult() { return result;}
	
	/* create constructor without arguments */
	public MathEquation() {}
	
	/* initialize/start the constructor */
	public MathEquation(char opCode) {
		this.opCode = opCode;
		
	}	
	
	public MathEquation(char opCode, double leftVal, double rightVal) {
		/*call up to constructor above */
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	
	
	public void execute() {
		switch(opCode) {
		
		case 'a':
			result = leftVal + rightVal;
			break;
		
		case 's': 
			result = leftVal - rightVal;
			break;
		
		case 'd':
			result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
			break;
			
		case 'm': 
			result = leftVal * rightVal;
			break;
		 default:
				System.out.println("Error - invalid opCode");
				result = 0.0d;
				break;
		}
	}
}




