
public class Calculator {
	public int evaluate(String expression) {
		int sum = 0;
		for (String summand : expression.split("\\+")) 
			sum += Integer.valueOf(summand);
		return sum;
	}
	
	int substruct(int num1, int num2) {
		return num1-num2;
	}
}
