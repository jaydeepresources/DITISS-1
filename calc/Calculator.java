package calc;

public class Calculator {

	float num1;
	float num2;
	float result;

	void add() {
		result = num1 + num2;
		printResult();
	}

	void sub() {
		result = num1 - num2;
		printResult();
	}

	void mul() {
		result = num1 * num2;
		printResult();
	}

	void div() {
		result = num1 / num2;
		printResult();
	}

	void printResult() {
		System.out.println("Result is= " + result);
	}

}
