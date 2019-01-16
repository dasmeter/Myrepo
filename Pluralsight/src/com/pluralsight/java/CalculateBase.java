package com.pluralsight.java;

public abstract class CalculateBase {
/*define fields */
	private double leftVal;
	private double rightVal;
	private double result;
	
/* Getters and Settings section */
	
	public double getLeftVal() {return leftVal;}
	public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
	public double getRightVal() {return rightVal;}
	public void setRightVal(double rightVal) {this.rightVal = rightVal;}
	public double getResult() {return result;}
	public void setResult(double result) {this.result = result;}
	
/* Construct the instance of Calculate Base */
	
	public CalculateBase() {}
	public CalculateBase(double leftVal, double rightVal) {
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public abstract void calculate();
	
	
}
	
	
	
	
	

	


