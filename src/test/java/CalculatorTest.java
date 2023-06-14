
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc = new Calculator();
	@Test
	public void evaluateExpression(){
		int sum = calc.evaluate("1+2+3");
		assertEquals(6, sum);
	}
	
	@Test
	public void evaluateSubstraction() {
		int sub = calc.substruct(5, 4);
		assertEquals(1,sub);
	}
}
