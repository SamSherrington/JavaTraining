package classes;

public class Calculator {

	private double valueOne;
	private double valueTwo;
	
	

	public Calculator(double valueOne, double valueTwo) {
		super();
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}

	// Generate getters and setters
	public double getValueOne() {
		return valueOne;
	}

	public void setValueOne(double valueOne) {
		this.valueOne = valueOne;
	}

	public double getValueTwo() {
		return valueTwo;
	}

	public void setValueTwo(double valueTwo) {
		this.valueTwo = valueTwo;
	}

	// Create methods

	public double add() {

		return valueOne + valueTwo;
	}

	public double subtract() {

		return valueOne - valueTwo;
	}

	public double multiply() {

		return valueOne * valueTwo;
	}

	public double divide() {

		if (valueTwo == 0)
			return 0;
		return valueOne / valueTwo;
	}

}
